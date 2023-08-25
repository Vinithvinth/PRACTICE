package Array;

import java.util.Scanner;

public class intArray {
    public static void main(String[]args) {
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
    	for(int j=0;j<arr.length;j++) {
    		System.out.print(" "+arr[j]);
    	}
    	System.out.println();
    	//Array traversing in backward direction
    	for(int k = arr.length-1;k>=0;k--) {
    		System.out.print(" "+arr[k]);
    	}
    	sca.close();
    	}
    	
    }

