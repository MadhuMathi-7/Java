package basics;
import java.util.Scanner;
public class Array_it {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array:");
	    int len=sc.nextInt();
	    int [] a= new int[len];
	    System.out.println("Enter the values of the array:");
	    for (int i=0;i<len;i++) {
	    	a[i]=sc.nextInt();
	    }
		System.out.println("\nForward");
		for(int i=0;i<a.length;i++) {
			System.out.println("Index:"+i+" \tElement:"+a[i]);
		}
		System.out.println("Backward");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println("Index:"+i+" \tElement:"+a[i]);
		}

	}


}
