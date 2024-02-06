package corejavaconcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robo {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		 {
		        String command = "notepad.exe";
		        Runtime run = Runtime.getRuntime();
		        run.exec(command);
		        try {
		            Thread.sleep(2000);
		        }
		        catch (InterruptedException e)
		        {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		 
		        // Create an instance of Robot class
		        Robot robot = new Robot();
		 
		        // Press keys using robot. A gap of
		        // of 500 milli seconds is added after
		        // every key press
		        robot.keyPress(KeyEvent.VK_H);
		        robot.keyRelease(KeyEvent.VK_H);
		        Thread.sleep(500);
		        robot.keyPress(KeyEvent.VK_E);
		        robot.keyRelease(KeyEvent.VK_E);
		        Thread.sleep(500);
		       
		    }
		}

	}


