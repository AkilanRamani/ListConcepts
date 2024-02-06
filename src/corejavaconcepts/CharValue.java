package corejavaconcepts;

public class CharValue {

	public static void main(String[] args) {
		String s = "abc";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
	
		boolean b = Character.isUpperCase(s.charAt(i));
		System.out.println(Character.toUpperCase(s.charAt(0)));
		
		if(b) {
			System.out.println("NT");
			
		}
		else {
			System.out.println("NT1");
			
		}

	}

	}
}
