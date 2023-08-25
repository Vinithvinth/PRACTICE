package JavaT_pointArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateOfAnArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.print("enter the number of times to rotate= ");
		int n = scan.nextInt();
		int[] res = rightRotate(arr,n);
		System.out.println(Arrays.toString(res));

	}

	private static int[] rightRotate(int[] arr,int n) {
		
		for(int i=0;i<n;i++) {
			int temp = arr[arr.length-1];
			for(int j=arr.length-1;j>=1;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
		return arr;
	}

}
