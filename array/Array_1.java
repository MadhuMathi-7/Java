package array;
import java.util.Scanner;
public class Array_1 {
     public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int len=a.length;
		int odd=0,even=0;
		for(int i=len-1;i>=0;i--) {
			if(a[i]%2==0) {
				even=even+a[i];
			}
			else {
				odd=odd+a[i];
			}
		}
		System.out.println("Odd sum is:" + odd);
		System.out.println("Even sum is:" + even);

	}

}
