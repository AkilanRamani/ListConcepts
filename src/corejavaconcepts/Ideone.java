package corejavaconcepts;

import java.util.ArrayList;
import java.util.List;

public class Ideone {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<Integer>(); 
		l.add(100);	l.add(200);	l.add(130);	l.add(1450); 
		System.out.print(returningList(l));
		 
	} 
	public static List<Integer> returningList(List<Integer> l){ 
		return l; 
	} 


	}

