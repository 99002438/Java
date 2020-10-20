package training;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1=new Student("Abir","Mumbai",1);
		Student stud2=new Student("Mohan","Indore",2);
		Student stud3=new Student("Dev","Delhi",3);
		Student stud4=new Student("Arjun","Bangalore",4);
		Student stud5=new Student("Anant","Kolkata",5);
		
		ArrayList<Student> studList=new ArrayList<>();
		studList.add(stud1);
		studList.add(stud2);
		studList.add(stud3);
		studList.add(stud4);
		studList.add(stud5);
		for(Student student:studList) {
			System.out.println(student);
		}
		Collections.sort(studList);
		System.out.println("sorted list");
		for(Student student:studList) {
			System.out.println(student);
		}

	}

}
