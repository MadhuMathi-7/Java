package basics;

import java.util.Scanner;

public class Deletion_arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int del=sc.nextInt();
        int[]arr= {5,89,45,9,46,64,9,85,4,9,18};
        for(int i=0;i<arr.length;i++){
        	if(arr[i]==del) {
        		for(int j=i;j<arr.length-1;j++) {
        			arr[j]=arr[j+1];
        			
        	}
        		i--;
        	
        	}
        }
        for(int i:arr) {
        	System.out.println(i+" ");
        }

	}

}

