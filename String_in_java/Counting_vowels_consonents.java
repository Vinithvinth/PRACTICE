package String_in_java;

import java.util.Scanner;

public class Counting_vowels_consonents {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write something");
        String str = scan.nextLine();
        int count=0;
        int ans =0;
        for (int i=0;i<str.length();i++) {
        
        	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
        		count++;
        	}else {
        		ans++;
        	}
        }
        System.out.println("the number of vowels: " +count);
        System.out.println("the number of consonents: "+ans);
	}

}
