package JavaT_PointString;

public class LargestAndSmallestWordInAString {

	public static void main(String[] args) {
		  String string = "Hardships often prepare ordinary a people for an extraordinary destiny";  
		  
		  findLargestAndSmallestWord(string);
	}

	private static void findLargestAndSmallestWord(String str) {
 //create an array to split the word by space and store in it
		String word[] = str.split(" ");
		int temp =0;
		int temp1 =word.length;
		String ans =" ";
		String ans1 = " ";
//traversing through the every word
		for(int i =0;i<word.length;i++) {
			int count =0;
//traversing through the every character of that word
			for(int j =0;j<word[i].length();j++){
				count++;
			}
//if the count is maximum then that is the largest word so print it
			if(count>temp) {
				temp = count;
				ans = word[i];
			}
//if the count is minimum the that is the smallest word so print it
			if(count<temp1) {
				temp1 = count;
				ans1 = word[i];
			}
		}
		System.out.println("Largest word in a string is: "+ans);
		System.out.println("smallest word in the string is: "+ans1);
	}

}
