/**
 */
package webpage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.Servers#getSname <em>Sname</em>}</li>
 *   <li>{@link webpage.Servers#getMaxCapacity <em>Max Capacity</em>}</li>
 *   <li>{@link webpage.Servers#getJobId <em>Job Id</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getServers()
 * @model
 * @generated
 */
public interface Servers extends Resource {
	/**
	 * Returns the value of the '<em><b>Sname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sname</em>' attribute.
	 * @see #setSname(String)
	 * @see webpage.WebpagePackage#getServers_Sname()
	 * @model
	 * @generated
	 */
	String getSname();

	/**
	 * Sets the value of the '{@link webpage.Servers#getSname <em>Sname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sname</em>' attribute.
	 * @see #getSname()
	 * @generated
	 */
	void setSname(String value);

	/**
	 * Returns the value of the '<em><b>Max Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Capacity</em>' attribute.
	 * @see #setMaxCapacity(int)
	 * @see webpage.WebpagePackage#getServers_MaxCapacity()
	 * @model
	 * @generated
	 */
	int getMaxCapacity();

	/**
	 * Sets the value of the '{@link webpage.Servers#getMaxCapacity <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Capacity</em>' attribute.
	 * @see #getMaxCapacity()
	 * @generated
	 */
	void setMaxCapacity(int value);

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
	 * @see webpage.WebpagePackage#getServers_JobId()
	 * @model
	 * @generated
	 */
	int getJobId();

	/**
	 * Sets the value of the '{@link webpage.Servers#getJobId <em>Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Id</em>' attribute.
	 * @see #getJobId()
	 * @generated
	 */
	void setJobId(int value);

} // Servers
