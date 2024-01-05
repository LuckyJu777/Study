package com.test2;

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


    //유일한 변수
    public String getManager() {
        return super.getEmployee()+ "\t "+depart;
    }//this.를 써도 문제 없다.
    public Manager(String name, int salary, String depart) {
        super(name, salary);
        this.depart = depart;
    }
}

public class Ex06_3 {

    public static void main(String[] args) {
        Employee e = new Employee("홍길동", 2000);
        Manager m = new Manager("이순신", 4000, "개발");
        System.out.println(e.getEmployee());
        System.out.println(m.getManager());

    }

}