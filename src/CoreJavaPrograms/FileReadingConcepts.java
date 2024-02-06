package CoreJavaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingConcepts {
	
	
	public static void main(String[] args) throws IOException {
		String line;
		StringBuffer buffer = new StringBuffer();
		File f = new File("C:\\AKILAN\\abc.txt");
		 FileReader fileReader 
         = new FileReader(f); 

     try (// Convert fileReader to 
	     // bufferedReader 
	BufferedReader buffReader = new BufferedReader( 
	     fileReader)) {
		try {
			while ((line=buffReader.readLine())!=null) { 
				buffer.append(line);
			     System.out.println( 
			         buffReader.readLine()); 
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
 } 


	}


