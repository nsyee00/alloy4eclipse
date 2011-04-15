/**
 * <copyright>
 * </copyright>
 *
 */
package fr.univartois.cril.xtext.als.impl;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.AsName;
import fr.univartois.cril.xtext.als.Comma;
import fr.univartois.cril.xtext.als.LeftSquareBracketKeyword;
import fr.univartois.cril.xtext.als.Open;
import fr.univartois.cril.xtext.als.OpenName;
import fr.univartois.cril.xtext.als.Ref;
import fr.univartois.cril.xtext.als.RightSquareBracketKeyword;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.OpenImpl#getOpenName <em>Open Name</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.OpenImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.OpenImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.OpenImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.OpenImpl#getRight <em>Right</em>}</li>
 *   <li>{@link fr.univartois.cril.xtext.als.impl.OpenImpl#getNameAs <em>Name As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenImpl extends MinimalEObjectImpl.Container implements Open
{
  /**
   * The cached value of the '{@link #getOpenName() <em>Open Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenName()
   * @generated
   * @ordered
   */
  protected OpenName openName;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected LeftSquareBracketKeyword left;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected EList<Ref> ref;

  /**
   * The cached value of the '{@link #getComma() <em>Comma</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComma()
   * @generated
   * @ordered
   */
  protected EList<Comma> comma;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected RightSquareBracketKeyword right;

  /**
   * The cached value of the '{@link #getNameAs() <em>Name As</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAs()
   * @generated
   * @ordered
   */
  protected AsName nameAs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpenImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlsPackage.Literals.OPEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenName getOpenName()
  {
    return openName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpenName(OpenName newOpenName, NotificationChain msgs)
  {
    OpenName oldOpenName = openName;
    openName = newOpenName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.OPEN__OPEN_NAME, oldOpenName, newOpenName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpenName(OpenName newOpenName)
  {
    if (newOpenName != openName)
    {
      NotificationChain msgs = null;
      if (openName != null)
        msgs = ((InternalEObject)openName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.OPEN__OPEN_NAME, null, msgs);
      if (newOpenName != null)
        msgs = ((InternalEObject)newOpenName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.OPEN__OPEN_NAME, null, msgs);
      msgs = basicSetOpenName(newOpenName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.OPEN__OPEN_NAME, newOpenName, newOpenName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftSquareBracketKeyword getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(LeftSquareBracketKeyword newLeft, NotificationChain msgs)
  {
    LeftSquareBracketKeyword oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.OPEN__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(LeftSquareBracketKeyword newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.OPEN__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.OPEN__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.OPEN__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ref> getRef()
  {
    if (ref == null)
    {
      ref = new EObjectContainmentEList<Ref>(Ref.class, this, AlsPackage.OPEN__REF);
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comma> getComma()
  {
    if (comma == null)
    {
      comma = new EObjectContainmentEList<Comma>(Comma.class, this, AlsPackage.OPEN__COMMA);
    }
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightSquareBracketKeyword getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(RightSquareBracketKeyword newRight, NotificationChain msgs)
  {
    RightSquareBracketKeyword oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.OPEN__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(RightSquareBracketKeyword newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.OPEN__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.OPEN__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.OPEN__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsName getNameAs()
  {
    return nameAs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameAs(AsName newNameAs, NotificationChain msgs)
  {
    AsName oldNameAs = nameAs;
    nameAs = newNameAs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlsPackage.OPEN__NAME_AS, oldNameAs, newNameAs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameAs(AsName newNameAs)
  {
    if (newNameAs != nameAs)
    {
      NotificationChain msgs = null;
      if (nameAs != null)
        msgs = ((InternalEObject)nameAs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlsPackage.OPEN__NAME_AS, null, msgs);
      if (newNameAs != null)
        msgs = ((InternalEObject)newNameAs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlsPackage.OPEN__NAME_AS, null, msgs);
      msgs = basicSetNameAs(newNameAs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlsPackage.OPEN__NAME_AS, newNameAs, newNameAs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlsPackage.OPEN__OPEN_NAME:
        return basicSetOpenName(null, msgs);
      case AlsPackage.OPEN__LEFT:
        return basicSetLeft(null, msgs);
      case AlsPackage.OPEN__REF:
        return ((InternalEList<?>)getRef()).basicRemove(otherEnd, msgs);
      case AlsPackage.OPEN__COMMA:
        return ((InternalEList<?>)getComma()).basicRemove(otherEnd, msgs);
      case AlsPackage.OPEN__RIGHT:
        return basicSetRight(null, msgs);
      case AlsPackage.OPEN__NAME_AS:
        return basicSetNameAs(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlsPackage.OPEN__OPEN_NAME:
        return getOpenName();
      case AlsPackage.OPEN__LEFT:
        return getLeft();
      case AlsPackage.OPEN__REF:
        return getRef();
      case AlsPackage.OPEN__COMMA:
        return getComma();
      case AlsPackage.OPEN__RIGHT:
        return getRight();
      case AlsPackage.OPEN__NAME_AS:
        return getNameAs();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlsPackage.OPEN__OPEN_NAME:
        setOpenName((OpenName)newValue);
        return;
      case AlsPackage.OPEN__LEFT:
        setLeft((LeftSquareBracketKeyword)newValue);
        return;
      case AlsPackage.OPEN__REF:
        getRef().clear();
        getRef().addAll((Collection<? extends Ref>)newValue);
        return;
      case AlsPackage.OPEN__COMMA:
        getComma().clear();
        getComma().addAll((Collection<? extends Comma>)newValue);
        return;
      case AlsPackage.OPEN__RIGHT:
        setRight((RightSquareBracketKeyword)newValue);
        return;
      case AlsPackage.OPEN__NAME_AS:
        setNameAs((AsName)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlsPackage.OPEN__OPEN_NAME:
        setOpenName((OpenName)null);
        return;
      case AlsPackage.OPEN__LEFT:
        setLeft((LeftSquareBracketKeyword)null);
        return;
      case AlsPackage.OPEN__REF:
        getRef().clear();
        return;
      case AlsPackage.OPEN__COMMA:
        getComma().clear();
        return;
      case AlsPackage.OPEN__RIGHT:
        setRight((RightSquareBracketKeyword)null);
        return;
      case AlsPackage.OPEN__NAME_AS:
        setNameAs((AsName)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlsPackage.OPEN__OPEN_NAME:
        return openName != null;
      case AlsPackage.OPEN__LEFT:
        return left != null;
      case AlsPackage.OPEN__REF:
        return ref != null && !ref.isEmpty();
      case AlsPackage.OPEN__COMMA:
        return comma != null && !comma.isEmpty();
      case AlsPackage.OPEN__RIGHT:
        return right != null;
      case AlsPackage.OPEN__NAME_AS:
        return nameAs != null;
    }
    return super.eIsSet(featureID);
  }

} //OpenImpl
