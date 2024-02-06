package corejavaconcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Student {
	public static void main(String args[]){  
		
		
		Locale[] locales = { new Locale("en", "US"),  
				 new Locale("es", "ES"), new Locale("it", "IT") };   
				  
				for (int i=0; i< locales.length; i++) {   
					
					
				 String displayLanguage = locales[i].getDisplayLanguage(locales[i]);   
				 System.out.println(locales[i].toString() + ": " + displayLanguage);   
				}   
				}  
				  
	
         
}  

		
		
		

