package basics;

import java.util.Scanner;

public class New_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=" You Tube";
		char ch[]=st.toCharArray();
		for(int i=0;i<st.length();i++) {
			System.out.println(st.charAt(i));
		}
		for(char ch1:st.toCharArray()) {
			System.out.println(ch1);
		}
		


	}

}
