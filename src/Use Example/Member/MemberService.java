package Member;		//id부터 한개씩 해보자

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService { // class {}

	String id;
	String password;

	//런을 찾는 생성자 초기화, 생성자 정의 호출 함수
	
	public static void main(String[] args) {			//main method() {} 
		System.out.println("아이디를 입력하세요.");
		Scanner scanner = new Scanner(System.in);		//사용자 입력 가능
		List<String> id_list = new ArrayList<String>();	//id 리스트 넣어줌
		String ownerid = null;		//스트링에 값 넣기
		
		for(int i =0; i<1; i++) {	
			ownerid = scanner.next();
			break;
		}
		id_list.add(ownerid);		//리스트안에 아이디를 넣었어요~ 아니 이건 회원가입 창 아니냐 
		
		MemberService Ms = new MemberService();
		Ms.loginId(ownerid, 1);
	}

	public void loginId(List<String> num_list, int name_type) { //method()
		
		String print_str = "";
		name_type = "java";
		
		if(name_type) {
			print_str ="로그인";
		} else if (id_list != name_type){
			print_str =	"관리자 번호가 아닙니다.";
		}
		
		for(int i = 0; i<2; i++) {
			System.out.println(print_str+ " : ");	
		}
	}
	
	public static void loginPw(List<Integer> PW_list, int print_type2) {
		String print_str = "";
		
		if(print_type2 == 1234) {
			print_str ="로그인";
		} else if (print_type2 != 1234){
			print_str =	"관리자 번호가 아닙니다.";
		}
	}	
	String logout(String id) { //메소드의 내용은 로그아웃 되었습니다. 가 출력되도로 해라
		System.out.println("로그아웃 되었습니다.");
		return id;
		}
  
 }
 