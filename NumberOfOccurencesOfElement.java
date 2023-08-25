package JavaT_pointArrays;

import java.util.Scanner;

public class NumberOfOccurencesOfElement {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int[] arr = {2, 3, 2, 5, 5, 3, 2, 2, 5, 6, 8, 9, 7};
		System.out.println("enter a number to check");
		int num = scan.nextInt();
		claculateOccurences(arr,num);

	}

	private static void claculateOccurences(int[] arr,int num) {
	 //Array fr will store frequencies of element 
		int[] fr = new int[arr.length];
		int visited =-1;
		for(int i =0;i<arr.length;i++) {
			int count =1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
			   //To avoid counting same element again 
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
			}
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=visited)
			System.out.println(arr[i] +" = "+fr[i]);
		}
		
	}

}
