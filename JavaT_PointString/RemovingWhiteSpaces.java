package JavaT_PointString;

public class RemovingWhiteSpaces {
	  public static void main(String[] args) {    
          
	        String str1="Remove white spaces";    
	            
	        //Removes the white spaces using regex    
	        str1 = str1.replaceAll("\\s+", "");  
/*In the regular expression pattern "\\s+":
\\s represents a white space character (including spaces, tabs, and newlines).
+ indicates that one or more occurrences of the white space character should be matched.
The second argument, "", is an empty string. This means that every occurrence of one or 
more white space characters will be replaced with nothing (removed)*/
	            
	        System.out.println("String after removing all the white spaces : " + str1); 
	        
	        
	        //doing it manually
	        StringBuffer s = new StringBuffer();
	        	for(int j=0;j<str1.length();j++) {
	        		if(str1.charAt(j)!=' ') {
	        			s.append(str1.charAt(j));	        			
	        		}
	        	}
	        	System.out.println(s);
	        }
	    }    

