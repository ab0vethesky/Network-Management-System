/**
 */
package webpage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Printer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.Printer#getPname <em>Pname</em>}</li>
 *   <li>{@link webpage.Printer#getQueueId <em>Queue Id</em>}</li>
 *   <li>{@link webpage.Printer#getJobId <em>Job Id</em>}</li>
 *   <li>{@link webpage.Printer#getQueueStatus <em>Queue Status</em>}</li>
 *   <li>{@link webpage.Printer#getQueueJob <em>Queue Job</em>}</li>
 *   <li>{@link webpage.Printer#getJobPriority <em>Job Priority</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getPrinter()
 * @model
 * @generated
 */
public interface Printer extends Resource {
	/**
	 * Returns the value of the '<em><b>Pname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pname</em>' attribute.
	 * @see #setPname(String)
	 * @see webpage.WebpagePackage#getPrinter_Pname()
	 * @model
	 * @generated
	 */
	String getPname();

	/**
	 * Sets the value of the '{@link webpage.Printer#getPname <em>Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pname</em>' attribute.
	 * @see #getPname()
	 * @generated
	 */
	void setPname(String value);

	/**
	 * Returns the value of the '<em><b>Queue Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Id</em>' attribute.
	 * @see #setQueueId(int)
	 * @see webpage.WebpagePackage#getPrinter_QueueId()
	 * @model
	 * @generated
	 */
	int getQueueId();

	/**
	 * Sets the value of the '{@link webpage.Printer#getQueueId <em>Queue Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Id</em>' attribute.
	 * @see #getQueueId()
	 * @generated
	 */
	void setQueueId(int value);

	/**
	 * Returns the value of the '<em><b>Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Id</em>' attribute.
	 * @see #setJobId(int)
	 * @see webpage.WebpagePackage#getPrinter_JobId()
	 * @model
	 * @generated
	 */
	int getJobId();

	/**
	 * Sets the value of the '{@link webpage.Printer#getJobId <em>Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Id</em>' attribute.
	 * @see #getJobId()
	 * @generated
	 */
	void setJobId(int value);

	/**
	 * Returns the value of the '<em><b>Queue Status</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link webpage.QueueStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Status</em>' attribute.
	 * @see webpage.QueueStatus
	 * @see #setQueueStatus(QueueStatus)
	 * @see webpage.WebpagePackage#getPrinter_QueueStatus()
	 * @model default="0"
	 * @generated
	 */
	static QueueStatus getQueueStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Sets the value of the '{@link webpage.Printer#getQueueStatus <em>Queue Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Status</em>' attribute.
	 * @see webpage.QueueStatus
	 * @see #getQueueStatus()
	 * @generated
	 */
	void setQueueStatus(QueueStatus value);

	/**
	 * Returns the value of the '<em><b>Queue Job</b></em>' reference list.
	 * The list contents are of type {@link webpage.JobQueue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Job</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Job</em>' reference list.
	 * @see webpage.WebpagePackage#getPrinter_QueueJob()
	 * @model required="true"
	 * @generated
	 */
	EList<JobQueue> getQueueJob();

	/**
	 * Returns the value of the '<em><b>Job Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link webpage.JobPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Priority</em>' attribute.
	 * @see webpage.JobPriority
	 * @see #setJobPriority(JobPriority)
	 * @see webpage.WebpagePackage#getPrinter_JobPriority()
	 * @model
	 * @generated
	 */
	JobPriority getJobPriority();

	/**
	 * Sets the value of the '{@link webpage.Printer#getJobPriority <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Priority</em>' attribute.
	 * @see webpage.JobPriority
	 * @see #getJobPriority()
	 * @generated
	 */
	void setJobPriority(JobPriority value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param jobId 
	 * @model
	 * @generated
	 */
	public static void QueueJob(String jobId) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param jobId 
	 * @model
	 * @generated
	 */
	public static void printJob(String jobId) {
		// TODO Auto-generated method stub
		
	}

} // Printer
