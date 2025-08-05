package method;
import java.util.Scanner;
public class Method_1{
	static int addition(int x,int y) {
		return x+y;
	}
	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println(addition(a,b));
		System.out.println(addition(5,5));
		System.out.println(addition(1,5));
		System.out.println(addition(6,10));
		System.out.println(addition(15,1));
		System.out.println(addition(a,19));
		System.out.println(addition(19,b));
	}
}