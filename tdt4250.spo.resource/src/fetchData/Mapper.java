package fetchData;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import jsonPojo.Albums;
import jsonPojo.Item;
import jsonPojo.PlaylistObj;
import jsonPojo.ShowObj;
import jsonPojo.ShowsObj;
import jsonPojo.TrackObj;
import tdt4250.spo.Album;
import tdt4250.spo.Artist;
import tdt4250.spo.Episode;
import tdt4250.spo.Playlist;
import tdt4250.spo.Show;
import tdt4250.spo.SpoFactory;
import tdt4250.spo.SpoPackage;
import tdt4250.spo.Spotify;
import tdt4250.spo.Track;


public class Mapper {
	
	private PlaylistObj playlistObj;
	private ShowsObj showsObj;
	private Albums albums;
	
	private List<String> albumIds;
	
	ObjectMapper om;
	
	public Mapper(String top50_path, String shows_path) {
		om = new ObjectMapper();
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		try {
			playlistObj = om.readValue(new URL("file:" + top50_path), PlaylistObj.class);
			showsObj = om.readValue(new URL("file:" + shows_path), ShowsObj.class);
			setAlbumIds();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void mapAlbums(String albums_path) {
		
		try {
			albums = om.readValue(new URL("file:" + albums_path), Albums.class);
			for (jsonPojo.Album album : albums.albums) {
				
				for (TrackObj track : album.tracks.items) {
					track.album = album;	
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	private void setAlbumIds() {
		int count = 0;
		String albumIds1 = "";
		String albumIds2 = "";
		String albumIds3 = "";
		for (Item item : playlistObj.items) {
			if (count < 20) {
				albumIds1 +=item.track.album.id+",";
			} else if (count < 40) {
				albumIds2 +=item.track.album.id+",";
			} else {
				albumIds3 +=item.track.album.id+",";
			}

			count++;
		}
		albumIds1 = albumIds1.substring(0, albumIds1.lastIndexOf(","));
		albumIds2 = albumIds2.substring(0, albumIds2.lastIndexOf(","));
		albumIds3 = albumIds3.substring(0, albumIds3.lastIndexOf(","));
		albumIds = Arrays.asList(albumIds1, albumIds2, albumIds3);
	}
	

	
	public List<String> getAlbumIds() {
		return albumIds;
	}
	
	public void mapToModel() {
		
		System.out.println("Mapping to Ecore...");
		SpoPackage.eINSTANCE.eClass();
		SpoFactory factory = SpoFactory.eINSTANCE;
		
		Spotify spotify = createSpotify(factory);
		Playlist playlist = createPlaylist(factory, spotify);
		addAlbums(factory, spotify);
		addTracksPlaylist(spotify, playlist);
		addShows(factory, spotify);
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        
        ResourceSet resSet = new ResourceSetImpl();
        
        Resource resource = resSet.createResource(URI.createURI("../tdt4250.spo.model/model/sample.xmi"));
		
        resource.getContents().add(spotify);
        
        try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Data successfully mapped, sample.xmi can be found in model folder.");
	}

	private Spotify createSpotify(SpoFactory factory) {
		Spotify spotify = factory.createSpotify();
		return spotify;
	}
	
	private Playlist createPlaylist(SpoFactory factory, Spotify spotify) {
		Playlist playlist = factory.createPlaylist();
		playlist.setName("Top 50 Global");
		spotify.getPlaylists().add(playlist);
		return playlist;
	}

	private void addTracksPlaylist(Spotify spotify, Playlist playlist) {
		
		for (Item item : playlistObj.items) {
			String id = item.track.id;
			for (Album album : spotify.getAlbums()) {
				for (Track track : album.getTracks()) {
					if (id.equals(track.getId())) {
						playlist.getTracks().add(track);
					}
				}
			}
		}	
	}
	
	private Artist createArtist(SpoFactory factory, jsonPojo.Artist artistObj) {
		Artist artist = factory.createArtist();
		artist.setName(artistObj.name);
		artist.setUri(artistObj.uri);
		return artist;
	}

	private void addShows(SpoFactory factory, Spotify spotify) {
		for (ShowObj showObj : showsObj.shows) {
			Show show = factory.createShow();
			show.setExplicit(showObj.explicit);
			show.setId(showObj.id);
			show.setName(showObj.name);
			show.setUri(showObj.uri);
			show.setDescription(showObj.description);
			show.setTotal_episodes(showObj.total_episodes);
			for (jsonPojo.Episode episodeObj : showObj.episodes.items) {
				show.getEpisodes().add(createEpisode(factory, episodeObj));
			}
			spotify.getShows().add(show);
		}
	}
	
	private Episode createEpisode(SpoFactory factory, jsonPojo.Episode episodeObj) {
		Episode episode = factory.createEpisode();
		episode.setExplicit(episodeObj.explicit);
		episode.setId(episodeObj.id);
		episode.setName(episodeObj.name);
		episode.setUri(episodeObj.uri);
		episode.setDuration(episodeObj.duration_ms);
		episode.setRelease_date(episodeObj.release_date);
		return episode;
	}
	
	private void addAlbums(SpoFactory factory, Spotify spotify) {
		List<String> added = new ArrayList<>();
		for (jsonPojo.Album albumObj : albums.albums) {
			Album album = factory.createAlbum();
			String id = albumObj.id;
			album.setId(id);
			album.setLabel(albumObj.label);
			album.setName(albumObj.name);
			album.setRelease_date(albumObj.release_date);
			album.setUri(albumObj.uri);
			album.setArtist(createArtist(factory, albumObj.artists.get(0)));
			for (TrackObj trackObj : albumObj.tracks.items) {
				Track track = createTrack(factory, trackObj);
				track.setAlbum(album);
				album.getTracks().add(track);
			}
			try {
				if (!added.contains(id)) {
					spotify.getAlbums().add(album);
					added.add(id);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	private Track createTrack(SpoFactory factory, TrackObj trackObj) {
		Track track = factory.createTrack();
		track.setName(trackObj.name);
		track.setUri(trackObj.uri);
		track.setDuration_ms(trackObj.duration_ms);
		track.setExplicit(trackObj.explicit);
		track.setId(trackObj.id);
		for (jsonPojo.Artist artistObj: trackObj.artists) {
			track.getArtists().add(createArtist(factory, artistObj));
		}
		return track;
	}
	
	
}
