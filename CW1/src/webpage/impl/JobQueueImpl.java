/**
 */
package webpage.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webpage.JobPriority;
import webpage.JobQueue;
import webpage.JobStatus;
import webpage.Printer;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.JobQueueImpl#getJid <em>Jid</em>}</li>
 *   <li>{@link webpage.impl.JobQueueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link webpage.impl.JobQueueImpl#getJobDuration <em>Job Duration</em>}</li>
 *   <li>{@link webpage.impl.JobQueueImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link webpage.impl.JobQueueImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link webpage.impl.JobQueueImpl#getUpdateQueueStatus <em>Update Queue Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobQueueImpl extends MinimalEObjectImpl.Container implements JobQueue {
	/**
	 * The default value of the '{@link #getJid() <em>Jid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJid()
	 * @generated
	 * @ordered
	 */
	protected static final int JID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJid() <em>Jid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJid()
	 * @generated
	 * @ordered
	 */
	protected int jid = JID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final JobStatus STATUS_EDEFAULT = JobStatus.WAITING;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected JobStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobDuration() <em>Job Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJobDuration() <em>Job Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDuration()
	 * @generated
	 * @ordered
	 */
	protected int jobDuration = JOB_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected String userId = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final JobPriority PRIORITY_EDEFAULT = JobPriority.URGENT;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected JobPriority priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdateQueueStatus() <em>Update Queue Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateQueueStatus()
	 * @generated
	 * @ordered
	 */
	protected Printer updateQueueStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.JOB_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJid() {
		return jid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJid(int newJid) {
		int oldJid = jid;
		jid = newJid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.JOB_QUEUE__JID, oldJid, jid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(JobStatus newStatus) {
		JobStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.JOB_QUEUE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobDuration() {
		return jobDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobDuration(int newJobDuration) {
		int oldJobDuration = jobDuration;
		jobDuration = newJobDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.JOB_QUEUE__JOB_DURATION, oldJobDuration, jobDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(String newUserId) {
		String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.JOB_QUEUE__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(JobPriority newPriority) {
		JobPriority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.JOB_QUEUE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Printer getUpdateQueueStatus() {
		if (updateQueueStatus != null && updateQueueStatus.eIsProxy()) {
			InternalEObject oldUpdateQueueStatus = (InternalEObject)updateQueueStatus;
			updateQueueStatus = (Printer)eResolveProxy(oldUpdateQueueStatus);
			if (updateQueueStatus != oldUpdateQueueStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebpagePackage.JOB_QUEUE__UPDATE_QUEUE_STATUS, oldUpdateQueueStatus, updateQueueStatus));
			}
		}
		return updateQueueStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Printer basicGetUpdateQueueStatus() {
		return updateQueueStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateQueueStatus(Printer newUpdateQueueStatus) {
		Printer oldUpdateQueueStatus = updateQueueStatus;
		updateQueueStatus = newUpdateQueueStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.JOB_QUEUE__UPDATE_QUEUE_STATUS, oldUpdateQueueStatus, updateQueueStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateQueueStatus() {
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
			case WebpagePackage.JOB_QUEUE__JID:
				return getJid();
			case WebpagePackage.JOB_QUEUE__STATUS:
				return getStatus();
			case WebpagePackage.JOB_QUEUE__JOB_DURATION:
				return getJobDuration();
			case WebpagePackage.JOB_QUEUE__USER_ID:
				return getUserId();
			case WebpagePackage.JOB_QUEUE__PRIORITY:
				return getPriority();
			case WebpagePackage.JOB_QUEUE__UPDATE_QUEUE_STATUS:
				if (resolve) return getUpdateQueueStatus();
				return basicGetUpdateQueueStatus();
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
			case WebpagePackage.JOB_QUEUE__JID:
				setJid((Integer)newValue);
				return;
			case WebpagePackage.JOB_QUEUE__STATUS:
				setStatus((JobStatus)newValue);
				return;
			case WebpagePackage.JOB_QUEUE__JOB_DURATION:
				setJobDuration((Integer)newValue);
				return;
			case WebpagePackage.JOB_QUEUE__USER_ID:
				setUserId((String)newValue);
				return;
			case WebpagePackage.JOB_QUEUE__PRIORITY:
				setPriority((JobPriority)newValue);
				return;
			case WebpagePackage.JOB_QUEUE__UPDATE_QUEUE_STATUS:
				setUpdateQueueStatus((Printer)newValue);
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
			case WebpagePackage.JOB_QUEUE__JID:
				setJid(JID_EDEFAULT);
				return;
			case WebpagePackage.JOB_QUEUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case WebpagePackage.JOB_QUEUE__JOB_DURATION:
				setJobDuration(JOB_DURATION_EDEFAULT);
				return;
			case WebpagePackage.JOB_QUEUE__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case WebpagePackage.JOB_QUEUE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case WebpagePackage.JOB_QUEUE__UPDATE_QUEUE_STATUS:
				setUpdateQueueStatus((Printer)null);
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
			case WebpagePackage.JOB_QUEUE__JID:
				return jid != JID_EDEFAULT;
			case WebpagePackage.JOB_QUEUE__STATUS:
				return status != STATUS_EDEFAULT;
			case WebpagePackage.JOB_QUEUE__JOB_DURATION:
				return jobDuration != JOB_DURATION_EDEFAULT;
			case WebpagePackage.JOB_QUEUE__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case WebpagePackage.JOB_QUEUE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case WebpagePackage.JOB_QUEUE__UPDATE_QUEUE_STATUS:
				return updateQueueStatus != null;
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
			case WebpagePackage.JOB_QUEUE___UPDATE_QUEUE_STATUS:
				UpdateQueueStatus();
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
		result.append(" (jid: ");
		result.append(jid);
		result.append(", Status: ");
		result.append(status);
		result.append(", JobDuration: ");
		result.append(jobDuration);
		result.append(", UserId: ");
		result.append(userId);
		result.append(", Priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //JobQueueImpl
