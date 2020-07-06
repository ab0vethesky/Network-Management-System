/**
 */
package webpage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webpage.WebpageFactory
 * @model kind="package"
 * @generated
 */
public interface WebpagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webpage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/TR/html4/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webpage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebpagePackage eINSTANCE = webpage.impl.WebpagePackageImpl.init();

	/**
	 * The meta object id for the '{@link webpage.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.ResourceImpl
	 * @see webpage.impl.WebpagePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Rid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONNECTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Connection Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONNECTION_STATUS = 4;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Notify User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___NOTIFY_USER = 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link webpage.impl.ServersImpl <em>Servers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.ServersImpl
	 * @see webpage.impl.WebpagePackageImpl#getServers()
	 * @generated
	 */
	int SERVERS = 1;

	/**
	 * The feature id for the '<em><b>Rid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS__RID = RESOURCE__RID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS__CONNECTION_TYPE = RESOURCE__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS__CONNECTION_STATUS = RESOURCE__CONNECTION_STATUS;

	/**
	 * The feature id for the '<em><b>Sname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS__SNAME = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS__MAX_CAPACITY = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS__JOB_ID = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Servers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Notify User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS___NOTIFY_USER = RESOURCE___NOTIFY_USER;

	/**
	 * The number of operations of the '<em>Servers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERS_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webpage.impl.PrinterImpl <em>Printer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.PrinterImpl
	 * @see webpage.impl.WebpagePackageImpl#getPrinter()
	 * @generated
	 */
	int PRINTER = 2;

	/**
	 * The feature id for the '<em><b>Rid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__RID = RESOURCE__RID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__CONNECTION_TYPE = RESOURCE__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__CONNECTION_STATUS = RESOURCE__CONNECTION_STATUS;

	/**
	 * The feature id for the '<em><b>Pname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__PNAME = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queue Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__QUEUE_ID = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__JOB_ID = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Queue Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__QUEUE_STATUS = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Queue Job</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__QUEUE_JOB = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Job Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__JOB_PRIORITY = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Printer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Notify User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER___NOTIFY_USER = RESOURCE___NOTIFY_USER;

	/**
	 * The operation id for the '<em>Queue Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER___QUEUE_JOB = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Print Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER___PRINT_JOB = RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Printer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link webpage.impl.ComputersImpl <em>Computers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.ComputersImpl
	 * @see webpage.impl.WebpagePackageImpl#getComputers()
	 * @generated
	 */
	int COMPUTERS = 3;

	/**
	 * The feature id for the '<em><b>Rid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__RID = RESOURCE__RID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__CONNECTION_TYPE = RESOURCE__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Connection Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__CONNECTION_STATUS = RESOURCE__CONNECTION_STATUS;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__CNAME = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__JOB_ID = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Send Job</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__SEND_JOB = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Send Print Job</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS__SEND_PRINT_JOB = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Computers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Notify User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS___NOTIFY_USER = RESOURCE___NOTIFY_USER;

	/**
	 * The operation id for the '<em>Send Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS___SEND_JOB = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Send Print Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS___SEND_PRINT_JOB = RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTERS_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link webpage.impl.JobQueueImpl <em>Job Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.JobQueueImpl
	 * @see webpage.impl.WebpagePackageImpl#getJobQueue()
	 * @generated
	 */
	int JOB_QUEUE = 4;

	/**
	 * The feature id for the '<em><b>Jid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE__JID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Job Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE__JOB_DURATION = 2;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE__USER_ID = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE__PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Update Queue Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE__UPDATE_QUEUE_STATUS = 5;

	/**
	 * The number of structural features of the '<em>Job Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Update Queue Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE___UPDATE_QUEUE_STATUS = 0;

	/**
	 * The number of operations of the '<em>Job Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_QUEUE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link webpage.impl.UsersImpl <em>Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.UsersImpl
	 * @see webpage.impl.WebpagePackageImpl#getUsers()
	 * @generated
	 */
	int USERS = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__UID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Configure Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__CONFIGURE_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__JOB = 3;

	/**
	 * The number of structural features of the '<em>Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS___JOB = 0;

	/**
	 * The operation id for the '<em>Configure Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS___CONFIGURE_RESOURCE = 1;

	/**
	 * The number of operations of the '<em>Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link webpage.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.UserImpl
	 * @see webpage.impl.WebpagePackageImpl#getUser()
	 * @generated
	 */
	int USER = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UID = USERS__UID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TYPE = USERS__TYPE;

	/**
	 * The feature id for the '<em><b>Configure Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONFIGURE_RESOURCE = USERS__CONFIGURE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__JOB = USERS__JOB;

	/**
	 * The feature id for the '<em><b>Usid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USID = USERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UNAME = USERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = USERS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___JOB = USERS___JOB;

	/**
	 * The operation id for the '<em>Configure Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CONFIGURE_RESOURCE = USERS___CONFIGURE_RESOURCE;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = USERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webpage.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.AdministratorImpl
	 * @see webpage.impl.WebpagePackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__UID = USERS__UID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__TYPE = USERS__TYPE;

	/**
	 * The feature id for the '<em><b>Configure Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__CONFIGURE_RESOURCE = USERS__CONFIGURE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__JOB = USERS__JOB;

	/**
	 * The feature id for the '<em><b>Aid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__AID = USERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__ANAME = USERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__CREATE_USER = USERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = USERS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___JOB = USERS___JOB;

	/**
	 * The operation id for the '<em>Configure Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___CONFIGURE_RESOURCE = USERS___CONFIGURE_RESOURCE;

	/**
	 * The operation id for the '<em>Create User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___CREATE_USER = USERS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_OPERATION_COUNT = USERS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link webpage.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.ConnectionType
	 * @see webpage.impl.WebpagePackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 8;

	/**
	 * The meta object id for the '{@link webpage.ConnectionStatus <em>Connection Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.ConnectionStatus
	 * @see webpage.impl.WebpagePackageImpl#getConnectionStatus()
	 * @generated
	 */
	int CONNECTION_STATUS = 9;

	/**
	 * The meta object id for the '{@link webpage.JobPriority <em>Job Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.JobPriority
	 * @see webpage.impl.WebpagePackageImpl#getJobPriority()
	 * @generated
	 */
	int JOB_PRIORITY = 10;

	/**
	 * The meta object id for the '{@link webpage.QueueStatus <em>Queue Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.QueueStatus
	 * @see webpage.impl.WebpagePackageImpl#getQueueStatus()
	 * @generated
	 */
	int QUEUE_STATUS = 11;

	/**
	 * The meta object id for the '{@link webpage.JobStatus <em>Job Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.JobStatus
	 * @see webpage.impl.WebpagePackageImpl#getJobStatus()
	 * @generated
	 */
	int JOB_STATUS = 12;

	/**
	 * The meta object id for the '{@link webpage.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.ResourceType
	 * @see webpage.impl.WebpagePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 13;

	/**
	 * The meta object id for the '{@link webpage.UserType <em>User Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.UserType
	 * @see webpage.impl.WebpagePackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link webpage.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see webpage.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Resource#getRid <em>Rid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rid</em>'.
	 * @see webpage.Resource#getRid()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Rid();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webpage.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see webpage.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Resource#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see webpage.Resource#getConnectionType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Resource#getConnectionStatus <em>Connection Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Status</em>'.
	 * @see webpage.Resource#getConnectionStatus()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ConnectionStatus();

	/**
	 * Returns the meta object for the '{@link webpage.Resource#notifyUser() <em>Notify User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify User</em>' operation.
	 * @see webpage.Resource#notifyUser()
	 * @generated
	 */
	EOperation getResource__NotifyUser();

	/**
	 * Returns the meta object for class '{@link webpage.Servers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servers</em>'.
	 * @see webpage.Servers
	 * @generated
	 */
	EClass getServers();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Servers#getSname <em>Sname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sname</em>'.
	 * @see webpage.Servers#getSname()
	 * @see #getServers()
	 * @generated
	 */
	EAttribute getServers_Sname();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Servers#getMaxCapacity <em>Max Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Capacity</em>'.
	 * @see webpage.Servers#getMaxCapacity()
	 * @see #getServers()
	 * @generated
	 */
	EAttribute getServers_MaxCapacity();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Servers#getJobId <em>Job Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Id</em>'.
	 * @see webpage.Servers#getJobId()
	 * @see #getServers()
	 * @generated
	 */
	EAttribute getServers_JobId();

	/**
	 * Returns the meta object for class '{@link webpage.Printer <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printer</em>'.
	 * @see webpage.Printer
	 * @generated
	 */
	EClass getPrinter();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Printer#getPname <em>Pname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pname</em>'.
	 * @see webpage.Printer#getPname()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_Pname();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Printer#getQueueId <em>Queue Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Id</em>'.
	 * @see webpage.Printer#getQueueId()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_QueueId();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Printer#getJobId <em>Job Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Id</em>'.
	 * @see webpage.Printer#getJobId()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_JobId();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Printer#getQueueStatus <em>Queue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Status</em>'.
	 * @see webpage.Printer#getQueueStatus()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_QueueStatus();

	/**
	 * Returns the meta object for the reference list '{@link webpage.Printer#getQueueJob <em>Queue Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Queue Job</em>'.
	 * @see webpage.Printer#getQueueJob()
	 * @see #getPrinter()
	 * @generated
	 */
	EReference getPrinter_QueueJob();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Printer#getJobPriority <em>Job Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Priority</em>'.
	 * @see webpage.Printer#getJobPriority()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_JobPriority();

	/**
	 * Returns the meta object for the '{@link webpage.Printer#QueueJob() <em>Queue Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Queue Job</em>' operation.
	 * @see webpage.Printer#QueueJob()
	 * @generated
	 */
	EOperation getPrinter__QueueJob();

	/**
	 * Returns the meta object for the '{@link webpage.Printer#printJob() <em>Print Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Job</em>' operation.
	 * @see webpage.Printer#printJob()
	 * @generated
	 */
	EOperation getPrinter__PrintJob();

	/**
	 * Returns the meta object for class '{@link webpage.Computers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computers</em>'.
	 * @see webpage.Computers
	 * @generated
	 */
	EClass getComputers();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Computers#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see webpage.Computers#getCname()
	 * @see #getComputers()
	 * @generated
	 */
	EAttribute getComputers_Cname();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Computers#getJobId <em>Job Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Id</em>'.
	 * @see webpage.Computers#getJobId()
	 * @see #getComputers()
	 * @generated
	 */
	EAttribute getComputers_JobId();

	/**
	 * Returns the meta object for the reference list '{@link webpage.Computers#getSendJob <em>Send Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Send Job</em>'.
	 * @see webpage.Computers#getSendJob()
	 * @see #getComputers()
	 * @generated
	 */
	EReference getComputers_SendJob();

	/**
	 * Returns the meta object for the reference list '{@link webpage.Computers#getSendPrintJob <em>Send Print Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Send Print Job</em>'.
	 * @see webpage.Computers#getSendPrintJob()
	 * @see #getComputers()
	 * @generated
	 */
	EReference getComputers_SendPrintJob();

	/**
	 * Returns the meta object for the '{@link webpage.Computers#SendJob() <em>Send Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Job</em>' operation.
	 * @see webpage.Computers#SendJob()
	 * @generated
	 */
	EOperation getComputers__SendJob();

	/**
	 * Returns the meta object for the '{@link webpage.Computers#SendPrintJob() <em>Send Print Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Print Job</em>' operation.
	 * @see webpage.Computers#SendPrintJob()
	 * @generated
	 */
	EOperation getComputers__SendPrintJob();

	/**
	 * Returns the meta object for class '{@link webpage.JobQueue <em>Job Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Queue</em>'.
	 * @see webpage.JobQueue
	 * @generated
	 */
	EClass getJobQueue();

	/**
	 * Returns the meta object for the attribute '{@link webpage.JobQueue#getJid <em>Jid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jid</em>'.
	 * @see webpage.JobQueue#getJid()
	 * @see #getJobQueue()
	 * @generated
	 */
	EAttribute getJobQueue_Jid();

	/**
	 * Returns the meta object for the attribute '{@link webpage.JobQueue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see webpage.JobQueue#getStatus()
	 * @see #getJobQueue()
	 * @generated
	 */
	EAttribute getJobQueue_Status();

	/**
	 * Returns the meta object for the attribute '{@link webpage.JobQueue#getJobDuration <em>Job Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Duration</em>'.
	 * @see webpage.JobQueue#getJobDuration()
	 * @see #getJobQueue()
	 * @generated
	 */
	EAttribute getJobQueue_JobDuration();

	/**
	 * Returns the meta object for the attribute '{@link webpage.JobQueue#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see webpage.JobQueue#getUserId()
	 * @see #getJobQueue()
	 * @generated
	 */
	EAttribute getJobQueue_UserId();

	/**
	 * Returns the meta object for the attribute '{@link webpage.JobQueue#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see webpage.JobQueue#getPriority()
	 * @see #getJobQueue()
	 * @generated
	 */
	EAttribute getJobQueue_Priority();

	/**
	 * Returns the meta object for the reference '{@link webpage.JobQueue#getUpdateQueueStatus <em>Update Queue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Queue Status</em>'.
	 * @see webpage.JobQueue#getUpdateQueueStatus()
	 * @see #getJobQueue()
	 * @generated
	 */
	EReference getJobQueue_UpdateQueueStatus();

	/**
	 * Returns the meta object for the '{@link webpage.JobQueue#UpdateQueueStatus() <em>Update Queue Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Queue Status</em>' operation.
	 * @see webpage.JobQueue#UpdateQueueStatus()
	 * @generated
	 */
	EOperation getJobQueue__UpdateQueueStatus();

	/**
	 * Returns the meta object for class '{@link webpage.Users <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Users</em>'.
	 * @see webpage.Users
	 * @generated
	 */
	EClass getUsers();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Users#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see webpage.Users#getUid()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_Uid();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Users#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see webpage.Users#getType()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_Type();

	/**
	 * Returns the meta object for the reference list '{@link webpage.Users#getConfigureResource <em>Configure Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configure Resource</em>'.
	 * @see webpage.Users#getConfigureResource()
	 * @see #getUsers()
	 * @generated
	 */
	EReference getUsers_ConfigureResource();

	/**
	 * Returns the meta object for the reference list '{@link webpage.Users#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Job</em>'.
	 * @see webpage.Users#getJob()
	 * @see #getUsers()
	 * @generated
	 */
	EReference getUsers_Job();

	/**
	 * Returns the meta object for the '{@link webpage.Users#Job() <em>Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Job</em>' operation.
	 * @see webpage.Users#Job()
	 * @generated
	 */
	EOperation getUsers__Job();

	/**
	 * Returns the meta object for the '{@link webpage.Users#configureResource() <em>Configure Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Configure Resource</em>' operation.
	 * @see webpage.Users#configureResource()
	 * @generated
	 */
	EOperation getUsers__ConfigureResource();

	/**
	 * Returns the meta object for class '{@link webpage.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see webpage.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link webpage.User#getUsid <em>Usid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usid</em>'.
	 * @see webpage.User#getUsid()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Usid();

	/**
	 * Returns the meta object for the attribute '{@link webpage.User#getUname <em>Uname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uname</em>'.
	 * @see webpage.User#getUname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Uname();

	/**
	 * Returns the meta object for class '{@link webpage.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see webpage.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Administrator#getAid <em>Aid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aid</em>'.
	 * @see webpage.Administrator#getAid()
	 * @see #getAdministrator()
	 * @generated
	 */
	EAttribute getAdministrator_Aid();

	/**
	 * Returns the meta object for the attribute '{@link webpage.Administrator#getAname <em>Aname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aname</em>'.
	 * @see webpage.Administrator#getAname()
	 * @see #getAdministrator()
	 * @generated
	 */
	EAttribute getAdministrator_Aname();

	/**
	 * Returns the meta object for the reference list '{@link webpage.Administrator#getCreateUser <em>Create User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Create User</em>'.
	 * @see webpage.Administrator#getCreateUser()
	 * @see #getAdministrator()
	 * @generated
	 */
	EReference getAdministrator_CreateUser();

	/**
	 * Returns the meta object for the '{@link webpage.Administrator#createUser() <em>Create User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create User</em>' operation.
	 * @see webpage.Administrator#createUser()
	 * @generated
	 */
	EOperation getAdministrator__CreateUser();

	/**
	 * Returns the meta object for enum '{@link webpage.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see webpage.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the meta object for enum '{@link webpage.ConnectionStatus <em>Connection Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Status</em>'.
	 * @see webpage.ConnectionStatus
	 * @generated
	 */
	EEnum getConnectionStatus();

	/**
	 * Returns the meta object for enum '{@link webpage.JobPriority <em>Job Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Priority</em>'.
	 * @see webpage.JobPriority
	 * @generated
	 */
	EEnum getJobPriority();

	/**
	 * Returns the meta object for enum '{@link webpage.QueueStatus <em>Queue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Queue Status</em>'.
	 * @see webpage.QueueStatus
	 * @generated
	 */
	EEnum getQueueStatus();

	/**
	 * Returns the meta object for enum '{@link webpage.JobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Status</em>'.
	 * @see webpage.JobStatus
	 * @generated
	 */
	EEnum getJobStatus();

	/**
	 * Returns the meta object for enum '{@link webpage.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see webpage.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link webpage.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Type</em>'.
	 * @see webpage.UserType
	 * @generated
	 */
	EEnum getUserType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebpageFactory getWebpageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webpage.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.ResourceImpl
		 * @see webpage.impl.WebpagePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Rid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RID = eINSTANCE.getResource_Rid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__CONNECTION_TYPE = eINSTANCE.getResource_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Connection Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__CONNECTION_STATUS = eINSTANCE.getResource_ConnectionStatus();

		/**
		 * The meta object literal for the '<em><b>Notify User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___NOTIFY_USER = eINSTANCE.getResource__NotifyUser();

		/**
		 * The meta object literal for the '{@link webpage.impl.ServersImpl <em>Servers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.ServersImpl
		 * @see webpage.impl.WebpagePackageImpl#getServers()
		 * @generated
		 */
		EClass SERVERS = eINSTANCE.getServers();

		/**
		 * The meta object literal for the '<em><b>Sname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVERS__SNAME = eINSTANCE.getServers_Sname();

		/**
		 * The meta object literal for the '<em><b>Max Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVERS__MAX_CAPACITY = eINSTANCE.getServers_MaxCapacity();

		/**
		 * The meta object literal for the '<em><b>Job Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVERS__JOB_ID = eINSTANCE.getServers_JobId();

		/**
		 * The meta object literal for the '{@link webpage.impl.PrinterImpl <em>Printer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.PrinterImpl
		 * @see webpage.impl.WebpagePackageImpl#getPrinter()
		 * @generated
		 */
		EClass PRINTER = eINSTANCE.getPrinter();

		/**
		 * The meta object literal for the '<em><b>Pname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__PNAME = eINSTANCE.getPrinter_Pname();

		/**
		 * The meta object literal for the '<em><b>Queue Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__QUEUE_ID = eINSTANCE.getPrinter_QueueId();

		/**
		 * The meta object literal for the '<em><b>Job Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__JOB_ID = eINSTANCE.getPrinter_JobId();

		/**
		 * The meta object literal for the '<em><b>Queue Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__QUEUE_STATUS = eINSTANCE.getPrinter_QueueStatus();

		/**
		 * The meta object literal for the '<em><b>Queue Job</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINTER__QUEUE_JOB = eINSTANCE.getPrinter_QueueJob();

		/**
		 * The meta object literal for the '<em><b>Job Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__JOB_PRIORITY = eINSTANCE.getPrinter_JobPriority();

		/**
		 * The meta object literal for the '<em><b>Queue Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINTER___QUEUE_JOB = eINSTANCE.getPrinter__QueueJob();

		/**
		 * The meta object literal for the '<em><b>Print Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINTER___PRINT_JOB = eINSTANCE.getPrinter__PrintJob();

		/**
		 * The meta object literal for the '{@link webpage.impl.ComputersImpl <em>Computers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.ComputersImpl
		 * @see webpage.impl.WebpagePackageImpl#getComputers()
		 * @generated
		 */
		EClass COMPUTERS = eINSTANCE.getComputers();

		/**
		 * The meta object literal for the '<em><b>Cname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTERS__CNAME = eINSTANCE.getComputers_Cname();

		/**
		 * The meta object literal for the '<em><b>Job Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTERS__JOB_ID = eINSTANCE.getComputers_JobId();

		/**
		 * The meta object literal for the '<em><b>Send Job</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTERS__SEND_JOB = eINSTANCE.getComputers_SendJob();

		/**
		 * The meta object literal for the '<em><b>Send Print Job</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTERS__SEND_PRINT_JOB = eINSTANCE.getComputers_SendPrintJob();

		/**
		 * The meta object literal for the '<em><b>Send Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTERS___SEND_JOB = eINSTANCE.getComputers__SendJob();

		/**
		 * The meta object literal for the '<em><b>Send Print Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTERS___SEND_PRINT_JOB = eINSTANCE.getComputers__SendPrintJob();

		/**
		 * The meta object literal for the '{@link webpage.impl.JobQueueImpl <em>Job Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.JobQueueImpl
		 * @see webpage.impl.WebpagePackageImpl#getJobQueue()
		 * @generated
		 */
		EClass JOB_QUEUE = eINSTANCE.getJobQueue();

		/**
		 * The meta object literal for the '<em><b>Jid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_QUEUE__JID = eINSTANCE.getJobQueue_Jid();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_QUEUE__STATUS = eINSTANCE.getJobQueue_Status();

		/**
		 * The meta object literal for the '<em><b>Job Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_QUEUE__JOB_DURATION = eINSTANCE.getJobQueue_JobDuration();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_QUEUE__USER_ID = eINSTANCE.getJobQueue_UserId();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_QUEUE__PRIORITY = eINSTANCE.getJobQueue_Priority();

		/**
		 * The meta object literal for the '<em><b>Update Queue Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_QUEUE__UPDATE_QUEUE_STATUS = eINSTANCE.getJobQueue_UpdateQueueStatus();

		/**
		 * The meta object literal for the '<em><b>Update Queue Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_QUEUE___UPDATE_QUEUE_STATUS = eINSTANCE.getJobQueue__UpdateQueueStatus();

		/**
		 * The meta object literal for the '{@link webpage.impl.UsersImpl <em>Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.UsersImpl
		 * @see webpage.impl.WebpagePackageImpl#getUsers()
		 * @generated
		 */
		EClass USERS = eINSTANCE.getUsers();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__UID = eINSTANCE.getUsers_Uid();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__TYPE = eINSTANCE.getUsers_Type();

		/**
		 * The meta object literal for the '<em><b>Configure Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERS__CONFIGURE_RESOURCE = eINSTANCE.getUsers_ConfigureResource();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERS__JOB = eINSTANCE.getUsers_Job();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERS___JOB = eINSTANCE.getUsers__Job();

		/**
		 * The meta object literal for the '<em><b>Configure Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERS___CONFIGURE_RESOURCE = eINSTANCE.getUsers__ConfigureResource();

		/**
		 * The meta object literal for the '{@link webpage.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.UserImpl
		 * @see webpage.impl.WebpagePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Usid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USID = eINSTANCE.getUser_Usid();

		/**
		 * The meta object literal for the '<em><b>Uname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__UNAME = eINSTANCE.getUser_Uname();

		/**
		 * The meta object literal for the '{@link webpage.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.AdministratorImpl
		 * @see webpage.impl.WebpagePackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '<em><b>Aid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATOR__AID = eINSTANCE.getAdministrator_Aid();

		/**
		 * The meta object literal for the '<em><b>Aname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATOR__ANAME = eINSTANCE.getAdministrator_Aname();

		/**
		 * The meta object literal for the '<em><b>Create User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATOR__CREATE_USER = eINSTANCE.getAdministrator_CreateUser();

		/**
		 * The meta object literal for the '<em><b>Create User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR___CREATE_USER = eINSTANCE.getAdministrator__CreateUser();

		/**
		 * The meta object literal for the '{@link webpage.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.ConnectionType
		 * @see webpage.impl.WebpagePackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link webpage.ConnectionStatus <em>Connection Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.ConnectionStatus
		 * @see webpage.impl.WebpagePackageImpl#getConnectionStatus()
		 * @generated
		 */
		EEnum CONNECTION_STATUS = eINSTANCE.getConnectionStatus();

		/**
		 * The meta object literal for the '{@link webpage.JobPriority <em>Job Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.JobPriority
		 * @see webpage.impl.WebpagePackageImpl#getJobPriority()
		 * @generated
		 */
		EEnum JOB_PRIORITY = eINSTANCE.getJobPriority();

		/**
		 * The meta object literal for the '{@link webpage.QueueStatus <em>Queue Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.QueueStatus
		 * @see webpage.impl.WebpagePackageImpl#getQueueStatus()
		 * @generated
		 */
		EEnum QUEUE_STATUS = eINSTANCE.getQueueStatus();

		/**
		 * The meta object literal for the '{@link webpage.JobStatus <em>Job Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.JobStatus
		 * @see webpage.impl.WebpagePackageImpl#getJobStatus()
		 * @generated
		 */
		EEnum JOB_STATUS = eINSTANCE.getJobStatus();

		/**
		 * The meta object literal for the '{@link webpage.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.ResourceType
		 * @see webpage.impl.WebpagePackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link webpage.UserType <em>User Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.UserType
		 * @see webpage.impl.WebpagePackageImpl#getUserType()
		 * @generated
		 */
		EEnum USER_TYPE = eINSTANCE.getUserType();

	}

} //WebpagePackage
