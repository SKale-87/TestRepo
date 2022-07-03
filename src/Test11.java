
public class Test11 {
	
	int id;
	
	public Test11(int id)
	{
		this.id=id;
	}
	
	public Test11()
	{
		System.out.println("Hi");
	}

		
	public Test11 getEmployeeById() {

		int id = 10;
		return new Test11(id); 
	}

	
	
	public static void main(String[] args) {

		Test11 t = new Test11(20);
		Test11 t1=t.getEmployeeById();
		System.out.println(t.id);
	}


}
