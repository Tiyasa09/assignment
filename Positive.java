package operator1;
import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pt=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=pt.nextInt();
		if(a>0) {
			System.out.println("Its a positive number");
		} else {
			System.out.println("its a negative number");
		}

	}

}
