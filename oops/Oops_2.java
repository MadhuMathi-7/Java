//SINGLE INHERITANCE
//package oops;
//class Parent{
//	int bankBalance=1500000;
//	void property() {
//		System.out.println("10 acres + 2 apartments");
//	}
//}
//class Child extends Parent{
//	
//}
//public class Oops_2 {
//
//	public static void main(String[] args) {
//	      Child Kousik=new Child();	
//          System.out.println(Kousik.bankBalance);
//          Kousik.property();
//	}
//
//}



//MULTILEVEL INHERITANCE
//package oops;
//class GrandParent{
//	int bankBalance=1500000;
//	void property() {
//		System.out.println("10 acres + 2 apartments");
//	}
//}
//
//class Parent extends GrandParent{
//	int debt=100000;
//	void salary() {
//		System.out.println("50000 per month");
//	}
//}
//class Child extends Parent{
//	
//}
//public class Oops_2 {
//
//	public static void main(String[] args) {
//	      Child Kousik=new Child();	
//          System.out.println(Kousik.bankBalance);
//          Kousik.property();
//          System.out.println(Kousik.debt);
//          Kousik.salary();
//	}
//
//}




//Hierarchical Inheritance
//package oops;
//class Parent{
//	int bankBalance=1500000;
//	void property() {
//		System.out.println("10 acres + 2 apartments");
//	}
//}
//
//class Child1 extends Parent{
//	int salary=100000;
//}
//class Child2 extends Parent{
//	int salary=70000;
//}
//class Child3 extends Parent{
//	int salary=50000;
//}
//public class Oops_2 {
//
//	public static void main(String[] args) {
//	     Child1 Kousik=new Child1();
//	     Child2 Rajini=new Child2();
//	     Child3 Kamal=new Child3();
//	     Kousik.property();
//	     Rajini.property();
//	     Kamal.property();
//	     System.out.println(Kousik.salary);
//	     System.out.println(Rajini.salary);
//	     System.out.println(Kamal.salary);
//	}
//
//}





//COMPILE TIME POLYMORPHISM
//package oops;
//class Demo{
//	void demo() {
//		System.out.println("Hi");
//	}
//	void demo(int n) {
//		System.out.println("Hi "+n);
//	}
//	void demo(String s) {
//		System.out.println("Hello "+s);
//	}
//	void demo(int n,int m) {
//		System.out.println("Hi" +n+m);
//	}
//}
//	
//
//
//public class Oops_2 {
//
//	public static void main(String[] args) {
//	     Byte b=127;
//	     Demo d=new Demo();
//	     d.demo("s");
//	}
//
//}



//RUNTIME POLYMORPHISM(METHOD OVERRIDING)
//package oops;
//class Parent{
//	int bankBalance=1500000;
//	void mobile() {
//		System.out.println("Nokia 6600");
//	}
//}
//class Child extends Parent{
//	void mobile() {
//		System.out.println("Iphone 15");
//	}
//	
//}
//
//public class Oops_2 {
//
//	public static void main(String[] args) {
//	     Parent kousik=new Child();
//	     System.out.println(kousik.bankBalance);
//	     kousik.mobile();
//	}
//
//}







package oops;
class Parent{
	int bankBalance=1500000;
	static void mobile() {
		System.out.println("Nokia 6600");
	}
}
class Child extends Parent{
	static void mobile() {
		System.out.println("Iphone 15");
	}
	
}

public class Oops_2 {

	public static void main(String[] args) {
		 Parent kousik;
	     kousik=new Child();
	     System.out.println(kousik.bankBalance);
	     kousik.mobile();
	}

}


