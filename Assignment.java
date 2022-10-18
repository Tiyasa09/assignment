package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("resust" +(x/y));
	}catch(InputMismatchException e) {
		System.out.println(e);
	}catch(ArithmeticException f) {
		System.out.println(f);
	}catch(Exception a) {
		System.out.println(a);
	}
	

}}
