package basics;
import java.util.Scanner;
public class Subscript {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of the array:");
		int [] a= {97,8,94,47,38};
		int len=a.length;
		System.out.println(len);
		System.out.println(a[2]);
		a[2]=100;
		System.out.println(2);
		System.out.println(a);
	}

}
