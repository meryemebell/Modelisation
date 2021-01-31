/**
 */
package yml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gitlab CI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yml.GitlabCI#getJobs <em>Jobs</em>}</li>
 *   <li>{@link yml.GitlabCI#getImages <em>Images</em>}</li>
 *   <li>{@link yml.GitlabCI#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see yml.YmlPackage#getGitlabCI()
 * @model
 * @generated
 */
public interface GitlabCI extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link yml.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see yml.YmlPackage#getGitlabCI_Jobs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link yml.ImageG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see yml.YmlPackage#getGitlabCI_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImageG> getImages();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link yml.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see yml.YmlPackage#getGitlabCI_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

} // GitlabCI
