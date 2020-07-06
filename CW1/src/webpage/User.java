/**
 */
package webpage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.User#getUsid <em>Usid</em>}</li>
 *   <li>{@link webpage.User#getUname <em>Uname</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getUser()
 * @model
 * @generated
 */
public interface User extends Users {
	/**
	 * Returns the value of the '<em><b>Usid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usid</em>' attribute.
	 * @see #setUsid(int)
	 * @see webpage.WebpagePackage#getUser_Usid()
	 * @model
	 * @generated
	 */
	int getUsid();

	/**
	 * Sets the value of the '{@link webpage.User#getUsid <em>Usid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usid</em>' attribute.
	 * @see #getUsid()
	 * @generated
	 */
	void setUsid(int value);

	/**
	 * Returns the value of the '<em><b>Uname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uname</em>' attribute.
	 * @see #setUname(String)
	 * @see webpage.WebpagePackage#getUser_Uname()
	 * @model
	 * @generated
	 */
	String getUname();

	/**
	 * Sets the value of the '{@link webpage.User#getUname <em>Uname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uname</em>' attribute.
	 * @see #getUname()
	 * @generated
	 */
	void setUname(String value);

} // User
