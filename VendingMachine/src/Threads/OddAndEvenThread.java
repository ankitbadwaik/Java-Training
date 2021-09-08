package Threads;

public class OddAndEvenThread {
	boolean odd;
    int count = 1;
    int MAX = 10;
 
    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking odd loop");
 
                while (!odd) {
                    try {
                        System.out.println("Odd waiting : " + count);
                        wait();
                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }
    
    public void printEven() {
    	 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking even loop");
 
                while (odd) {
                    try {
                        System.out.println("Even waiting: " + count);
                        wait();
                        System.out.println("Notified even:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread :" + count);
                count++;
                odd = true;
                notify();
 
            }
        }
    }

	public static void main(String[] args) {
		OddAndEvenThread obj = new OddAndEvenThread();
	        obj.odd = true;
	        Thread t1 = new Thread(new Runnable() {
	 
	            
	            public void run() {
	                obj.printEven();
	 
	            }
	        });
	        Thread t2 = new Thread(new Runnable() {
	 
	            
	            public void run() {
	                obj.printOdd();
	 
	            }
	        });
	 
	        t1.start();
	        t2.start();
	 
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	 
	}

}
