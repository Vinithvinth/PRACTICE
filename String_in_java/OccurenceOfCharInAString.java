package String_in_java;

public class OccurenceOfCharInAString {

	public static void main(String[] args) {
		String str = "Vinith";
	    calculateOccurence(str);

	}

	private static void calculateOccurence(String str) {
		for(int i=0;i<str.length();i++) {
			  int count =0;
		  for(int j=0; j<str.length();j++) {
			  if(str.charAt(i)==str.charAt(j)) {
				count++;
			  }
		  }
		  System.out.println(str.charAt(i)+"= "+count+ " Occurences");
		}
	}

}
