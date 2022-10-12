package string;
import java.util.Scanner;
public class Add {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //scanner class
	int sum=0; //take sum=o
	char c;
	do { //starting do-while loop
	System.out.println("enter two numbers:");
	int a=sc.nextInt();//taking user input1
	int b=sc.nextInt();//user input2
	sum=sum+a+b; //add
	System.out.println("sum is:"+sum);
	System.out.println("do you wish to perform again? y/n");
     c=sc.next().charAt(0); //user input if perform again
}while(c=='y');
	System.out.println("new sum:" +sum);

}
}
