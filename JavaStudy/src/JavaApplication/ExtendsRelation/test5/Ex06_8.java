package com.test5;

class Employee {
    public Employee() {
        System.out.println("Employee 호출");
    }

    String name;

    public void print() {
        System.out.println(this.name);
    }
}// class

class Manager extends Employee {
    String depart;

    @Override
    public void print() {
        System.out.println(this.name + "\t" + this.depart);
    }

}// class

class Engineer extends Employee {
    String address;

    @Override
    public void print() {
        System.out.println("출력 : " + this.name + "\t" + this.address);
    }
}// class

class Tax {
    public Employee getTax() {	//다형성 리턴
        return new Employee();
//		return new Manager();
//		return new Engineer();
//		return new Object();
    }

    public void taxRate(Employee emp) {
        if (emp instanceof Manager) {
            System.out.println("Manager 객체");
            Manager m = (Manager) emp;
        } else if (emp instanceof Engineer) {
            System.out.println("Engineer 객체");
            Engineer egn = (Engineer) emp;
        } else if (emp instanceof Employee) {
            System.out.println("Employee 객체");
        }

        /*
         * System.out.println("tax taxRate 참조값 >>> " + emp); / Manager m = (Manager)emp;
         * System.out.println(m.depart);
         */
    }
    // main에서 받는 객체가 다 다르면 다 다른 매개변수를 만들어 생성해주어야한다.
    // 매개변수 여러가지를 다 받을 수 있는 하나의 함수를 만들려면
    // 다형성 매개변수, 부모타입 하나만 적어주면 자식타입을 다 받을 수 있다.

}// class

public class Ex06_8 {

    public static void main(String[] args) {
        Tax tax = new Tax(); // 세금계산!

        Manager man = new Manager();
        man.depart = "개발개발";
        tax.taxRate(man);
        Employee e = new Employee();
        tax.taxRate(e);
        Engineer eng = new Engineer();
        tax.taxRate(eng);

        System.err.println("tax.getTax() 호출");
        tax.getTax();

    }

}// end class