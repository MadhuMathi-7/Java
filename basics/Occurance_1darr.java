package basics;

import java.util.Scanner;

public class Occurance_1darr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[]arr= {5,89,45,9,46,64,9,85,4,9,18};
        int num=sc.nextInt();
        int i;
        int flag=0;
        int count=0;
        for( i=0;i<arr.length;i++) {
        	if(num==arr[i]) {
        		count++;
        		if (count==2) {
        			flag=1;
        			break;
        		}
        		
        	}	
        	}
        	if(flag==1) {
        		System.out.println(i);
        	}
        	else {
        		System.out.println(-1);
        	}
        	

	}

}
