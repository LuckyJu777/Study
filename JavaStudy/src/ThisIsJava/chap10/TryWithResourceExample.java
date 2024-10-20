public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
		}throw new Exception(); //강젲적 예외 발생시킴
	}catch(Exception e) {
		System.out.println("예외처리코드가 실행되었다.");
	}
}