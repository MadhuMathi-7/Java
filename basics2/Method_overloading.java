package basics2;
import java.util.Scanner;

class Methol{
	void add(int a,int b){
		System.out.println(a+b);
	}
	void add(float a,float b){
		System.out.println(a+b);
}
}
public class Method_overloading {

	public static void main(String[] args) {
		Methol ml=new Methol();
		ml.add(2, 6);
		ml.add(3.5f, 1.0f);
		
	}

}
