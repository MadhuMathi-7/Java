//package string;
//import java.util.Scanner;
//public class String_buffer {
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer();
//		sb.append("Hello");
//		System.out.println(sb);
//	}
//}


//package string;
//import java.util.Scanner;
//public class String_buffer{
//	public static void main(String[] args) {
//		String s="Hello";
//		s.concat("World");
//		System.out.println(s);
//		StringBuffer sb=new StringBuffer("Hello");
//		sb.append("World");
//		System.out.println(sb);
//	}
//}



//REVERSE THE STRING IN STRING BUFFER
//package string;
//import java.util.Scanner;
//public class String_buffer{
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer("Hello");
//		sb.reverse();
//		System.out.println(sb);
//	}
//}



//PALINDROME OR NOT A PALINDROME
//package string;
//import java.util.Scanner;
//public class String_buffer{
//	public static void main(String[] args) {
//		 String text = "World";
//		 boolean isPalindrome = true;
//		 int length = text.length();
//		      for (int i = 0; i < length / 2; i++) {
//		           if (text.charAt(i) != text.charAt(length - 1 - i)) {
//		                isPalindrome = false;
//		                break;
//		            }
//		      }
//		      if (isPalindrome) {
//		            System.out.println(text + " is a palindrome.");
//		      } 
//		      else {
//		            System.out.println(text + " is not a palindrome.");
//		      }
//	}
//}
//



//package string;
//import java.util.Scanner;
//public class String_buffer{
//	public static void main(String[] args) {
//		Scanner scr=new Scanner(System.in);
//		String s=scr.nextLine();
//		StringBuffer sb = new StringBuffer(s);
//		sb.reverse();
//		if(s.contentEquals(sb)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not a Palindrome");
//		}
//	}
//}



//package string;
//import java.util.Scanner;
//public class String_buffer{
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer();
//		sb.append("helloworldhiteamm");
//		System.out.println(sb.capacity());//16
//		StringBuffer sb1=new StringBuffer("hello");
//		sb1.append("helloworldhiteamm");
//		System.out.println(sb1.capacity());//21
//	}
//}



//package string;
//import java.util.Scanner;
//public class String_buffer{
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer("Hello World");
//		System.out.println(sb.isEmpty());
//		sb.insert(1, "BEEEEEEEEEE");                                                                                                                                        
//		System.out.println(sb);
//	}
//}




//package string;
//import java.util.Scanner;
//public class String_buffer{
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer("Hello World");
//		sb.deleteCharAt(5);
//		System.out.println(sb);
//		sb.delete(5,10);
//		System.out.println(sb);
//	}
//}



//package string;
//import java.util.Scanner;
//public class String_buffer{
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer("Hello World");
//		sb.setCharAt(5,'-');
//		System.out.println(sb);
//	}
//}




package string;
import java.util.Scanner;
public class String_buffer{
	public static void main(String[] args) {
		String s = "Hello";
		String st = s.join("  >>  ",s,"Hi","Students");
		System.out.println(st);
		String str[]= {"One","Two","Three"};
		st=s.join(" ", str);
		System.out.println(st);
	}	
}