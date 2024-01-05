package test8;

public class Ex08_1 {

    public static void main(String[] args) {
        String str = new String("jelly"); //100번주소
        String str2 = new String("jelly"); //200번주소
        String str3 = "jelly"; //리터럴을 쓸 경우
        String str4 = "jelly"; //같은 문자는 같은 주소를 사용한다.
        System.out.println(str.equals(str2));	//문자열비교
        System.out.println(str3.equals(str4));	//문자열비교
        System.out.println(str == str2);	//f
        System.out.println(str3 == str4);	//t
        System.out.println(str);
        System.out.println(str2);
    }

}