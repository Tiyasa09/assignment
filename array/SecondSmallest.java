package array;

import java.util.Arrays;

public class SecondSmallest {
	public static int getNumber(int[] a,int t) {
		Arrays.sort(a);
		return a[1];
	}
	public static void main(String[] args) {
		int a[]= {3,6,7,2,5};
		System.out.println("second smallest:"+getNumber(a,5));
	}

}
