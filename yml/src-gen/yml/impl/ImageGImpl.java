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

import yml.ImageG;
import yml.Job;
import yml.YmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image G</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yml.impl.ImageGImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link yml.impl.ImageGImpl#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageGImpl extends ElementNommeImpl implements ImageG {
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
	 * The cached value of the '{@link #getJob() <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected Job job;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YmlPackage.Literals.IMAGE_G;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEntrypoint() {
		if (entrypoint == null) {
			entrypoint = new EDataTypeUniqueEList<String>(String.class, this, YmlPackage.IMAGE_G__ENTRYPOINT);
		}
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job getJob() {
		if (job != null && job.eIsProxy()) {
			InternalEObject oldJob = (InternalEObject) job;
			job = (Job) eResolveProxy(oldJob);
			if (job != oldJob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YmlPackage.IMAGE_G__JOB, oldJob, job));
			}
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job basicGetJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJob(Job newJob, NotificationChain msgs) {
		Job oldJob = job;
		job = newJob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YmlPackage.IMAGE_G__JOB,
					oldJob, newJob);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJob(Job newJob) {
		if (newJob != job) {
			NotificationChain msgs = null;
			if (job != null)
				msgs = ((InternalEObject) job).eInverseRemove(this, YmlPackage.JOB__IMAGEG, Job.class, msgs);
			if (newJob != null)
				msgs = ((InternalEObject) newJob).eInverseAdd(this, YmlPackage.JOB__IMAGEG, Job.class, msgs);
			msgs = basicSetJob(newJob, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.IMAGE_G__JOB, newJob, newJob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YmlPackage.IMAGE_G__JOB:
			if (job != null)
				msgs = ((InternalEObject) job).eInverseRemove(this, YmlPackage.JOB__IMAGEG, Job.class, msgs);
			return basicSetJob((Job) otherEnd, msgs);
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
		case YmlPackage.IMAGE_G__JOB:
			return basicSetJob(null, msgs);
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
		case YmlPackage.IMAGE_G__ENTRYPOINT:
			return getEntrypoint();
		case YmlPackage.IMAGE_G__JOB:
			if (resolve)
				return getJob();
			return basicGetJob();
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
		case YmlPackage.IMAGE_G__ENTRYPOINT:
			getEntrypoint().clear();
			getEntrypoint().addAll((Collection<? extends String>) newValue);
			return;
		case YmlPackage.IMAGE_G__JOB:
			setJob((Job) newValue);
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
		case YmlPackage.IMAGE_G__ENTRYPOINT:
			getEntrypoint().clear();
			return;
		case YmlPackage.IMAGE_G__JOB:
			setJob((Job) null);
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
		case YmlPackage.IMAGE_G__ENTRYPOINT:
			return entrypoint != null && !entrypoint.isEmpty();
		case YmlPackage.IMAGE_G__JOB:
			return job != null;
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

} //ImageGImpl
