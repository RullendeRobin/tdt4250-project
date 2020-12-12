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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.spo.Album;
import tdt4250.spo.Artist;
import tdt4250.spo.SpoPackage;
import tdt4250.spo.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.impl.AlbumImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.spo.impl.AlbumImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link tdt4250.spo.impl.AlbumImpl#getId <em>Id</em>}</li>
 *   <li>{@link tdt4250.spo.impl.AlbumImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link tdt4250.spo.impl.AlbumImpl#getRelease_date <em>Release date</em>}</li>
 *   <li>{@link tdt4250.spo.impl.AlbumImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link tdt4250.spo.impl.AlbumImpl#getArtist <em>Artist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlbumImpl extends MinimalEObjectImpl.Container implements Album {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelease_date() <em>Release date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease_date()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelease_date() <em>Release date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease_date()
	 * @generated
	 * @ordered
	 */
	protected String release_date = RELEASE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> tracks;

	/**
	 * The cached value of the '{@link #getArtist() <em>Artist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected Artist artist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpoPackage.Literals.ALBUM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.ALBUM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.ALBUM__URI, oldUri, uri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.ALBUM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.ALBUM__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelease_date() {
		return release_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease_date(String newRelease_date) {
		String oldRelease_date = release_date;
		release_date = newRelease_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.ALBUM__RELEASE_DATE, oldRelease_date, release_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentWithInverseEList<Track>(Track.class, this, SpoPackage.ALBUM__TRACKS, SpoPackage.TRACK__ALBUM);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist getArtist() {
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtist(Artist newArtist, NotificationChain msgs) {
		Artist oldArtist = artist;
		artist = newArtist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpoPackage.ALBUM__ARTIST, oldArtist, newArtist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtist(Artist newArtist) {
		if (newArtist != artist) {
			NotificationChain msgs = null;
			if (artist != null)
				msgs = ((InternalEObject)artist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpoPackage.ALBUM__ARTIST, null, msgs);
			if (newArtist != null)
				msgs = ((InternalEObject)newArtist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpoPackage.ALBUM__ARTIST, null, msgs);
			msgs = basicSetArtist(newArtist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.ALBUM__ARTIST, newArtist, newArtist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpoPackage.ALBUM__TRACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTracks()).basicAdd(otherEnd, msgs);
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
			case SpoPackage.ALBUM__TRACKS:
				return ((InternalEList<?>)getTracks()).basicRemove(otherEnd, msgs);
			case SpoPackage.ALBUM__ARTIST:
				return basicSetArtist(null, msgs);
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
			case SpoPackage.ALBUM__NAME:
				return getName();
			case SpoPackage.ALBUM__URI:
				return getUri();
			case SpoPackage.ALBUM__ID:
				return getId();
			case SpoPackage.ALBUM__LABEL:
				return getLabel();
			case SpoPackage.ALBUM__RELEASE_DATE:
				return getRelease_date();
			case SpoPackage.ALBUM__TRACKS:
				return getTracks();
			case SpoPackage.ALBUM__ARTIST:
				return getArtist();
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
			case SpoPackage.ALBUM__NAME:
				setName((String)newValue);
				return;
			case SpoPackage.ALBUM__URI:
				setUri((String)newValue);
				return;
			case SpoPackage.ALBUM__ID:
				setId((String)newValue);
				return;
			case SpoPackage.ALBUM__LABEL:
				setLabel((String)newValue);
				return;
			case SpoPackage.ALBUM__RELEASE_DATE:
				setRelease_date((String)newValue);
				return;
			case SpoPackage.ALBUM__TRACKS:
				getTracks().clear();
				getTracks().addAll((Collection<? extends Track>)newValue);
				return;
			case SpoPackage.ALBUM__ARTIST:
				setArtist((Artist)newValue);
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
			case SpoPackage.ALBUM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpoPackage.ALBUM__URI:
				setUri(URI_EDEFAULT);
				return;
			case SpoPackage.ALBUM__ID:
				setId(ID_EDEFAULT);
				return;
			case SpoPackage.ALBUM__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SpoPackage.ALBUM__RELEASE_DATE:
				setRelease_date(RELEASE_DATE_EDEFAULT);
				return;
			case SpoPackage.ALBUM__TRACKS:
				getTracks().clear();
				return;
			case SpoPackage.ALBUM__ARTIST:
				setArtist((Artist)null);
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
			case SpoPackage.ALBUM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpoPackage.ALBUM__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case SpoPackage.ALBUM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpoPackage.ALBUM__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SpoPackage.ALBUM__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? release_date != null : !RELEASE_DATE_EDEFAULT.equals(release_date);
			case SpoPackage.ALBUM__TRACKS:
				return tracks != null && !tracks.isEmpty();
			case SpoPackage.ALBUM__ARTIST:
				return artist != null;
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
		result.append(", label: ");
		result.append(label);
		result.append(", release_date: ");
		result.append(release_date);
		result.append(')');
		return result.toString();
	}

} //AlbumImpl
