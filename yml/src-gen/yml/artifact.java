/**
 */
package yml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yml.artifact#getPaths <em>Paths</em>}</li>
 *   <li>{@link yml.artifact#getExclude <em>Exclude</em>}</li>
 *   <li>{@link yml.artifact#getExpose_as <em>Expose as</em>}</li>
 *   <li>{@link yml.artifact#getName <em>Name</em>}</li>
 *   <li>{@link yml.artifact#isUntracked <em>Untracked</em>}</li>
 *   <li>{@link yml.artifact#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see yml.YmlPackage#getartifact()
 * @model
 * @generated
 */
public interface artifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute.
	 * @see #setPaths(String)
	 * @see yml.YmlPackage#getartifact_Paths()
	 * @model required="true"
	 * @generated
	 */
	String getPaths();

	/**
	 * Sets the value of the '{@link yml.artifact#getPaths <em>Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paths</em>' attribute.
	 * @see #getPaths()
	 * @generated
	 */
	void setPaths(String value);

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' attribute.
	 * @see #setExclude(String)
	 * @see yml.YmlPackage#getartifact_Exclude()
	 * @model
	 * @generated
	 */
	String getExclude();

	/**
	 * Sets the value of the '{@link yml.artifact#getExclude <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' attribute.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(String value);

	/**
	 * Returns the value of the '<em><b>Expose as</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose as</em>' attribute.
	 * @see #setExpose_as(String)
	 * @see yml.YmlPackage#getartifact_Expose_as()
	 * @model
	 * @generated
	 */
	String getExpose_as();

	/**
	 * Sets the value of the '{@link yml.artifact#getExpose_as <em>Expose as</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose as</em>' attribute.
	 * @see #getExpose_as()
	 * @generated
	 */
	void setExpose_as(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yml.YmlPackage#getartifact_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yml.artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Untracked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Untracked</em>' attribute.
	 * @see #setUntracked(boolean)
	 * @see yml.YmlPackage#getartifact_Untracked()
	 * @model
	 * @generated
	 */
	boolean isUntracked();

	/**
	 * Sets the value of the '{@link yml.artifact#isUntracked <em>Untracked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Untracked</em>' attribute.
	 * @see #isUntracked()
	 * @generated
	 */
	void setUntracked(boolean value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * The default value is <code>"always"</code>.
	 * The literals are from the enumeration {@link yml.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see yml.When
	 * @see #setWhen(When)
	 * @see yml.YmlPackage#getartifact_When()
	 * @model default="always"
	 * @generated
	 */
	When getWhen();

	/**
	 * Sets the value of the '{@link yml.artifact#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see yml.When
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(When value);

} // artifact
