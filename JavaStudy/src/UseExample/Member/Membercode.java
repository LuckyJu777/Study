package Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Membercode {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<User> userStore = new ArrayList<>();

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println();

            int menuNum = sc.nextInt();			//입력받기

            User user = null;					//User null값

            switch (menuNum) {
                case 1:							//1번이면
                    System.out.println("=========== 로그인 ===========");
                    System.out.print("아이디를 입력하세요: ");
                    String loginId = sc.next();				//loginId에 저장
                    System.out.print("비밀번호를 입력하세요: ");
                    String loginPass = sc.next();			//loginPass에 저장

                    User findUser = login(loginId, loginPass);	//User클래스 findUser변수 = 로그인(아이디 패스워드)
                    if (findUser != null) {
                        System.out.println("로그인 성공");
                        System.out.println(findUser.getId() + "님 환영합니다.");
                    } else {
                        System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
                    }
                    break;
                case 2:
                    System.out.println("=========== 회원가입 ===========");
                    System.out.print("아이디를 입력하세요: ");
                    String joinId = sc.next();
                    System.out.print("비밀번호를 입력하세요: ");
                    String joinPass = sc.next();

                    boolean flag = true;
                    while (flag) {
                        if (checkId(joinId)) {
                            System.out.println("이미 존재하는 아이디입니다. 다시 입력해 주세요.");
                            System.out.print("아이디를 입력하세요: ");
                            joinId = sc.next();
                        } else {
                            flag = false;
                        }
                    }

//                    User join = new User();
//                    join.setId(joinId);
//                    join.setPass(joinPass);
                    User join = new User(joinId, joinPass);

                    userStore.add(join);

                    System.out.println("회원가입 완료");
                    break;
            }
            System.out.println();
        }
    }

    public static Boolean checkId(String id) {
        boolean flag = false;
        for (int i = 0; i < userStore.size(); i++) {
            if (userStore.get(i).getId().equals(id)) {
                flag = true;
            }
        }
        return flag;
    }

    public static User login(String id, String pass) {
        for (int i = 0; i < userStore.size(); i++) {
            if (userStore.get(i).getId().equals(id)) {
                if(userStore.get(i).getPass().equals(pass)) {
                    return userStore.get(i);
                }
            }
        }
        return null;
    }
}