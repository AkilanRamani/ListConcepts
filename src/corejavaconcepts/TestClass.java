package corejavaconcepts;

public class TestClass {
	
	
	String a = "hello";
	
	
	public String getStatus() {
		return a ;
	}

	public static void main(String[] args) {
		
		TestClass class1 = new TestClass();
		String name = System.getProperty("user.dir");
		String name1 = name + "sam";
		String b = name1+ class1.getStatus() + "abc";
		System.out.println(b);
		
		

	}

}
