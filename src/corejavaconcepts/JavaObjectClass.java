package corejavaconcepts;

public class JavaObjectClass {

	public static void main(String[] args) {
		 
    String obj = new String();   
    Class<? extends String> a = obj.getClass();  // which is used to get the class of the corresponding Object at the Run Time. 
    System.out.println("Class of Object obj is : " + a.getName());   
}   
}  
