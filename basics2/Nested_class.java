package basics2;

import java.util.Scanner;
class Computer{
	Computer(){
		System.out.println("Computer created");
	}
	class CA{
		int roll;
		String name;
		long ph_no;
		int str;
		CA(){
			
		}
		CA(int r,String n,long ph,int s){
			roll=r;
			name=n;
			ph_no=ph;
			str=s;
		}
		void disp() {
			System.out.println(roll+"\t"+name+"\t"+ph_no+"\t"+str);
		}
	}
	class CB{
		int roll;
		String name;
		long ph_no;
		int str;
		CB(){
		
		}
		CB(int r,String n,long ph,int s){
			roll=r;
			name=n;
			ph_no=ph;
			str=s;
		}
		void disp() {
			System.out.println(roll+"\t"+name+"\t"+ph_no+"\t"+str);
		}
}
}

public class Nested_class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Computer co=new Computer();
		Computer.CA ca=co.new CA (72,"Ram",9874561230l,60);
		ca.disp();
		Computer.CB cb=co.new CB (12,"Abi",9321457830l,50);
		cb.disp();
	}
	
}

