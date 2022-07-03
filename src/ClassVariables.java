
public class ClassVariables {
	
	int y=25; // defining global variable y with value 25
	
	
	public static void main(String[] args)
	{
		char firstletter='S'; //storing first letter of name
		int x; //declaring int type local variable
		x=50; //defining local variable with the value 50	
		ClassVariables classvariables=new ClassVariables();
		System.out.println("My Name starts with the letter '"+firstletter+"'");
		System.out.println("Value of Local Variable x= "+x);//Printing local variable value
		System.out.println("Value of Local Variable y= "+classvariables.y);//Printing global variable value
		
	}

}
