/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.manatee.sketchengine;

public class map_int_sort_bigrams {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected map_int_sort_bigrams(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(map_int_sort_bigrams obj) {
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
        manateeJNI.delete_map_int_sort_bigrams(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public map_int_sort_bigrams(String filename) {
    this(manateeJNI.new_map_int_sort_bigrams(filename), true);
  }

  public int maxid() {
    return manateeJNI.map_int_sort_bigrams_maxid(swigCPtr, this);
  }

  public int count(int id) {
    return manateeJNI.map_int_sort_bigrams_count(swigCPtr, this, id);
  }

  public int value(int id1, int id2) {
    return manateeJNI.map_int_sort_bigrams_value(swigCPtr, this, id1, id2);
  }

}
