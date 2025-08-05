package basics3;
import java.util.Scanner;
interface Area1 {
	public static final float PI=3.14f;
	abstract void area1_Rectangle(int l,int b);
	static void static_meth() {
		System.out.println("static");
	}
}
public class New_iface implements Area1{
	public void area1_Reactangle(int l,int b) {
		int res=l*b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Area1 ar=New_iface();
		ar.area1_Rectangle(3,4);
		System.out.println(Area1.PI);
		Area1.static_meth();
	}
}
