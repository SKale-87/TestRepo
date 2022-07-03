
public class GlobalVariables {
	
	int a; //By default initialized to 0
	int b=10; //both variables stored in Heap Area and accessed within the class by creating class object
	
	public static void main(String[] args)
	{
		GlobalVariables globalvariables=new GlobalVariables();
		System.out.println("The Value of Global or Instance Variable a is, "+globalvariables.a);
		System.out.println("The Value of Global or Instance Variable b is, "+globalvariables.b);
		
	}

}


