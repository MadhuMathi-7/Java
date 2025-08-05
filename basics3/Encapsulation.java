package basics3;import java.util.Scanner;
class Mcat1{
	private int n1;	
	private int n2;
	public int getn1() {
		return n1;
	}
	public void setn1(int n1) {
		this.n1=n1;
	}
	public int getn2() {
		return n2;
	}
	public void setn2(int n2) {
		this.n2=n2;
	}
}
	public class Encapsulation  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Mcat1 mc=new Mcat1();
		mc.setn1(10);
		mc.setn2(20);
		System.out.println(mc.getn1());
		System.out.println(mc.getn2());
		System.out.println(mc.getn1()+mc.getn2());
	}
}



