package JavaT_PointString;

public class AnagramOfStrings {

	public static void main(String[] args) {
		String str1 = "sglm";
		String str2 = "mlgs";
		
		boolean b = checkAnagram(str1,str2);
		if(b) {
			System.out.println("given strings are anagram ");
		}else {
			System.out.println("given strings are not anagram ");
		}
	}

	private static boolean checkAnagram(String str1, String str2) {
		int count =0;
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i =0;i<str1.length();i++) {
			for(int j =0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					count++;
				}
			}
		}
		if(str1.length()==count) {
			return true;
		}else {
			return false;
		}
	}

}
