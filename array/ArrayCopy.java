package array;

import java.util.Arrays;

public class ArrayCopy {
	 public static void main(String[] args) {
		   int[] a = {25,65,34,76,23,95};
		   int[] A = new int[6];     
		 
		   System.out.println("original array : "+Arrays.toString(a));     
		   
		   for(int i=0; i < a.length; i++) {
		    A[i] = a[i];
		}
		   System.out.println("New Array: "+Arrays.toString(A));
		 }
		 }

