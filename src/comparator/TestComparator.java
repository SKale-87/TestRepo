package comparator;

import java.util.*;

public class TestComparator {
	public static void main(String[] args) {
		ArrayList<Student> stud=new ArrayList<Student>();
		stud.add(new Student(10,"Shilpa",78));
		stud.add(new Student(21,"Pravin",88));
		stud.add(new Student(13,"Krishna",80));
	
	Collections.sort(stud,new ComparatorFunction());
	System.out.println(stud);
	}
}
