package com.dog.ztest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

  public static Calendar parseTimestamp(String timestamp) throws Exception {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss", Locale.US);
    Date d = sdf.parse(timestamp);
    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    return cal;
  }

  public static void main(String a[]) throws Exception {
    String timestampToParse = "24-Feb-2009 17:39:35";
    System.out.println("Timestamp : " + timestampToParse);

    SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println("Calendar : " + sdf.format(parseTimestamp(timestampToParse).getTime()));
  }

}