package array;
import java.util.Arrays;
public class Array_sorting {
	public static void main(String[] args) {
		int arr[]= {1,3,9,7,2};
		Arrays.sort(arr);//Quick sort Algorithm
		for(int n:arr) {
			System.out.print(n+ "  ");
		}
	}

}

