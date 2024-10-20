package Test;

import java.util.ArrayList;

public class EmployeeList{
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Moon"+"heechan"));
		emps.add(new Employee("jung"+"jihun"));
		emps.add(new Employee("lee"+"byunghun"));
		System.out.println(emps);
	}
	
	class Address{
		
	}
	
	class Employee{
		private String lastName;
		private String firstName;
		private Double salray;
		private Address address;
		
		Employee(String lastName, String firstName){
			this.lastName = lastName;
			this.firstName = firstName;
			this.address = new Address();
		}
		
	public String getLstName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFisrstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Double getSalry() {
		return salary;
	}
	
	public void setSalaray(Double salary) {
		this.salray = salary;
	}
	
	}
}