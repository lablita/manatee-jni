/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.manatee.sketchengine;

public class IntVector extends java.util.AbstractList<Integer> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        manateeJNI.delete_IntVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntVector(int[] initialElements) {
    this();
    reserve(initialElements.length);

    for (int element : initialElements) {
      add(element);
    }
  }

  public IntVector(Iterable<Integer> initialElements) {
    this();
    for (int element : initialElements) {
      add(element);
    }
  }

  public Integer get(int index) {
    return doGet(index);
  }

  public Integer set(int index, Integer e) {
    return doSet(index, e);
  }

  public boolean add(Integer e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Integer e) {
    modCount++;
    doAdd(index, e);
  }

  public Integer remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public IntVector() {
    this(manateeJNI.new_IntVector__SWIG_0(), true);
  }

  public IntVector(IntVector other) {
    this(manateeJNI.new_IntVector__SWIG_1(IntVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return manateeJNI.IntVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    manateeJNI.IntVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return manateeJNI.IntVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    manateeJNI.IntVector_clear(swigCPtr, this);
  }

  public IntVector(int count, int value) {
    this(manateeJNI.new_IntVector__SWIG_2(count, value), true);
  }

  private int doSize() {
    return manateeJNI.IntVector_doSize(swigCPtr, this);
  }

  private void doAdd(int x) {
    manateeJNI.IntVector_doAdd__SWIG_0(swigCPtr, this, x);
  }

  private void doAdd(int index, int x) {
    manateeJNI.IntVector_doAdd__SWIG_1(swigCPtr, this, index, x);
  }

  private int doRemove(int index) {
    return manateeJNI.IntVector_doRemove(swigCPtr, this, index);
  }

  private int doGet(int index) {
    return manateeJNI.IntVector_doGet(swigCPtr, this, index);
  }

  private int doSet(int index, int val) {
    return manateeJNI.IntVector_doSet(swigCPtr, this, index, val);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    manateeJNI.IntVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}