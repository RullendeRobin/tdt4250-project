/**
 */
package tdt4250.spo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.spo.SpoFactory
 * @model kind="package"
 * @generated
 */
public interface SpoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.spo.model/model/spo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpoPackage eINSTANCE = tdt4250.spo.impl.SpoPackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.spo.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.spo.impl.PlaylistImpl
	 * @see tdt4250.spo.impl.SpoPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__TRACKS = 1;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.spo.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.spo.impl.TrackImpl
	 * @see tdt4250.spo.impl.SpoPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__URI = 1;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__EXPLICIT = 2;

	/**
	 * The feature id for the '<em><b>Duration ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__DURATION_MS = 3;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ARTISTS = 4;

	/**
	 * The feature id for the '<em><b>Album</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ALBUM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ID = 6;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.spo.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.spo.impl.ArtistImpl
	 * @see tdt4250.spo.impl.SpoPackageImpl#getArtist()
	 * @generated
	 */
	int ARTIST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__URI = 1;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.spo.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.spo.impl.AlbumImpl
	 * @see tdt4250.spo.impl.SpoPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__URI = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ID = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Release date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__RELEASE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TRACKS = 5;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ARTIST = 6;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.spo.impl.SpotifyImpl <em>Spotify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.spo.impl.SpotifyImpl
	 * @see tdt4250.spo.impl.SpoPackageImpl#getSpotify()
	 * @generated
	 */
	int SPOTIFY = 4;

	/**
	 * The feature id for the '<em><b>Shows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY__SHOWS = 0;

	/**
	 * The feature id for the '<em><b>Playlists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY__PLAYLISTS = 1;

	/**
	 * The feature id for the '<em><b>Albums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY__ALBUMS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Spotify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Spotify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.spo.impl.ShowImpl <em>Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.spo.impl.ShowImpl
	 * @see tdt4250.spo.impl.SpoPackageImpl#getShow()
	 * @generated
	 */
	int SHOW = 5;

	/**
	 * The feature id for the '<em><b>Episodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__EPISODES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__URI = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__ID = 3;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__EXPLICIT = 4;

	/**
	 * The feature id for the '<em><b>Total episodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__TOTAL_EPISODES = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.spo.impl.EpisodeImpl <em>Episode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.spo.impl.EpisodeImpl
	 * @see tdt4250.spo.impl.SpoPackageImpl#getEpisode()
	 * @generated
	 */
	int EPISODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__URI = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__ID = 2;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__EXPLICIT = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__DURATION = 4;

	/**
	 * The feature id for the '<em><b>Release date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__RELEASE_DATE = 5;

	/**
	 * The number of structural features of the '<em>Episode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Episode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tdt4250.spo.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see tdt4250.spo.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Playlist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.spo.Playlist#getName()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Name();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.spo.Playlist#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracks</em>'.
	 * @see tdt4250.spo.Playlist#getTracks()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Tracks();

	/**
	 * Returns the meta object for class '{@link tdt4250.spo.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see tdt4250.spo.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Track#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.spo.Track#getName()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Track#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see tdt4250.spo.Track#getUri()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Uri();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Track#isExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit</em>'.
	 * @see tdt4250.spo.Track#isExplicit()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Explicit();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Track#getDuration_ms <em>Duration ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration ms</em>'.
	 * @see tdt4250.spo.Track#getDuration_ms()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Duration_ms();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.spo.Track#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artists</em>'.
	 * @see tdt4250.spo.Track#getArtists()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Artists();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.spo.Track#getAlbum <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Album</em>'.
	 * @see tdt4250.spo.Track#getAlbum()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Album();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Track#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.spo.Track#getId()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Id();

	/**
	 * Returns the meta object for class '{@link tdt4250.spo.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see tdt4250.spo.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Artist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.spo.Artist#getName()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Artist#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see tdt4250.spo.Artist#getUri()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Uri();

	/**
	 * Returns the meta object for class '{@link tdt4250.spo.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see tdt4250.spo.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Album#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.spo.Album#getName()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Album#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see tdt4250.spo.Album#getUri()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Uri();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Album#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.spo.Album#getId()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Id();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Album#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see tdt4250.spo.Album#getLabel()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Label();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Album#getRelease_date <em>Release date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release date</em>'.
	 * @see tdt4250.spo.Album#getRelease_date()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Release_date();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.spo.Album#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see tdt4250.spo.Album#getTracks()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Tracks();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.spo.Album#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artist</em>'.
	 * @see tdt4250.spo.Album#getArtist()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Artist();

	/**
	 * Returns the meta object for class '{@link tdt4250.spo.Spotify <em>Spotify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spotify</em>'.
	 * @see tdt4250.spo.Spotify
	 * @generated
	 */
	EClass getSpotify();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.spo.Spotify#getShows <em>Shows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shows</em>'.
	 * @see tdt4250.spo.Spotify#getShows()
	 * @see #getSpotify()
	 * @generated
	 */
	EReference getSpotify_Shows();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.spo.Spotify#getPlaylists <em>Playlists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Playlists</em>'.
	 * @see tdt4250.spo.Spotify#getPlaylists()
	 * @see #getSpotify()
	 * @generated
	 */
	EReference getSpotify_Playlists();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.spo.Spotify#getAlbums <em>Albums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Albums</em>'.
	 * @see tdt4250.spo.Spotify#getAlbums()
	 * @see #getSpotify()
	 * @generated
	 */
	EReference getSpotify_Albums();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Spotify#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.spo.Spotify#getName()
	 * @see #getSpotify()
	 * @generated
	 */
	EAttribute getSpotify_Name();

	/**
	 * Returns the meta object for class '{@link tdt4250.spo.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show</em>'.
	 * @see tdt4250.spo.Show
	 * @generated
	 */
	EClass getShow();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.spo.Show#getEpisodes <em>Episodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Episodes</em>'.
	 * @see tdt4250.spo.Show#getEpisodes()
	 * @see #getShow()
	 * @generated
	 */
	EReference getShow_Episodes();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Show#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.spo.Show#getName()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Show#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see tdt4250.spo.Show#getUri()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_Uri();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Show#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.spo.Show#getId()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_Id();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Show#isExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit</em>'.
	 * @see tdt4250.spo.Show#isExplicit()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_Explicit();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Show#getTotal_episodes <em>Total episodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total episodes</em>'.
	 * @see tdt4250.spo.Show#getTotal_episodes()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_Total_episodes();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Show#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tdt4250.spo.Show#getDescription()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_Description();

	/**
	 * Returns the meta object for class '{@link tdt4250.spo.Episode <em>Episode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episode</em>'.
	 * @see tdt4250.spo.Episode
	 * @generated
	 */
	EClass getEpisode();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Episode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.spo.Episode#getName()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Episode#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see tdt4250.spo.Episode#getUri()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_Uri();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Episode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.spo.Episode#getId()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_Id();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Episode#isExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit</em>'.
	 * @see tdt4250.spo.Episode#isExplicit()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_Explicit();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Episode#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see tdt4250.spo.Episode#getDuration()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_Duration();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.spo.Episode#getRelease_date <em>Release date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release date</em>'.
	 * @see tdt4250.spo.Episode#getRelease_date()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_Release_date();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpoFactory getSpoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.spo.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.spo.impl.PlaylistImpl
		 * @see tdt4250.spo.impl.SpoPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__NAME = eINSTANCE.getPlaylist_Name();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__TRACKS = eINSTANCE.getPlaylist_Tracks();

		/**
		 * The meta object literal for the '{@link tdt4250.spo.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.spo.impl.TrackImpl
		 * @see tdt4250.spo.impl.SpoPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__NAME = eINSTANCE.getTrack_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__URI = eINSTANCE.getTrack_Uri();

		/**
		 * The meta object literal for the '<em><b>Explicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__EXPLICIT = eINSTANCE.getTrack_Explicit();

		/**
		 * The meta object literal for the '<em><b>Duration ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__DURATION_MS = eINSTANCE.getTrack_Duration_ms();

		/**
		 * The meta object literal for the '<em><b>Artists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__ARTISTS = eINSTANCE.getTrack_Artists();

		/**
		 * The meta object literal for the '<em><b>Album</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__ALBUM = eINSTANCE.getTrack_Album();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__ID = eINSTANCE.getTrack_Id();

		/**
		 * The meta object literal for the '{@link tdt4250.spo.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.spo.impl.ArtistImpl
		 * @see tdt4250.spo.impl.SpoPackageImpl#getArtist()
		 * @generated
		 */
		EClass ARTIST = eINSTANCE.getArtist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__NAME = eINSTANCE.getArtist_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__URI = eINSTANCE.getArtist_Uri();

		/**
		 * The meta object literal for the '{@link tdt4250.spo.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.spo.impl.AlbumImpl
		 * @see tdt4250.spo.impl.SpoPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__NAME = eINSTANCE.getAlbum_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__URI = eINSTANCE.getAlbum_Uri();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__ID = eINSTANCE.getAlbum_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__LABEL = eINSTANCE.getAlbum_Label();

		/**
		 * The meta object literal for the '<em><b>Release date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__RELEASE_DATE = eINSTANCE.getAlbum_Release_date();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__TRACKS = eINSTANCE.getAlbum_Tracks();

		/**
		 * The meta object literal for the '<em><b>Artist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__ARTIST = eINSTANCE.getAlbum_Artist();

		/**
		 * The meta object literal for the '{@link tdt4250.spo.impl.SpotifyImpl <em>Spotify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.spo.impl.SpotifyImpl
		 * @see tdt4250.spo.impl.SpoPackageImpl#getSpotify()
		 * @generated
		 */
		EClass SPOTIFY = eINSTANCE.getSpotify();

		/**
		 * The meta object literal for the '<em><b>Shows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOTIFY__SHOWS = eINSTANCE.getSpotify_Shows();

		/**
		 * The meta object literal for the '<em><b>Playlists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOTIFY__PLAYLISTS = eINSTANCE.getSpotify_Playlists();

		/**
		 * The meta object literal for the '<em><b>Albums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOTIFY__ALBUMS = eINSTANCE.getSpotify_Albums();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOTIFY__NAME = eINSTANCE.getSpotify_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.spo.impl.ShowImpl <em>Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.spo.impl.ShowImpl
		 * @see tdt4250.spo.impl.SpoPackageImpl#getShow()
		 * @generated
		 */
		EClass SHOW = eINSTANCE.getShow();

		/**
		 * The meta object literal for the '<em><b>Episodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW__EPISODES = eINSTANCE.getShow_Episodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__NAME = eINSTANCE.getShow_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__URI = eINSTANCE.getShow_Uri();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__ID = eINSTANCE.getShow_Id();

		/**
		 * The meta object literal for the '<em><b>Explicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__EXPLICIT = eINSTANCE.getShow_Explicit();

		/**
		 * The meta object literal for the '<em><b>Total episodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__TOTAL_EPISODES = eINSTANCE.getShow_Total_episodes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__DESCRIPTION = eINSTANCE.getShow_Description();

		/**
		 * The meta object literal for the '{@link tdt4250.spo.impl.EpisodeImpl <em>Episode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.spo.impl.EpisodeImpl
		 * @see tdt4250.spo.impl.SpoPackageImpl#getEpisode()
		 * @generated
		 */
		EClass EPISODE = eINSTANCE.getEpisode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__NAME = eINSTANCE.getEpisode_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__URI = eINSTANCE.getEpisode_Uri();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__ID = eINSTANCE.getEpisode_Id();

		/**
		 * The meta object literal for the '<em><b>Explicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__EXPLICIT = eINSTANCE.getEpisode_Explicit();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__DURATION = eINSTANCE.getEpisode_Duration();

		/**
		 * The meta object literal for the '<em><b>Release date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__RELEASE_DATE = eINSTANCE.getEpisode_Release_date();

	}

} //SpoPackage
