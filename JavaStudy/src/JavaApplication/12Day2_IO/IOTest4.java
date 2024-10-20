import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


class IOTest4 {

    public static void main(String[] args) {
        // 파일이 없어도 예외가 되지 않는다. f.exist를
        // excape문자
//		File f = new File("C:\\upload\\IOTest.java");
        File f = new File("c:\\upload","IOTest.java");

        System.out.println(f.exists());

        System.out.println("파일크기 : " + f.length());
        System.out.println("이름 : " + f.getName());
        System.out.println("경로 : " + f.getPath());
        System.out.println("절대경로 : " + f.getAbsolutePath());
        System.out.println("파일 : " + f.isFile());
        System.out.println("디렉토리 : " + f.isDirectory());
        System.out.println("파일 유무 : " + f.exists());
        System.out.println("파일실행유무 : " + f.canExecute());
        System.out.println("write의 유무 : " + f.canWrite());
        System.out.println("Read의 유무 : " + f.canRead());
        System.out.println(f.delete());
    }

}