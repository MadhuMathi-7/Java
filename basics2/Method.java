package basics2;
import java.util.Arrays;
import java.util.Scanner;
public class Method {
	String sum(char a[],char [] b){
		String s1=new String(a);
		String s2=new String(b);
		String res=s1+s2;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Method md=new Method();
        char a[]= {'P','R','A'};
        char b[]= {'S','A','D'};
        String res=md.sum(a,b);
        System.out.println(res);
}
}

