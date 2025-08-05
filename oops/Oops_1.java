//package oops;
//public class Oops_1 {
//
//	public static void main(String[] args) {
//		House house1=new House();
//		House house2=new House();
//		System.out.println(house1);
//		System.out.println(house2);
//	}
//}
//class House{
//	int price;
//	int sqft;
//	static void rooms() {
//		System.out.println("2-Bedroom,1-Hall,1-Kitchen");
//	}
//}
//




//package oops;
//public class Oops_1 {
//    public static void main(String[] args) {
//	      System.out.println("Yes");	
//    }
//    static { //Static method
//    	System.out.println("No-1");
//    }	
//    static {
//    	System.out.println("No-2");
//    }	
//    static {
//    	System.out.println("No-3");
//    }	
//    static {
//    	System.out.println("No-4");
//    }	
//}	



//EXAMPLE FOR CONSTRUCTOR OVERLOADING 
//package oops;
//
//class One{
//	One(){
//		System.out.println("Default Constructor");
//	}
//	One(int n){
//		System.out.println("Int Constructor-1");
//	}
//	One(int n,int m){
//		System.out.println("Int Constructor-2");
//	}
//	One(int n,String s){
//		System.out.println("Int and String Constructor");
//	}
//
//
//
//}
//public class Oops_1 {
//    public static void main(String[] args) {
//    	One o1=new One();
//		One o2=new One(10,5);
//		One o3=new One(5,"Hello");
//    }	
//}




//package oops;
//class One{
//	int age=15;
//	String name;
//	One(int a,String s){
//		age=a;
//		name=s;
//	}
//}
//public class Oops_1{
//	public static void main(String[] args) {
//		One[] o=new One[5];
//		o[0]=new One(19,"Karthi");
//		o[1]=new One(20,"Surya");
//		o[2]=new One(21,"SK");
//		o[3]=new One(22,"Vikram");
//		o[4]=new One(23,"Kavin");
//		for(One n:o) {
//		System.out.println(n.age);
//		System.out.println(n.name);
//		}
//        
//		
//	}
//}
 




//this KEYWORD:
//package oops;
//class One{
//	int age;
//	String name;
//	void demo() {
//		System.out.println(this);
//	}
//}
//public class Oops_1{
//	public static void main(String[] args) {
//		One o1=new One();
//		System.out.println(o1);
//		o1.demo();
//		
//	}
//}
//		






//package oops;
//class One{
//	int age;//Instance variable
//	String name;//Instance Variable
//	One(int age,String name){//Constructor
//		this.age=age;//Local variable
//		this.name=name;//Local variable
//	}
//}
//public class Oops_1{
//	public static void main(String[] args) {
//		One o1=new One(19,"Karthi");
//		System.out.println(o1.age);
//		System.out.println(o1.name);
//		
//	}
//}




//
//package oops;
//class One{
//	void demo() {
//		this.print();
//	}
//	void print() {
//		System.out.println("Hello");
//	}
//}
//public class Oops_1{
//	public static void main(String[] args) {
//		One o1=new One();
//		o1.demo();
//		
//	}
//}



//package oops;
//class One{
//	int a=1000;
//	void demo() {
//		print(this);
//	}
//	void print(One obj) {
//		System.out.println(obj.a);
//	}
//}
//public class Oops_1{
//	public static void main(String[] args) {
//		One o1=new One();
//		o1.demo();
//	}
//}



package oops;
class One{
	int a=1000;
	void demo() {
		print(this);
	}
	void print(One obj) {
		System.out.println(obj.a);
	}
}
public class Oops_1{
	public static void main(String[] args) {
		One o1=new One();
		o1.demo();
	}
}
	

