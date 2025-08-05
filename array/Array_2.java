package array;
import java.util.Scanner;
public class Array_2 {
     public static void main(String[] args) {
		int a[]= {1,6,9,8,3};
		int len=a.length;
		int max=a[0];
		for(int i=1;i<len;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
