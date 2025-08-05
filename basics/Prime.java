package basics;
import java.util.Scanner;
public class Prime {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			int c=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.println(i);
			}
		}
	}

}
