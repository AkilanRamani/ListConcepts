package corejavaconcepts;

public class Runner {

	public static void main(String[] args) {
		MobileTest test = new MobileTest(); 
		Phone p = test.getPhone(); //Connection c =  test.getConnection(); 
		
		p.call();  // interface defined methods can be invoked and accessed ....
		p.sms();
	  String a =  p.sms();
	  
	 System.out.println(p.setInt(1, "akilan"));  // setInt method will initialize the value of the corresponding variables that are declared within the methods.
	//  System.out.println(a1); // p.id = 1 ; p.string = "akilan";
	 
	 
	 System.out.println(a);

	}

}
