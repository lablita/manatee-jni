/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.sketchengine.manatee;

public class manatee {
  public static String version() {
    return manateeJNI.version();
  }

  public static void languages(StrVector out) {
    manateeJNI.languages(StrVector.getCPtr(out), out);
  }

  public static boolean create_subcorpus(String subcpath, RangeStream r, Structure s) {
    return manateeJNI.create_subcorpus__SWIG_0(subcpath, RangeStream.getCPtr(r), r, Structure.getCPtr(s), s);
  }

  public static boolean create_subcorpus(String subcpath, Corpus corp, String structname, String query) {
    return manateeJNI.create_subcorpus__SWIG_1(subcpath, Corpus.getCPtr(corp), corp, structname, query);
  }

  public static boolean create_subcorpus_from_query(String subcpath, Corpus corp, String structname, String query) {
    return manateeJNI.create_subcorpus_from_query(subcpath, Corpus.getCPtr(corp), corp, structname, query);
  }

  public static void find_subcorpora(String subcdir, StrVector scs) {
    manateeJNI.find_subcorpora(subcdir, StrVector.getCPtr(scs), scs);
  }

  public static void merge_subcorpora(String subc1, String subc2, String subcout) {
    manateeJNI.merge_subcorpora(subc1, subc2, subcout);
  }

  public static double compute_ARF(FastStream s, long freq, long size) {
    return manateeJNI.compute_ARF(FastStream.getCPtr(s), s, freq, size);
  }

  public static double compute_fALD(FastStream s, long size) {
    return manateeJNI.compute_fALD(FastStream.getCPtr(s), s, size);
  }

  public static void estimate_colloc_poss(FastStream s, IntVector collposs, int maxcoll) {
    manateeJNI.estimate_colloc_poss(FastStream.getCPtr(s), s, IntVector.getCPtr(collposs), collposs, maxcoll);
  }

  public static CorpInfo loadCorpInfo(String corp_name_or_path, boolean no_defaults) {
    long cPtr = manateeJNI.loadCorpInfo__SWIG_0(corp_name_or_path, no_defaults);
    return (cPtr == 0) ? null : new CorpInfo(cPtr, false);
  }

  public static CorpInfo loadCorpInfo(String corp_name_or_path) {
    long cPtr = manateeJNI.loadCorpInfo__SWIG_1(corp_name_or_path);
    return (cPtr == 0) ? null : new CorpInfo(cPtr, false);
  }

  public static CorpInfo loadCorpInfoDefaults(String corp_name_or_path) {
    long cPtr = manateeJNI.loadCorpInfoDefaults(corp_name_or_path);
    return (cPtr == 0) ? null : new CorpInfo(cPtr, false);
  }

  public static CorpInfo loadCorpInfoNoDefaults(String corp_name_or_path) {
    long cPtr = manateeJNI.loadCorpInfoNoDefaults(corp_name_or_path);
    return (cPtr == 0) ? null : new CorpInfo(cPtr, false);
  }

  public static SWIGTYPE_p_TokenLevel new_TokenLevel(String path) {
    long cPtr = manateeJNI.new_TokenLevel(path);
    return (cPtr == 0) ? null : new SWIGTYPE_p_TokenLevel(cPtr, false);
  }

  public static MLTStream full_level(SWIGTYPE_p_TokenLevel level) {
    long cPtr = manateeJNI.full_level(SWIGTYPE_p_TokenLevel.getCPtr(level));
    return (cPtr == 0) ? null : new MLTStream(cPtr, false);
  }

}
