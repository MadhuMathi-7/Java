//WITH ARGUMENT WITH RETURNTYPE
//package method;
//import java.util.Scanner;
//public class Method_1{
	//static int addition(int x,int y) {
		//return x+y;
	//}
	//public static void main(String[] args) {
		//int a=10,b=5;
		//System.out.println(addition(a,b));
		//System.out.println(addition(5,5));
		//System.out.println(addition(1,5));
		//System.out.println(addition(6,10));
		//System.out.println(addition(15,1));
		//System.out.println(addition(a,19));
		//System.out.println(addition(19,b));
	//}
//}

//WITH ARGUMENT WITHOUT RETURNTYPE
//package method;
//import java.util.Scanner;
//public class Method_2{
	//static void addition(int x,int y) {
		//System.out.println(x+y);
	//}
	//public static void main(String[] args) {
		//int a=10,b=5;
		//addition(a,b); //method calling or invoking
	//}
	
//}

//WITHOUT ARGUMENT WITH RETURNTYPE
//package method;
//import java.util.Scanner;
//public class Method_2{
      //static int addition() {
		//int x=10,y=5;
		//return x+y;
	//}
	//public static void main(String[] args) {
		//System.out.println(addition());
	//}
//}


//WITHOUT ARGUMENT WITHOUT RETURNTYPE
//package method;
//import java.util.Scanner;
//public class Method_2{
	//static void addition() {
		//int x=10,y=5;
		//System.out.println(x+y);
		//return;
	//}
	//public static void main(String[] args) {
		//addition();
	//}
//}


//WITHOUT ARGUMENT WITHOUT RETURNTYPE
package method;
import java.util.Scanner;
public class Method_2{
	static void demo() {
		int x=10,y=15;
		if(x<y){
			System.out.println("Y is greater than X");
			return;
			
		}
		System.out.println("X is greater than Y");
	}
	public static void main(String[] args) {
		demo();
	}
}