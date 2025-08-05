//package string;
//public class String_9 {
    //public static void main(String[] args) {
      //  String text = "hello";
        //String swappedText = swapFirstAndLast(text);
        //System.out.println("Swapped string: " + swappedText);
    //}
    //public static String swapFirstAndLast(String text) {
      //  if (text == null || text.length() <= 1) {
        //    return text;
        //}
        //char[] chars = text.toCharArray();
        //char temp = chars[0];
        //chars[0] = chars[chars.length - 1];
        //chars[chars.length - 1] = temp;
        //return new String(chars);
   // }
//}


//REMOVE THE DUPLICATES FROM A STRING
//package string;
//public class String_9{
//     static String removeDuplicates(String s) {
//    	 String s1="";
//    	 for(int i=0;i<s.length();i++) {
//    		 if(!(s1.contains(s.charAt(i)+""))) {
//    			 s1+=s.charAt(i);
//    		 }
//    	 }
//    	 return s1;
//     }
//	 public static void main(String[] args) {
//		 String s="Hello World";
//		 String st=removeDuplicates(s);
//		 System.out.println(st);
//	 }
//}


//PRINT COUNT OF OCCURENCE OF CHARACTERS IN GIVEN STRING
package string;
import java.util.Scanner;
public class String_9{
	static void occurenceOfCharacters(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
			if(str.indexOf(s.charAt(i))==-1){
				str=str+s.charAt(i);
				int c=1;
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)){
						c++;
					}
				}
				System.out.println(s.charAt(i)+"  : "+c);
			}
		}
	}
	public static void main(String[] args) {
		String s = "Hello world";
		occurenceOfCharacters(s);
	}
}