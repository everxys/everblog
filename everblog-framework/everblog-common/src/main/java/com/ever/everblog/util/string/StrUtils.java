package com.ever.everblog.util.string;

public class StrUtils {

  public static String nullToString(String value) {
    return value == null ? "" : value;
  }

  public static boolean isEmpty(String str) {
    return str == null || str.length() == 0;
  }
}
