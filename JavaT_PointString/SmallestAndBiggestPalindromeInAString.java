package JavaT_PointString;

public class SmallestAndBiggestPalindromeInAString {

	public static void main(String[] args) {
		 String string = "Wow you own kayak wow ";
		string = string.toLowerCase();
		 findPalindrome(string);
	}

	private static void findPalindrome(String str) {
		
		String word[] = str.split(" ");
		String temp = "";
		int c1 =0;
		int c2 =word.length;
		String s1 ="";
		String s2 ="";
		for(int i =0;i<word.length;i++) {
			temp ="";
			int count = 0;
			for(int j = word[i].length()-1;j>=0;j--) {
				 temp+=word[i].charAt(j);
				 count++;
			}
			if(word[i].equals(temp) && count>c1) {
				c1 =count;
				s1 = temp;
			}
			if(word[i].equals(temp) && count<c2) {
				c2 =count;
				s2 = temp;
			} 
		}
		System.out.println("largest palindrome = "+s1);
		System.out.println("Smallest Palindrome = "+s2);
	}
}
