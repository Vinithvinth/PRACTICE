package JavaT_PointString;

import java.util.Arrays;

public class FrequencyOfACharecter {

	public static void main(String[] args) {
		 String str = "picture perfect askjfs kjbdfkl cjsbdfkjb";  
		 
		 //Converts given string into character array    
		 char[] string = str.toCharArray();
		 
		 System.out.println(Arrays.toString(string));
		 
		 for(int i =0;i<string.length;i++) {
			 int count =1;
			 for(int j =i+1;j<string.length;j++) {
				 if(string[i]==string[j] && string[i]!=' ') {
					 count++;
				   //Set string[j] to 0 to avoid printing visited character  
					 string[j]='0';
				 }
			 }
			 if(count>0 && string[i]!='0' && string[i]!=' ') {
			 System.out.println("frequency of "+string[i]+" = "+count);
			 }
		 }
	}

}
