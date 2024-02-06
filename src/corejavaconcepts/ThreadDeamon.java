package corejavaconcepts;


	
	// Java program to demonstrate the usage of
	// setDaemon() and isDaemon() method.

	public class ThreadDeamon extends Thread
	{
		public ThreadDeamon(String name){
			super(name);
		}

		public void run()
		{
			// Checking whether the thread is Daemon or not
			if(Thread.currentThread().isDaemon())
			{
				System.out.println(getName() + " is Daemon thread");
			}
			
			else
			{
				System.out.println(getName() + " is User thread");
			}
		}
		
		public static void main(String[] args)
		{
		
			ThreadDeamon t1 = new ThreadDeamon("t1");
			ThreadDeamon t2 = new ThreadDeamon("t2");
			ThreadDeamon t3 = new ThreadDeamon("t3");
		
			// Setting user thread t1 to Daemon
			t1.setDaemon(true);
				
			// starting first 2 threads
			t1.start();
		//	t1.start(); Illegal Thread state exception.
			t2.start();

			// Setting user thread t3 to Daemon
			t3.setDaemon(true);
			t3.start();	 
		}
	}



