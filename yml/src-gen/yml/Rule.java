/**
 */
package yml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yml.Rule#getIf <em>If</em>}</li>
 *   <li>{@link yml.Rule#getWhen <em>When</em>}</li>
 *   <li>{@link yml.Rule#isAllow_failure <em>Allow failure</em>}</li>
 *   <li>{@link yml.Rule#getStart_in <em>Start in</em>}</li>
 * </ul>
 *
 * @see yml.YmlPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' attribute.
	 * @see #setIf(String)
	 * @see yml.YmlPackage#getRule_If()
	 * @model required="true"
	 * @generated
	 */
	String getIf();

	/**
	 * Sets the value of the '{@link yml.Rule#getIf <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' attribute.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(String value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * The literals are from the enumeration {@link yml.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see yml.When
	 * @see #setWhen(When)
	 * @see yml.YmlPackage#getRule_When()
	 * @model
	 * @generated
	 */
	When getWhen();

	/**
	 * Sets the value of the '{@link yml.Rule#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see yml.When
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(When value);

	/**
	 * Returns the value of the '<em><b>Allow failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow failure</em>' attribute.
	 * @see #setAllow_failure(boolean)
	 * @see yml.YmlPackage#getRule_Allow_failure()
	 * @model
	 * @generated
	 */
	boolean isAllow_failure();

	/**
	 * Sets the value of the '{@link yml.Rule#isAllow_failure <em>Allow failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow failure</em>' attribute.
	 * @see #isAllow_failure()
	 * @generated
	 */
	void setAllow_failure(boolean value);

	/**
	 * Returns the value of the '<em><b>Start in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start in</em>' attribute.
	 * @see #setStart_in(String)
	 * @see yml.YmlPackage#getRule_Start_in()
	 * @model
	 * @generated
	 */
	String getStart_in();

	/**
	 * Sets the value of the '{@link yml.Rule#getStart_in <em>Start in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start in</em>' attribute.
	 * @see #getStart_in()
	 * @generated
	 */
	void setStart_in(String value);

} // Rule
