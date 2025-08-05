package basics;

import java.util.Scanner;

public class Toggle_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st= new String();
		st=sc.next();
		String st1="";
		for(char ch:st.toCharArray()) { 
			
			 if(ch>='A'&&ch<='Z') {
				 ch=(char)(ch+32);
				
			}
			 else if(ch>='a'&&ch<='z') {
				 ch=(char)(ch-32);
			 }
			 st1=st1+ch;
		}
		System.out.println(st1);
		
	}

}






