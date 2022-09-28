package array;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] a= {3,5,4,7,3,5};
		System.out.println("duplicate elements:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println( a[j]);
				}
			}
		}
		
	}

}
