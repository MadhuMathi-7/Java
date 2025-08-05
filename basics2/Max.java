package basics2;
import java.util.Arrays;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int arr[]= {23,43,55,22,43,56,43,23,55,23};
		Arrays.sort(arr);
		int dest[]=new int[arr.length];
		System.arraycopy(arr,1,dest,0,arr.length-1);
		for(int i:dest) {
			System.out.println(i);
		}
	}

}
