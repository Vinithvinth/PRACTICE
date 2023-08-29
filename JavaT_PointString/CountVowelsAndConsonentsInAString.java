package JavaT_PointString;

public class CountVowelsAndConsonentsInAString {

	public static void main(String[] args) {
		String name = "Vinith Kumar";
		name = name.toLowerCase();
		countVowelConsonent(name);
	}

	private static void countVowelConsonent(String str) {
		int vowel =0;
		int consonent =0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowel++;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				consonent++;
			}
		}
		System.out.println("NUmber of vowels in the string is "+vowel);
		System.out.println("NUmber of consonent in the string is "+consonent);
	}

}
