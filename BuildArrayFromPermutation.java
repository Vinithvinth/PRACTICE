package Array;

import java.util.Arrays;

/*https://leetcode.com/problems/build-array-from-permutation/solutions/3683553/1920-build-array-from-permutation-100-easy-java-code/*/
public class BuildArrayFromPermutation {

	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		int[] ans = search(nums);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] search(int[] nums) {
		        int[] arr = new int[nums.length];
		        for(int i =0; i<=arr.length-1;i++){
		            arr[i]=nums[nums[i]];
		           
		        }
		        return arr;
		    }
		}
