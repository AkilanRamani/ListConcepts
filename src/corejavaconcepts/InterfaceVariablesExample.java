package corejavaconcepts;

public class InterfaceVariablesExample  implements SampleInterface{
	
	 int a = 10; //Non static variable (changed from static to Non-static)
	  public int animalSound() {
	  return a;
	  }
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	  public void eat(){
	   System.out.println("Z12zz");
	  }
	

	
		
		public static void main(String[] args) {
			InterfaceVariablesExample e = new InterfaceVariablesExample();
			SampleInterface p = (SampleInterface)e ;  // type casting the mypig reference variable (which is an object ) of Pig class or Pig Primitive type to the Animal Interface type variable.
		    
		    System.out.println(e.a);
		    System.out.println(p.animalSound());
		    p.sleep();
		    p.eat();
		    
		  }
		
	}


