package Member;		

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
														
public class MemberService {
	String ownerkeyname = "java";	
	int ownerkeynumber = 3;
//관리자 이름, 번호로 접속 할 수 있는 
												        //사용자가 이름과 번호를 치면 	
	                                                    //그 내용을 받아서 if문 에 이 번호랑 맞다면 접속
														//아니라면 관리자의 이름이 맞지 않습니다.
	//런을 찾는 생성자 초기화, 생성자 정의 호출 함수
	
	public static void main(String[] args) {			//main method() {} 
		System.out.println("관리자 이름을 입력하세요.");
		Scanner scanner = new Scanner(System.in);		//사용자 입력 가능
		List<String>namelist = new ArrayList<String>();	//배열만들기 name
		List<Integer>numberlist = new ArrayList<Integer>(); //배열만들기 number
		
		String ownernumber = "";							//음냐
		for(int i =0; i<1; i++) {	
			ownernumber = scanner.next();	//스트링 사용자 값
			break;
		} 
		namelist.add(ownernumber);
		
		if(true) {
			namelist.get()= ownerkeynumber;
		} else {
			
		}
		Member Ms = new Member();			//if해서 튕겨내기 
		Ms.name = "java";
		Ms.number = 123;
		
		System.out.println("들어갔는지 확인" + Ms.name + Ms.number);

}
	
} 