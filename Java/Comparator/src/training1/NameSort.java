package training1;

import java.util.Comparator;

public class NameSort implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		// TODO Auto-generated method stub
		return stud1.getName().compareTo(stud2.getName());
	}
	

}
