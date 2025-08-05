package string;
import java.util.Scanner;
public class Wrapper_class{
	public static void main(String[] args) {
		int a=123;
		String s=Integer.toString(a);
		System.out.println(s+10);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.max(100, 15));
		System.out.println(Integer.min(100, 15));
		String st="1234";
		int n=Integer.parseInt(st);
		System.out.println(n);
		System.out.println(Integer.valueOf(st));
	}
}