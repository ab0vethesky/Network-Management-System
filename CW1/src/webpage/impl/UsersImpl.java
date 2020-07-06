/**
 */
package webpage.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import webpage.Computers;
import webpage.Resource;
import webpage.UserType;
import webpage.Users;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Users</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.UsersImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link webpage.impl.UsersImpl#getType <em>Type</em>}</li>
 *   <li>{@link webpage.impl.UsersImpl#getConfigureResource <em>Configure Resource</em>}</li>
 *   <li>{@link webpage.impl.UsersImpl#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsersImpl extends MinimalEObjectImpl.Container implements Users {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final int UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected int uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final UserType TYPE_EDEFAULT = UserType.ADMIN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected UserType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigureResource() <em>Configure Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigureResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> configureResource;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Computers> job;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.USERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(int newUid) {
		int oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.USERS__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(UserType newType) {
		UserType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.USERS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getConfigureResource() {
		if (configureResource == null) {
			configureResource = new EObjectResolvingEList<Resource>(Resource.class, this, WebpagePackage.USERS__CONFIGURE_RESOURCE);
		}
		return configureResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computers> getJob() {
		if (job == null) {
			job = new EObjectResolvingEList<Computers>(Computers.class, this, WebpagePackage.USERS__JOB);
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Job() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void configureResource() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebpagePackage.USERS__UID:
				return getUid();
			case WebpagePackage.USERS__TYPE:
				return getType();
			case WebpagePackage.USERS__CONFIGURE_RESOURCE:
				return getConfigureResource();
			case WebpagePackage.USERS__JOB:
				return getJob();
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
			case WebpagePackage.USERS__UID:
				setUid((Integer)newValue);
				return;
			case WebpagePackage.USERS__TYPE:
				setType((UserType)newValue);
				return;
			case WebpagePackage.USERS__CONFIGURE_RESOURCE:
				getConfigureResource().clear();
				getConfigureResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case WebpagePackage.USERS__JOB:
				getJob().clear();
				getJob().addAll((Collection<? extends Computers>)newValue);
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
			case WebpagePackage.USERS__UID:
				setUid(UID_EDEFAULT);
				return;
			case WebpagePackage.USERS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WebpagePackage.USERS__CONFIGURE_RESOURCE:
				getConfigureResource().clear();
				return;
			case WebpagePackage.USERS__JOB:
				getJob().clear();
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
			case WebpagePackage.USERS__UID:
				return uid != UID_EDEFAULT;
			case WebpagePackage.USERS__TYPE:
				return type != TYPE_EDEFAULT;
			case WebpagePackage.USERS__CONFIGURE_RESOURCE:
				return configureResource != null && !configureResource.isEmpty();
			case WebpagePackage.USERS__JOB:
				return job != null && !job.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebpagePackage.USERS___JOB:
				Job();
				return null;
			case WebpagePackage.USERS___CONFIGURE_RESOURCE:
				configureResource();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //UsersImpl
