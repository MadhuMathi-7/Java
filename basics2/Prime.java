package basics2;

import java.util.Scanner;

public class Prime {
	boolean isPrime(int n) {
		if(n==0||n==1) {
			
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
		
			return false;}
		
	
		return true;
	}
	

	

	public static void main(String[] args) {
		Prime pm =new Prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(pm.isPrime(n)) {
			System.out.println("is prime");
		}
		else {
			System.out.println("Not a prime");
		}
	}
}

