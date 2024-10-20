import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


class IOTest3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("데이터 입력 : ");
        InputStream is = System.in;
        InputStreamReader reader = null;
        try {
            //필터사용 : btye => char 로 변경
            reader = new InputStreamReader(is);
            int n = reader.read();
            System.out.println((char)n);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}