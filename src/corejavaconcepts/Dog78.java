package corejavaconcepts;

public class Dog78 extends Animal12 {
	  public String color;
      public Dog78(String name, int age, String color){
         super(name, age);
         this.color = color;
      }
      public void dogInfo() {
         System.out.println("Dog class: ");
         System.out.println("Name: "+this.name);
         System.out.println("Age: "+this.age);
         System.out.println("Color: "+this.color);
      }
      public static void main(String[] args) {
       Dog78 dog = new Dog78("Leo", 2, "Brown");
         Animal12 animal = new Animal12("Casper", 3);
         animal = dog; //implicit casting Object of dog to Animal
         animal.animalInfo();
         dog.dogInfo();
         
      }
   }

