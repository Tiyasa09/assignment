package threadactivity;

public class Problem5 implements Runnable {//using runnable interface
	public void run() {//run method
		for(int i=0;i<5;i++) {//loop
		System.out.println("threads running  " +i);
		try {
			Thread.sleep(500);//time
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}}
	public static void main(String [] args) {
		Problem5 p =new Problem5();//object of main class
		Thread t1=new Thread(p);//1st thread by object
		Thread t2=new Thread(p);//2nd thread by object
		Thread t3=new Thread(p);//3rd thread by object
		Thread t4=new Thread(p);//4th thread by object
		t1.run();//calling method by 1st thread
	    t2.run();//calling method by 2nd thread
	    t3.run();//calling method by 3rd thread
    	t4.run();//calling method by 4th thread

}}
