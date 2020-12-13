/**
 */
package tdt4250.spo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spotify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.Spotify#getShows <em>Shows</em>}</li>
 *   <li>{@link tdt4250.spo.Spotify#getPlaylists <em>Playlists</em>}</li>
 *   <li>{@link tdt4250.spo.Spotify#getAlbums <em>Albums</em>}</li>
 * </ul>
 *
 * @see tdt4250.spo.SpoPackage#getSpotify()
 * @model
 * @generated
 */
public interface Spotify extends EObject {
	/**
	 * Returns the value of the '<em><b>Shows</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.spo.Show}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows</em>' containment reference list.
	 * @see tdt4250.spo.SpoPackage#getSpotify_Shows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Show> getShows();

	/**
	 * Returns the value of the '<em><b>Playlists</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.spo.Playlist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playlists</em>' containment reference list.
	 * @see tdt4250.spo.SpoPackage#getSpotify_Playlists()
	 * @model containment="true"
	 * @generated
	 */
	EList<Playlist> getPlaylists();

	/**
	 * Returns the value of the '<em><b>Albums</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.spo.Album}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Albums</em>' containment reference list.
	 * @see tdt4250.spo.SpoPackage#getSpotify_Albums()
	 * @model containment="true"
	 * @generated
	 */
	EList<Album> getAlbums();

} // Spotify
