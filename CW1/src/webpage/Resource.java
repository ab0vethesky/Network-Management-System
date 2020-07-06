/**
 */
package webpage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.Resource#getRid <em>Rid</em>}</li>
 *   <li>{@link webpage.Resource#getName <em>Name</em>}</li>
 *   <li>{@link webpage.Resource#getType <em>Type</em>}</li>
 *   <li>{@link webpage.Resource#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link webpage.Resource#getConnectionStatus <em>Connection Status</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Rid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rid</em>' attribute.
	 * @see #setRid(int)
	 * @see webpage.WebpagePackage#getResource_Rid()
	 * @model
	 * @generated
	 */
	int getRid();

	/**
	 * Sets the value of the '{@link webpage.Resource#getRid <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rid</em>' attribute.
	 * @see #getRid()
	 * @generated
	 */
	void setRid(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see webpage.WebpagePackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link webpage.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link webpage.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see webpage.ResourceType
	 * @see #setType(ResourceType)
	 * @see webpage.WebpagePackage#getResource_Type()
	 * @model
	 * @generated
	 */
	ResourceType getType();

	/**
	 * Sets the value of the '{@link webpage.Resource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see webpage.ResourceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link webpage.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see webpage.ConnectionType
	 * @see #setConnectionType(ConnectionType)
	 * @see webpage.WebpagePackage#getResource_ConnectionType()
	 * @model default="0" transient="true"
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link webpage.Resource#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see webpage.ConnectionType
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Connection Status</b></em>' attribute.
	 * The literals are from the enumeration {@link webpage.ConnectionStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Status</em>' attribute.
	 * @see webpage.ConnectionStatus
	 * @see #setConnectionStatus(ConnectionStatus)
	 * @see webpage.WebpagePackage#getResource_ConnectionStatus()
	 * @model
	 * @generated
	 */
	ConnectionStatus getConnectionStatus();

	/**
	 * Sets the value of the '{@link webpage.Resource#getConnectionStatus <em>Connection Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Status</em>' attribute.
	 * @see webpage.ConnectionStatus
	 * @see #getConnectionStatus()
	 * @generated
	 */
	void setConnectionStatus(ConnectionStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void notifyUser();

} // Resource
