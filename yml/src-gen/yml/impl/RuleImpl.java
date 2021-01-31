/**
 */
package yml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import yml.Rule;
import yml.When;
import yml.YmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yml.impl.RuleImpl#getIf <em>If</em>}</li>
 *   <li>{@link yml.impl.RuleImpl#getWhen <em>When</em>}</li>
 *   <li>{@link yml.impl.RuleImpl#isAllow_failure <em>Allow failure</em>}</li>
 *   <li>{@link yml.impl.RuleImpl#getStart_in <em>Start in</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #getIf() <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected String if_ = IF_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final When WHEN_EDEFAULT = When.ON_SUCCESS;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected When when = WHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllow_failure() <em>Allow failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllow_failure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllow_failure() <em>Allow failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllow_failure()
	 * @generated
	 * @ordered
	 */
	protected boolean allow_failure = ALLOW_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart_in() <em>Start in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_in()
	 * @generated
	 * @ordered
	 */
	protected static final String START_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart_in() <em>Start in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_in()
	 * @generated
	 * @ordered
	 */
	protected String start_in = START_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YmlPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf(String newIf) {
		String oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.RULE__IF, oldIf, if_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(When newWhen) {
		When oldWhen = when;
		when = newWhen == null ? WHEN_EDEFAULT : newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.RULE__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllow_failure() {
		return allow_failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllow_failure(boolean newAllow_failure) {
		boolean oldAllow_failure = allow_failure;
		allow_failure = newAllow_failure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.RULE__ALLOW_FAILURE, oldAllow_failure,
					allow_failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart_in() {
		return start_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_in(String newStart_in) {
		String oldStart_in = start_in;
		start_in = newStart_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.RULE__START_IN, oldStart_in, start_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YmlPackage.RULE__IF:
			return getIf();
		case YmlPackage.RULE__WHEN:
			return getWhen();
		case YmlPackage.RULE__ALLOW_FAILURE:
			return isAllow_failure();
		case YmlPackage.RULE__START_IN:
			return getStart_in();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YmlPackage.RULE__IF:
			setIf((String) newValue);
			return;
		case YmlPackage.RULE__WHEN:
			setWhen((When) newValue);
			return;
		case YmlPackage.RULE__ALLOW_FAILURE:
			setAllow_failure((Boolean) newValue);
			return;
		case YmlPackage.RULE__START_IN:
			setStart_in((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case YmlPackage.RULE__IF:
			setIf(IF_EDEFAULT);
			return;
		case YmlPackage.RULE__WHEN:
			setWhen(WHEN_EDEFAULT);
			return;
		case YmlPackage.RULE__ALLOW_FAILURE:
			setAllow_failure(ALLOW_FAILURE_EDEFAULT);
			return;
		case YmlPackage.RULE__START_IN:
			setStart_in(START_IN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case YmlPackage.RULE__IF:
			return IF_EDEFAULT == null ? if_ != null : !IF_EDEFAULT.equals(if_);
		case YmlPackage.RULE__WHEN:
			return when != WHEN_EDEFAULT;
		case YmlPackage.RULE__ALLOW_FAILURE:
			return allow_failure != ALLOW_FAILURE_EDEFAULT;
		case YmlPackage.RULE__START_IN:
			return START_IN_EDEFAULT == null ? start_in != null : !START_IN_EDEFAULT.equals(start_in);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (if: ");
		result.append(if_);
		result.append(", when: ");
		result.append(when);
		result.append(", allow_failure: ");
		result.append(allow_failure);
		result.append(", start_in: ");
		result.append(start_in);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
