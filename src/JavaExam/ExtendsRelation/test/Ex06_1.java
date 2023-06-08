package com.test;

class Employee{	//extends object
    String name;
    int salary;

    public String getEmployee() {
        return name + " " + salary;
    }

    public Employee() {
        super(); //object이 기본생성자 호출
        System.out.println("emp기본생성자 호출");
    }	//필수

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}//end class

class Manager extends Employee{
    String depart;

    public String getManager() {
        return name + " " + salary + " " + depart;
    }

    public Manager() {};

    public Manager(String name, int salary, String depart) {
        super();
        System.out.println("Manager 생성자 호출");
        this.name = name;
        this.salary = salary;
        this.depart = depart;
    }
}

public class Ex06_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee emp = new Employee("홍길동", 2000);
        Manager mng = new Manager("홍길동", 1000, "개발");
        System.out.println(emp.getEmployee());
        System.out.println(mng.getManager());
        System.out.println(mng.name);
    }

}