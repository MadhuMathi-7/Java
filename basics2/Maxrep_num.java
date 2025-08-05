package basics2;

import java.util.Scanner;

public class Maxrep_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String st="Prasad@9360345434";
		int arr[]=new int[10];
		char ch;
		for(int i=0;i<st.length();i++) {
			ch=st.charAt(i);
			if(ch>='0'&&ch<='9') {
				arr[ch-48]++;
			}
		}
		int max=arr[0];
		int ind=0;
		for(int i=1;i<10;i++) {
			System.out.println(i+":"+arr[i]);
			if(max<=arr[i]) {
				max=arr[i];
				ind=i;
			}
		}
		System.out.println(ind+"occured"+max+"times");
	}
	

}
