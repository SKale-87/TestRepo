
public class Assignment3 
{
	String getStudentName(String name)//defining non-static method
	{
		return name;	//returns a value
	}
	
public static void main(String[] args)
{
		
   Assignment3 assignment3=new Assignment3();//creating object of a class to access the non-static method
   String stud_name;//variable to save the value returned by the function
   stud_name=assignment3.getStudentName("Shilpa");//calling function  
   System.out.println("Student name is: "+stud_name);//Printing returned value of function

}

}
