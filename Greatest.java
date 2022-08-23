package operator1;
import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter three numbers:");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if (a>b&&a>c) {
			System.out.println("a is the greatest");
		}else if(b>c&&b>a) {
			System.out.println("b is the greatest");
		}else {
			System.out.println("c is the greatest");
		}

	}

}
