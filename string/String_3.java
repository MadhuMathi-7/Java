package string;
import java.util.*;
public class String_3 {
	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
	    System.out.println(s1.equals(s2));
	    System.out.println(s1.compareTo(s2));
	    System.out.println(s1.charAt(4));
	    System.out.println(s1.length());
	    for(int i=s1.length()-1;i>=0;i--) {
	    	System.out.println(s1.charAt(i));
	    }
	}
}