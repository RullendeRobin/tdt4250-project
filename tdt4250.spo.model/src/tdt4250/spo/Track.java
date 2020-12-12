/**
 */
package tdt4250.spo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.Track#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.spo.Track#getUri <em>Uri</em>}</li>
 *   <li>{@link tdt4250.spo.Track#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link tdt4250.spo.Track#getDuration_ms <em>Duration ms</em>}</li>
 *   <li>{@link tdt4250.spo.Track#getArtists <em>Artists</em>}</li>
 *   <li>{@link tdt4250.spo.Track#getAlbum <em>Album</em>}</li>
 *   <li>{@link tdt4250.spo.Track#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see tdt4250.spo.SpoPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.spo.SpoPackage#getTrack_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Track#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see tdt4250.spo.SpoPackage#getTrack_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Track#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit</em>' attribute.
	 * @see #setExplicit(boolean)
	 * @see tdt4250.spo.SpoPackage#getTrack_Explicit()
	 * @model
	 * @generated
	 */
	boolean isExplicit();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Track#isExplicit <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit</em>' attribute.
	 * @see #isExplicit()
	 * @generated
	 */
	void setExplicit(boolean value);

	/**
	 * Returns the value of the '<em><b>Duration ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration ms</em>' attribute.
	 * @see #setDuration_ms(int)
	 * @see tdt4250.spo.SpoPackage#getTrack_Duration_ms()
	 * @model
	 * @generated
	 */
	int getDuration_ms();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Track#getDuration_ms <em>Duration ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration ms</em>' attribute.
	 * @see #getDuration_ms()
	 * @generated
	 */
	void setDuration_ms(int value);

	/**
	 * Returns the value of the '<em><b>Artists</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.spo.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' containment reference list.
	 * @see tdt4250.spo.SpoPackage#getTrack_Artists()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Artist> getArtists();

	/**
	 * Returns the value of the '<em><b>Album</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.spo.Album#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Album</em>' container reference.
	 * @see #setAlbum(Album)
	 * @see tdt4250.spo.SpoPackage#getTrack_Album()
	 * @see tdt4250.spo.Album#getTracks
	 * @model opposite="tracks" transient="false"
	 * @generated
	 */
	Album getAlbum();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Track#getAlbum <em>Album</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Album</em>' container reference.
	 * @see #getAlbum()
	 * @generated
	 */
	void setAlbum(Album value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see tdt4250.spo.SpoPackage#getTrack_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Track#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Track
