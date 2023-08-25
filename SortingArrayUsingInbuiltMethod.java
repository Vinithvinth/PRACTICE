package JavaT_pointArrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArrayUsingInbuiltMethod {

	public static void main(String[] args) {
		String[] brr = { "banana", "apple", "grape", "orange", "kiwi" };
		int[] arr = {0, 88, 30, 89, 50, 60};
		
		
  //sorting in ascending order
		Arrays.sort(arr);
		System.out.println("ascending order Array: "+Arrays.toString(arr));
		
  //sorting in descending order
  //if you do Array.-->you will get the options there you can choose
		//this is for descending order of string values
		Arrays.sort(brr, Comparator.reverseOrder());
		System.out.println("descending order String Array: "+Arrays.toString(brr));
		//String ascending order
		Arrays.sort(brr);
		System.out.println("ascending order string Array "+Arrays.toString(brr));
		
	}

}
