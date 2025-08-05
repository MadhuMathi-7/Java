//SUPER KEYWORD
//package oops;
//class Parents{
//     int bankBalance=150000;
//     void mobile() {
//    	 System.out.println("Nokia 6600");
//     }
// }
// class Childs extends Parents{
//	 void amount() {
//		 System.out.println(super.bankBalance);
//	 }
//	 void mobileModel() {
//		 super.mobile();
//	 }
// }
//public class Super_keyword {
//	public static void main(String[] args) {
//		Childs kousik=new Childs();
//		kousik.amount();
//		kousik.mobileModel();
//	}
//
//}



//package oops;
//class Parents{
//	Parents(int n){
//    	 System.out.println("Superclass constructor");
//     }
// }
// class Childs extends Parents{
//     Childs(int m) {
//    	 super(m);//Parents(10)
//		 System.out.println("Subclass constructor");
//	 }
// }
//public class Super_keyword {
//	public static void main(String[] args) {
//		Childs kousik=new Childs(10);
//	}
//
//}





//FINAL KEYWORD
//package oops;
//class Parent{
//     
// }
// class Child extends Parent{
//	final double PI=3.14;
// }
//public class Super_keyword {
//	public static void main(String[] args) {
//		Child c=new Child();
//		System.out.println(c.PI);
//		System.out.println(Integer.MAX_VALUE);
//		
//	}
//
//}




//ABSTRACTION
//package oops;
//abstract class Hotel{
//	void dosa() {
//		System.out.println("Dosa Flour+salt");
//	}
//	abstract void sambar();
//}
//abstract class Kitchen extends Hotel{
//	
//}
//class Home extends Hotel{
//	void sambar() {
//		System.out.println("Special masala");
//	}
//}
//public class Super_keyword{
//	public static void main(String[] args) {
//		Home A2B=new Home();
//		A2B.dosa();
//		A2B.sambar();		
//	}
//}




package oops;
interface Hotel{
	int DOSA_PRICE=50;//public final static int
	default void dosa() {
		System.out.println("Dosa flour+salt");
	}
	void sambar();//public abstract void sambar();(By default)
}
abstract class Kitchen implements Hotel{
	//abstract method implementation is optional(because this class is abstract)
}
class Home implements Hotel{
	//must implement abstract method
	public void sambar() {
		System.out.println("Special masala");
	}
}
public class Super_keyword{
	public static void main(String[] args) {
		Home A2B=new Home();
		A2B.dosa();
		A2B.sambar();
		System.out.println(A2B.DOSA_PRICE);
	}
}