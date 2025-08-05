//package string;
//import java.util.Scanner;
//public class String_7{
	//public static void main(String[] args) {
		//String s="Hello";
		//String s1=new String("Hello");
		//System.out.println(s==s1);
	//}
//}



//package string;
//import java.util.Scanner;
//public class String_7 {
	//public static void main(String[] args) {  
		//String s="Hello";
		//s.toUpperCase();
		//System.out.println(s);
	//}
//}



//package string;
//import java.util.Scanner;
//public class String_7 {
	//public static void main(String[] args) {  
		//String str="Helrlo World";
		//for(String s:str.split("r")) {
			//System.out.println(s);
		//}
	//}
//}




//package string;
//import java.util.Scanner;
//public class String_7 {
	//public static void main(String[] args) {
		//String str="Hello World";
		//char ch[]=str.toCharArray();
		//for(char c:ch) {
			//System.out.println(c);
		//}
	//}
//}



//package string;
//import java.util.Scanner;
//public class String_7 {
	//public static void main(String[] args) {
		//String str="Hello World";
		//str=str.replace('o',' ');
		//System.out.println(str);
	//}
//}




//package string;
//import java.util.Scanner;
//public class String_7 {
	//public static void main(String[] args) {
		//String str="Hello World";
		//str=str.replaceAll("o"," ");
		//System.out.println(str);
	//}
//}



//package string;
//import java.util.Scanner;
//public class String_7 {
	//public static void main(String[] args) {
		//String s1="Hello";
		//String s2="hEllo";
		//System.out.println(s1.equalsIgnoreCase(s2));
	//}
//}



//package string;
//import java.util.Scanner;
//public class String_7 {
	//public static void main(String[] args) {
		//String str="Hello team good morning";
		//int count=0;
		//for(int i=0;i<str.length();i++) {
			//if(str.charAt(i)==' ') {
				//count++;
			//}
		//}
		//System.out.println(count+1);
	//}
//}


//package string;
//import java.util.Scanner;
//public class String_7 {
	//public static void main(String[] args) {
		//String s="Hello";
		//s=s.concat("World");
		//System.out.println(s);
	//}
//}

package string;
import java.util.Scanner;
public class String_7 {
	public static void main(String[] args) {
		String s="Hello";
		s=s.concat("World");
		System.out.println(s.contains("loW"));
		System.out.println(s.startsWith("wor"));
		System.out.println(s.endsWith("rld"));
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf('o'));
		System.out.println(s.lastIndexOf('l'));

	}
}




