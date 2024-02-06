package corejavaconcepts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class robo12 {

	public static void sleep(long ms) { // 200 ms
        try {Thread.sleep(ms);} catch (Exception ignored) {}
    }
 
    public static void main(String[] args) throws Exception {
        // Open Notepad
        Runtime.getRuntime().exec("notepad.exe");
        // Wait for 2 seconds
        sleep(2000);
        // Create instance of Robot class
        Robot robot = new Robot();
        // The String to type
        String str = "Hello from GeeksforGeeks";
        // Press keys using robot
        // A gap of 200ms is added between each key press
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is a capital letter
            if (Character.isUpperCase(str.charAt(i))) { // 
                // Press shift key
                robot.keyPress(KeyEvent.VK_SHIFT); // (int keyEvent)
                // Press the current character
             char c = str.charAt(i);
        	 char b = Character.toUpperCase(c);
        	int c1 =      (int)b;
              robot.keyPress(c1); // It Presses a key using the corresponding integer value.(Every Key has a code)
                // Release shift key
                
                //robot.keyPress(Character.toUpperCase(str.charAt(i)));
             //  char  a = KeyEvent.VK_H;
                robot.keyRelease(KeyEvent.VK_SHIFT);
             //   robot.keyRelease(Character.toUpperCase(str.charAt(i)));
            }
            // else display the character as it is
            
            //int s = Character.toUpperCase(2);
            else {
            	
            	//robot.keyPress(Character.toUpperCase(str.charAt(i)));
            	char e = str.charAt(i);
            	char as = Character.toUpperCase(e);
            	System.out.println(as);
            	int value = (int)as;
            	System.out.println(value);
            	
            	robot.keyPress(value); // Capital F 
            }
            // wait for 200ms
            sleep(200);
        }
    }
		

	

}
