
public class NestedClass {
	
	String stud_name="Shilpa";
	String stud_class="BE Computer";
	
	public class InnerClass
	{
	    int passout_year=2011;
		double per=63.33;
		double getStudData()
		{
			return per;
			//System.out.println("Student Name is: "+per);
		}
	}	
	
	public static void main(String[] args)
	{
		NestedClass stud=new NestedClass();
		//InnerClass stud11=new InnerClass();
		//double per11=getStudData();				
		System.out.println("Student Name is: "+stud.stud_name);
		System.out.println("Student Class is: "+stud.stud_class);
		
	}
	
	
	
}

	
	
	


