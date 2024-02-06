package corejavaconcepts;

public class HardVal implements SoftVal {

	
	String name ;
	public HardVal(String name) {
	this.name=name;
	}
	@Override
	public void animalSound() {
		System.out.println("asc");
		
		
	}

	@Override
	public void sleep() {
		System.out.println("desc");
		
		
	}
	
	public void sleep1() {
		System.out.println("Sleep - 1");
}
}