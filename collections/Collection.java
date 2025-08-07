//package collections;
//import java.util.*;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Stack;
//import java.util.Vector;
//public class Collection {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        List<Integer> li = new LinkedList<Integer>();
//        // converting array into list
//        for (int i : arr) {
//            li.add(i);
//        }
//        // converting list back to array
//        int[] brr = new int[li.size()];
//        int l = 0;
//        for (Integer k : li) {
//            brr[l] = k;  // use 'k' instead of li.get(l)
//            l++;
//        }
//        // print the array to check
//        for (int i : brr) {
//            System.out.print(i + " ");
//        }
//    }
//}



//
//package collections;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;
//public class Collection {
//  public static void main(String[] args) {
//	  Scanner sc=new Scanner(System.in);
//      Set<Integer> hs=new HashSet<>();
//      Set<Integer> lhs=new LinkedHashSet<>();
//      Set<Integer> ts=new TreeSet<>();
//      for(int i=0;i<10;i++) {
//          lhs.add(sc.nextInt());
//      }
//      System.out.println(lhs);   	  
//      }
//}


//package collections;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;
//
// public class Collection{
//	 public static void main(String[] args){
//		  Map<Integer,String> hm=new HashMap<>();
//		  Map<Integer,String> lhm=new LinkedHashMap<>();
//		  Map<Integer,String> tm=new TreeMap<>();
//		  
//		  hm.put(0,"hiiii");
//		  hm.put(1,"hiiiiiiiiiiiiiiiiiiiii");
//		  hm.put(0,"hiiii");
//		  hm.put(0,"hiiii");
//		  hm.put(0,"hiiii");
//		  hm.put(0,"hiiii");
//		  System.out.println(hm.get(1));
//	 }
// }


package collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class Collection{
	public static void main(String[] args) {
		LinkedList<Integer>li = new LinkedList<>();
		for(int i=0;i<10;i++) {
			li.add(i);
		}
		System.out.println(li);
		Iterator<Integer> j=li.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		for(Integer i:li) System.out.println(i);
	}
}

























