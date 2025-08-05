package basics;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int a=n,sum=0;
		while(a!=0) {
			int rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		if(n==sum) {
		System.out.println( "is palindrome");
		System.out.println(sum);
		
	}
	    else {
	    	System.out.println(sum);
		System.out.println( "not palindrome");
	}

}
}
