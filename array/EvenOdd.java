package array;

public class EvenOdd {
	public static void main(String[] args) {
		int[] a= {3,5,2,7,9,8,13,24,11};
		System.out.println("original array:"+a);
		System.out.println("even numbers:");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("odd numbers:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
