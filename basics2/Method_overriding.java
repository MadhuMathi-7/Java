package basics2;
import java.util.Scanner;
class Methor{
	int a=5;
	void add(int a,int b) {
		System.out.println(a+b);
	}}
	class Overrid extends Methor{
		void add(float a,float b) {
			System.out.println(a*b);
		}
		
	}

public class Method_overriding {
	public static void main(String[]args) {
		Methor mr=new Methor();
		mr.add(2,4);
		Overrid mr1=new Overrid();
		mr1.add(5.0f, 5.4f);
	}
	

}
