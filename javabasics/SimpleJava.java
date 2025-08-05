//Whether the number is even or odd(without arthimetic operator and conditions)
//package javabasics;

//public class SimpleJava {

	//public static void main(String[] args) {
		//int num=8;
		//String res=((num&1)==1)?"odd":"even";
		//System.out.println(res);

	//}

//}

//package javabasics;
//import java.util.Scanner;
//public class SimpleJava {

	//public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int position=sc.nextInt();
		//int count=0,fact=0;
		//for(int i=2;i<=1000;i++) 
		//{
			//fact=0;
			//for(int j=2;j<=i/2;j++) {
				//if(i%j==0)  fact++;
			//}
			//if(fact==0)   count++;
			//if(count==position) {
				//System.out.println(i);
				//break;
			//}
		//}

	//}

//}


//package javabasics;
//import java.util.Scanner;
//public class SimpleJava {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt(),sum=0;
//		while(num!=0) {
//			sum+=num%10;
//			num=num/10;
//			if(sum>9 && num==0) {
//				num=sum;
//				sum=0;
//			}
//		}
//
//	}
//
//}




//package javabasics;
//import java.util.Scanner;
//public class SimpleJava {
//   boolean sleepy;
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		SimpleJava as=new SimpleJava();
//		System.out.println(as.sleepy);
//
//	}
//
//}



//package javabasics;
//import java.util.Scanner;
//public class SimpleJava {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int num=(int)Math.pow(3, 3);
//		int cb=(int)Math.cbrt(num);
//		System.out.println(cb);
//
//	}
//
//}






//package javabasics;
//import java.util.Scanner;
//public class SimpleJava {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int arr[]=new int[5];
//		for(int i=0;i<5;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int min=arr[0];
//		for(int i=0;i<5;i++) {
//			if(min>arr[i]) {
//				min=arr[i];
//				System.out.println(min);
//				int cb=(int)Math.cbrt(min);
//				int num=(int)Math.pow(cb,3);
//				if(num==min) {
//					System.out.println("Perfect Cube");
//				}
//				else {
//					System.out.println("Not Perfect Cube");
//				}
//			}
//		}
//
//	}
//
//}



//package javabasics;
//import java.util.Scanner;
//public class SimpleJava {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int[] freq=new int[10];
//		int num=sc.nextInt();
//		while(num!=0) {          //O(1)
//			freq[num%10]++;
//			num=num/10;
//			
//		}
//		int count=0;
//       for(int i:freq) {        //O(n)
//    	   if(i!=0) count++;
//       }
//       System.out.println(count);
//	}
//
//}



//package javabasics;
//import java.util.Scanner;
//public class SimpleJava {
//
//	public static void main(String[] args) {
//		String name="Madhu";
//		String name2="Madhu";
//		System.out.println(name==name2);
//	}
//
//}


//package javabasics;
//import java.util.Scanner;
//public class SimpleJava {
//
//	public static void main(String[] args) {
//		String name="Madhu";//literal
//		String name2=new String("Madhu");//object
//		System.out.println(name.equals(name2));
//	}
//
//}

//package javabasics;
//public class SimpleJava {
//
//	public static void main(String[] args) {
//		String emp= " ";
//		String name="hii welcome to my home";
//		String[] arr=name.split(" ");
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i%2==0) {
//				emp=emp+arr[i].toUpperCase()+" ";
//			}
//			else {
//				emp+=arr[i]+" ";
//			}
//		}
//		System.out.println(emp.trim());
//		
//	}
//}


//package javabasics;
//public class SimpleJava {
//	public static void main(String[] args) {
//		String s="Wipro Technologies";
//		String[] arr= s.split(" ");
//		int sum=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i].length();
//		}
//		int res=((sum%9)==0)? 9:sum%9;
//		  System.out.println(res);
//		  
//	}
//}
//


//package javabasics;
//public class SimpleJava {
//	public static void main(String[] args) {
//		String s="MadHu mAtHi r";
//		String str=" ";
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
//				str=str+(char)(s.charAt(i)+32);
//			}
//			else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
//				str=str+(char)(s.charAt(i)-32);
//			}
//			else if(s.charAt(i)>=32) {
//				str=str+(char)(s.charAt(i));
//			}
//		}
//		System.out.println(str);
//	}
//}


//package javabasics;
//public class SimpleJava {
//
//	public static void main(String[] args) {
//		String name="16BME0552".toUpperCase();
//		char[] arr = name.toCharArray();
//		int alp=0,num=0,spl=0;
//		for(char i:arr) {
//			if(i>='A' && i<='Z')  alp++;
//			else if(i>='0' && i<='9')  num++;
//			else spl++;
//		}
//			System.out.println("alphabet="+alp + "num="+num +" "+ "spl="+spl);
//	}
//}

//
//package javabasics;
//public class SimpleJava{
//    public static void main(String[] args){
//        String name = "Madhu Mathi R"; 
//        name = name.toLowerCase();  
//        for(char letter='a';letter<='z';letter++){
//            int count = 0;
//            for (int i = 0; i < name.length(); i++){
//                if (name.charAt(i)==letter){
//                    count++;
//                }
//            }
//            if (count > 0){
//                System.out.println(letter + ": " + count);
//            }
//        }
//    }
//}


//package javabasics;
//public class SimpleJava {
//	public static void main(String[] args) {
//		int a=10;
//		String num=""+a;
//		System.out.println(a+10);
//		System.out.println(num+10);
//		String data=String.valueOf(a);
//		System.out.println(data+20);
//	}
//}


//    
//package javabasics;
//public class SimpleJava {
//	public static void main(String[] args) {
//		String data="abc".toLowerCase();
//		int pos=0;
//		for(int i=0;i<data.length();i++) {
//			pos+=data.charAt(i)-96;
//		}
//		System.out.println(pos);
//	}
//}
//

package javabasics;
public class SimpleJava{
	public static void main(String[] args) {
		
	}
}







