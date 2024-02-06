package corejavaconcepts;

public  class TestingVariable implements TestVariable {
	
	  String name;
	public TestingVariable(String name) {
		this.name=name;
		
	}
  

	@Override
	public void animalSound() {
		
		System.out.println("abc");
		System.out.println(name);
		
	}
	public void sleep() {
	    System.out.println("Zzz");
	  }
		
	
	
	public static void main(String[] args) {
		
		TestingVariable test = new TestingVariable("akil");
		test.animalSound();
		TestVariable t = (TestVariable)test;
		System.out.println(TestVariable.name);	
	}
}