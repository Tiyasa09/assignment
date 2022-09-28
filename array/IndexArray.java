package array;

public class IndexArray {
	public static void main(String[] args) {
		int[] a= {2,4,6,8,10};
		System.out.println("index position of 4 is:"+indexOf(a,5));
	}
	private static int indexOf(int[] a, int num) {
		int length=a.length;
		int i=0;
		while (i<length) {
			if(a[i]==num) {
				return i;
		}else { 
			i= i+1;
		}}
		return -1;
	}}

