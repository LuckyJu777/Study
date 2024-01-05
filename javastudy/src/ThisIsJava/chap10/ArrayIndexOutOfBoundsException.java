public class ArrayIndexOutOfBoundsException{	//배열에서 인덱스 범위를 초과하여 사용할 경우 
	public static void main(String[] args) {
		String data1 = args[0];					//arr[0] ~ arr[2]를 사용 arr[3]을 사용하면 인덱스 범위를 초과했기 때문에 ArrayIndexOutBoundsException 발생
		String data2 = args[1];					//이클립스 메뉴에서 Run RunConfigurations 선택 -> Arguments탭의 Program arguments 입력란에 다음고 같이 두개의 매개값을 입력 실행하면 예외가 발생x
		
		System.out.println("args[0]: " +data1);
		System.out.println("args[1]: " +data2);
	}
}