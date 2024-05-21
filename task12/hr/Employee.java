package com.example.hr;

public class Employee {
	public String name;
	public int id;
	public double salary;
	public void printName() {
		System.out.println(getName());
		
	}
	public void printSalary() {
		System.out.println(getSalary());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
