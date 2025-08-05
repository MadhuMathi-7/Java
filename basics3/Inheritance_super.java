package basics3;
import java.util.Scanner;
class Mcat{
	Mcat(){
		super();
		System.out.println("meow meow!!");
	}}
	class Cat extends Mcat{
		Cat(){
			super();
			System.out.println("cat meow!!");
		}
	}
	class Kitten extends Cat{
		Kitten(){
			super();
			System.out.println("Kitten meow");
		}
	}

public class Inheritance_super {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Kitten kt=new Kitten();
		
	}

}
