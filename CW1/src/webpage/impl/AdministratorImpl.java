/**
 */
package webpage.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import webpage.Administrator;
import webpage.User;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.AdministratorImpl#getAid <em>Aid</em>}</li>
 *   <li>{@link webpage.impl.AdministratorImpl#getAname <em>Aname</em>}</li>
 *   <li>{@link webpage.impl.AdministratorImpl#getCreateUser <em>Create User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministratorImpl extends UsersImpl implements Administrator {
	/**
	 * The default value of the '{@link #getAid() <em>Aid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAid()
	 * @generated
	 * @ordered
	 */
	protected static final int AID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAid() <em>Aid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAid()
	 * @generated
	 * @ordered
	 */
	protected int aid = AID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAname() <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAname()
	 * @generated
	 * @ordered
	 */
	protected static final String ANAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAname() <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAname()
	 * @generated
	 * @ordered
	 */
	protected String aname = ANAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreateUser() <em>Create User</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> createUser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.ADMINISTRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAid(int newAid) {
		int oldAid = aid;
		aid = newAid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.ADMINISTRATOR__AID, oldAid, aid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAname() {
		return aname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAname(String newAname) {
		String oldAname = aname;
		aname = newAname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.ADMINISTRATOR__ANAME, oldAname, aname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getCreateUser() {
		if (createUser == null) {
			createUser = new EObjectResolvingEList<User>(User.class, this, WebpagePackage.ADMINISTRATOR__CREATE_USER);
		}
		return createUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createUser() {
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
			case WebpagePackage.ADMINISTRATOR__AID:
				return getAid();
			case WebpagePackage.ADMINISTRATOR__ANAME:
				return getAname();
			case WebpagePackage.ADMINISTRATOR__CREATE_USER:
				return getCreateUser();
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
			case WebpagePackage.ADMINISTRATOR__AID:
				setAid((Integer)newValue);
				return;
			case WebpagePackage.ADMINISTRATOR__ANAME:
				setAname((String)newValue);
				return;
			case WebpagePackage.ADMINISTRATOR__CREATE_USER:
				getCreateUser().clear();
				getCreateUser().addAll((Collection<? extends User>)newValue);
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
			case WebpagePackage.ADMINISTRATOR__AID:
				setAid(AID_EDEFAULT);
				return;
			case WebpagePackage.ADMINISTRATOR__ANAME:
				setAname(ANAME_EDEFAULT);
				return;
			case WebpagePackage.ADMINISTRATOR__CREATE_USER:
				getCreateUser().clear();
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
			case WebpagePackage.ADMINISTRATOR__AID:
				return aid != AID_EDEFAULT;
			case WebpagePackage.ADMINISTRATOR__ANAME:
				return ANAME_EDEFAULT == null ? aname != null : !ANAME_EDEFAULT.equals(aname);
			case WebpagePackage.ADMINISTRATOR__CREATE_USER:
				return createUser != null && !createUser.isEmpty();
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
			case WebpagePackage.ADMINISTRATOR___CREATE_USER:
				createUser();
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
		result.append(" (aid: ");
		result.append(aid);
		result.append(", aname: ");
		result.append(aname);
		result.append(')');
		return result.toString();
	}

} //AdministratorImpl
