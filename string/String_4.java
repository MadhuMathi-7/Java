package string;
import java.util.Scanner;
public class String_4 {
	public static void main(String[] args) {
	     String s="madam";
	     String rev="";
	     for(int i=s.length()-1;i>=0;i--) {
	    	 rev=rev+s.charAt(i);
	     }
	     if(s.equals(rev)) {
	    	 System.out.println("Palindrome");
	     }
	     else {
	    	 System.out.println("Not a palindrome");
	     }

	}

}
