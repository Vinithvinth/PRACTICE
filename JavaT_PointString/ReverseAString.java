package JavaT_PointString;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str =scan.nextLine();
		//by built in function
		StringBuilder st = new StringBuilder(str);
		st = st.reverse();
		System.out.println(st);
		
		//doing it manually
		String reverse = reverseString(str);
		
		System.out.println("reversed String is: "+reverse);
	}
 
	private static String reverseString(String str) {
		String reverse ="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
	}
	

}
