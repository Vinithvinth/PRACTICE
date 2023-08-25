package Array;

public class StudentArrayApp {
	 
			public static void main(String[]args) {
				StudentArray s1 = new StudentArray("arun",10,98);
				System.out.println("name:"+s1.name +" rolno:"+s1.rolno);
				
				StudentArray s2 = new StudentArray("aman",11,88);
				System.out.println("name:"+s2.name +" rolno:"+s2.rolno);
				
				//we are creating an array which can hold students references
				StudentArray students[]= new StudentArray[2];
				students[0]=s1;
				students[1]=s2;
				
				
//				for(int i=0;i<students.length;i++) {
//					System.out.println(students[i].name+" "+students[i].rolno);
					
		//enhanced for loop		
				for(StudentArray stud: students){
						System.out.println(stud.name+": "+stud.rolno);
				}
			}
		}



