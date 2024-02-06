package corejavaconcepts;

import java.util.NoSuchElementException;

public class Testing123 {
	
	  Class<?> c1; // ? is a wild character that refers to any type Primitive or the Non-Primitive
	  
	  
	 public void ignoringClass(Class<?> c ){ // 10
		  this.c1 = c; 
	 }

	 public Class<?> getMethod() {
		 return c1;
	}
	 
public static void main(String[] args){
	 
	 Testing123 test = new Testing123();
	 Class<NoSuchElementException> c = NoSuchElementException.class;
	 test.ignoringClass(c);
	//Class<NoSuchElementException> c = NoSuchElementException.class;   
	System.out.print(test.getMethod());

	 }
}
