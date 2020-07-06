/**
 */
package webpage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import webpage.Administrator;
import webpage.Computers;
import webpage.ConnectionStatus;
import webpage.ConnectionType;
import webpage.JobPriority;
import webpage.JobQueue;
import webpage.JobStatus;
import webpage.Printer;
import webpage.QueueStatus;
import webpage.Resource;
import webpage.ResourceType;
import webpage.Servers;
import webpage.User;
import webpage.UserType;
import webpage.Users;
import webpage.WebpageFactory;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebpagePackageImpl extends EPackageImpl implements WebpagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serversEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queueStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see webpage.WebpagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebpagePackageImpl() {
		super(eNS_URI, WebpageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebpagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebpagePackage init() {
		if (isInited) return (WebpagePackage)EPackage.Registry.INSTANCE.getEPackage(WebpagePackage.eNS_URI);

		// Obtain or create and register package
		WebpagePackageImpl theWebpagePackage = (WebpagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebpagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebpagePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWebpagePackage.createPackageContents();

		// Initialize created meta-data
		theWebpagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebpagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebpagePackage.eNS_URI, theWebpagePackage);
		return theWebpagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Rid() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Type() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ConnectionType() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ConnectionStatus() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__NotifyUser() {
		return resourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServers() {
		return serversEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServers_Sname() {
		return (EAttribute)serversEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServers_MaxCapacity() {
		return (EAttribute)serversEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServers_JobId() {
		return (EAttribute)serversEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinter() {
		return printerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_Pname() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_QueueId() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_JobId() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_QueueStatus() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrinter_QueueJob() {
		return (EReference)printerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_JobPriority() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrinter__QueueJob() {
		return printerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrinter__PrintJob() {
		return printerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputers() {
		return computersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputers_Cname() {
		return (EAttribute)computersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputers_JobId() {
		return (EAttribute)computersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputers_SendJob() {
		return (EReference)computersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputers_SendPrintJob() {
		return (EReference)computersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputers__SendJob() {
		return computersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputers__SendPrintJob() {
		return computersEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobQueue() {
		return jobQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobQueue_Jid() {
		return (EAttribute)jobQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobQueue_Status() {
		return (EAttribute)jobQueueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobQueue_JobDuration() {
		return (EAttribute)jobQueueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobQueue_UserId() {
		return (EAttribute)jobQueueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobQueue_Priority() {
		return (EAttribute)jobQueueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobQueue_UpdateQueueStatus() {
		return (EReference)jobQueueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobQueue__UpdateQueueStatus() {
		return jobQueueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsers() {
		return usersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsers_Uid() {
		return (EAttribute)usersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsers_Type() {
		return (EAttribute)usersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsers_ConfigureResource() {
		return (EReference)usersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsers_Job() {
		return (EReference)usersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsers__Job() {
		return usersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsers__ConfigureResource() {
		return usersEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Usid() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Uname() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrator() {
		return administratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrator_Aid() {
		return (EAttribute)administratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrator_Aname() {
		return (EAttribute)administratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrator_CreateUser() {
		return (EReference)administratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdministrator__CreateUser() {
		return administratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionType() {
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionStatus() {
		return connectionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJobPriority() {
		return jobPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueueStatus() {
		return queueStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJobStatus() {
		return jobStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserType() {
		return userTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebpageFactory getWebpageFactory() {
		return (WebpageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__RID);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__TYPE);
		createEAttribute(resourceEClass, RESOURCE__CONNECTION_TYPE);
		createEAttribute(resourceEClass, RESOURCE__CONNECTION_STATUS);
		createEOperation(resourceEClass, RESOURCE___NOTIFY_USER);

		serversEClass = createEClass(SERVERS);
		createEAttribute(serversEClass, SERVERS__SNAME);
		createEAttribute(serversEClass, SERVERS__MAX_CAPACITY);
		createEAttribute(serversEClass, SERVERS__JOB_ID);

		printerEClass = createEClass(PRINTER);
		createEAttribute(printerEClass, PRINTER__PNAME);
		createEAttribute(printerEClass, PRINTER__QUEUE_ID);
		createEAttribute(printerEClass, PRINTER__JOB_ID);
		createEAttribute(printerEClass, PRINTER__QUEUE_STATUS);
		createEReference(printerEClass, PRINTER__QUEUE_JOB);
		createEAttribute(printerEClass, PRINTER__JOB_PRIORITY);
		createEOperation(printerEClass, PRINTER___QUEUE_JOB);
		createEOperation(printerEClass, PRINTER___PRINT_JOB);

		computersEClass = createEClass(COMPUTERS);
		createEAttribute(computersEClass, COMPUTERS__CNAME);
		createEAttribute(computersEClass, COMPUTERS__JOB_ID);
		createEReference(computersEClass, COMPUTERS__SEND_JOB);
		createEReference(computersEClass, COMPUTERS__SEND_PRINT_JOB);
		createEOperation(computersEClass, COMPUTERS___SEND_JOB);
		createEOperation(computersEClass, COMPUTERS___SEND_PRINT_JOB);

		jobQueueEClass = createEClass(JOB_QUEUE);
		createEAttribute(jobQueueEClass, JOB_QUEUE__JID);
		createEAttribute(jobQueueEClass, JOB_QUEUE__STATUS);
		createEAttribute(jobQueueEClass, JOB_QUEUE__JOB_DURATION);
		createEAttribute(jobQueueEClass, JOB_QUEUE__USER_ID);
		createEAttribute(jobQueueEClass, JOB_QUEUE__PRIORITY);
		createEReference(jobQueueEClass, JOB_QUEUE__UPDATE_QUEUE_STATUS);
		createEOperation(jobQueueEClass, JOB_QUEUE___UPDATE_QUEUE_STATUS);

		usersEClass = createEClass(USERS);
		createEAttribute(usersEClass, USERS__UID);
		createEAttribute(usersEClass, USERS__TYPE);
		createEReference(usersEClass, USERS__CONFIGURE_RESOURCE);
		createEReference(usersEClass, USERS__JOB);
		createEOperation(usersEClass, USERS___JOB);
		createEOperation(usersEClass, USERS___CONFIGURE_RESOURCE);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USID);
		createEAttribute(userEClass, USER__UNAME);

		administratorEClass = createEClass(ADMINISTRATOR);
		createEAttribute(administratorEClass, ADMINISTRATOR__AID);
		createEAttribute(administratorEClass, ADMINISTRATOR__ANAME);
		createEReference(administratorEClass, ADMINISTRATOR__CREATE_USER);
		createEOperation(administratorEClass, ADMINISTRATOR___CREATE_USER);

		// Create enums
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
		connectionStatusEEnum = createEEnum(CONNECTION_STATUS);
		jobPriorityEEnum = createEEnum(JOB_PRIORITY);
		queueStatusEEnum = createEEnum(QUEUE_STATUS);
		jobStatusEEnum = createEEnum(JOB_STATUS);
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
		userTypeEEnum = createEEnum(USER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serversEClass.getESuperTypes().add(this.getResource());
		printerEClass.getESuperTypes().add(this.getResource());
		computersEClass.getESuperTypes().add(this.getResource());
		userEClass.getESuperTypes().add(this.getUsers());
		administratorEClass.getESuperTypes().add(this.getUsers());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Rid(), ecorePackage.getEInt(), "rid", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Type(), this.getResourceType(), "type", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ConnectionType(), this.getConnectionType(), "connectionType", "0", 0, 1, Resource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ConnectionStatus(), this.getConnectionStatus(), "connectionStatus", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResource__NotifyUser(), null, "notifyUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serversEClass, Servers.class, "Servers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServers_Sname(), ecorePackage.getEString(), "sname", null, 0, 1, Servers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServers_MaxCapacity(), ecorePackage.getEInt(), "MaxCapacity", null, 0, 1, Servers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServers_JobId(), ecorePackage.getEInt(), "jobId", null, 0, 1, Servers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printerEClass, Printer.class, "Printer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrinter_Pname(), ecorePackage.getEString(), "pname", null, 0, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_QueueId(), ecorePackage.getEInt(), "QueueId", null, 0, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_JobId(), ecorePackage.getEInt(), "jobId", null, 0, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_QueueStatus(), this.getQueueStatus(), "QueueStatus", "0", 0, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrinter_QueueJob(), this.getJobQueue(), null, "QueueJob", null, 1, -1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_JobPriority(), this.getJobPriority(), "jobPriority", null, 0, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPrinter__QueueJob(), null, "QueueJob", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrinter__PrintJob(), null, "printJob", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(computersEClass, Computers.class, "Computers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputers_Cname(), ecorePackage.getEString(), "cname", null, 0, 1, Computers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputers_JobId(), ecorePackage.getEInt(), "jobId", null, 0, 1, Computers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputers_SendJob(), this.getServers(), null, "SendJob", null, 1, -1, Computers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputers_SendPrintJob(), this.getPrinter(), null, "SendPrintJob", null, 1, -1, Computers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComputers_SendPrintJob().getEKeys().add(this.getPrinter_JobPriority());
		getComputers_SendPrintJob().getEKeys().add(this.getResource_Rid());

		initEOperation(getComputers__SendJob(), null, "SendJob", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComputers__SendPrintJob(), ecorePackage.getEString(), "SendPrintJob", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobQueueEClass, JobQueue.class, "JobQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobQueue_Jid(), ecorePackage.getEInt(), "jid", null, 0, 1, JobQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobQueue_Status(), this.getJobStatus(), "Status", null, 0, 1, JobQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobQueue_JobDuration(), ecorePackage.getEInt(), "JobDuration", "0", 0, 1, JobQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobQueue_UserId(), ecorePackage.getEString(), "UserId", null, 0, 1, JobQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobQueue_Priority(), this.getJobPriority(), "Priority", "0", 0, 1, JobQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobQueue_UpdateQueueStatus(), this.getPrinter(), null, "UpdateQueueStatus", null, 1, 1, JobQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getJobQueue__UpdateQueueStatus(), null, "UpdateQueueStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(usersEClass, Users.class, "Users", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsers_Uid(), ecorePackage.getEInt(), "uid", "0", 0, 1, Users.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsers_Type(), this.getUserType(), "type", null, 0, 1, Users.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsers_ConfigureResource(), this.getResource(), null, "configureResource", null, 1, -1, Users.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsers_Job(), this.getComputers(), null, "Job", null, 1, -1, Users.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUsers__Job(), null, "Job", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUsers__ConfigureResource(), null, "configureResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Usid(), ecorePackage.getEInt(), "usid", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Uname(), ecorePackage.getEString(), "uname", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administratorEClass, Administrator.class, "Administrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdministrator_Aid(), ecorePackage.getEInt(), "aid", null, 0, 1, Administrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrator_Aname(), ecorePackage.getEString(), "aname", null, 0, 1, Administrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdministrator_CreateUser(), this.getUser(), null, "createUser", null, 1, -1, Administrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAdministrator__CreateUser(), null, "createUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.HUB);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.NETWORK_CABLE);

		initEEnum(connectionStatusEEnum, ConnectionStatus.class, "ConnectionStatus");
		addEEnumLiteral(connectionStatusEEnum, ConnectionStatus.CONNECTED);
		addEEnumLiteral(connectionStatusEEnum, ConnectionStatus.DISCONNECTED);

		initEEnum(jobPriorityEEnum, JobPriority.class, "JobPriority");
		addEEnumLiteral(jobPriorityEEnum, JobPriority.URGENT);
		addEEnumLiteral(jobPriorityEEnum, JobPriority.NORMAL);
		addEEnumLiteral(jobPriorityEEnum, JobPriority.LOW);

		initEEnum(queueStatusEEnum, QueueStatus.class, "QueueStatus");
		addEEnumLiteral(queueStatusEEnum, QueueStatus.AVAILABLE);
		addEEnumLiteral(queueStatusEEnum, QueueStatus.NOT_AVAILABLE);

		initEEnum(jobStatusEEnum, JobStatus.class, "JobStatus");
		addEEnumLiteral(jobStatusEEnum, JobStatus.WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.IN_PROGRESS);
		addEEnumLiteral(jobStatusEEnum, JobStatus.COMPLETED);

		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COMPUTERS);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SERVERS);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PRINTERS);

		initEEnum(userTypeEEnum, UserType.class, "UserType");
		addEEnumLiteral(userTypeEEnum, UserType.ADMIN);
		addEEnumLiteral(userTypeEEnum, UserType.USER);

		// Create resource
		createResource(eNS_URI);
	}

} //WebpagePackageImpl
