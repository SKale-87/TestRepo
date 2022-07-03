import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;

public class Employee1 implements Comparable<Employee1>{
int id;
String name;
int salary;
public Employee1(int id,String name,int salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public int compareTo(Employee1 employee) {
	//equal must return 0, > return 1, < return -1
	if (salary == employee.salary)
		return 0; 
	else if (salary > employee.salary)
		return 1;
	else
		return -1;	
}

@Override
public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public static void main(String[] args) {
	ArrayList<Employee1> arl=new ArrayList<Employee1>();
	arl.add(new Employee1(201,"Pravin",5500));
	arl.add(new Employee1(501,"Shilpa",7500));
	arl.add(new Employee1(101,"Krishna",9500));
	Collections.sort(arl);
	System.out.println(arl);
}

}
