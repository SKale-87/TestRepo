package comparator;

import java.util.Comparator;

public class ComparatorFunction implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		return stud1.name.compareTo(stud2.name);
	}

}
