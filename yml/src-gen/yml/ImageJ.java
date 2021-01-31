/**
 */
package yml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image J</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yml.ImageJ#getEntrypoint <em>Entrypoint</em>}</li>
 * </ul>
 *
 * @see yml.YmlPackage#getImageJ()
 * @model
 * @generated
 */
public interface ImageJ extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' attribute list.
	 * @see yml.YmlPackage#getImageJ_Entrypoint()
	 * @model
	 * @generated
	 */
	EList<String> getEntrypoint();

} // ImageJ
