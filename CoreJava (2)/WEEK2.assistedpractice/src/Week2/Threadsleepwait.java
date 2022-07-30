package Week2;

public class Threadsleepwait {
	 
	    private static Object LOCK = new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(200);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping ");
	        synchronized (LOCK) 
	        {
	            LOCK.wait(1000);
	            System.out.println("Object '" + LOCK + "' is woken after" + " waiting ");
	        }
	    }
	}


	