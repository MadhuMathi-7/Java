package basics;
import java.util.Scanner;
public class Perfect {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=sc.nextInt();
		int i=1;
		while(i<5)
			if(i%a==0) {
				System.out.println("perfect number"+i);
				i++;
			}
			else {
				System.out.println("not perfect number"+i);
			}
		
	}

}
