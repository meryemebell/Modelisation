/**
 */
package yml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yml.Service#getAlias <em>Alias</em>}</li>
 *   <li>{@link yml.Service#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link yml.Service#getCommand <em>Command</em>}</li>
 *   <li>{@link yml.Service#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @see yml.YmlPackage#getService()
 * @model
 * @generated
 */
public interface Service extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see yml.YmlPackage#getService_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link yml.Service#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' attribute.
	 * @see #setEntrypoint(String)
	 * @see yml.YmlPackage#getService_Entrypoint()
	 * @model
	 * @generated
	 */
	String getEntrypoint();

	/**
	 * Sets the value of the '{@link yml.Service#getEntrypoint <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrypoint</em>' attribute.
	 * @see #getEntrypoint()
	 * @generated
	 */
	void setEntrypoint(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute list.
	 * @see yml.YmlPackage#getService_Command()
	 * @model
	 * @generated
	 */
	EList<String> getCommand();

	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference list.
	 * The list contents are of type {@link yml.Job}.
	 * It is bidirectional and its opposite is '{@link yml.Job#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference list.
	 * @see yml.YmlPackage#getService_Job()
	 * @see yml.Job#getService
	 * @model opposite="service"
	 * @generated
	 */
	EList<Job> getJob();

} // Service
