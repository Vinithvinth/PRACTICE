package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int[] num = new int[5];
	    
	    for (int i=0;i<num.length;i++) {
	    	num[i]=in.nextInt();
	    
    }
	    //one way of printing
	    
//	    for (int i=0;i<num.length;i++) {
//	    	System.out.println(num[i]);
//	    }
	    
	    
	    //best way of printing
	    
	    System.out.println(Arrays.toString(num));//internally its using for loop only
	    
	    
	    // enhanced for loop other way of printing
	    
//	    for (int j:num) {//for every element in array print the element
//	    	System.out.print(j+" ");//here i represents the element of the array
//	    }
	    
	    
	}

	}

