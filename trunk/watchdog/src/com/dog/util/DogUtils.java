package com.dog.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/*
 * date:2011-01-19
 * author: pradoem wongkraso
 * contact : go2doem@gmail.com,destar_@hotmail.com
 * description: this is class Utility for use  frequent 
 * */
public class DogUtils {
	
	//return format  YYYYMMDD,20110119
	public String getYYYYmmDD(){
		 Date date = new Date();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd",Locale.US);
		 return sdf.format(date);
	}

}
