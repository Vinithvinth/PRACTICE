package Array;

import java.util.Scanner;

public class FindTheTargetElement {

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
    	int target=22;
    	int result = searchElement(arr,target);
    	
    	if(result==-1) {
    		System.out.println("the targeted element is not found in the Array");
    	}else {
    		System.out.println("the targeted element found at "+result+" index");
    	}
    	}

	private static int searchElement(int[] arr, int target) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
