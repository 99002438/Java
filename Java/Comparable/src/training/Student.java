package training;

public class Student implements Comparable<Student>{
	private String name;
	public String getName() {
		return name;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String city, int empId) {
		super();
		this.name = name;
		this.city = city;
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	private String city;
	private int empId;
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}

	@Override
	public int compareTo(Student ex) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(ex.getName());
	}
	

}
