/**
 */
package webpage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import webpage.User;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.UserImpl#getUsid <em>Usid</em>}</li>
 *   <li>{@link webpage.impl.UserImpl#getUname <em>Uname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends UsersImpl implements User {
	/**
	 * The default value of the '{@link #getUsid() <em>Usid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsid()
	 * @generated
	 * @ordered
	 */
	protected static final int USID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsid() <em>Usid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsid()
	 * @generated
	 * @ordered
	 */
	protected int usid = USID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUname() <em>Uname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUname()
	 * @generated
	 * @ordered
	 */
	protected static final String UNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUname() <em>Uname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUname()
	 * @generated
	 * @ordered
	 */
	protected String uname = UNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsid() {
		return usid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsid(int newUsid) {
		int oldUsid = usid;
		usid = newUsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.USER__USID, oldUsid, usid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUname(String newUname) {
		String oldUname = uname;
		uname = newUname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.USER__UNAME, oldUname, uname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebpagePackage.USER__USID:
				return getUsid();
			case WebpagePackage.USER__UNAME:
				return getUname();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebpagePackage.USER__USID:
				setUsid((Integer)newValue);
				return;
			case WebpagePackage.USER__UNAME:
				setUname((String)newValue);
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
			case WebpagePackage.USER__USID:
				setUsid(USID_EDEFAULT);
				return;
			case WebpagePackage.USER__UNAME:
				setUname(UNAME_EDEFAULT);
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
			case WebpagePackage.USER__USID:
				return usid != USID_EDEFAULT;
			case WebpagePackage.USER__UNAME:
				return UNAME_EDEFAULT == null ? uname != null : !UNAME_EDEFAULT.equals(uname);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (usid: ");
		result.append(usid);
		result.append(", uname: ");
		result.append(uname);
		result.append(')');
		return result.toString();
	}

} //UserImpl
