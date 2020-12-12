/**
 */
package tdt4250.spo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.Playlist#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.spo.Playlist#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see tdt4250.spo.SpoPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.spo.SpoPackage#getPlaylist_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Playlist#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.spo.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' reference list.
	 * @see tdt4250.spo.SpoPackage#getPlaylist_Tracks()
	 * @model
	 * @generated
	 */
	EList<Track> getTracks();

} // Playlist
