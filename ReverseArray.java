package array;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   System.out.println("enter the length");
   int length=sc.nextInt();
   int[] a=new int[length];
   System.out.println("enter the nums:");
   for(int i=0;i<length;i++) {
	   a[i]=sc.nextInt();

	}
   System.out.println("the reverse array is:");
   for(int i=length-1;i>=0;i--) {
	   System.out.println(a[i]);
	
}}}
