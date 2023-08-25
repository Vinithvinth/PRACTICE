package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = {{2, 3, 4, 5},{4, 5, 7, 12}};
		int[][] brr = {{21, 32, 40, 7},{11, 15, 7, 2}};

		 int[][] sum = calculateSumOfTwoDimentionalArray(arr,brr);
		 //printing in enhanced for loop
		 for(int[] s : sum) {
			 System.out.println(Arrays.toString(s));
		 }
		 //printing with normal for loop
		 for(int i =0;i<arr.length;i++) {//we can any arr or brr.length no issue in it
			 for(int j =0;j<arr[i].length;j++) {
				 System.out.println(sum[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

	private static int[][] calculateSumOfTwoDimentionalArray(int[][] arr, int[][] brr) {
		  int[][] crr = new int[arr.length][arr[0].length];
		
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr[i].length;j++) {
				  crr[i][j]= arr[i][j]+brr[i][j];
			  }
			  
		  }
		return crr;
		
	}

}
