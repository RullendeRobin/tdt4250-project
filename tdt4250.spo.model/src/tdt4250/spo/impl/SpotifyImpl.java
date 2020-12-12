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

import tdt4250.spo.Album;
import tdt4250.spo.Playlist;
import tdt4250.spo.Show;
import tdt4250.spo.SpoPackage;
import tdt4250.spo.Spotify;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spotify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.spo.impl.SpotifyImpl#getShows <em>Shows</em>}</li>
 *   <li>{@link tdt4250.spo.impl.SpotifyImpl#getPlaylists <em>Playlists</em>}</li>
 *   <li>{@link tdt4250.spo.impl.SpotifyImpl#getAlbums <em>Albums</em>}</li>
 *   <li>{@link tdt4250.spo.impl.SpotifyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpotifyImpl extends MinimalEObjectImpl.Container implements Spotify {
	/**
	 * The cached value of the '{@link #getShows() <em>Shows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShows()
	 * @generated
	 * @ordered
	 */
	protected EList<Show> shows;

	/**
	 * The cached value of the '{@link #getPlaylists() <em>Playlists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaylists()
	 * @generated
	 * @ordered
	 */
	protected EList<Playlist> playlists;

	/**
	 * The cached value of the '{@link #getAlbums() <em>Albums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbums()
	 * @generated
	 * @ordered
	 */
	protected EList<Album> albums;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpotifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpoPackage.Literals.SPOTIFY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Show> getShows() {
		if (shows == null) {
			shows = new EObjectContainmentEList<Show>(Show.class, this, SpoPackage.SPOTIFY__SHOWS);
		}
		return shows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Playlist> getPlaylists() {
		if (playlists == null) {
			playlists = new EObjectContainmentEList<Playlist>(Playlist.class, this, SpoPackage.SPOTIFY__PLAYLISTS);
		}
		return playlists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Album> getAlbums() {
		if (albums == null) {
			albums = new EObjectContainmentEList<Album>(Album.class, this, SpoPackage.SPOTIFY__ALBUMS);
		}
		return albums;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpoPackage.SPOTIFY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpoPackage.SPOTIFY__SHOWS:
				return ((InternalEList<?>)getShows()).basicRemove(otherEnd, msgs);
			case SpoPackage.SPOTIFY__PLAYLISTS:
				return ((InternalEList<?>)getPlaylists()).basicRemove(otherEnd, msgs);
			case SpoPackage.SPOTIFY__ALBUMS:
				return ((InternalEList<?>)getAlbums()).basicRemove(otherEnd, msgs);
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
			case SpoPackage.SPOTIFY__SHOWS:
				return getShows();
			case SpoPackage.SPOTIFY__PLAYLISTS:
				return getPlaylists();
			case SpoPackage.SPOTIFY__ALBUMS:
				return getAlbums();
			case SpoPackage.SPOTIFY__NAME:
				return getName();
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
			case SpoPackage.SPOTIFY__SHOWS:
				getShows().clear();
				getShows().addAll((Collection<? extends Show>)newValue);
				return;
			case SpoPackage.SPOTIFY__PLAYLISTS:
				getPlaylists().clear();
				getPlaylists().addAll((Collection<? extends Playlist>)newValue);
				return;
			case SpoPackage.SPOTIFY__ALBUMS:
				getAlbums().clear();
				getAlbums().addAll((Collection<? extends Album>)newValue);
				return;
			case SpoPackage.SPOTIFY__NAME:
				setName((String)newValue);
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
			case SpoPackage.SPOTIFY__SHOWS:
				getShows().clear();
				return;
			case SpoPackage.SPOTIFY__PLAYLISTS:
				getPlaylists().clear();
				return;
			case SpoPackage.SPOTIFY__ALBUMS:
				getAlbums().clear();
				return;
			case SpoPackage.SPOTIFY__NAME:
				setName(NAME_EDEFAULT);
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
			case SpoPackage.SPOTIFY__SHOWS:
				return shows != null && !shows.isEmpty();
			case SpoPackage.SPOTIFY__PLAYLISTS:
				return playlists != null && !playlists.isEmpty();
			case SpoPackage.SPOTIFY__ALBUMS:
				return albums != null && !albums.isEmpty();
			case SpoPackage.SPOTIFY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //SpotifyImpl
