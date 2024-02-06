package corejavaconcepts;

import java.awt.event.KeyEvent;

public class CharValue1 {

	public static void main(String[] args) {
		String a = "Hello";
		char c = a.charAt(1);
		char e = KeyEvent.VK_A; 
		//int q = (int)e;
		char b = Character.toUpperCase(c);
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(e);
		
		

	}

}
