package basics2;

import java.util.Scanner;
class Dept{
	int roll;
	String name;
	String dept;
	int age;
	Dept(){
		System.out.println("Empty");
	}
	Dept(int r,String n,String d,int a){
		roll=r;
		name=n;
		dept=d;
		age=a;
	}
	void disp() {
		System.out.println(roll+"\t"+name+"\t"+dept+"\t"+age);
	}
}

public class Oops {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dept db=new Dept(72,"Prasad","Cse",20);
		db.disp();
		
	}

}
