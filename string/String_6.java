//package string;
//import java.util.Scanner;
//public class String_6{
	//public static void main(String[] args) {
	     //String s="hello";
	     //s=s.toUpperCase();
	     //System.out.println(s);
	     //System.out.println(s.toLowerCase());
	//}
//}


//package string;
//import java.util.Scanner;
//public class String_6 {
	//public static void main(String[] args) {     
      //  String s = "hElLo Wo RlD!";
        //String lowerStr = s.toLowerCase();
        //String upperStr = s.toUpperCase();
        //System.out.println("Original String: " + s);
        //System.out.println("Lowercase String: " + lowerStr);
        //System.out.println("Uppercase String: " + upperStr);
    //}
//}



//package string;
//import java.util.Scanner;
//public class String_6 {
	//public static void main(String[] args) {     
      //  String s = "Hello";
        //String str="";
        //for(int i=0;i<s.length();i++) {
        	//if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
        		//str=str+(char) (s.charAt(i)+32);
        	//}
        	//else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
        		//str=str+(char)(s.charAt(i)-32);
        	//}
        //}
        //System.out.println(str);
	//}
//}




//package string;
//import java.util.Scanner;
//public class String_6 {
	//public static void main(String[] args) {  
      //  String s = "Hello World!";
        //s = s.toLowerCase();
        //System.out.print("Vowels in the string: ");
        //for (int i = 0; i < s.length(); i++) {
          //  char ch = s.charAt(i);
            //if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
           //     System.out.print(ch + " ");
            //}
        //}
    //}
//}



//package string;
//import java.util.Scanner;
//public class String_6 {
	//public static void main(String[] args) {  
      //  String s = "Hello World!";
        //int count=0;
        //s=s.replace('l','t');
        //System.out.println(s);
	//}
//}



//package string;
//import java.util.Scanner;
//public class String_6 {
	//public static void main(String[] args) {  
      //  String s = "HELLO world";
        //int len1=s.length();
        //int len2=s.replaceAll("[AEIOUaeiou]","").length();
        //System.out.println(len1-len2);
	//}
//}




//package string;
//import java.util.Scanner;
//public class String_6 {
	//public static void main(String[] args) {  
       //String s = "Hello World!";
        //int len=0;
        //for(char c:s.toCharArray()) {
        	//  len++;
        //}
        	//System.out.println(len);
	//}
//}



package string;
import java.util.Scanner;
public class String_6 {
	public static void main(String[] args) {  
       String s = "Hello World!";
    	        String[] words = s.split("\\s+");
    	        int wordCount = words.length;
    	        System.out.println("Number of words in the string: " + wordCount);
    	    }
    	}


  
