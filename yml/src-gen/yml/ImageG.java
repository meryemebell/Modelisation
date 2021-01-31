/**
 */
package yml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image G</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yml.ImageG#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link yml.ImageG#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @see yml.YmlPackage#getImageG()
 * @model
 * @generated
 */
public interface ImageG extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' attribute list.
	 * @see yml.YmlPackage#getImageG_Entrypoint()
	 * @model
	 * @generated
	 */
	EList<String> getEntrypoint();

	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link yml.Job#getImageg <em>Imageg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(Job)
	 * @see yml.YmlPackage#getImageG_Job()
	 * @see yml.Job#getImageg
	 * @model opposite="imageg"
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link yml.ImageG#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

} // ImageG
