/**
 */
package yml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import yml.When;
import yml.YmlPackage;
import yml.artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yml.impl.artifactImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link yml.impl.artifactImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link yml.impl.artifactImpl#getExpose_as <em>Expose as</em>}</li>
 *   <li>{@link yml.impl.artifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link yml.impl.artifactImpl#isUntracked <em>Untracked</em>}</li>
 *   <li>{@link yml.impl.artifactImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class artifactImpl extends MinimalEObjectImpl.Container implements artifact {
	/**
	 * The default value of the '{@link #getPaths() <em>Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected static final String PATHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected String paths = PATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected String exclude = EXCLUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpose_as() <em>Expose as</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose_as()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPOSE_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpose_as() <em>Expose as</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose_as()
	 * @generated
	 * @ordered
	 */
	protected String expose_as = EXPOSE_AS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUntracked() <em>Untracked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUntracked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNTRACKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUntracked() <em>Untracked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUntracked()
	 * @generated
	 * @ordered
	 */
	protected boolean untracked = UNTRACKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final When WHEN_EDEFAULT = When.ALWAYS;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected artifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YmlPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaths() {
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaths(String newPaths) {
		String oldPaths = paths;
		paths = newPaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.ARTIFACT__PATHS, oldPaths, paths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude(String newExclude) {
		String oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.ARTIFACT__EXCLUDE, oldExclude, exclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpose_as() {
		return expose_as;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpose_as(String newExpose_as) {
		String oldExpose_as = expose_as;
		expose_as = newExpose_as;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.ARTIFACT__EXPOSE_AS, oldExpose_as,
					expose_as));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.ARTIFACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUntracked() {
		return untracked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntracked(boolean newUntracked) {
		boolean oldUntracked = untracked;
		untracked = newUntracked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.ARTIFACT__UNTRACKED, oldUntracked,
					untracked));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.ARTIFACT__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YmlPackage.ARTIFACT__PATHS:
			return getPaths();
		case YmlPackage.ARTIFACT__EXCLUDE:
			return getExclude();
		case YmlPackage.ARTIFACT__EXPOSE_AS:
			return getExpose_as();
		case YmlPackage.ARTIFACT__NAME:
			return getName();
		case YmlPackage.ARTIFACT__UNTRACKED:
			return isUntracked();
		case YmlPackage.ARTIFACT__WHEN:
			return getWhen();
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
		case YmlPackage.ARTIFACT__PATHS:
			setPaths((String) newValue);
			return;
		case YmlPackage.ARTIFACT__EXCLUDE:
			setExclude((String) newValue);
			return;
		case YmlPackage.ARTIFACT__EXPOSE_AS:
			setExpose_as((String) newValue);
			return;
		case YmlPackage.ARTIFACT__NAME:
			setName((String) newValue);
			return;
		case YmlPackage.ARTIFACT__UNTRACKED:
			setUntracked((Boolean) newValue);
			return;
		case YmlPackage.ARTIFACT__WHEN:
			setWhen((When) newValue);
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
		case YmlPackage.ARTIFACT__PATHS:
			setPaths(PATHS_EDEFAULT);
			return;
		case YmlPackage.ARTIFACT__EXCLUDE:
			setExclude(EXCLUDE_EDEFAULT);
			return;
		case YmlPackage.ARTIFACT__EXPOSE_AS:
			setExpose_as(EXPOSE_AS_EDEFAULT);
			return;
		case YmlPackage.ARTIFACT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case YmlPackage.ARTIFACT__UNTRACKED:
			setUntracked(UNTRACKED_EDEFAULT);
			return;
		case YmlPackage.ARTIFACT__WHEN:
			setWhen(WHEN_EDEFAULT);
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
		case YmlPackage.ARTIFACT__PATHS:
			return PATHS_EDEFAULT == null ? paths != null : !PATHS_EDEFAULT.equals(paths);
		case YmlPackage.ARTIFACT__EXCLUDE:
			return EXCLUDE_EDEFAULT == null ? exclude != null : !EXCLUDE_EDEFAULT.equals(exclude);
		case YmlPackage.ARTIFACT__EXPOSE_AS:
			return EXPOSE_AS_EDEFAULT == null ? expose_as != null : !EXPOSE_AS_EDEFAULT.equals(expose_as);
		case YmlPackage.ARTIFACT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case YmlPackage.ARTIFACT__UNTRACKED:
			return untracked != UNTRACKED_EDEFAULT;
		case YmlPackage.ARTIFACT__WHEN:
			return when != WHEN_EDEFAULT;
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
		result.append(" (Paths: ");
		result.append(paths);
		result.append(", exclude: ");
		result.append(exclude);
		result.append(", expose_as: ");
		result.append(expose_as);
		result.append(", name: ");
		result.append(name);
		result.append(", untracked: ");
		result.append(untracked);
		result.append(", when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //artifactImpl
