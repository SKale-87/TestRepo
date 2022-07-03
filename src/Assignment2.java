
public class Assignment2 {
	
	int y=25; // defining global variable y with value 25
	
	
	public static void main(String[] args)
	{
		char firstletter='S'; //storing first letter of name
		int x; //declaring int type local variable
		x=50; //defining local variable with the value 50	
		Assignment2 assignment=new Assignment2();
		System.out.println("My Name starts with the letter '"+firstletter+"'");//Printing first character of name
		System.out.println("Value of Local Variable x= "+x);//Printing local variable value
		System.out.println("Value of Local Variable y= "+assignment.y);//Printing global variable value
	}

}