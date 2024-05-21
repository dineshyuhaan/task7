package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.setId(123);
		obj1.setName("Yuhaan");
		obj1.setSalary(50000);
		obj1.printName();
		obj1.printSalary();

	}

}
