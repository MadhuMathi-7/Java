package method;
import java.util.Scanner;
public class Method_6 {
    static int deleteAtPos(int arr[],int pos){
    	int newArray[]=new int[arr.length-1];
    	for(int i=0,j=0;i<arr.length;i++,j++) {
    		if(i==pos) {
    			i++;
    		}
            if(i !=arr.length) {
            	newArray[j]=arr[i];
            }
    	}
    	return newArray;
    }
	public static void main(String[] args) {
		 int arr[]= {1,6,3,8,7};
		 int pos=2;
		 arr=deleteAtPos(arr,pos);
		 arr=deleteAtPos(arr,3);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }

	}

}