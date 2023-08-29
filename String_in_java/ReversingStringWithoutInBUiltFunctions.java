package String_in_java;

import java.util.Scanner;

public class ReversingStringWithoutInBUiltFunctions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String revers = reverseString(str);
		System.out.println(revers);
		scan.close();

	}

	private static String reverseString(String str) {
		String reversed = "";
		for(int i=str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}
		return reversed;
	}

}
