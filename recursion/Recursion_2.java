////EXAMPLE FOR TAIL RECURSION
//package recursion;
//
//public class Recursion_2 {
//	static void print(int n) {
//    	if(n==0) {//base case
//    		return;
//    	}
//    	System.out.println(n);
//    	print(n-1);
//        System.out.println(n);//recursive case
//    }
//	public static void main(String[] args) {
//		int n=5;
//		print(n);
//
//	}
//
//}




//EXAMPLE FOR TREE RECURSION
package recursion;
public class Recursion_2 {
	static void print(int n) {
    	if(n<=0) {
    		return;
    	}
    	System.out.println(n);
    	print(n-1);
    	print(n-2);
    	
    }
	public static void main(String[] args) {
		int n=3;
		print(n);

	}
}
