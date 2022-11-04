package threadactivity;

public class Program2 implements Runnable {//using runnable interface
	public void run() {//run method
		while (true) {
		System.out.println("thread activated");
		try {//try block
			Thread.sleep(2000);//set time
		}
		catch(InterruptedException e) {//catch block
			System.out.println(e);
		}
	}}
	public static void main(String[] args) {
		Program2 p=new Program2();//creating object
		Thread t=new Thread(p);//thread class object ref ofprogram2 class
		t.start();//to start
	}

}
