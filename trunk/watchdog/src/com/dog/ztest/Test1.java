package com.dog.ztest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(fDate());
		
		print();

	}
	
	private static void print()
	{
		 Date date = new Date();
		    SimpleDateFormat sdf;
		    sdf = new SimpleDateFormat("hh:mm:ss");
		    System.out.println(sdf.format(date));
		    sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
		    System.out.println(sdf.format(date));
		    sdf = new SimpleDateFormat("E MMM dd yyyy");
		    System.out.println(sdf.format(date));
		    
		    sdf = new SimpleDateFormat("yyyyMMdd",Locale.US);
		    System.out.println(sdf.format(date));
	}
	
   /* public static String fDate()
    {
           DateFormat p = DateFormat.getDateInstance("",Locale.US);
           String now = p.format(new java.util.Date());
           
           System.out.println(now);
           
           String fDate="";
           String temp[]=now.split("/");
           fDate="20"+temp[2]+"-"+temp[0]+"-"+temp[1];
           return fDate;
    }*/

}
