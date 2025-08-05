package array;
import java.util.Arrays;
public class Binary_search{
	public static void main(String[] args) {
		int arr[]= {1,3,9,7,2};
		Arrays.sort(arr);//Quick sort Algorithm
		for(int n:arr) {
			System.out.print(n+ "  ");
		}
		System.out.println();
		int index=Arrays.binarySearch(arr,9);
		System.out.println(index);
		int copy1[]=Arrays.copyOf(arr,3);
		for(int n:copy1) {
			System.out.print(n+ "  ");
		}
		System.out.println();
		 int copy2[]=Arrays.copyOfRange(arr,1,4);
		 for(int n:copy2) {
				System.out.print(n+ "  ");
		 }
		 System.out.println();
		 Arrays.fill(arr,7);
		 for(int n:arr) {
			 System.out.print(n+ " ");
		 }
		 System.out.println();
	}

}
