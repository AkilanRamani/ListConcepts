package corejavaconcepts;


	public class Person {
		  private static String name; // private = restricted access

		  // Getter
		  public String getName() {
		    return null;
		  }

		  // Setter
		  public void setName(String newName) {
		    Person.name = newName;
		  }
		
	public static void main(String[] args) {
	    Person myObj = new Person();
	    myObj.setName("john");
	  String a =  myObj.getName();
	   System.out.println(a);
	  }
	}



