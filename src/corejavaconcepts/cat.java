package corejavaconcepts;

public class cat implements Animal1{
	
	//String name = "as";
	
	public cat() {
	//	this.name = name;	}
	}
	public void display(){
		
		System.out.println("aaa");
	}
	
	@Override
	public void animalSound() {
		
		System.out.println(name);
	}



public static void main(String[] args) {
	
	cat c = new cat();
	Animal1 a = (Animal1)c;
	a.animalSound();
}
}