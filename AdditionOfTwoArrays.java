package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//creating and initializing two arrays(this is one D Array)
		int[] arr = {0, 20, 30, 40, 50, 60};
		int[] brr= {2, 4, 5, 6, 7, 8};
		
		//CReating 2DArray by User
		int[][] arr2 = new int[2][2];
		int[][] brr1 = new int[arr2.length][arr2[0].length];
		
		for(int i=0;i<arr2.length;i++) {
			for(int j =0;j<arr2[i].length;j++) {
				arr2[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			for(int j =0;j<arr2[i].length;j++) {
				brr1[i][j]=scan.nextInt();
			}
		}
		//calling function to calculate sum of 2D array
		 calculateSumOfTwoDArray(arr2,brr1);
		
		
//		System.out.println(Arrays.toString(sum1));
		
		
		
		
		
		
		//calling the function for addition
		int[] sum = calculateSum(arr,brr);
		int[] product = calculateProduct(arr,brr);
		double[] div = calculateDivition(arr,brr);
		int[] subtn = calculateSubtraction(arr,brr);
		//printing the array values
		System.out.println("Addition of two Arrays:");
        System.out.println(Arrays.toString(sum));
        System.out.println("multiplication of two Arrays:");
        System.out.println(Arrays.toString(product ));
        System.out.println("Division of two Arrays: ");
        System.out.println(Arrays.toString(div));
        System.out.println("Substraction of two Arrays:");
        System.out.println(Arrays.toString(subtn));
	}

	private static void calculateSumOfTwoDArray(int[][] arr2, int[][] brr1) {
		int[][] crr1 = new int[arr2.length][arr2[0].length];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
			crr1[i][j]=arr2[i][j]+brr1[i][j];
		}
		}
		System.out.println("sum of 2D Array");
//		for(int i =0;i<arr2.length;i++) {
//			for(int j=0;j<arr2[0].length;j++) {
//				System.out.print(crr1[i][j]+" ");
//			}
//		}
//		System.out.println(Arrays.toString(crr1));
		//printing with enhanced for loop
		for(int[] a:crr1) {
			System.out.println(Arrays.toString(a));
		}
	}

	private static int[] calculateSubtraction(int[] arr, int[] brr) {
		//creating new array to store the subtraction values
				int[] crr = new int[arr.length];
				//running the loop to calculate the sum
				for(int i=0;i<arr.length;i++) {
					crr[i]=arr[i]-brr[i];
				}
				return crr;
	}

	private static double[] calculateDivition(int[] arr, int[] brr) {
		//creating new array to store the division values
				double[] crr = new double[arr.length];
				//running the loop to calculate the sum
				for(int i=0;i<arr.length;i++) {
					crr[i]=arr[i]/brr[i];
				}
				return crr;
	}

	private static int[] calculateProduct(int[] arr, int[] brr) {
		//creating new array to store the product values
				int[] crr = new int[arr.length];
				//running the loop to calculate the sum
				for(int i=0;i<arr.length;i++) {
					crr[i]=arr[i]*brr[i];
				}
				return crr;
	}

	private static int[] calculateSum(int[] arr, int[] brr) {
		//creating new array to store the addition values
		int[] crr = new int[arr.length];
		//running the loop to calculate the sum
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i]+brr[i];
		}
		return crr;
	}

}
