/**
 */
package tdt4250.spo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.spo.Episode;
import tdt4250.spo.Show;
import tdt4250.spo.SpoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Show</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.impl.ShowImpl#getEpisodes <em>Episodes</em>}</li>
 *   <li>{@link tdt4250.spo.impl.ShowImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.spo.impl.ShowImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link tdt4250.spo.impl.ShowImpl#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.spo.impl.ShowImpl#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link tdt4250.spo.impl.ShowImpl#getTotal_episodes <em>Total episodes</em>}</li>
 *   <li>{@link tdt4250.spo.impl.ShowImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShowImpl extends MinimalEObjectImpl.Container implements Show {
	/**
	 * The cached value of the '{@link #getEpisodes() <em>Episodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Episode> episodes;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isExplicit() <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicit() <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicit()
	 * @generated
	 * @ordered
	 */
	protected boolean explicit = EXPLICIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_episodes() <em>Total episodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_episodes()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_EPISODES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_episodes() <em>Total episodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_episodes()
	 * @generated
	 * @ordered
	 */
	protected int total_episodes = TOTAL_EPISODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpoPackage.Literals.SHOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Episode> getEpisodes() {
		if (episodes == null) {
			episodes = new EObjectContainmentEList<Episode>(Episode.class, this, SpoPackage.SHOW__EPISODES);
		}
		return episodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.SHOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.SHOW__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.SHOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicit() {
		return explicit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicit(boolean newExplicit) {
		boolean oldExplicit = explicit;
		explicit = newExplicit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.SHOW__EXPLICIT, oldExplicit, explicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_episodes() {
		return total_episodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_episodes(int newTotal_episodes) {
		int oldTotal_episodes = total_episodes;
		total_episodes = newTotal_episodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.SHOW__TOTAL_EPISODES, oldTotal_episodes, total_episodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.SHOW__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpoPackage.SHOW__EPISODES:
				return ((InternalEList<?>)getEpisodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpoPackage.SHOW__EPISODES:
				return getEpisodes();
			case SpoPackage.SHOW__NAME:
				return getName();
			case SpoPackage.SHOW__URI:
				return getUri();
			case SpoPackage.SHOW__ID:
				return getId();
			case SpoPackage.SHOW__EXPLICIT:
				return isExplicit();
			case SpoPackage.SHOW__TOTAL_EPISODES:
				return getTotal_episodes();
			case SpoPackage.SHOW__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpoPackage.SHOW__EPISODES:
				getEpisodes().clear();
				getEpisodes().addAll((Collection<? extends Episode>)newValue);
				return;
			case SpoPackage.SHOW__NAME:
				setName((String)newValue);
				return;
			case SpoPackage.SHOW__URI:
				setUri((String)newValue);
				return;
			case SpoPackage.SHOW__ID:
				setId((String)newValue);
				return;
			case SpoPackage.SHOW__EXPLICIT:
				setExplicit((Boolean)newValue);
				return;
			case SpoPackage.SHOW__TOTAL_EPISODES:
				setTotal_episodes((Integer)newValue);
				return;
			case SpoPackage.SHOW__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpoPackage.SHOW__EPISODES:
				getEpisodes().clear();
				return;
			case SpoPackage.SHOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpoPackage.SHOW__URI:
				setUri(URI_EDEFAULT);
				return;
			case SpoPackage.SHOW__ID:
				setId(ID_EDEFAULT);
				return;
			case SpoPackage.SHOW__EXPLICIT:
				setExplicit(EXPLICIT_EDEFAULT);
				return;
			case SpoPackage.SHOW__TOTAL_EPISODES:
				setTotal_episodes(TOTAL_EPISODES_EDEFAULT);
				return;
			case SpoPackage.SHOW__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpoPackage.SHOW__EPISODES:
				return episodes != null && !episodes.isEmpty();
			case SpoPackage.SHOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpoPackage.SHOW__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case SpoPackage.SHOW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpoPackage.SHOW__EXPLICIT:
				return explicit != EXPLICIT_EDEFAULT;
			case SpoPackage.SHOW__TOTAL_EPISODES:
				return total_episodes != TOTAL_EPISODES_EDEFAULT;
			case SpoPackage.SHOW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", uri: ");
		result.append(uri);
		result.append(", id: ");
		result.append(id);
		result.append(", explicit: ");
		result.append(explicit);
		result.append(", total_episodes: ");
		result.append(total_episodes);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ShowImpl
