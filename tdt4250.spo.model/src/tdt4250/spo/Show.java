/**
 */
package tdt4250.spo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.Show#getEpisodes <em>Episodes</em>}</li>
 *   <li>{@link tdt4250.spo.Show#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.spo.Show#getUri <em>Uri</em>}</li>
 *   <li>{@link tdt4250.spo.Show#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.spo.Show#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link tdt4250.spo.Show#getTotal_episodes <em>Total episodes</em>}</li>
 *   <li>{@link tdt4250.spo.Show#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see tdt4250.spo.SpoPackage#getShow()
 * @model
 * @generated
 */
public interface Show extends EObject {
	/**
	 * Returns the value of the '<em><b>Episodes</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.spo.Episode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episodes</em>' containment reference list.
	 * @see tdt4250.spo.SpoPackage#getShow_Episodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Episode> getEpisodes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.spo.SpoPackage#getShow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Show#getName <em>Name</em>}' attribute.
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
	 * @see tdt4250.spo.SpoPackage#getShow_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Show#getUri <em>Uri</em>}' attribute.
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
	 * @see tdt4250.spo.SpoPackage#getShow_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Show#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit</em>' attribute.
	 * @see #setExplicit(boolean)
	 * @see tdt4250.spo.SpoPackage#getShow_Explicit()
	 * @model
	 * @generated
	 */
	boolean isExplicit();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Show#isExplicit <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit</em>' attribute.
	 * @see #isExplicit()
	 * @generated
	 */
	void setExplicit(boolean value);

	/**
	 * Returns the value of the '<em><b>Total episodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total episodes</em>' attribute.
	 * @see #setTotal_episodes(int)
	 * @see tdt4250.spo.SpoPackage#getShow_Total_episodes()
	 * @model
	 * @generated
	 */
	int getTotal_episodes();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Show#getTotal_episodes <em>Total episodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total episodes</em>' attribute.
	 * @see #getTotal_episodes()
	 * @generated
	 */
	void setTotal_episodes(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tdt4250.spo.SpoPackage#getShow_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tdt4250.spo.Show#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Show
