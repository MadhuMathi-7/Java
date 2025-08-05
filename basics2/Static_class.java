package basics2;

import java.util.Scanner;
class Computer1{
	    String name;
		Computer1(String c){
			name=c;
	}
	
		void disp() {
			System.out.println(name);
		}
	}
	
public class Static_class {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Computer1 c[]=new Computer1[10];
			System.out.println("Enter the name:");
			for(int i=0;i<10;i++) {
				String st=sc.nextLine();
				c[i]=new Computer1(st);
			}
			for(int i=0;i<10;i++) {
				c[i].disp();
			}
			sc.close();
		
		}
		
	}


	

