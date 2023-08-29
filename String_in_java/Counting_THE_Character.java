package String_in_java;

import java.util.Scanner;

public class Counting_THE_Character {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String name = scan.nextLine();
//		int count = 0;
//		for(int i = 0; i < name.length(); i++) {    
//            if(name.charAt(i) != ' ')    
//                count++;    
//		}
//		System.out.println(count);
	
// counting digits in two string

//String s = "Vinith";
//String n = "Kumar";
//String f = "CK";
//int s1=0;
//int n1=0;
//int f1=0;
//for(int j = 0; j < s.length(); j++) {    
//    if(s.charAt(j) != ' ')    
//        s1++; 
//	}
//for(int l= 0; l < n.length(); l++) {    
//    if(n.charAt(l) != ' ')    
//        n1++; 
//	}
//for(int k = 0; k < f.length(); k++) {    
//    if(f.charAt(k) != ' ')    
//        f1++; 
//	}
//System.out.println(s1+n1+f1);


// counting the no of puncutations
System.out.println("Write Something");
   String pun = scan.nextLine();
   int ans = 0;
   for(int a =0; a<pun.length();a++) {
	   if( pun.charAt(a)== '!' || pun.charAt(a)== ',' ||pun.charAt(a)== '.' ||pun.charAt(a)== '/' ||pun.charAt(a)== '$' ||pun.charAt(a)== '#' ||pun.charAt(a)== '$' ||pun.charAt(a)== '%' ||pun.charAt(a)== '^' ||pun.charAt(a)== '&' ||pun.charAt(a)== '[' ) {
			   ans++;
   }
   

       


	}
   System.out.print(ans);
}
}
