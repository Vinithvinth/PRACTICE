package JavaT_pointArrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateOfTheElementInAnArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6};
		//numbers of times i want to rotate
		System.out.println("enter th enumber of times to rotate");
		int N = scan.nextInt();
		leftRotate(arr,N);

	}

	private static void leftRotate(int[] arr,int N) {

		for(int i=0;i<N;i++) {
			
	//storing the first value here so that i can assign it to the last
			int first = arr[0];
	//declaring j here bcz i am accessing j value outside the loop
			int j;
	//length should be length-1, bcz if it goes to last element i wants to assign
	//the next element value next to the last element	so it gives Array Index out
	//of bound Error	
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
