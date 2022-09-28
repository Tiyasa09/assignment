package array;

import java.util.Arrays;

public class RemoveEle {
	public static void main(String[] args) {
		int[] a= {2,3,4,6,8,10};
		System.out.println("original array:"+Arrays.toString(a));
		int removeIndex=1; //remove 2nd index
		for(int i=removeIndex;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		System.out.println("after removing:"+Arrays.toString(a));
	}

}
