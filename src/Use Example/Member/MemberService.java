package Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService { // class {}

	String id;
	String password;

	//런을 찾는 생성자 초기화, 생성자 정의 호출 함수
	public static void login(List<Integer> id_list, int print_type) { //method()
		
		String print_str = "";
		
		if(오늘 한건 없는데 삽질은 많이 했습니다. 근데 결과물은 없었습니다.== 3) {
			print_str ="로그인";
		} else if (number != 3){
			print_str =	"관리자 번호가 아닙니다.";
		}
		
		for(int i = 0; i<2; i++) {
			System.out.println(print_str+ " : ");	
		}
	}
	
	public static void main(String[] args) {			//main method() {} 
		System.out.println("아이디와 비밀번호를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		List<String> id_list = new ArrayList<String>();	//id 리스트 넣어줌
		List<String> pass_list = new ArrayList<String>();	// Password 리스트 넣어줌
		String ownerid = null;		//스트링에도 값을 줘야해요~
		
		for(int i =0; i<1; i++) {
			ownerid = scanner.next();
			break;
		}
		id_list.add(ownerid);

		MemberService memberserivce = new MemberService();
		MemberService.login("스트링값", 3);
		MemberService.logout("스트링값");
	}

	String logout(String id) { //메소드의 내용은 로그아웃 되었습니다. 가 출력되도로 해라
		System.out.println("로그아웃 되었습니다.");
		return id;
		}
  
 }
 