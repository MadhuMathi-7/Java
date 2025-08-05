package array;
import java.util.Scanner;
public class Array_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		boolean flag= false;
		for(int i=0;i<n;i++) {
			if(a[i]==target){
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Target found");
		}
		else {
			System.out.println("Target not found");
		}
	}

}
