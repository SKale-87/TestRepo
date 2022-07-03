
public class PassingVal {
	static String studName(String name)
	{
		return name;
	}
	public static void main(String[] args)
	{
		String str;
		str=studName("Shilpa");
		System.out.println("Student name is "+str);
		
	}

}
