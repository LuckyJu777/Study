package Test;

public class ReTest2{
	public static void Name() {
		int i = 2;
			if(i < 3) {
				System.out.println("d");
			} else if (i == 20) {
				System.out.println("d2");
			} else {
				System.out.println("ddd");
			}
	}
	
	public static void main(String[] args) {
		System.out.println("Line");
		Name();
		System.out.println("Line2");
	}
	
	public void Annotation_Test() {
		@Ano(element1 = "값", element2=6);
	}
}