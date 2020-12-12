package fetchData;


public class Main {
	
	private final static String top50_path = "data/top50.json";
	private final static String shows_path = "data/shows.json";
	private final static String albums_path = "data/albums.json";
	
	public static void main(String[] args) {
		
		//Fetches the newest data and maps it
		Fetch fetch = new Fetch(top50_path, shows_path, albums_path);
		fetch.fetchAll();
		Mapper mapper = new Mapper(top50_path, shows_path);
		
		//Fetches the albums for the new data and maps them
		fetch.fetchAlbums(mapper.getAlbumIds());
		mapper.mapAlbums(albums_path);
		mapper.mapToModel();
		
	}

}
