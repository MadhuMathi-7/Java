//package method;
//public class Method_4 {
	//public static void main(String[] args) {
		//Demo.run();
	//}
//}
//class Demo{
	//static void run() {
		//System.out.println("Running");
	//}
//}
package method;
public class Method_4 {
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		if(isPrime(10)) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime");
		}
	}
}