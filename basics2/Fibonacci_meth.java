package basics2;
import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci_meth {
	void fib(int n) {
		int a=0,b=1;
		System.out.println(+a+"\n"+b);
		for(int i=2;i<n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Fibonacci_meth fb=new Fibonacci_meth();
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		fb.fib(n);

	}

}
