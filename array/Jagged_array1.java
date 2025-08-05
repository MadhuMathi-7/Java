package array;
import java.util.Scanner;
public class Jagged_array1 {
	public static void main(String[] args) {
		java.util.Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[1];
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int a[]:arr) {
			for(int n:a) {
				System.out.print(n+"  ");
			}
			System.out.println();
		}
	

	}

}
