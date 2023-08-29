package String_in_java;

import java.util.Scanner;

public class Devideni_string_into_n_parts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write something to devide into parts");
		String s = scan.nextLine();
		System.out.println("enter the number of parts required");
		int n = scan.nextInt();
		int partlength =s.length()/n;
		if(s.length()%n!=0) {
			System.out.println("string cant be devided int "+n+"parts");
		    return;
		}
			
			String[] part = new String[n];
			for(int i=0;i<n;i++) {
				int startIndex = i*partlength;
				int endIndex = startIndex+partlength;
				part[i] = s.substring(startIndex, endIndex);
				
			}
			for(String ans:part) {
				System.out.println(ans);
			}
		}
	}

		        
		

