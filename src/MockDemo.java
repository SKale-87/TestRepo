import java.util.ArrayList;

public class MockDemo {
public static void main(String[] args) {
	ArrayList<Employee2> arl=new ArrayList<Employee2>();
	arl.add(new Employee2(10,"Ajay",20000));
	arl.add(new Employee2(10,"Akshay",40000));
	arl.add(new Employee2(10,"Seema",30000));
	arl.add(new Employee2(10,"Sejal",25000));
	for(Employee2 e:arl)
	{
		System.out.print(e);
	}
}
}
