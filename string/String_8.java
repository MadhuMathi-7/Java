package string;
import java.util.Scanner;
public class String_8 {
	public static void main(String[] args) {
		String s="  Hello world  ";
		s=s.trim();
		System.out.println(s);
		String st=s.substring(6,s.length());
		System.out.println(st);
		String st2 = s.subSequence(6,s.length()).toString();
		System.out.println(st2);
	}
}
		