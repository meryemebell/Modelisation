/**
 */
package yml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yml.GitlabCI;
import yml.ImageG;
import yml.Job;
import yml.Service;
import yml.YmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gitlab CI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yml.impl.GitlabCIImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link yml.impl.GitlabCIImpl#getImages <em>Images</em>}</li>
 *   <li>{@link yml.impl.GitlabCIImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitlabCIImpl extends ElementNommeImpl implements GitlabCI {
	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageG> images;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitlabCIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YmlPackage.Literals.GITLAB_CI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<Job>(Job.class, this, YmlPackage.GITLAB_CI__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageG> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<ImageG>(ImageG.class, this, YmlPackage.GITLAB_CI__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, YmlPackage.GITLAB_CI__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YmlPackage.GITLAB_CI__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
		case YmlPackage.GITLAB_CI__IMAGES:
			return ((InternalEList<?>) getImages()).basicRemove(otherEnd, msgs);
		case YmlPackage.GITLAB_CI__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
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
		case YmlPackage.GITLAB_CI__JOBS:
			return getJobs();
		case YmlPackage.GITLAB_CI__IMAGES:
			return getImages();
		case YmlPackage.GITLAB_CI__SERVICES:
			return getServices();
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
		case YmlPackage.GITLAB_CI__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
			return;
		case YmlPackage.GITLAB_CI__IMAGES:
			getImages().clear();
			getImages().addAll((Collection<? extends ImageG>) newValue);
			return;
		case YmlPackage.GITLAB_CI__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
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
		case YmlPackage.GITLAB_CI__JOBS:
			getJobs().clear();
			return;
		case YmlPackage.GITLAB_CI__IMAGES:
			getImages().clear();
			return;
		case YmlPackage.GITLAB_CI__SERVICES:
			getServices().clear();
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
		case YmlPackage.GITLAB_CI__JOBS:
			return jobs != null && !jobs.isEmpty();
		case YmlPackage.GITLAB_CI__IMAGES:
			return images != null && !images.isEmpty();
		case YmlPackage.GITLAB_CI__SERVICES:
			return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GitlabCIImpl
