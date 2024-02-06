package CoreJavaPrograms;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
       String data =  animals.toString();
        System.out.println (data);

        System.out.println("ArrayList: " + animals);
    }
}
	


