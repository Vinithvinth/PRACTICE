package Array;
import java.util.*;
public class ArrayList {

	public static void main(String[] args) {
		//syntax
		ArrayList list = new ArrayList();
          list.add("A");
         list.add(10);
         list.add("A");
         list.add(20.1);
         list.add(null);
		System.out.println(list);//[A,10,A,20.1,null]-->duplicates and heterogenous objects are allowed
	     list.remove(2);
	     System.out.println(list);
	     list.add(2,"M");
	     list.add("N");
	     System.out.println(list);
	}

	

}
