//package oops;
//class Bank{ 
//	private String accountNumber;
//	private int balance;
//	void setAccountNumber(String accountNumber) {
//          this.accountNumber=accountNumber;
//    }
//    String getAccountNumber() {
//    	return accountNumber;
//    }
//    void deposit(int amount) {
//    	if(amount>0) {
//    		balance+=amount;
//    	}
//    	else {
//    		System.out.println("Invalid deposit");
//    	}
//    }
//    void withdraw(int amount) {
//    	if(balance>=amount) {
//    		balance-=amount;
//    	}
//    	else {
//    		System.out.println("Insufficient amount");
//    	}
//    }
//    int getBalance() {
//    	return balance;
//}
//public class Encapsulation_1 {
//    public static void main(String[] args) {
//    	Bank b1=new Bank();
//    	b1.setAccountNumber("IOBA00115");
//    	System.out.println(b1.getAccountNumber());
//    	b1.deposit(-10000);
//    	b1.withdraw(5000);
//    	b1.getBalance();
//    	
//
//    }
//}




//package oops;
//class One{
//	One demo() {
//		return this;
//	}
//	void run() {
//		System.out.println("Running");
//	}
//}
//public class Encapsulation_1{
//	public static void main(String[] args) {
//		One o=new One();
//		One obj=o.demo();
//		System.out.println(o);
//		System.out.println(obj);
//	}
//}





//package oops;
//class One{
//	One demo() {
//		return this;
//	}
//	int a=15;
//	int print(){
//		return a;
//	}
//	void run() {
//		System.out.println("Running");
//	}
//}
//public class Encapsulation_1{
//	public static void main(String[] args) {
//		One o=new One();
//		One obj=o.demo();
//		System.out.println(o);
//		System.out.println(obj);
//	}
//}






//package oops;
//class One{
//	void run() {
//		System.out.println("Running");
//	}
//}
//class Two extends One{
//	
//}
//public class Encapsulation_1 extends One{
//	void a() {
//		super.run();
//	}
//	public static void main(String[] args) {
//		Encapsulation_1 o=new Encapsulation_1();
//		o.a();
//	}
//}










//package oops;
//class One{
//	void run() {
//		System.out.println("Running");
//	}
//}
//class Two extends One{
//	
//}
//public class Encapsulation_1 extends One{
//	void a() {
//		super.run();
//	}
//	public static void main(String[] args) {
//		Encapsulation_1 o=new Encapsulation_1();
//		o.a();
//	}
//}


//package oops;
//class One{
//	void walk() {
//		System.out.println("Walking");
//	}
//	class Two{
//		void run() {
//			System.out.println("Running");
//	    }
//	}
//}
//public class Encapsulation_1 extends One{
//	public static void main(String[] args) {
//		One o=new One();
//		One.Two t=o.new Two();
//	    t.run();
//	    o.walk();
//		
//		
//	}
//}



package oops;
                 //static nested class
class One{
	  static class Two{
		void run() {
			System.out.println("Running");
	    }
	}
}
public class Encapsulation_1 extends One{
	public static void main(String[] args) {
		One o=new One();
	    One.Two t=new One.Two();
        t.run();
	}
}