package basics;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=sc.nextInt();
		int orginal_num =a,sum=0;
		while(a!=0) {
			int rem=a%10;
			sum+=rem*rem*rem*rem ;
			a/=10;
		}
		if(orginal_num==sum) {
			System.out.println("is Armstrong number");
		}
		else {
			System.out.println(sum);
			System.out.println("is not an Armstrong");
		}
	}

}
