//FACTORIAL 
//package recursion;
//import java.util.Scanner;
//public class Recursion_3 {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println("The factorial of number is:"+fact);
//	}
//}



//package recursion;
//public class Recursion_3 {
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//
//    public static void main(String[] args) {
//        int number = 5;
//        System.out.println("Factorial of " + number + " is " + factorial(number));
//    }
//}




package recursion;
public class Recursion_3 {
    static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }                                                                                                                                                                                                                                                                        
    public static void main(String[] args) {
        int number = 9;
        System.out.println(fib(number));
    }
}


//INDIRECT RECURSION
//package recursion;
//public class Recursion_3{
//	static void m1(int n) {
//		if(n<=0) return;
//		System.out.println("m1 : "+n);
//		m2(n-1);
//	}
//	static void m2(int n) {
//		if(n<=0) return;
//		System.out.println("m2 : "+n);
//		m1(n-2);
//	}
//	public static void main(String[] args) {
//		m1(5);
//	}
//	
//}   





