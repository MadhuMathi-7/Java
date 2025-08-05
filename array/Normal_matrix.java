package array;
import java.util.Arrays;
import java.util.Scanner;

public class Normal_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=2,c=3;
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int arr1[][]=new int[c][r];
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				arr1[i][j]=arr[j][i];
			}
		}
		for(int a[]:arr1) {
			for(int n:a) {
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
