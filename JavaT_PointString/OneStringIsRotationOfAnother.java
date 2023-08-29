package JavaT_PointString;

public class OneStringIsRotationOfAnother {

	public static void main(String[] args) {
		 String str1 = "abcde", str2 = "deabc";    
		 
		 if(str1.length()!=str2.length()) {
			 System.out.println("string 2 is not a rotation of string1");
		 }else {
		//Concatenate str1 with str1 and store it in str1 (this is the inbuilt method)   
			 str1 = str1.concat(str1);
		 }
/*
 ---> The indexOf() method in JavaScript is used to find the index of the first occurrence 
 of a substring within a string. If the substring is found, indexOf() returns the 
 index of the first character of the substring in the original string.
 If the substring is not found, it returns -1.

  --->So, the condition str1.indexOf(str2) != -1 is checking whether str2 is a substring of 
  str1. If str2 is indeed a substring of str1, the code block inside the if statement 
  will be executed.
 
 */
		 if(str1.indexOf(str2)!=-1) {
			 System.out.println("str2 is the rotation of str1");
			 
		 }else {
			 System.out.println("str2 is not the rotation of str1");
		 }
	}

}
