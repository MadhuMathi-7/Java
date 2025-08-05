
//
//public class Exception_1 {
//
//	public static void main(String[] args) {
//		try {
//			String s="Hello";
//			System.out.println(s.charAt(5));
//			int n=12/0;
//			System.out.println(n);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Exception:"+e);
//		}
//		catch(StringIndexOutOfBoundsException e) {
//			System.out.println("Exception:"+e);
//		}
//		
//	}
//
//}

//package exception;
//public class Exception_1{
//	static int division(int n1,int n2) throws ArithmeticException{
//		if(n2==0) {
//			throw new ArithmeticException("Exception throw");
//		}
//		else {
//			return n1/n2;
//		}
//	}
//	public static void main(String[] args) {
//		int n1=10,n2=0;
//		try {
//			int n=division(n1,n2);
//			System.out.println(n);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Exception: "+e);
//		}
//	}
//}
	
	
	
//package exception;
//class A{
//	class B{
//		void run() {
//			System.out.println("Running");
//		}
//	}
//}
//public class Exception_1{
//	public static void main(String[] args) {
//		A.B b=new A().new B();
//		b.run();
//	}
//}
//	


package exception;
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String message){
		super(message);
	}
}
class ATM{
	int balance=10000;
	void withdraw(int amount) throws InsufficientBalanceException {
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient Amount.Available balance:"+balance);
		}
		balance-=amount;
		System.out.println("Withdraw Successful.Remaining Balance:"+balance);
	}
}
public class Exception_1{
	public static void main(String[] args) {
		ATM atm=new ATM();
		try {
			atm.withdraw(11000);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
}