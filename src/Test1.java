import java.util.Scanner;

public class Test1 {
	
	void primeNumber(int no)
	{
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				if(i==1 || i==no)
					System.out.println("The number is prime");
				
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Test1 test1=new Test1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any Number: ");
        int number=scanner.nextInt();
	    test1.primeNumber(number);		

	}
}