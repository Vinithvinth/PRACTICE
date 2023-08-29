package JavaT_PointString;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		 String str = "KayaK";
		 str = str.toLowerCase();
		 String temp = str;
		 reverseString(str,temp);
   //another method(simple)
		 boolean ans = true;
		 for(int i =0;i<str.length()/2;i++) {
			 if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				 ans = false;
			 }
		 }
		 if(ans) {
			 System.out.println("String is Palindrome");
		 }else {
			 System.out.println("not a Palindrome");
		 }
	}

	private static void reverseString(String str, String temp) {
		StringBuffer s = new StringBuffer();
		for(int i = str.length()-1;i>=0;i--) {
			s.append(str.charAt(i));
		}
		String result = s.toString();
		if(result.equals(temp)) {
			System.out.println("given String is A Palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
	}

}
