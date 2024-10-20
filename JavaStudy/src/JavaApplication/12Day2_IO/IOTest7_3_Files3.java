import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOTest7_3_Files3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Path original = Paths.get("c:\\upload\\IOTest.java");
        Path copy = Paths.get("c:\\upload\\IOTestCopy.java");
        try {
            Path yyy = Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(yyy);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}