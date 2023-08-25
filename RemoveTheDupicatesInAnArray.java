package JavaT_pointArrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveTheDupicatesInAnArray {
	    public static void main (String[] args) {  
	        int arr[] = {1, 2, 1, 3, 4, 5, 3, 5, 2};  
	        System.out.println(Arrays.toString(removeDuplicateElements(arr)));  
	    }
	    public static int[] removeDuplicateElements(int arr[]){  
	       HashSet<Integer> uniqueSet = new HashSet<>();
	        for(int i : arr) {
	        	uniqueSet.add(i);
	        }
	        int[] newArray = new int[uniqueSet.size()];
	        int i =0;
	        for(int m : uniqueSet) {
	        	  newArray[i]=m;
	        	  i++;
	          }
	        return newArray;
	    }  
	}  
