import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class fileReader {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f = new File("c:\\upload\\output.txt");
        System.out.println("데이터를 입력");

        BufferedReader buffer = null;
        PrintWriter out = null;

        try {
            buffer = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(f,true);
            out = new PrintWriter(writer);
//			out.println(writer);
            out.println(buffer.readLine());	//ReadLine읽어오기
        }catch (Exception e) {	//println 입력
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            try {
                buffer.close();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}