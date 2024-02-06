package corejavaconcepts;

public class SystemGetPropertyExample7 {

	public static void main(String[] args) {
	     System.out.println("my name : "+System.getProperty("myname", "Shubham Jadon"));  
	     
	     System.out.println("map library for OS's name = "+System.mapLibraryName("os.name"));  
	        System.out.println("map library for OS's architecture = "+System.mapLibraryName("os.arch"));  
	        System.out.println("map library for OS's version = "+System.mapLibraryName("os.version"));  
	        
	        String a=new String ("Shubham");  
	        a.equals("Shubham");  
	         System.out.println("identity hash code of object a = "+System.identityHashCode(a));  
	         String b=new String ("Jadon");  
	            b.equals("Jadon");  
	             System.out.println("identity hash code of object b = "+System.identityHashCode(b));        
	    }  
	
      
	}

