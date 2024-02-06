package corejavaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfLists {

	public static void main(String[] args) {
		  List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
	        ArrayList<String> list1 = new ArrayList<String>();
	        list1.add("Delhi");
	        list1.add("Mumbai");
	        listOfLists.add(list1); // adding the list of the string into the List.
	        System.out.println(listOfLists);
	 
	        ArrayList<String> anotherList = new ArrayList<String>();
	 
	        anotherList.add("Beijing");
	        anotherList.add("Shanghai");
	        listOfLists.add(anotherList);
	        
	        System.out.println(listOfLists);
	        System.out.println (listOfLists.get(0).get(1));
	        
	     List<Integer> inte =   Arrays.asList(1,2,3);
	     System.out.println(inte);
	 
	        listOfLists.forEach((list)  -> 
	        {
	            list.forEach((city)->System.out.println(city));
	        }
	                );
	    }

	}


