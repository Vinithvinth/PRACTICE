package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 1 2 3
		 4 5 6
		 7 8 9  
		 */
        int[][] arr = new int[3][4];
        System.out.println(arr.length);
//		
//		int[][] arr = {
//				{12,3,4,},
//				{2,7,4,},
//				{72,3,4,},
//		  };
        //input
		for (int row = 0;row<arr.length;row++) {
			//fro each cloumn in every row
			for (int col = 0; col<arr[row].length;col++) {
				arr[row][col]=in.nextInt();
			}
		}
		//output
//		for (int row = 0;row<arr.length;row++) {
//			
//			for (int col = 0; col<arr[row].length;col++) {
//				System.out.print(arr[row][col]+" ");
//		}
//			System.out.println();
			//or
//			for (int row = 0;row<arr.length;row++) {
//				
//				System.out.println(Arrays.toString(arr[row]));
//			}
//			
		
		//enhanced for loop (easy) just mention the datatype and variable inside the loop
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
	}
	}




