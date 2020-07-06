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

import webpage.JobPriority;
import webpage.JobQueue;
import webpage.Printer;
import webpage.QueueStatus;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Printer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.PrinterImpl#getPname <em>Pname</em>}</li>
 *   <li>{@link webpage.impl.PrinterImpl#getQueueId <em>Queue Id</em>}</li>
 *   <li>{@link webpage.impl.PrinterImpl#getJobId <em>Job Id</em>}</li>
 *   <li>{@link webpage.impl.PrinterImpl#getQueueStatus <em>Queue Status</em>}</li>
 *   <li>{@link webpage.impl.PrinterImpl#getQueueJob <em>Queue Job</em>}</li>
 *   <li>{@link webpage.impl.PrinterImpl#getJobPriority <em>Job Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrinterImpl extends ResourceImpl implements Printer {
	/**
	 * The default value of the '{@link #getPname() <em>Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPname()
	 * @generated
	 * @ordered
	 */
	protected static final String PNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPname() <em>Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPname()
	 * @generated
	 * @ordered
	 */
	protected String pname = PNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueId() <em>Queue Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueId()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQueueId() <em>Queue Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueId()
	 * @generated
	 * @ordered
	 */
	protected int queueId = QUEUE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getQueueStatus() <em>Queue Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueStatus()
	 * @generated
	 * @ordered
	 */
	protected static final QueueStatus QUEUE_STATUS_EDEFAULT = QueueStatus.AVAILABLE;

	/**
	 * The cached value of the '{@link #getQueueStatus() <em>Queue Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueStatus()
	 * @generated
	 * @ordered
	 */
	protected QueueStatus queueStatus = QUEUE_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueueJob() <em>Queue Job</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueJob()
	 * @generated
	 * @ordered
	 */
	protected EList<JobQueue> queueJob;

	/**
	 * The default value of the '{@link #getJobPriority() <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriority()
	 * @generated
	 * @ordered
	 */
	protected static final JobPriority JOB_PRIORITY_EDEFAULT = JobPriority.URGENT;

	/**
	 * The cached value of the '{@link #getJobPriority() <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriority()
	 * @generated
	 * @ordered
	 */
	protected JobPriority jobPriority = JOB_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrinterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.PRINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPname(String newPname) {
		String oldPname = pname;
		pname = newPname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.PRINTER__PNAME, oldPname, pname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueId() {
		return queueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueId(int newQueueId) {
		int oldQueueId = queueId;
		queueId = newQueueId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.PRINTER__QUEUE_ID, oldQueueId, queueId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.PRINTER__JOB_ID, oldJobId, jobId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueStatus getQueueStatus() {
		return queueStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueStatus(QueueStatus newQueueStatus) {
		QueueStatus oldQueueStatus = queueStatus;
		queueStatus = newQueueStatus == null ? QUEUE_STATUS_EDEFAULT : newQueueStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.PRINTER__QUEUE_STATUS, oldQueueStatus, queueStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobQueue> getQueueJob() {
		if (queueJob == null) {
			queueJob = new EObjectResolvingEList<JobQueue>(JobQueue.class, this, WebpagePackage.PRINTER__QUEUE_JOB);
		}
		return queueJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobPriority getJobPriority() {
		return jobPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobPriority(JobPriority newJobPriority) {
		JobPriority oldJobPriority = jobPriority;
		jobPriority = newJobPriority == null ? JOB_PRIORITY_EDEFAULT : newJobPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.PRINTER__JOB_PRIORITY, oldJobPriority, jobPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void QueueJob() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printJob() {
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
			case WebpagePackage.PRINTER__PNAME:
				return getPname();
			case WebpagePackage.PRINTER__QUEUE_ID:
				return getQueueId();
			case WebpagePackage.PRINTER__JOB_ID:
				return getJobId();
			case WebpagePackage.PRINTER__QUEUE_STATUS:
				return getQueueStatus();
			case WebpagePackage.PRINTER__QUEUE_JOB:
				return getQueueJob();
			case WebpagePackage.PRINTER__JOB_PRIORITY:
				return getJobPriority();
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
			case WebpagePackage.PRINTER__PNAME:
				setPname((String)newValue);
				return;
			case WebpagePackage.PRINTER__QUEUE_ID:
				setQueueId((Integer)newValue);
				return;
			case WebpagePackage.PRINTER__JOB_ID:
				setJobId((Integer)newValue);
				return;
			case WebpagePackage.PRINTER__QUEUE_STATUS:
				setQueueStatus((QueueStatus)newValue);
				return;
			case WebpagePackage.PRINTER__QUEUE_JOB:
				getQueueJob().clear();
				getQueueJob().addAll((Collection<? extends JobQueue>)newValue);
				return;
			case WebpagePackage.PRINTER__JOB_PRIORITY:
				setJobPriority((JobPriority)newValue);
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
			case WebpagePackage.PRINTER__PNAME:
				setPname(PNAME_EDEFAULT);
				return;
			case WebpagePackage.PRINTER__QUEUE_ID:
				setQueueId(QUEUE_ID_EDEFAULT);
				return;
			case WebpagePackage.PRINTER__JOB_ID:
				setJobId(JOB_ID_EDEFAULT);
				return;
			case WebpagePackage.PRINTER__QUEUE_STATUS:
				setQueueStatus(QUEUE_STATUS_EDEFAULT);
				return;
			case WebpagePackage.PRINTER__QUEUE_JOB:
				getQueueJob().clear();
				return;
			case WebpagePackage.PRINTER__JOB_PRIORITY:
				setJobPriority(JOB_PRIORITY_EDEFAULT);
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
			case WebpagePackage.PRINTER__PNAME:
				return PNAME_EDEFAULT == null ? pname != null : !PNAME_EDEFAULT.equals(pname);
			case WebpagePackage.PRINTER__QUEUE_ID:
				return queueId != QUEUE_ID_EDEFAULT;
			case WebpagePackage.PRINTER__JOB_ID:
				return jobId != JOB_ID_EDEFAULT;
			case WebpagePackage.PRINTER__QUEUE_STATUS:
				return queueStatus != QUEUE_STATUS_EDEFAULT;
			case WebpagePackage.PRINTER__QUEUE_JOB:
				return queueJob != null && !queueJob.isEmpty();
			case WebpagePackage.PRINTER__JOB_PRIORITY:
				return jobPriority != JOB_PRIORITY_EDEFAULT;
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
			case WebpagePackage.PRINTER___QUEUE_JOB:
				QueueJob();
				return null;
			case WebpagePackage.PRINTER___PRINT_JOB:
				printJob();
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
		result.append(" (pname: ");
		result.append(pname);
		result.append(", QueueId: ");
		result.append(queueId);
		result.append(", jobId: ");
		result.append(jobId);
		result.append(", QueueStatus: ");
		result.append(queueStatus);
		result.append(", jobPriority: ");
		result.append(jobPriority);
		result.append(')');
		return result.toString();
	}

} //PrinterImpl
