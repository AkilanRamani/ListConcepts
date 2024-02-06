package corejavaconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ChildClass { 
  
    // Main driver method 
    public static void main(String[] args) {
    	
    	{ 
    		   // the TEMP environment variable 
            System.out.println(System.getenv("env")); 
      
            // Get the value of 
            // the OS environment variable 
            System.out.println(System.getenv("OS")); 
      
            // Get the value of 
            // the JAVA_HOME environment variable 
            System.out.println(System.getenv("JAVA_HOME")); 
    }
}
}



	