package com.test3;

import com.test3.Employee;
import com.test3.Manager;

class Employee {
    String name;
    int salary;

    public String getEmployee() {
        return name + " " + salary;
    }

    public Employee() {}

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

}

class Manager extends Employee {
    String depart;

    @Override
    public String getEmployee() {
        // TODO Auto-generated method stub
        return super.getEmployee();
    }

//	@Override
//	public String getEmployee() {
//		//return name + " " + salary + " " + depart;
//		return super.getEmployee()+depart;
//	}//override

    public Manager(String name, int salary, String depart) {
        super(name, salary);
        this.depart = depart;
    }
}

public class Ex06_6 {

    public static void main(String[] args) {
        Employee e = new Employee("홍길동", 2000);
        Manager m = new Manager("이순신", 4000, "개발");
        System.out.println(e.getEmployee());
        System.out.println(m.getEmployee());
        System.out.println(m);	//m만 적어줘도 자동 toString이 붙는다.
        //똑같은 getEm
    }

}