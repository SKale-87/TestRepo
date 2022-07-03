import java.util.*;
public class Test {
	int reverse,digit;
	int sum=0;
	
	void armstrong(int no)
	{
		int number=no;
		while(no!=0)
		{
		reverse=no%10;
		no=no/10;		
		digit=reverse*reverse*reverse;
		sum=sum+digit;
		}
		if(sum==number)
		{
			System.out.println("Number is Armstrong");
		}
		
		else
			System.out.println("Number is not Armstrong");
	
	 }
	
	public static void main(String[] args)
	{
		Test test=new Test();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any Number: ");
        int number=scanner.nextInt();
	    test.armstrong(number);		
	}
	

}
