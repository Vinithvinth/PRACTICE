package Array;

import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
    	// Array  declaration
    	int[] arr;
    	//Array creation
    	System.out.println("enter the size of the Array");
    	arr = new int[sca.nextInt()];
    	//Array initialization
    	for(int i=0; i<arr.length;i++) {
    		System.out.println("enter the "+i+" element");
    		arr[i]=sca.nextInt();
    	}	
    	// Array traversing forward direction
    	int sum =0;
    	for(int j=0;j<arr.length;j++) {
    		sum+=arr[j];
    	}
    	System.out.println("the sum of the Array Elements= "+sum);
    	sca.close();
	}

}
