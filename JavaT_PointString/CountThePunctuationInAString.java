package JavaT_PointString;

public class CountThePunctuationInAString {

	public static void main(String[] args) {
		String str = "^&$**& sdfkjb &$^&* oihdsfb";
		
		int c =countPunctuations(str);
		System.out.println("the total number of punctuation in a String is "+c);
	}

	private static int countPunctuations(String str) {
		int count =0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='!'||str.charAt(i)=='@'||str.charAt(i)=='#'||str.charAt(i)=='$'||str.charAt(i)=='%'||str.charAt(i)=='^'||str.charAt(i)=='&') {
				count++;
			}
		}
		return count;
	}

}
