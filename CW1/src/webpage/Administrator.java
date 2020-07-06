/**
 */
package webpage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.Administrator#getAid <em>Aid</em>}</li>
 *   <li>{@link webpage.Administrator#getAname <em>Aname</em>}</li>
 *   <li>{@link webpage.Administrator#getCreateUser <em>Create User</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getAdministrator()
 * @model
 * @generated
 */
public interface Administrator extends Users {
	/**
	 * Returns the value of the '<em><b>Aid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aid</em>' attribute.
	 * @see #setAid(int)
	 * @see webpage.WebpagePackage#getAdministrator_Aid()
	 * @model
	 * @generated
	 */
	int getAid();

	/**
	 * Sets the value of the '{@link webpage.Administrator#getAid <em>Aid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aid</em>' attribute.
	 * @see #getAid()
	 * @generated
	 */
	void setAid(int value);

	/**
	 * Returns the value of the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aname</em>' attribute.
	 * @see #setAname(String)
	 * @see webpage.WebpagePackage#getAdministrator_Aname()
	 * @model
	 * @generated
	 */
	String getAname();

	/**
	 * Sets the value of the '{@link webpage.Administrator#getAname <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aname</em>' attribute.
	 * @see #getAname()
	 * @generated
	 */
	void setAname(String value);

	/**
	 * Returns the value of the '<em><b>Create User</b></em>' reference list.
	 * The list contents are of type {@link webpage.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create User</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create User</em>' reference list.
	 * @see webpage.WebpagePackage#getAdministrator_CreateUser()
	 * @model required="true"
	 * @generated
	 */
	EList<User> getCreateUser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createUser();

} // Administrator
