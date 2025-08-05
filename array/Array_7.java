package array;
import java.util.Scanner;
public class Array_7 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int r=2;
		int j=1;
		int len=a.length;
		while(j<=r) {
			int temp=a[0];
			for(int i=0;i<len-1;i++) {
				a[i]=a[i+1];
			}
			a[len-1]=temp;
			j++;
		}
		for(int k:a) {
			System.out.print(k+" ");
		}

	}

}
