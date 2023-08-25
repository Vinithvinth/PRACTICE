package Array;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrayPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	//Array declaration And creation
	System.out.print("Enter the Number of Batches= ");
	String[][] arr=new String[scan.nextInt()][]; //base size is mandatory here(arrays are the fixed size)
	for(int i=0;i<arr.length;i++) {
	System.out.println("A"+(i+1)+" batch Friends size");
	 arr[i]=new String[scan.nextInt()];
	}
//	 System.out.println("A2 batch Friends size");
//	 arr[1]=new String[scan.nextInt()];
//	 System.out.println("A3 batch Friends size");
//	 arr[2]=new String[scan.nextInt()];
//	 System.out.println("A4 batch Friends size");
//	 arr[a]=new String[scan.nextInt()];

	 //Array initialization
	 //manually 
//	 arr[0][0]="Vinith";
//	 arr[0][1]="Aasha";
//	 arr[0][2]="Arjun";
//	 arr[1][0]="Kamal";
//	 arr[1][1]="Shantha";
//	 arr[1][2]="Rocky";
//	 arr[1][3]="Vijay";
//	 arr[2][0]="Dhanush";
//	 arr[2][1]="Ambani";
//	 arr[3][0]="Mukesh";
	 
	 //initializing using for loop
	 for(int i=0;i<=arr.length-1;i++) {
		 System.out.println("A"+(i+1)+" batch ");
		 System.out.println("I Have "+arr[i].length+" Friends");
			for(int j=0;j<arr[i].length;j++) {
		System.out.print("Enter "+(j+1)+" Friend Name=");	
				arr[i][j]=scan.next();
			}
	 }
	 System.out.println("*************************************");
	 //Array traversing
	for(int row=0;row<=arr.length-1;row++) {
		System.out.print("A"+(row+1)+": batch Friends Are: ");
		for(int col=0;col<arr[row].length;col++) {
			System.out.print(arr[row][col]+" ");
		}
		System.out.println();
	}
   /*	System.out.println("**********************************");
	 //enhanced for loop
	 for(String[] str:arr) {
		 System.out.println(Arrays.toString(str));
	 }
	 System.out.println("***********************************");
    //enhanced for loop
	for (String n[]:arr) {
        for(String m:n) {
	       System.out.print(m+" ");
   }
     System.out.println();
}*/
}
}
