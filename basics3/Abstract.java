package basics3;
import java.util.Scanner;
abstract class Area{
	abstract void area_Rectangle(int length,int breadth);
	void instance_Meth() {
		System.out.println("Instance method in abstract class");
	}
}
public class Abstract extends Area{
	void area_Rectangle(int l,int b) {
		int res=l*b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Area ar=new Abstract();
		ar.area_Rectangle(3,4);
		ar.instance_Meth();
	}
	}