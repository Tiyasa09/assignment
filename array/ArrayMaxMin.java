package array;

import java.util.Arrays;

public class ArrayMaxMin {
	public static void main(String[] args) {
		int a[]= {20,11,43,50,76,32,89};
		/*System.out.println(largenumber (a));
		System.out.println(smallnumber(a));
	}
	public static int smallnumber(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	public static int largenumber(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;*/
		Arrays.sort(a);
		System.out.println("min is:"+a[0]);
		System.out.println("max is:"+a[a.length-1]);


}}
