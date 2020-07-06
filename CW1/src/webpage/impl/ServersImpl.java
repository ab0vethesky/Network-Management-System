/**
 */
package webpage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import webpage.Servers;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.ServersImpl#getSname <em>Sname</em>}</li>
 *   <li>{@link webpage.impl.ServersImpl#getMaxCapacity <em>Max Capacity</em>}</li>
 *   <li>{@link webpage.impl.ServersImpl#getJobId <em>Job Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServersImpl extends ResourceImpl implements Servers {
	/**
	 * The default value of the '{@link #getSname() <em>Sname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSname()
	 * @generated
	 * @ordered
	 */
	protected static final String SNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSname() <em>Sname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSname()
	 * @generated
	 * @ordered
	 */
	protected String sname = SNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCapacity() <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCapacity() <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected int maxCapacity = MAX_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobId() <em>Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobId()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJobId() <em>Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobId()
	 * @generated
	 * @ordered
	 */
	protected int jobId = JOB_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.SERVERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSname(String newSname) {
		String oldSname = sname;
		sname = newSname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.SERVERS__SNAME, oldSname, sname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCapacity(int newMaxCapacity) {
		int oldMaxCapacity = maxCapacity;
		maxCapacity = newMaxCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.SERVERS__MAX_CAPACITY, oldMaxCapacity, maxCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobId() {
		return jobId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobId(int newJobId) {
		int oldJobId = jobId;
		jobId = newJobId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.SERVERS__JOB_ID, oldJobId, jobId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebpagePackage.SERVERS__SNAME:
				return getSname();
			case WebpagePackage.SERVERS__MAX_CAPACITY:
				return getMaxCapacity();
			case WebpagePackage.SERVERS__JOB_ID:
				return getJobId();
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
			case WebpagePackage.SERVERS__SNAME:
				setSname((String)newValue);
				return;
			case WebpagePackage.SERVERS__MAX_CAPACITY:
				setMaxCapacity((Integer)newValue);
				return;
			case WebpagePackage.SERVERS__JOB_ID:
				setJobId((Integer)newValue);
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
			case WebpagePackage.SERVERS__SNAME:
				setSname(SNAME_EDEFAULT);
				return;
			case WebpagePackage.SERVERS__MAX_CAPACITY:
				setMaxCapacity(MAX_CAPACITY_EDEFAULT);
				return;
			case WebpagePackage.SERVERS__JOB_ID:
				setJobId(JOB_ID_EDEFAULT);
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
			case WebpagePackage.SERVERS__SNAME:
				return SNAME_EDEFAULT == null ? sname != null : !SNAME_EDEFAULT.equals(sname);
			case WebpagePackage.SERVERS__MAX_CAPACITY:
				return maxCapacity != MAX_CAPACITY_EDEFAULT;
			case WebpagePackage.SERVERS__JOB_ID:
				return jobId != JOB_ID_EDEFAULT;
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
		result.append(" (sname: ");
		result.append(sname);
		result.append(", MaxCapacity: ");
		result.append(maxCapacity);
		result.append(", jobId: ");
		result.append(jobId);
		result.append(')');
		return result.toString();
	}

} //ServersImpl
