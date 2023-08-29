package String_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	

	

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        
	        for(int i=1;i<=n;i++){
	          Scanner sca = new Scanner(System.in);
	          String str = sca.nextLine();
	        System.out.println(i+" " +str);
	        
	        }
	        
	        scan.close();
	      
	    }
	}
	
	
	


	/*public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first string to comapare:");
		String a = scan.nextLine();
		System.out.println("enter second string to compare:");
		String b = scan.nextLine();
		//Converting both the string to lower case. 
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		 //Checking for the length of strings  
		if(a.length()!=b.length()) {
			System.out.println("not a anagram");
			
		}else {
			
			//Converting both the arrays to character array  
			char[] a1=a.toCharArray();
			char[] b1=b.toCharArray();
			System.out.println(a1);
			System.out.println(b1);
			 //Sorting the arrays using in-built function sort ()
			Arrays.sort(a1);
			Arrays.sort(b1);
			//Comparing both the arrays using in-built function equals () 
            if(Arrays.equals(a1, b1)==true){
            	System.out.println("Anagram");
            }else {
            	System.out.println("not anagram");
            }
			
		}

	}

}*/
	
