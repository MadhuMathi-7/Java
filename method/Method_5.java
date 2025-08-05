//Largest Number
//package method;
//import java.util.Scanner;
//public class Method_5 {
    //public static int findLargest(int num1, int num2, int num3) {
       //int largest = num1;
        //if (num2 > largest) {
            //largest = num2;
        //}
        //if (num3 > largest) {
          //  largest = num3;
        //}
        
        //return largest;
    //}

	//public static void main(String[] args) {
		 //Scanner scanner = new Scanner(System.in);
	        //System.out.print("Enter the first number: ");
	        //int num1 = scanner.nextInt();
	        ///System.out.print("Enter the second number: ");
	        //int num2 = scanner.nextInt();
	        //System.out.print("Enter the third number: ");
	        //int num3 = scanner.nextInt();	      
	       /// int largest = findLargest(num1, num2, num3);
	        //System.out.println("The largest number is: " + largest);	        
	      //  scanner.close();
	   // }
	//}

//SECOND LARGEST NUMBER
package method;
public class Method_5{
	static int secondMax(int arr[]) {
		int max=arr[0],smax=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				smax=max;
				max=arr[i];
			}
			else if(smax<arr[i]) {
				smax=arr[i];
			}
		}
		return smax;
	}

	public static void main(String[] args) {
		int arr[]= {1,6,3,8,7};
		int smax=secondMax(arr);
		System.out.println(smax);
	}
}    