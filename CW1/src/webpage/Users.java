/**
 */
package webpage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Users</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.Users#getUid <em>Uid</em>}</li>
 *   <li>{@link webpage.Users#getType <em>Type</em>}</li>
 *   <li>{@link webpage.Users#getConfigureResource <em>Configure Resource</em>}</li>
 *   <li>{@link webpage.Users#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getUsers()
 * @model
 * @generated
 */
public interface Users extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(int)
	 * @see webpage.WebpagePackage#getUsers_Uid()
	 * @model default="0" id="true"
	 * @generated
	 */
	int getUid();

	/**
	 * Sets the value of the '{@link webpage.Users#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link webpage.UserType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see webpage.UserType
	 * @see #setType(UserType)
	 * @see webpage.WebpagePackage#getUsers_Type()
	 * @model
	 * @generated
	 */
	UserType getType();

	/**
	 * Sets the value of the '{@link webpage.Users#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see webpage.UserType
	 * @see #getType()
	 * @generated
	 */
	void setType(UserType value);

	/**
	 * Returns the value of the '<em><b>Configure Resource</b></em>' reference list.
	 * The list contents are of type {@link webpage.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configure Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configure Resource</em>' reference list.
	 * @see webpage.WebpagePackage#getUsers_ConfigureResource()
	 * @model required="true"
	 * @generated
	 */
	EList<Resource> getConfigureResource();

	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference list.
	 * The list contents are of type {@link webpage.Computers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference list.
	 * @see webpage.WebpagePackage#getUsers_Job()
	 * @model required="true"
	 * @generated
	 */
	EList<Computers> getJob();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Job();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void configureResource();

} // Users
