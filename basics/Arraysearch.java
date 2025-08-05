package basics;

import java.util.Scanner;

public class Arraysearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[]arr= {5,89,45,46,36,85,4,9,18};
        int num=sc.nextInt();
        int i;
        int flag=0;
        for( i=0;i<arr.length;i++) {
        	if(arr[i]==num) {
        		System.out.println("found at"+i);
        		flag++;
        	}	
        	}
        	if(flag==0) {
        		System.out.println("not found");
        	}
        	else {
        		System.out.println(+i+ "\toccurs\t"+flag);
        	}
        	
        	
        
	}
}

