package Array;

import java.util.Arrays;

/*https://leetcode.com/problems/concatenation-of-array/*/
public class oncatinationOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] ans = Solution(arr);
         System.out.println(Arrays.toString(ans));
         //using enhanced for loop
         for(int i : ans) {
        	 System.out.print(i+" ");
         }
	}

	private static int[] Solution(int[] arr) {

	        int[] result = new int[arr.length * 2];
	        
	        //doing it using inbuilt function
	        
	        //here we are copying the array from arr indext 0 to result indext 0,upto arr.length
	        System.arraycopy(arr,0,result,0,arr.length);
	        //here we are copying the array from arr indext 0 to result indext arr.length,upto arr.length
	        System.arraycopy(arr,0,result,arr.length,arr.length);

	        
	        //doing it manually
	        int temp = 0;
	        for(int i=0;i<arr.length*2;i++) {
	        	
	        	if(i<arr.length) {
	        	result[i]=arr[i];
	        	}else {
	        		result[i]=arr[temp];
	        		temp++;
	        	}
	        }
	        return result;
	    }
	
	}

