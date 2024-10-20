import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class IOTest10_Serial_Out {
	public static void main(String[] args) {
	ObjectOutputStream oos = null;
	try {
		Person p = new Person("홍길동",20);
		File f = new File("c:\\upload\\serial.dat");
		FileOutputStream fos = new FileOutputStream(f);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

}
}