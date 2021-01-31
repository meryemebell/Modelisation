/**
 */
package yml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yml.Job;
import yml.Service;
import yml.YmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yml.impl.ServiceImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link yml.impl.ServiceImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link yml.impl.ServiceImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link yml.impl.ServiceImpl#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ElementNommeImpl implements Service {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRYPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected String entrypoint = ENTRYPOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<String> command;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> job;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YmlPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.SERVICE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntrypoint() {
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrypoint(String newEntrypoint) {
		String oldEntrypoint = entrypoint;
		entrypoint = newEntrypoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.SERVICE__ENTRYPOINT, oldEntrypoint,
					entrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCommand() {
		if (command == null) {
			command = new EDataTypeUniqueEList<String>(String.class, this, YmlPackage.SERVICE__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Job> getJob() {
		if (job == null) {
			job = new EObjectWithInverseResolvingEList.ManyInverse<Job>(Job.class, this, YmlPackage.SERVICE__JOB,
					YmlPackage.JOB__SERVICE);
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YmlPackage.SERVICE__JOB:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJob()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YmlPackage.SERVICE__JOB:
			return ((InternalEList<?>) getJob()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YmlPackage.SERVICE__ALIAS:
			return getAlias();
		case YmlPackage.SERVICE__ENTRYPOINT:
			return getEntrypoint();
		case YmlPackage.SERVICE__COMMAND:
			return getCommand();
		case YmlPackage.SERVICE__JOB:
			return getJob();
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
		case YmlPackage.SERVICE__ALIAS:
			setAlias((String) newValue);
			return;
		case YmlPackage.SERVICE__ENTRYPOINT:
			setEntrypoint((String) newValue);
			return;
		case YmlPackage.SERVICE__COMMAND:
			getCommand().clear();
			getCommand().addAll((Collection<? extends String>) newValue);
			return;
		case YmlPackage.SERVICE__JOB:
			getJob().clear();
			getJob().addAll((Collection<? extends Job>) newValue);
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
		case YmlPackage.SERVICE__ALIAS:
			setAlias(ALIAS_EDEFAULT);
			return;
		case YmlPackage.SERVICE__ENTRYPOINT:
			setEntrypoint(ENTRYPOINT_EDEFAULT);
			return;
		case YmlPackage.SERVICE__COMMAND:
			getCommand().clear();
			return;
		case YmlPackage.SERVICE__JOB:
			getJob().clear();
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
		case YmlPackage.SERVICE__ALIAS:
			return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
		case YmlPackage.SERVICE__ENTRYPOINT:
			return ENTRYPOINT_EDEFAULT == null ? entrypoint != null : !ENTRYPOINT_EDEFAULT.equals(entrypoint);
		case YmlPackage.SERVICE__COMMAND:
			return command != null && !command.isEmpty();
		case YmlPackage.SERVICE__JOB:
			return job != null && !job.isEmpty();
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
		result.append(" (alias: ");
		result.append(alias);
		result.append(", entrypoint: ");
		result.append(entrypoint);
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
