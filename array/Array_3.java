package array;
import java.util.Scanner;
public class Array_3 {
	public static void main(String[] args) {
		  int a[]= {10,20,30,40,50};
		  int len=a.length;
		  int sum=0;
		  for(int i=0;i<len;i++) {
			  sum+=a[i];
		  }
		  System.out.println(sum);
		  int avg=sum/len;
		  System.out.println(avg);

	}

}
