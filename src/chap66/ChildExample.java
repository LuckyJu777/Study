//강제 타입 변환(캐스팅)
public class ChildExample{
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "date1";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent;
		child field2 = "yyy";
		child.method3(); //
	}
	
}