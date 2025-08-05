package basics2;
class Computer2{
	void disp() {
		System.out.println(this);
	}
}
public class This_keyword {

	public static void main(String[] args) {
		Computer2 c1=new Computer2();
		System.out.println(c1);
		c1.disp();
		Computer2 c2=new Computer2();
		System.out.println(c2);
		c2.disp();
	}

}
