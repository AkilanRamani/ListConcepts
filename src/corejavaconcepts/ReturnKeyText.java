package corejavaconcepts;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class ReturnKeyText {
	 public static void main(String[] args) 
		        throws IOException 
		    { 
		  
		        // Create input stream 'demo.txt' 
		        // for reading containing 
		        // text "GEEKSFORGEEKS" 
		        FileInputStream inputStream 
		            = new FileInputStream( 
		                "c:\\AKILAN\\abc.txt"); 
		  
		        try (// Convert inputStream to 
						        // DataInputStream 
				DataInputStream dataInputStr = new DataInputStream( 
				    inputStream)) {
					// Count the total bytes 
					int count = dataInputStr.available(); 
  
					// Create byte array 
					byte[] b = new byte[count]; 
  
					// Read full data into byte array 
					dataInputStr.readFully(b); 
  
					for (byte by : b) { 
					    // Print the character 
					    System.out.print((char)by); 
					}
				} 
		    } 
	} 


	
	 
