package Array;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,};
		System.out.println(Arrays.toString(num));
		change(num);
         System.out.println(Arrays.toString(num));
	}

	public static void change(int[] num) {
		num[0]=99;
		
	}

}
