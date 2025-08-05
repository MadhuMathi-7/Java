package basics;
import java.util.Scanner;
public class Singlenum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			sum=0;
			sum=sum+(n%10);
			n/=10;
		}
		System.out.println(sum);
	}

}
