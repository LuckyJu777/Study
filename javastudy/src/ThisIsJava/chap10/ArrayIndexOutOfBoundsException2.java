public class ArrayIndexOutOfBoundsException2{
	public static void main(String[] args) {		//배열값을 읽기 전에 배열의 길이를 머저 조사하는 것.
		if(args.length == 2) {						//실행 매개값이 없거나 부족할 경우 조건문을 이용해서 사용자에게 실행방법을 알려준다.
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " +data1);
			System.out.println("args[1]: " +data2);
		}else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsException");
			System.out.println("값1 값2");
		}
	}
}