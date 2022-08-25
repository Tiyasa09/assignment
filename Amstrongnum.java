package operator1;
import java.util.Scanner;

public class Amstrongnum {

	public static void main(String[] args) {
		
		System.out.println("Enter a three digit number");
		int sum=0,rem,b;
		Scanner pt=new Scanner(System.in);
		int number=pt.nextInt();
		b=number;
		while(number>0) {
			rem=number%10;
			sum=(rem*rem*rem)+sum;
			number=number/10;
			
		}
		if(b==sum) {
			System.out.println("its a amstrong number");
		}else {
			System.out.println("its not a amstrong number");
		}}}
			
		
		
		
	

	


