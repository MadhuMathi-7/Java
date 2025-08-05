package basics;

import java.util.Scanner;

public class Max_rep_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st="4456345Happy";
		st=st.toLowerCase();
		int arr[]=new int[10];
		for(char ch:st.toCharArray()) {
			if(!(Character.isAlphabetic(ch))) {
				arr[ch-48]++;
			}
		}
		char c='0';
		for(int i:arr) {
			System.out.println(c+":"+i);
			c++;
		}
	}

}
