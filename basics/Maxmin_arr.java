package basics;

import java.util.Scanner;

public class Maxmin_arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[]arr= {5,89,45,9,46,64,9,85,4,9,18};
        int i;
        int max=arr[0];
        int count=0;
        for( i=0;i<arr.length;i++) {
        	if(max<arr[i]) {
        		max=arr[i];
                count=i;
	}
        	

}
        System.out.println("Index:"+count+"Value:"+max);
	}
}
