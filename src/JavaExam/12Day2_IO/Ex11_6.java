import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex11_6 {

    public static void main(String[] args) {
        Path path = Paths.get("c:\\Temp\\Ex11_5.java");

        System.out.println("getFileName: "+path.getFileName());
        System.out.println("getParent: "+path.getParent());
        System.out.println("getRoot: "+path.getRoot());
        System.out.println("isAbsolute : "+path.isAbsolute());
        //브라우저에서 불러올 때 절대경로로
        //toUri() : 브라우저에서 알수 있는 Path 반환
        URI ul = path.toUri();
        System.out.println(ul);

        //toAbsolutePath() : 절대경로를 사용하는 path 전환
        Path xx = Paths.get("IOTest2");
        Path xx2 = xx.toAbsolutePath();
        System.out.println(xx2);

        //subpath : 하위경로를 만들어 경로의 일부가져온다.
        Path yy = Paths.get("c:\\upload\\IOTest.java");
        Path yy2 = yy.subpath(0, 2);
        System.out.println(yy2);
    }

}