package corejavaconcepts;

public class Animal12 {
	protected String name;
    protected int age;
    public Animal12(String name, int age){
       this.name = name;
       this.age = age;
    }
    public void animalInfo() {
       System.out.println("Animal class info: ");
       System.out.println("Name: "+this.name);
       System.out.println("Age: "+this.age);
    }
 }


