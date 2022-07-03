
public class Employee2 {
	int emp_id,emp_salary;
	String emp_name;
public Employee2(int id,String name,int salary)
{
	this.emp_id=id;
	this.emp_name=name;
	this.emp_salary=salary;
}
@Override
public String toString() {
	return "Employee2 [emp_id=" + emp_id + ", emp_salary=" + emp_salary + ", emp_name=" + emp_name + "]";
}

}
