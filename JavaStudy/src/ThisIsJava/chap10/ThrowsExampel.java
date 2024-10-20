public class ThrowsExampel {
	public static void main(string[] args) {
		try {
			findClass();
		}catch(ClassNtFoundException e) {
			System.out.println("클랫가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}