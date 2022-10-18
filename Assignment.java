package exception;
import java.util.InputMismatchException;
import java.util.Scanner;//import scanner class
public class Assignment { 
	public static void main(String[] args) {
		try { //try block
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();//1st integer
		int y=sc.nextInt();//2nd integer
		System.out.println("resust" +(x/y));
	}catch(InputMismatchException e) {//catch block
		System.out.println(e);
	}catch(ArithmeticException f) { //2nd catch block
		System.out.println(f);
	}catch(Exception a) { 
		System.out.println(a);
	}
	

}}
