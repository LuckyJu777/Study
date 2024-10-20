import java.io.IOException;
import java.io.InputStream;


class IOTest2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("데이터 입력 : ");
        InputStream is = System.in;
        try {
            byte[] b = new byte[5];
            int n = is.read();
            System.out.println("읽은갯수 : "+ n);
            for(byte c : b) {
                System.out.println((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}