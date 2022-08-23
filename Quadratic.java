package operator1;
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rt=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=rt.nextInt();
		int b=rt.nextInt();
		int c=rt.nextInt();
		int d=(b^2-(4*a*c));
		System.out.println((-b)+Math.sqrt(d)/2*a);
		System.out.println((-b)-Math.sqrt(d)/2*a);
		
		

	}

}
