package corejavaconcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GFG78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile(".*s");//. represents single character  
		Matcher m = p.matcher("ghhhs");  
		boolean b = m.matches();  

		System.out.println(b);  
		}
	}  

