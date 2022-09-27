package array;
import java.util.Scanner;

public class ArrayAvg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int length=sc.nextInt();
		int[] a=new int[length];
		System.out.println("enter nums:");
	a[0]=sc.nextInt();
	a[1]=sc.nextInt();
	a[2]=sc.nextInt();
	a[3]=sc.nextInt();
    int sum=0;
    for(int i=0;i<a.length;i++) {
    	sum=sum+a[i];
    }
    double avg=sum/length;
    System.out.println("average is:"+avg);
	

}}
