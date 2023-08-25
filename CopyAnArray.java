package JavaT_pointArrays;

import java.util.Arrays;

public class CopyAnArray {

	public static void main(String[] args) {
          int[] arr = {12,32,43,45,34};
          
          //using normal for loop
          int[] copyarr = new int[arr.length];
          for(int i=0;i<arr.length;i++) {
        	  copyarr[i] = arr[i];
          }
          System.out.println("copyarr"+Arrays.toString(copyarr));
          //using System.arraycopy() method
          int[] copyarr2 = new int[arr.length];
          System.arraycopy(arr,0,copyarr2,0,arr.length);
          System.out.println("copyarr2"+Arrays.toString(copyarr2));
          //using Arrays.copyOf() method
          int[] copyarr3 =  Arrays.copyOf(arr,arr.length);
          System.out.println("copyarr3"+Arrays.toString(copyarr3));
          
	}

}
