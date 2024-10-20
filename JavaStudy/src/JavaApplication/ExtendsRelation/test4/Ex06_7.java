package com.test4;

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
class Manager extends Employee{
    String depart;

    @Override
    public String getEmployee() {
        return super.getEmployee()+ " " + depart;
    }

    public Manager(String name, int salary, String depart) {
        super(name, salary);
        this.depart = depart;
    }
}//end Manager

public class Ex06_7 {
    public static void main(String[] args) {
        Employee e = new Employee("홍길동", 2000);
        System.out.println(e.getEmployee());

        Employee e2 = new Employee("이순신", 4000);
        System.out.println(e2.getEmployee());
        // 1. 다형성 : 부모타입 변수에 자식객체 저장
        Manager m2 = new Manager("이순신", 4000, "개발");
        // 2. 다형성 변수의 경우 오버라이딩 된 함수 직접 사용 가능
        System.out.println(m2);	//m만 적어줘도 자동 toString이 붙는다.
        // 3. 자식의 유일변수, 유일 함수 사용시 형변환 후 사용
        Manager m1 = (Manager)m2;
        System.out.println(m2.name);
        System.out.println(m2.salary);
        System.out.println(m2.depart);
    }
}