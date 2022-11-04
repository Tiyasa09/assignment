package threadactivity;

public class Problem1 extends Thread {//extend Thread class
	public void run() {//run method
		while(true) {
		System.out.println("my thread is running");
		try {//try block
			Thread.sleep(2000);//set time
		}
		catch(InterruptedException e) {//catch block
			System.out.println(e);
		}
	}}

	public static void main(String[] args) {//main method
		Problem1 t1= new Problem1();//create object
		t1.start();//to start 
	}

}
