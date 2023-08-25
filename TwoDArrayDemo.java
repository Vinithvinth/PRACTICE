package Array;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of students:");
		int size1 = scan.nextInt();
		System.out.println("Enter the number of Subjects: ");
		int size2 = scan.nextInt();
		//declaration and creation of 2D Array
		int[][] arr = new int[size1][size2];
		
		//Initialization of Array
		for(int i =0;i<size1;i++) {
			System.out.println("Student "+(i+1)+"data:");
			for(int j=0;j<size2;j++) {
				System.out.print("Subject "+(j+1)+"Marks= ");
				arr[i][j]=scan.nextInt();
				
			}
			System.out.println();
		}
      System.out.println("***********************************************");
	  //Array traversing
      for(int i =0;i<arr.length;i++) {
    	  System.out.println("Student "+(i+1)+"Data: ");
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.println("Subject "+(j+1)+"Marks= "+arr[i][j]);
    		  
    	  }
      }
	}

}
