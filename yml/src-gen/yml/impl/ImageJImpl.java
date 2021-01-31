/**
 */
package yml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import yml.ImageJ;
import yml.YmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image J</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yml.impl.ImageJImpl#getEntrypoint <em>Entrypoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageJImpl extends ElementNommeImpl implements ImageJ {
	/**
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entrypoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageJImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YmlPackage.Literals.IMAGE_J;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEntrypoint() {
		if (entrypoint == null) {
			entrypoint = new EDataTypeUniqueEList<String>(String.class, this, YmlPackage.IMAGE_J__ENTRYPOINT);
		}
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YmlPackage.IMAGE_J__ENTRYPOINT:
			return getEntrypoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YmlPackage.IMAGE_J__ENTRYPOINT:
			getEntrypoint().clear();
			getEntrypoint().addAll((Collection<? extends String>) newValue);
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
		case YmlPackage.IMAGE_J__ENTRYPOINT:
			getEntrypoint().clear();
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
		case YmlPackage.IMAGE_J__ENTRYPOINT:
			return entrypoint != null && !entrypoint.isEmpty();
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
		result.append(" (entrypoint: ");
		result.append(entrypoint);
		result.append(')');
		return result.toString();
	}

} //ImageJImpl
