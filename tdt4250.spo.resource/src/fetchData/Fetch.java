package fetchData;


import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Fetch {
	
	//client credentials and encoding
	private static final String clientID = "6f5858daa57c49138dd1059cf6bf7dc5";
	private static final String clientSecret = "e56ed901b2fb45f8842a8e81e370aa5b";
	private static final String toEncode = clientID + ":" + clientSecret;
	private static final String encoded = Base64.getEncoder().encodeToString(toEncode.getBytes());

	//urls
	private static final String auth_url = "https://accounts.spotify.com/api/token?grant_type=client_credentials";
	private static final String top50_url = "https://api.spotify.com/v1/playlists/37i9dQZEVXbMDoHDwVN2tF/tracks//?fields=items(track(name,uri,id,duration_ms,explicit,artists(name,uri,id),album(name,uri,id)))";
	private static final String show_url = "https://api.spotify.com/v1/shows/";///tracks//?fields=items(track(name,uri,id,duration_ms,explicit,artists(name,uri),album(name,uri,id)))";
	private static final String albums_url = "https://api.spotify.com/v1/albums?ids=";
	
	//paths
	private String top50_path;
	private String shows_path;
	private String albums_path;
	
	private String token;
	
	public Fetch(String top50_path, String shows_path, String albums_path) {
		
		this.top50_path = top50_path;
		this.shows_path = shows_path;
		this.albums_path = albums_path;
	}
	
	private String authToken(String url) throws MalformedURLException, IOException {
		System.out.println("Requesting authorization token...");
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("POST");
		
		conn.setDoOutput(true);
		conn.setDoInput(true);
		
		conn.setRequestProperty("Authorization", "Basic " + encoded);
	    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); 
	    conn.setRequestProperty("Content-Length", "0"); 

	    conn.getOutputStream();
	    InputStream response = conn.getInputStream();

	    Scanner scanner = new Scanner(response);
		String body = scanner.useDelimiter("\\A").next();
		scanner.close();
		
		//getting just token from json result
		JsonNode node = new ObjectMapper().readTree(body);
		String token = node.path("access_token").asText();
	    System.out.println("Token successfully requested.");
	    
		return token;
	}
	
private String fetchData(String url, String token) throws MalformedURLException, IOException {
		
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization", "Bearer " + token); 
		//System.out.println(conn.getResponseCode());
		
	    InputStream response = conn.getInputStream();
	    
	    String responseBody;

	    try (Scanner scanner = new Scanner(response)) {
	        responseBody = scanner.useDelimiter("\\A").next();
	        //System.out.println(responseBody);
	    }

	   
		return responseBody;
	}

private String fetchShows(String url, String token, List<String> showIds) throws MalformedURLException, IOException {
	String result = "{\"shows\" : [ ";
	String query = "?market=NO";
	for (String id : showIds) {
		String json = fetchData(url+id+query, token);
		result += json + ", ";
	}
	result = result.substring(0, result.length()-2);
	result += " ]}";
	return result;
}

public void fetchAlbums(List<String> ids) {
	
	String jsonAlbums = "";
	boolean first = true;
	boolean second = false;
	
	
	try {
		//build one json string from several results
		for (String id : ids) {
			String temp = fetchData(albums_url+id, token);
			if (first) {
				jsonAlbums += temp.substring(0, temp.length()-4) + ",";
				first = false;
				second = true;
			} else if (second) {
				jsonAlbums += temp.substring(16, temp.length()-4) + ",";
				second = false;
			} else {
				jsonAlbums += temp.substring(16);
			}
		}
		
		FileWriter albumsWriter = new FileWriter(albums_path);
		
		try {
			albumsWriter.write(jsonAlbums);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			albumsWriter.flush();
			albumsWriter.close();
		}
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("Data successfully fetched.");
		
}

public void fetchAll() {
	
	
	List<String> showIds = Arrays.asList(
			"1ORXutIUV7choy21qjalf9", "7bFOGUPLYyksjmlSO86Fpk", 
			"5CWuDWqyovQKFxS9bPstNC", "5bOgnhXT3nMX7f1BO67tyD", 
			"5KhgRSELqgZXKh1N4qD4t9", "2NFzv1HCxM1v6pFgoB6wJy", 
			"71mtVlnMMhJ35YbiCzKzAz", "3Jil9IZ2a5yKt15vXgzUYr", 
			"18a8wg8LCaPwWJ7PbXDchZ", "3vag1pwyV1VU0dquxFVmVq");
	
	try {
		System.out.println("Fetching data...");
		token = authToken(auth_url);
		
	
		String jsonTop50 = fetchData(top50_url, token);
		String jsonShows = fetchShows(show_url, token, showIds);
		
		FileWriter top50Writer = new FileWriter(top50_path);
		FileWriter showsWriter = new FileWriter(shows_path);
		
		try {
			top50Writer.write(jsonTop50);
			showsWriter.write(jsonShows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			top50Writer.flush();
			top50Writer.close();
			showsWriter.flush();
			showsWriter.close();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
		
}
