package com.srn1535.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String name;
	String address;
	int salary;
	public Employee(int empId, String name, String address, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}

public class Reduceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Simple reduce : START
		/*List<Integer> runs = new ArrayList<>();
		runs.add(45);
		runs.add(45);
		runs.add(45);
		int abc=15;
		int total = runs.stream().reduce(abc, (Integer a,Integer b)->a+b);
		System.out.println(total);*/
		// Simple reduce : END
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Gowri", "London",45000));
		empList.add(new Employee(2, "Deva", "Chennai",30000));
		empList.add(new Employee(3, "Vaishu", "USA",40000));
		empList.add(new Employee(3, "Vaishnavi", "USA",2000));
		
		int totalSalary = empList.stream().map(Employee::getSalary).reduce(0, (a,b)->a+b);
		System.out.println(totalSalary);
		
		List<Integer> salaryList = empList.stream().map(Employee::getSalary).collect(Collectors.toList());
		System.out.println(salaryList);
		
		// converting list to Map
		Map<Integer,String> empMap = empList.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getName,(a, b) -> b));
		System.out.println(empMap);
		
		
		
	}

}
