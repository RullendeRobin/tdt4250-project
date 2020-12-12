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
 *   <li>{@link tdt4250.spo.Spotify#getName <em>Name</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.spo.SpoPackage#getSpotify_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Spotify#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Spotify
