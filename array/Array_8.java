package array;
import java.util.Scanner;
public class Array_8 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int r=2;
		int j=1;
		int len=a.length;
		while(j<=r) {
			int temp=a[len-1];
			for(int i=len-1;i>0;i--) {
				a[i]=a[i-1];
			}
			a[0]=temp;
			j++;
		}
		for(int k:a) {
			System.out.print(k+" ");
		}
	}

}
