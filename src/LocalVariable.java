
public class LocalVariable {
	public static void main(String[] args)
	{
		int a=20; //Value is not initialized.
		int b=10; //Both variables stored in stack area. Not accessed outside the method
		System.out.println("The Value of Local a is, "+a);
		System.out.println("The Value of Local b is, "+b);
	}

}
