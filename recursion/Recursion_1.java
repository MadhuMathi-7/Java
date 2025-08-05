//package recursion;
//
//public class Recursion_1 {
//    static int i=1;
//	static void print(int n,int i) {
//    	if(i==n+1) {//base case
//    		return;
//    	}
//    	System.out.println(i);
//    	i++;
//        print(n,i);//recursive case
//    }
//	public static void main(String[] args) {
//		int n=100;
//		print(n,i);
//	}
//
//}


//package recursion;
//
//public class Recursion_1 {
//	static void print(int n) {
//    	if(n==0) {base case
//    		return;
//    	}
//    	System.out.println(n);
//    	print(n-1);
//        System.out.println(n);//recursive case
//    }
//	public static void main(String[] args) {
//		int n=5;
//		print(n);
//	}
//
//}


//
//package recursion;
//import java.util.Scanner;
//public class Recursion_1 {
//     static int fact(int n) {
//        if(n==0||n==1) {
//            return 1;
//        }
//        return n*fact(n-1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        fact(n);
//        System.out.println(fact(n));
//    }
//
//}





package recursion;
public class Recursion_1 {
    static int sum(int n) {
        int sum=0;
        if(n<10) return n;
        return (n%10)+sum(n/10);
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(sum(n));

    }

}