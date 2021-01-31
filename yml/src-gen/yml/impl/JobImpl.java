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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yml.Environment;
import yml.ImageG;
import yml.ImageJ;
import yml.Job;
import yml.Rule;
import yml.Service;
import yml.Stage;
import yml.YmlPackage;
import yml.artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yml.impl.JobImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link yml.impl.JobImpl#getScript <em>Script</em>}</li>
 *   <li>{@link yml.impl.JobImpl#getAfter_script <em>After script</em>}</li>
 *   <li>{@link yml.impl.JobImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link yml.impl.JobImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link yml.impl.JobImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link yml.impl.JobImpl#getService <em>Service</em>}</li>
 *   <li>{@link yml.impl.JobImpl#getImage <em>Image</em>}</li>
 *   <li>{@link yml.impl.JobImpl#getImageg <em>Imageg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends ElementNommeImpl implements Job {
	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final Stage STAGE_EDEFAULT = Stage.TEST;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected Stage stage = STAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<String> script;

	/**
	 * The cached value of the '{@link #getAfter_script() <em>After script</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter_script()
	 * @generated
	 * @ordered
	 */
	protected EList<String> after_script;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<artifact> artifacts;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageJ> image;

	/**
	 * The cached value of the '{@link #getImageg() <em>Imageg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageg()
	 * @generated
	 * @ordered
	 */
	protected ImageG imageg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YmlPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(Stage newStage) {
		Stage oldStage = stage;
		stage = newStage == null ? STAGE_EDEFAULT : newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.JOB__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getScript() {
		if (script == null) {
			script = new EDataTypeUniqueEList<String>(String.class, this, YmlPackage.JOB__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAfter_script() {
		if (after_script == null) {
			after_script = new EDataTypeUniqueEList<String>(String.class, this, YmlPackage.JOB__AFTER_SCRIPT);
		}
		return after_script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, YmlPackage.JOB__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Environment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this,
					YmlPackage.JOB__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<artifact>(artifact.class, this, YmlPackage.JOB__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this,
					YmlPackage.JOB__SERVICE, YmlPackage.SERVICE__JOB);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageJ> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<ImageJ>(ImageJ.class, this, YmlPackage.JOB__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageG getImageg() {
		if (imageg != null && imageg.eIsProxy()) {
			InternalEObject oldImageg = (InternalEObject) imageg;
			imageg = (ImageG) eResolveProxy(oldImageg);
			if (imageg != oldImageg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YmlPackage.JOB__IMAGEG, oldImageg,
							imageg));
			}
		}
		return imageg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageG basicGetImageg() {
		return imageg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageg(ImageG newImageg, NotificationChain msgs) {
		ImageG oldImageg = imageg;
		imageg = newImageg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YmlPackage.JOB__IMAGEG,
					oldImageg, newImageg);
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
	public void setImageg(ImageG newImageg) {
		if (newImageg != imageg) {
			NotificationChain msgs = null;
			if (imageg != null)
				msgs = ((InternalEObject) imageg).eInverseRemove(this, YmlPackage.IMAGE_G__JOB, ImageG.class, msgs);
			if (newImageg != null)
				msgs = ((InternalEObject) newImageg).eInverseAdd(this, YmlPackage.IMAGE_G__JOB, ImageG.class, msgs);
			msgs = basicSetImageg(newImageg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.JOB__IMAGEG, newImageg, newImageg));
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
		case YmlPackage.JOB__SERVICE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getService()).basicAdd(otherEnd, msgs);
		case YmlPackage.JOB__IMAGEG:
			if (imageg != null)
				msgs = ((InternalEObject) imageg).eInverseRemove(this, YmlPackage.IMAGE_G__JOB, ImageG.class, msgs);
			return basicSetImageg((ImageG) otherEnd, msgs);
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
		case YmlPackage.JOB__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case YmlPackage.JOB__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case YmlPackage.JOB__ARTIFACTS:
			return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
		case YmlPackage.JOB__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		case YmlPackage.JOB__IMAGE:
			return ((InternalEList<?>) getImage()).basicRemove(otherEnd, msgs);
		case YmlPackage.JOB__IMAGEG:
			return basicSetImageg(null, msgs);
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
		case YmlPackage.JOB__STAGE:
			return getStage();
		case YmlPackage.JOB__SCRIPT:
			return getScript();
		case YmlPackage.JOB__AFTER_SCRIPT:
			return getAfter_script();
		case YmlPackage.JOB__RULES:
			return getRules();
		case YmlPackage.JOB__ENVIRONMENTS:
			return getEnvironments();
		case YmlPackage.JOB__ARTIFACTS:
			return getArtifacts();
		case YmlPackage.JOB__SERVICE:
			return getService();
		case YmlPackage.JOB__IMAGE:
			return getImage();
		case YmlPackage.JOB__IMAGEG:
			if (resolve)
				return getImageg();
			return basicGetImageg();
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
		case YmlPackage.JOB__STAGE:
			setStage((Stage) newValue);
			return;
		case YmlPackage.JOB__SCRIPT:
			getScript().clear();
			getScript().addAll((Collection<? extends String>) newValue);
			return;
		case YmlPackage.JOB__AFTER_SCRIPT:
			getAfter_script().clear();
			getAfter_script().addAll((Collection<? extends String>) newValue);
			return;
		case YmlPackage.JOB__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends Rule>) newValue);
			return;
		case YmlPackage.JOB__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case YmlPackage.JOB__ARTIFACTS:
			getArtifacts().clear();
			getArtifacts().addAll((Collection<? extends artifact>) newValue);
			return;
		case YmlPackage.JOB__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
			return;
		case YmlPackage.JOB__IMAGE:
			getImage().clear();
			getImage().addAll((Collection<? extends ImageJ>) newValue);
			return;
		case YmlPackage.JOB__IMAGEG:
			setImageg((ImageG) newValue);
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
		case YmlPackage.JOB__STAGE:
			setStage(STAGE_EDEFAULT);
			return;
		case YmlPackage.JOB__SCRIPT:
			getScript().clear();
			return;
		case YmlPackage.JOB__AFTER_SCRIPT:
			getAfter_script().clear();
			return;
		case YmlPackage.JOB__RULES:
			getRules().clear();
			return;
		case YmlPackage.JOB__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case YmlPackage.JOB__ARTIFACTS:
			getArtifacts().clear();
			return;
		case YmlPackage.JOB__SERVICE:
			getService().clear();
			return;
		case YmlPackage.JOB__IMAGE:
			getImage().clear();
			return;
		case YmlPackage.JOB__IMAGEG:
			setImageg((ImageG) null);
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
		case YmlPackage.JOB__STAGE:
			return stage != STAGE_EDEFAULT;
		case YmlPackage.JOB__SCRIPT:
			return script != null && !script.isEmpty();
		case YmlPackage.JOB__AFTER_SCRIPT:
			return after_script != null && !after_script.isEmpty();
		case YmlPackage.JOB__RULES:
			return rules != null && !rules.isEmpty();
		case YmlPackage.JOB__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case YmlPackage.JOB__ARTIFACTS:
			return artifacts != null && !artifacts.isEmpty();
		case YmlPackage.JOB__SERVICE:
			return service != null && !service.isEmpty();
		case YmlPackage.JOB__IMAGE:
			return image != null && !image.isEmpty();
		case YmlPackage.JOB__IMAGEG:
			return imageg != null;
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
		result.append(" (stage: ");
		result.append(stage);
		result.append(", script: ");
		result.append(script);
		result.append(", after_script: ");
		result.append(after_script);
		result.append(')');
		return result.toString();
	}

} //JobImpl
