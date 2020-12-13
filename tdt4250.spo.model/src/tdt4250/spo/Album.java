/**
 */
package tdt4250.spo;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.Album#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.spo.Album#getUri <em>Uri</em>}</li>
 *   <li>{@link tdt4250.spo.Album#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.spo.Album#getLabel <em>Label</em>}</li>
 *   <li>{@link tdt4250.spo.Album#getRelease_date <em>Release date</em>}</li>
 *   <li>{@link tdt4250.spo.Album#getTracks <em>Tracks</em>}</li>
 *   <li>{@link tdt4250.spo.Album#getArtist <em>Artist</em>}</li>
 * </ul>
 *
 * @see tdt4250.spo.SpoPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.spo.SpoPackage#getAlbum_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Album#getName <em>Name</em>}' attribute.
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
	 * @see tdt4250.spo.SpoPackage#getAlbum_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Album#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see tdt4250.spo.SpoPackage#getAlbum_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Album#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see tdt4250.spo.SpoPackage#getAlbum_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Album#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Release date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release date</em>' attribute.
	 * @see #setRelease_date(Date)
	 * @see tdt4250.spo.SpoPackage#getAlbum_Release_date()
	 * @model
	 * @generated
	 */
	Date getRelease_date();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Album#getRelease_date <em>Release date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release date</em>' attribute.
	 * @see #getRelease_date()
	 * @generated
	 */
	void setRelease_date(Date value);

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.spo.Track}.
	 * It is bidirectional and its opposite is '{@link tdt4250.spo.Track#getAlbum <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see tdt4250.spo.SpoPackage#getAlbum_Tracks()
	 * @see tdt4250.spo.Track#getAlbum
	 * @model opposite="album" containment="true"
	 * @generated
	 */
	EList<Track> getTracks();

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' containment reference.
	 * @see #setArtist(Artist)
	 * @see tdt4250.spo.SpoPackage#getAlbum_Artist()
	 * @model containment="true"
	 * @generated
	 */
	Artist getArtist();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Album#getArtist <em>Artist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artist</em>' containment reference.
	 * @see #getArtist()
	 * @generated
	 */
	void setArtist(Artist value);

} // Album
