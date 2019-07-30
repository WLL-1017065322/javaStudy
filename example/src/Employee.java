import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	//构造器
	public Employee(String name) {
		this.name = name;
	}
	//	age
	public void empAge(int empAge) {
		age = empAge;
	}
	// designation
	public void empDesignation(String empDesig) {
		designation = empDesig;
	}
	//salary
	public void empSalary(double empSalary) {
		salary = empSalary;
	}
	public void printEmployee() {
		System.out.println("名字:"+ name);
		System.out.println("年龄:"+ age);
		System.out.println("职位:"+ designation);
		System.out.println("薪水:"+ salary);
		
	}
}
