/**
 */
package webpage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.JobQueue#getJid <em>Jid</em>}</li>
 *   <li>{@link webpage.JobQueue#getStatus <em>Status</em>}</li>
 *   <li>{@link webpage.JobQueue#getJobDuration <em>Job Duration</em>}</li>
 *   <li>{@link webpage.JobQueue#getUserId <em>User Id</em>}</li>
 *   <li>{@link webpage.JobQueue#getPriority <em>Priority</em>}</li>
 *   <li>{@link webpage.JobQueue#getUpdateQueueStatus <em>Update Queue Status</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getJobQueue()
 * @model
 * @generated
 */
public interface JobQueue extends EObject {
	/**
	 * Returns the value of the '<em><b>Jid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jid</em>' attribute.
	 * @see #setJid(int)
	 * @see webpage.WebpagePackage#getJobQueue_Jid()
	 * @model
	 * @generated
	 */
	int getJid();

	/**
	 * Sets the value of the '{@link webpage.JobQueue#getJid <em>Jid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jid</em>' attribute.
	 * @see #getJid()
	 * @generated
	 */
	void setJid(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link webpage.JobStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see webpage.JobStatus
	 * @see #setStatus(JobStatus)
	 * @see webpage.WebpagePackage#getJobQueue_Status()
	 * @model
	 * @generated
	 */
	static JobStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Sets the value of the '{@link webpage.JobQueue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see webpage.JobStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(JobStatus value);

	/**
	 * Returns the value of the '<em><b>Job Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Duration</em>' attribute.
	 * @see #setJobDuration(int)
	 * @see webpage.WebpagePackage#getJobQueue_JobDuration()
	 * @model default="0" derived="true"
	 * @generated
	 */
	int getJobDuration();

	/**
	 * Sets the value of the '{@link webpage.JobQueue#getJobDuration <em>Job Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Duration</em>' attribute.
	 * @see #getJobDuration()
	 * @generated
	 */
	void setJobDuration(int value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see webpage.WebpagePackage#getJobQueue_UserId()
	 * @model
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link webpage.JobQueue#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link webpage.JobPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see webpage.JobPriority
	 * @see #setPriority(JobPriority)
	 * @see webpage.WebpagePackage#getJobQueue_Priority()
	 * @model default="0"
	 * @generated
	 */
	JobPriority getPriority();

	/**
	 * Sets the value of the '{@link webpage.JobQueue#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see webpage.JobPriority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(JobPriority value);

	/**
	 * Returns the value of the '<em><b>Update Queue Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Queue Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Queue Status</em>' reference.
	 * @see #setUpdateQueueStatus(Printer)
	 * @see webpage.WebpagePackage#getJobQueue_UpdateQueueStatus()
	 * @model required="true"
	 * @generated
	 */
	Printer getUpdateQueueStatus();

	/**
	 * Sets the value of the '{@link webpage.JobQueue#getUpdateQueueStatus <em>Update Queue Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Queue Status</em>' reference.
	 * @see #getUpdateQueueStatus()
	 * @generated
	 */
	void setUpdateQueueStatus(Printer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateQueueStatus();

} // JobQueue
