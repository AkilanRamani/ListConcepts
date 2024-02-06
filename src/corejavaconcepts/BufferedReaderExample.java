package corejavaconcepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		 FileReader fr=new FileReader("C:\\Users\\akilan-18633\\eclipse-workspace\\ListCollections\\data\\txt");    
         BufferedReader br=new BufferedReader(fr);    
 
         int i;    
         while((i=br.read())!=-1){   // i= -1 (-1 will be stored in the variable if there are no characters to read , that is null )
         System.out.print((char)i);  
         }  
         br.close();    
         fr.close();    
   }    
 

	}


