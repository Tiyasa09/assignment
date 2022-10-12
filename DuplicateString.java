package string;

import java.util.Arrays;

public class DuplicateString {
public static void main(String[] args) {
	String p[]= {"T","I","Y","A","S","A"}; //initialize string
	System.out.println(Arrays.toString(p));
	//to find duplicate element
	for(int i=0;i<p.length;i++) {  
		for(int j=i+1;j<p.length;j++) {
			if(p[i].endsWith(p[j])) {
				System.out.println("duplicate elements are:" +p[j]);
			}
		}
	}
}
}
