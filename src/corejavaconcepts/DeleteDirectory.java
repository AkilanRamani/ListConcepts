package corejavaconcepts;

import java.io.File;

public class DeleteDirectory {
	
	  public static void deleteDirectory(File file)
	    {
		  // store all the paths of files and folders present
	        // inside directory
	        for (File subfile : file.listFiles()) {
	        	
	        	System.out.println("The subdirectoryfiles  is " + subfile );
	            // if it is a subfolder,e.g Rohan and Ritik,
	            //  recursively call function to empty subfolder
	            if (subfile.isDirectory()) {
	            	System.out.println("The subdirectory is " + subfile );
	               deleteDirectory(subfile);
	            }
	 
	            // delete files and empty subfolders
	            subfile.delete();
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        // store file path
	        String filepath = "C:\\AKILAN";
	        File file = new File(filepath);
	 
	        // call deleteDirectory function to delete
	        // subdirectory and files
	        deleteDirectory(file);
	 
	        // delete main GFG folder
	        file.delete();
	    }
	}