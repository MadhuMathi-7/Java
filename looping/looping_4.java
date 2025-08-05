package looping;
import java.util.Scanner;
public class looping_4 {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int reversedNumber = 0,temp=n;
        while (n != 0) { 
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit; 
            n/= 10; 
        }
        if(reversedNumber==temp) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("Not a palindrome");
        }
	}

}