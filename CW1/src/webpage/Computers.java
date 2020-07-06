/**
 */
package webpage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.Computers#getCname <em>Cname</em>}</li>
 *   <li>{@link webpage.Computers#getJobId <em>Job Id</em>}</li>
 *   <li>{@link webpage.Computers#getSendJob <em>Send Job</em>}</li>
 *   <li>{@link webpage.Computers#getSendPrintJob <em>Send Print Job</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getComputers()
 * @model
 * @generated
 */
public interface Computers extends Resource {
	/**
	 * Returns the value of the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cname</em>' attribute.
	 * @see #setCname(String)
	 * @see webpage.WebpagePackage#getComputers_Cname()
	 * @model
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link webpage.Computers#getCname <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cname</em>' attribute.
	 * @see #getCname()
	 * @generated
	 */
	void setCname(String value);

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
	 * @see webpage.WebpagePackage#getComputers_JobId()
	 * @model
	 * @generated
	 */
	int getJobId();

	/**
	 * Sets the value of the '{@link webpage.Computers#getJobId <em>Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Id</em>' attribute.
	 * @see #getJobId()
	 * @generated
	 */
	void setJobId(int value);

	/**
	 * Returns the value of the '<em><b>Send Job</b></em>' reference list.
	 * The list contents are of type {@link webpage.Servers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Job</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Job</em>' reference list.
	 * @see webpage.WebpagePackage#getComputers_SendJob()
	 * @model required="true"
	 * @generated
	 */
	EList<Servers> getSendJob();

	/**
	 * Returns the value of the '<em><b>Send Print Job</b></em>' reference list.
	 * The list contents are of type {@link webpage.Printer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Print Job</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Print Job</em>' reference list.
	 * @see webpage.WebpagePackage#getComputers_SendPrintJob()
	 * @model keys="jobPriority rid" required="true"
	 * @generated
	 */
	EList<Printer> getSendPrintJob();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SendJob();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	//String SendPrintJob();
	public static void main(String[] args)
	{
	  Integer jobId;
	  QueueStatus Qs = Printer.getQueueStatus();
	 /* if QueueStatus.getValue(jobId) = 1;
			  then
			  {
				  Printer.printJob(jobId);
			  }
			  else
			  {
				  Printer.QueueJob(jobId);
			  }*/
	}

} // Computers
