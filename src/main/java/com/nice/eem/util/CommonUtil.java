package com.nice.eem.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {

	public Date stringToDate(String str) throws ParseException {  
	    Date date=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(str);  
	   return date; 
	}
	
	public String dateToString(Date date) {		
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");  
      String strDate = dateFormat.format(date);  
     return strDate;
     
	}
}