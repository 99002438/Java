package training1;

import training1.Student;

public class Student{
	private String name;
	public String getName() {
		return name;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String city, Integer empId) {
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
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	private String city;
	private Integer empId;
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}

	

}
