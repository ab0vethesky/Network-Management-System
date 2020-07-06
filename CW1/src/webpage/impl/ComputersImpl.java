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

import webpage.Computers;
import webpage.Printer;
import webpage.Servers;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.ComputersImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link webpage.impl.ComputersImpl#getJobId <em>Job Id</em>}</li>
 *   <li>{@link webpage.impl.ComputersImpl#getSendJob <em>Send Job</em>}</li>
 *   <li>{@link webpage.impl.ComputersImpl#getSendPrintJob <em>Send Print Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputersImpl extends ResourceImpl implements Computers {
	/**
	 * The default value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected static final String CNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected String cname = CNAME_EDEFAULT;

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
	 * The cached value of the '{@link #getSendJob() <em>Send Job</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Servers> sendJob;

	/**
	 * The cached value of the '{@link #getSendPrintJob() <em>Send Print Job</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendPrintJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Printer> sendPrintJob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.COMPUTERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCname(String newCname) {
		String oldCname = cname;
		cname = newCname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.COMPUTERS__CNAME, oldCname, cname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.COMPUTERS__JOB_ID, oldJobId, jobId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Servers> getSendJob() {
		if (sendJob == null) {
			sendJob = new EObjectResolvingEList<Servers>(Servers.class, this, WebpagePackage.COMPUTERS__SEND_JOB);
		}
		return sendJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Printer> getSendPrintJob() {
		if (sendPrintJob == null) {
			sendPrintJob = new EObjectResolvingEList<Printer>(Printer.class, this, WebpagePackage.COMPUTERS__SEND_PRINT_JOB);
		}
		return sendPrintJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SendJob() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String SendPrintJob() {
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
			case WebpagePackage.COMPUTERS__CNAME:
				return getCname();
			case WebpagePackage.COMPUTERS__JOB_ID:
				return getJobId();
			case WebpagePackage.COMPUTERS__SEND_JOB:
				return getSendJob();
			case WebpagePackage.COMPUTERS__SEND_PRINT_JOB:
				return getSendPrintJob();
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
			case WebpagePackage.COMPUTERS__CNAME:
				setCname((String)newValue);
				return;
			case WebpagePackage.COMPUTERS__JOB_ID:
				setJobId((Integer)newValue);
				return;
			case WebpagePackage.COMPUTERS__SEND_JOB:
				getSendJob().clear();
				getSendJob().addAll((Collection<? extends Servers>)newValue);
				return;
			case WebpagePackage.COMPUTERS__SEND_PRINT_JOB:
				getSendPrintJob().clear();
				getSendPrintJob().addAll((Collection<? extends Printer>)newValue);
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
			case WebpagePackage.COMPUTERS__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case WebpagePackage.COMPUTERS__JOB_ID:
				setJobId(JOB_ID_EDEFAULT);
				return;
			case WebpagePackage.COMPUTERS__SEND_JOB:
				getSendJob().clear();
				return;
			case WebpagePackage.COMPUTERS__SEND_PRINT_JOB:
				getSendPrintJob().clear();
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
			case WebpagePackage.COMPUTERS__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case WebpagePackage.COMPUTERS__JOB_ID:
				return jobId != JOB_ID_EDEFAULT;
			case WebpagePackage.COMPUTERS__SEND_JOB:
				return sendJob != null && !sendJob.isEmpty();
			case WebpagePackage.COMPUTERS__SEND_PRINT_JOB:
				return sendPrintJob != null && !sendPrintJob.isEmpty();
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
			case WebpagePackage.COMPUTERS___SEND_JOB:
				SendJob();
				return null;
			case WebpagePackage.COMPUTERS___SEND_PRINT_JOB:
				return SendPrintJob();
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
		result.append(" (cname: ");
		result.append(cname);
		result.append(", jobId: ");
		result.append(jobId);
		result.append(')');
		return result.toString();
	}

} //ComputersImpl
