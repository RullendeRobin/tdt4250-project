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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import tdt4250.spo.Album;
import tdt4250.spo.Artist;
import tdt4250.spo.SpoPackage;
import tdt4250.spo.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.impl.TrackImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.spo.impl.TrackImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link tdt4250.spo.impl.TrackImpl#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link tdt4250.spo.impl.TrackImpl#getDuration_ms <em>Duration ms</em>}</li>
 *   <li>{@link tdt4250.spo.impl.TrackImpl#getArtists <em>Artists</em>}</li>
 *   <li>{@link tdt4250.spo.impl.TrackImpl#getAlbum <em>Album</em>}</li>
 *   <li>{@link tdt4250.spo.impl.TrackImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackImpl extends MinimalEObjectImpl.Container implements Track {
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
	 * The default value of the '{@link #getDuration_ms() <em>Duration ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_ms()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_MS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration_ms() <em>Duration ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_ms()
	 * @generated
	 * @ordered
	 */
	protected int duration_ms = DURATION_MS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtists() <em>Artists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtists()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> artists;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpoPackage.Literals.TRACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.TRACK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.TRACK__URI, oldUri, uri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.TRACK__EXPLICIT, oldExplicit, explicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration_ms() {
		return duration_ms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration_ms(int newDuration_ms) {
		int oldDuration_ms = duration_ms;
		duration_ms = newDuration_ms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.TRACK__DURATION_MS, oldDuration_ms, duration_ms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artist> getArtists() {
		if (artists == null) {
			artists = new EObjectContainmentEList<Artist>(Artist.class, this, SpoPackage.TRACK__ARTISTS);
		}
		return artists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Album getAlbum() {
		if (eContainerFeatureID() != SpoPackage.TRACK__ALBUM) return null;
		return (Album)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlbum(Album newAlbum, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAlbum, SpoPackage.TRACK__ALBUM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlbum(Album newAlbum) {
		if (newAlbum != eInternalContainer() || (eContainerFeatureID() != SpoPackage.TRACK__ALBUM && newAlbum != null)) {
			if (EcoreUtil.isAncestor(this, newAlbum))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAlbum != null)
				msgs = ((InternalEObject)newAlbum).eInverseAdd(this, SpoPackage.ALBUM__TRACKS, Album.class, msgs);
			msgs = basicSetAlbum(newAlbum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.TRACK__ALBUM, newAlbum, newAlbum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.TRACK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpoPackage.TRACK__ALBUM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAlbum((Album)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpoPackage.TRACK__ARTISTS:
				return ((InternalEList<?>)getArtists()).basicRemove(otherEnd, msgs);
			case SpoPackage.TRACK__ALBUM:
				return basicSetAlbum(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpoPackage.TRACK__ALBUM:
				return eInternalContainer().eInverseRemove(this, SpoPackage.ALBUM__TRACKS, Album.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpoPackage.TRACK__NAME:
				return getName();
			case SpoPackage.TRACK__URI:
				return getUri();
			case SpoPackage.TRACK__EXPLICIT:
				return isExplicit();
			case SpoPackage.TRACK__DURATION_MS:
				return getDuration_ms();
			case SpoPackage.TRACK__ARTISTS:
				return getArtists();
			case SpoPackage.TRACK__ALBUM:
				return getAlbum();
			case SpoPackage.TRACK__ID:
				return getId();
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
			case SpoPackage.TRACK__NAME:
				setName((String)newValue);
				return;
			case SpoPackage.TRACK__URI:
				setUri((String)newValue);
				return;
			case SpoPackage.TRACK__EXPLICIT:
				setExplicit((Boolean)newValue);
				return;
			case SpoPackage.TRACK__DURATION_MS:
				setDuration_ms((Integer)newValue);
				return;
			case SpoPackage.TRACK__ARTISTS:
				getArtists().clear();
				getArtists().addAll((Collection<? extends Artist>)newValue);
				return;
			case SpoPackage.TRACK__ALBUM:
				setAlbum((Album)newValue);
				return;
			case SpoPackage.TRACK__ID:
				setId((String)newValue);
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
			case SpoPackage.TRACK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpoPackage.TRACK__URI:
				setUri(URI_EDEFAULT);
				return;
			case SpoPackage.TRACK__EXPLICIT:
				setExplicit(EXPLICIT_EDEFAULT);
				return;
			case SpoPackage.TRACK__DURATION_MS:
				setDuration_ms(DURATION_MS_EDEFAULT);
				return;
			case SpoPackage.TRACK__ARTISTS:
				getArtists().clear();
				return;
			case SpoPackage.TRACK__ALBUM:
				setAlbum((Album)null);
				return;
			case SpoPackage.TRACK__ID:
				setId(ID_EDEFAULT);
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
			case SpoPackage.TRACK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpoPackage.TRACK__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case SpoPackage.TRACK__EXPLICIT:
				return explicit != EXPLICIT_EDEFAULT;
			case SpoPackage.TRACK__DURATION_MS:
				return duration_ms != DURATION_MS_EDEFAULT;
			case SpoPackage.TRACK__ARTISTS:
				return artists != null && !artists.isEmpty();
			case SpoPackage.TRACK__ALBUM:
				return getAlbum() != null;
			case SpoPackage.TRACK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", explicit: ");
		result.append(explicit);
		result.append(", duration_ms: ");
		result.append(duration_ms);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TrackImpl
