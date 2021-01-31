/**
 */
package yml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see yml.YmlFactory
 * @model kind="package"
 * @generated
 */
public interface YmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/yml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YmlPackage eINSTANCE = yml.impl.YmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link yml.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.ElementNommeImpl
	 * @see yml.impl.YmlPackageImpl#getElementNomme()
	 * @generated
	 */
	int ELEMENT_NOMME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link yml.impl.ImageGImpl <em>Image G</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.ImageGImpl
	 * @see yml.impl.YmlPackageImpl#getImageG()
	 * @generated
	 */
	int IMAGE_G = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_G__NAME = ELEMENT_NOMME__NAME;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_G__ENTRYPOINT = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_G__JOB = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_G_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_G_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yml.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.ServiceImpl
	 * @see yml.impl.YmlPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = ELEMENT_NOMME__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ALIAS = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENTRYPOINT = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COMMAND = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__JOB = ELEMENT_NOMME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yml.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.JobImpl
	 * @see yml.impl.YmlPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = ELEMENT_NOMME__NAME;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STAGE = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SCRIPT = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After script</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__AFTER_SCRIPT = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RULES = ELEMENT_NOMME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENTS = ELEMENT_NOMME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ARTIFACTS = ELEMENT_NOMME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SERVICE = ELEMENT_NOMME_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IMAGE = ELEMENT_NOMME_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Imageg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IMAGEG = ELEMENT_NOMME_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yml.impl.artifactImpl <em>artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.artifactImpl
	 * @see yml.impl.YmlPackageImpl#getartifact()
	 * @generated
	 */
	int ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PATHS = 0;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Expose as</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXPOSE_AS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Untracked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__UNTRACKED = 4;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__WHEN = 5;

	/**
	 * The number of structural features of the '<em>artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link yml.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.RuleImpl
	 * @see yml.impl.YmlPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 5;

	/**
	 * The feature id for the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IF = 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__WHEN = 1;

	/**
	 * The feature id for the '<em><b>Allow failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ALLOW_FAILURE = 2;

	/**
	 * The feature id for the '<em><b>Start in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__START_IN = 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link yml.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.EnvironmentImpl
	 * @see yml.impl.YmlPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = ELEMENT_NOMME__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__URL = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ACTION = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yml.impl.GitlabCIImpl <em>Gitlab CI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.GitlabCIImpl
	 * @see yml.impl.YmlPackageImpl#getGitlabCI()
	 * @generated
	 */
	int GITLAB_CI = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITLAB_CI__NAME = ELEMENT_NOMME__NAME;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITLAB_CI__JOBS = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITLAB_CI__IMAGES = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITLAB_CI__SERVICES = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gitlab CI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITLAB_CI_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gitlab CI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITLAB_CI_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yml.impl.ImageJImpl <em>Image J</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.ImageJImpl
	 * @see yml.impl.YmlPackageImpl#getImageJ()
	 * @generated
	 */
	int IMAGE_J = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_J__NAME = ELEMENT_NOMME__NAME;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_J__ENTRYPOINT = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image J</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_J_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image J</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_J_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link yml.Stage <em>Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.Stage
	 * @see yml.impl.YmlPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 9;

	/**
	 * The meta object id for the '{@link yml.When <em>When</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.When
	 * @see yml.impl.YmlPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 10;

	/**
	 * The meta object id for the '{@link yml.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.Action
	 * @see yml.impl.YmlPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 11;

	/**
	 * Returns the meta object for class '{@link yml.ImageG <em>Image G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image G</em>'.
	 * @see yml.ImageG
	 * @generated
	 */
	EClass getImageG();

	/**
	 * Returns the meta object for the attribute list '{@link yml.ImageG#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entrypoint</em>'.
	 * @see yml.ImageG#getEntrypoint()
	 * @see #getImageG()
	 * @generated
	 */
	EAttribute getImageG_Entrypoint();

	/**
	 * Returns the meta object for the reference '{@link yml.ImageG#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job</em>'.
	 * @see yml.ImageG#getJob()
	 * @see #getImageG()
	 * @generated
	 */
	EReference getImageG_Job();

	/**
	 * Returns the meta object for class '{@link yml.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see yml.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link yml.Service#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see yml.Service#getAlias()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Alias();

	/**
	 * Returns the meta object for the attribute '{@link yml.Service#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entrypoint</em>'.
	 * @see yml.Service#getEntrypoint()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Entrypoint();

	/**
	 * Returns the meta object for the attribute list '{@link yml.Service#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Command</em>'.
	 * @see yml.Service#getCommand()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Command();

	/**
	 * Returns the meta object for the reference list '{@link yml.Service#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Job</em>'.
	 * @see yml.Service#getJob()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Job();

	/**
	 * Returns the meta object for class '{@link yml.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see yml.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link yml.Job#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see yml.Job#getStage()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Stage();

	/**
	 * Returns the meta object for the attribute list '{@link yml.Job#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Script</em>'.
	 * @see yml.Job#getScript()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Script();

	/**
	 * Returns the meta object for the attribute list '{@link yml.Job#getAfter_script <em>After script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>After script</em>'.
	 * @see yml.Job#getAfter_script()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_After_script();

	/**
	 * Returns the meta object for the containment reference list '{@link yml.Job#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see yml.Job#getRules()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link yml.Job#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see yml.Job#getEnvironments()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environments();

	/**
	 * Returns the meta object for the containment reference list '{@link yml.Job#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see yml.Job#getArtifacts()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Artifacts();

	/**
	 * Returns the meta object for the reference list '{@link yml.Job#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see yml.Job#getService()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link yml.Job#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see yml.Job#getImage()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Image();

	/**
	 * Returns the meta object for the reference '{@link yml.Job#getImageg <em>Imageg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imageg</em>'.
	 * @see yml.Job#getImageg()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Imageg();

	/**
	 * Returns the meta object for class '{@link yml.ElementNomme <em>Element Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Nomme</em>'.
	 * @see yml.ElementNomme
	 * @generated
	 */
	EClass getElementNomme();

	/**
	 * Returns the meta object for the attribute '{@link yml.ElementNomme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see yml.ElementNomme#getName()
	 * @see #getElementNomme()
	 * @generated
	 */
	EAttribute getElementNomme_Name();

	/**
	 * Returns the meta object for class '{@link yml.artifact <em>artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>artifact</em>'.
	 * @see yml.artifact
	 * @generated
	 */
	EClass getartifact();

	/**
	 * Returns the meta object for the attribute '{@link yml.artifact#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paths</em>'.
	 * @see yml.artifact#getPaths()
	 * @see #getartifact()
	 * @generated
	 */
	EAttribute getartifact_Paths();

	/**
	 * Returns the meta object for the attribute '{@link yml.artifact#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see yml.artifact#getExclude()
	 * @see #getartifact()
	 * @generated
	 */
	EAttribute getartifact_Exclude();

	/**
	 * Returns the meta object for the attribute '{@link yml.artifact#getExpose_as <em>Expose as</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expose as</em>'.
	 * @see yml.artifact#getExpose_as()
	 * @see #getartifact()
	 * @generated
	 */
	EAttribute getartifact_Expose_as();

	/**
	 * Returns the meta object for the attribute '{@link yml.artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see yml.artifact#getName()
	 * @see #getartifact()
	 * @generated
	 */
	EAttribute getartifact_Name();

	/**
	 * Returns the meta object for the attribute '{@link yml.artifact#isUntracked <em>Untracked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Untracked</em>'.
	 * @see yml.artifact#isUntracked()
	 * @see #getartifact()
	 * @generated
	 */
	EAttribute getartifact_Untracked();

	/**
	 * Returns the meta object for the attribute '{@link yml.artifact#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see yml.artifact#getWhen()
	 * @see #getartifact()
	 * @generated
	 */
	EAttribute getartifact_When();

	/**
	 * Returns the meta object for class '{@link yml.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see yml.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link yml.Rule#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If</em>'.
	 * @see yml.Rule#getIf()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_If();

	/**
	 * Returns the meta object for the attribute '{@link yml.Rule#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see yml.Rule#getWhen()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_When();

	/**
	 * Returns the meta object for the attribute '{@link yml.Rule#isAllow_failure <em>Allow failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow failure</em>'.
	 * @see yml.Rule#isAllow_failure()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Allow_failure();

	/**
	 * Returns the meta object for the attribute '{@link yml.Rule#getStart_in <em>Start in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start in</em>'.
	 * @see yml.Rule#getStart_in()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Start_in();

	/**
	 * Returns the meta object for class '{@link yml.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see yml.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link yml.Environment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see yml.Environment#getUrl()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Url();

	/**
	 * Returns the meta object for the attribute '{@link yml.Environment#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see yml.Environment#getAction()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Action();

	/**
	 * Returns the meta object for class '{@link yml.GitlabCI <em>Gitlab CI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gitlab CI</em>'.
	 * @see yml.GitlabCI
	 * @generated
	 */
	EClass getGitlabCI();

	/**
	 * Returns the meta object for the containment reference list '{@link yml.GitlabCI#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see yml.GitlabCI#getJobs()
	 * @see #getGitlabCI()
	 * @generated
	 */
	EReference getGitlabCI_Jobs();

	/**
	 * Returns the meta object for the containment reference list '{@link yml.GitlabCI#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see yml.GitlabCI#getImages()
	 * @see #getGitlabCI()
	 * @generated
	 */
	EReference getGitlabCI_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link yml.GitlabCI#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see yml.GitlabCI#getServices()
	 * @see #getGitlabCI()
	 * @generated
	 */
	EReference getGitlabCI_Services();

	/**
	 * Returns the meta object for class '{@link yml.ImageJ <em>Image J</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image J</em>'.
	 * @see yml.ImageJ
	 * @generated
	 */
	EClass getImageJ();

	/**
	 * Returns the meta object for the attribute list '{@link yml.ImageJ#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entrypoint</em>'.
	 * @see yml.ImageJ#getEntrypoint()
	 * @see #getImageJ()
	 * @generated
	 */
	EAttribute getImageJ_Entrypoint();

	/**
	 * Returns the meta object for enum '{@link yml.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stage</em>'.
	 * @see yml.Stage
	 * @generated
	 */
	EEnum getStage();

	/**
	 * Returns the meta object for enum '{@link yml.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>When</em>'.
	 * @see yml.When
	 * @generated
	 */
	EEnum getWhen();

	/**
	 * Returns the meta object for enum '{@link yml.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see yml.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YmlFactory getYmlFactory();

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
		 * The meta object literal for the '{@link yml.impl.ImageGImpl <em>Image G</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.ImageGImpl
		 * @see yml.impl.YmlPackageImpl#getImageG()
		 * @generated
		 */
		EClass IMAGE_G = eINSTANCE.getImageG();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_G__ENTRYPOINT = eINSTANCE.getImageG_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_G__JOB = eINSTANCE.getImageG_Job();

		/**
		 * The meta object literal for the '{@link yml.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.ServiceImpl
		 * @see yml.impl.YmlPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ALIAS = eINSTANCE.getService_Alias();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ENTRYPOINT = eINSTANCE.getService_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__COMMAND = eINSTANCE.getService_Command();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__JOB = eINSTANCE.getService_Job();

		/**
		 * The meta object literal for the '{@link yml.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.JobImpl
		 * @see yml.impl.YmlPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__STAGE = eINSTANCE.getJob_Stage();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__SCRIPT = eINSTANCE.getJob_Script();

		/**
		 * The meta object literal for the '<em><b>After script</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__AFTER_SCRIPT = eINSTANCE.getJob_After_script();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__RULES = eINSTANCE.getJob_Rules();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENTS = eINSTANCE.getJob_Environments();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ARTIFACTS = eINSTANCE.getJob_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SERVICE = eINSTANCE.getJob_Service();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__IMAGE = eINSTANCE.getJob_Image();

		/**
		 * The meta object literal for the '<em><b>Imageg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__IMAGEG = eINSTANCE.getJob_Imageg();

		/**
		 * The meta object literal for the '{@link yml.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.ElementNommeImpl
		 * @see yml.impl.YmlPackageImpl#getElementNomme()
		 * @generated
		 */
		EClass ELEMENT_NOMME = eINSTANCE.getElementNomme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_NOMME__NAME = eINSTANCE.getElementNomme_Name();

		/**
		 * The meta object literal for the '{@link yml.impl.artifactImpl <em>artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.artifactImpl
		 * @see yml.impl.YmlPackageImpl#getartifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getartifact();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PATHS = eINSTANCE.getartifact_Paths();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__EXCLUDE = eINSTANCE.getartifact_Exclude();

		/**
		 * The meta object literal for the '<em><b>Expose as</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__EXPOSE_AS = eINSTANCE.getartifact_Expose_as();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getartifact_Name();

		/**
		 * The meta object literal for the '<em><b>Untracked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__UNTRACKED = eINSTANCE.getartifact_Untracked();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__WHEN = eINSTANCE.getartifact_When();

		/**
		 * The meta object literal for the '{@link yml.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.RuleImpl
		 * @see yml.impl.YmlPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IF = eINSTANCE.getRule_If();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__WHEN = eINSTANCE.getRule_When();

		/**
		 * The meta object literal for the '<em><b>Allow failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ALLOW_FAILURE = eINSTANCE.getRule_Allow_failure();

		/**
		 * The meta object literal for the '<em><b>Start in</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__START_IN = eINSTANCE.getRule_Start_in();

		/**
		 * The meta object literal for the '{@link yml.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.EnvironmentImpl
		 * @see yml.impl.YmlPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__URL = eINSTANCE.getEnvironment_Url();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__ACTION = eINSTANCE.getEnvironment_Action();

		/**
		 * The meta object literal for the '{@link yml.impl.GitlabCIImpl <em>Gitlab CI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.GitlabCIImpl
		 * @see yml.impl.YmlPackageImpl#getGitlabCI()
		 * @generated
		 */
		EClass GITLAB_CI = eINSTANCE.getGitlabCI();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITLAB_CI__JOBS = eINSTANCE.getGitlabCI_Jobs();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITLAB_CI__IMAGES = eINSTANCE.getGitlabCI_Images();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITLAB_CI__SERVICES = eINSTANCE.getGitlabCI_Services();

		/**
		 * The meta object literal for the '{@link yml.impl.ImageJImpl <em>Image J</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.ImageJImpl
		 * @see yml.impl.YmlPackageImpl#getImageJ()
		 * @generated
		 */
		EClass IMAGE_J = eINSTANCE.getImageJ();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_J__ENTRYPOINT = eINSTANCE.getImageJ_Entrypoint();

		/**
		 * The meta object literal for the '{@link yml.Stage <em>Stage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.Stage
		 * @see yml.impl.YmlPackageImpl#getStage()
		 * @generated
		 */
		EEnum STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '{@link yml.When <em>When</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.When
		 * @see yml.impl.YmlPackageImpl#getWhen()
		 * @generated
		 */
		EEnum WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '{@link yml.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.Action
		 * @see yml.impl.YmlPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

	}

} //YmlPackage
