package corejavaconcepts;

import java.io.PrintStream;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("value1");  
        //System.out.println("builderObject :"+sb1);  
     // appending boolean argument  
        sb1.append(true);  
        // print the StringBuilder after appending  
        PrintStream stream = System.out;
        stream.println(sb1);

	}

}
