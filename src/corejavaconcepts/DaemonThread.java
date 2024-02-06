package corejavaconcepts;

public class DaemonThread extends Thread {
	
	public DaemonThread(String name){ //t1
       super(name); //  t1 value will be passed into the name variable of the parent class constructor.
       //Thread(String name);
       //this.name = name ; t1.name = name ;
       
       
    }
 
    public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon()) //Thread name = Thread.currentThread();
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
     
        DaemonThread t1 = new DaemonThread("t1");
        DaemonThread t2 = new DaemonThread("t2");
        DaemonThread t3 = new DaemonThread("t3");
     
        // Setting user thread t1 to Daemon
        t1.setDaemon(true);
             
        // starting first 2 threads
        t1.start();
        t2.start();
 
        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();        
    }
}
	


