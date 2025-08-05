package basics;
import java.util.Scanner;
public class Arraysum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,40,50,60};
		 int sum=0;
		 for(int i=0;i<a.length;i++) {
			 sum+=a[i];
			 
		 }
		 System.out.println(sum);
	}

}
