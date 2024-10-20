package HowMake;
/* 	class Over{
		void display() { System.out.println("부모 클래스의 display() 메소드입니다.");}
}

 	class Child extends Over {
	void display() { System.out.println("자식 클래스의 display() 메소드입니다.");}
	}
 	
 	public class OverrideEx {
		public static void main(String[] args) {
			Over pa = new Over(); 
			pa.display();
			Child ch = new Child();
			ch.display();
	}
}
	
 	// 오버로딩을 만들어 보자!
 	class Big {
 		String A;
 		String B;
 		
 		void JuJu() {
 			System.out.println("첫번째 메소드");
 		}
 		
 		void JuJu2(String A) {
 			System.out.println("두번째 메소드");
 		}
 		
 		void JuJu3(String A, String B) {
 			System.out.println("세번쨰 메소드");
 		}
}		
 	
 	public class OverrideEx{
 		public static void main(String[] args) {
 			String A = "AA";
 			String B = "BB";
 			int C = 1;		//생성자를 만들때에는 호출하고 싶은 클래스를 앞에 붙이고 
 							//변수명을 지정한다.
 			Big ex = new Big(); 
 			ex.JuJu();
 			ex.JuJu2(A);
 			ex.JuJu3(A,B);
 			
 		}
 	}
*/ 

 	//오버라이딩을 만들어 보자! 부모클래스로부터 상속받은 > 부모클래스의 메서드는 무시하고 자식클래스의 메소드를 덮어써서 사용하겠다. 
	//Job Class(자식클래스)에서 Woman Class(부모클래스)를 상속받아 부모클래스에 있는 info()를 재정의하여 사용하였고,
	//메인메서드에서 Job 객체를 생성하고 호출하였기 때문에 Job클래스의 내용이 실행되었습니다.
	//부모클래스의 info() 와는 다르죠? 부모클래스를 호출하였다면 실행결과는 여자의 이름은 유리, 나이는 30살입니다. 가 되었겠죠.
	//자식클래스만 호출했을때 부모클래스의 내용도 그대로 가져오고 싶을때는 어떻게 해야할까요?
	//여자의 이름과 나이, 직업을 모두 알고싶을때는 똑같이 재정의 해도 되고, super예약어를 사용해도 됩니다.

	class Woman{
		public String name;
		public int age;
		
		void info() {
			System.out.println("[이름] "+name+ " \t[나이] " +age);
		}
	}
	
	class Job extends Woman{
		String job;
		
		public void info(){	//부모 클래스의 info를 재정의
			);
			System.out.println("여자의 직업은 " +job+ " 입니다.");
		}
	}
	
	public class OverrideEx{	//얘가 주축인가용
		public static void main(String[] args) {
			//객체를 메인에서 만들어준다
			Job job = new Job();
			//변수 설정??
			job.name = "장철민";
			job.age = 13;
			job.job = "기계체조선수";
			
			//호출
			job.info();
		}
		
	}