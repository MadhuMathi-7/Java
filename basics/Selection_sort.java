package basics;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {6,4,5,7,2,9,3,1};
		System.out.println("Before sotring:");
		for(int i:arr) {
			System.out.print(i+ " ");

		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("\nAfter sorting:");
		for(int i:arr) {
			System.out.print(i+ " ");

		}
	}

}
