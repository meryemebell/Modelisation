/**
 */
package yml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yml.Job#getStage <em>Stage</em>}</li>
 *   <li>{@link yml.Job#getScript <em>Script</em>}</li>
 *   <li>{@link yml.Job#getAfter_script <em>After script</em>}</li>
 *   <li>{@link yml.Job#getRules <em>Rules</em>}</li>
 *   <li>{@link yml.Job#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link yml.Job#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link yml.Job#getService <em>Service</em>}</li>
 *   <li>{@link yml.Job#getImage <em>Image</em>}</li>
 *   <li>{@link yml.Job#getImageg <em>Imageg</em>}</li>
 * </ul>
 *
 * @see yml.YmlPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The default value is <code>"Test"</code>.
	 * The literals are from the enumeration {@link yml.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see yml.Stage
	 * @see #setStage(Stage)
	 * @see yml.YmlPackage#getJob_Stage()
	 * @model default="Test" required="true"
	 * @generated
	 */
	Stage getStage();

	/**
	 * Sets the value of the '{@link yml.Job#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see yml.Stage
	 * @see #getStage()
	 * @generated
	 */
	void setStage(Stage value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute list.
	 * @see yml.YmlPackage#getJob_Script()
	 * @model default=""
	 * @generated
	 */
	EList<String> getScript();

	/**
	 * Returns the value of the '<em><b>After script</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After script</em>' attribute list.
	 * @see yml.YmlPackage#getJob_After_script()
	 * @model
	 * @generated
	 */
	EList<String> getAfter_script();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link yml.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see yml.YmlPackage#getJob_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link yml.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see yml.YmlPackage#getJob_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link yml.artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see yml.YmlPackage#getJob_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link yml.Service}.
	 * It is bidirectional and its opposite is '{@link yml.Service#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see yml.YmlPackage#getJob_Service()
	 * @see yml.Service#getJob
	 * @model opposite="job"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link yml.ImageJ}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see yml.YmlPackage#getJob_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImageJ> getImage();

	/**
	 * Returns the value of the '<em><b>Imageg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link yml.ImageG#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageg</em>' reference.
	 * @see #setImageg(ImageG)
	 * @see yml.YmlPackage#getJob_Imageg()
	 * @see yml.ImageG#getJob
	 * @model opposite="job"
	 * @generated
	 */
	ImageG getImageg();

	/**
	 * Sets the value of the '{@link yml.Job#getImageg <em>Imageg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imageg</em>' reference.
	 * @see #getImageg()
	 * @generated
	 */
	void setImageg(ImageG value);

} // Job
