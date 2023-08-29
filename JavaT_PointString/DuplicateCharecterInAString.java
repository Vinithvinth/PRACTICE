package JavaT_PointString;

import java.util.Arrays;

public class DuplicateCharecterInAString {

	public static void main(String[] args) {
		String str = "jkbfiuzmbcisabkjzk";
		
		findDuplicateCharecter(str);
		
	}

	private static void findDuplicateCharecter(String str) {
	//create an array to make repeated elements as zero
		char[] string = str.toCharArray();
		System.out.println(Arrays.toString(string));
		
		System.out.println("Duplicate Charecyter are: ");
		
		for(int i =0;i<str.length();i++) {
			int count = 1;
			for(int j =i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' ') {
					count++;
		 //Set string[j] to 0 to avoid printing visited character
					string[j]=0;
//to not to print the same char again i am creating one array and making that char as '0'
//so that i can print it only once (excluding zero)
				}
			}
	//A character is considered as duplicate if count is greater than 1 
			if(count>1 && string[i]!=0) {
				System.out.print(str.charAt(i)+" ");
			}
			
		}
		
	}

}
