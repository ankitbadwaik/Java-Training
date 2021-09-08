package Threads;

public class Runn implements Runnable {
	public void run(){  
		System.out.println("thread is running...");  
		}  

	public static void main(String[] args) {
		Runn m1=new Runn();  
		Thread t1 =new Thread(m1);  
		t1.start();
	}

}
