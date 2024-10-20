package test;

public class Ex08_3 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        s.append(" world");	//추가
        System.out.println(s);
        s.insert(5, "!!! ");	//수정
        System.out.println(s);
        s.delete(0, 5); 	// 삭제
        System.out.println(s);

        String data = s.toString();
        System.out.println(s);
    }
