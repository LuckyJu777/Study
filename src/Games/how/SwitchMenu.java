package how;

import java.util.Scanner;

public class SwitchMenu{							//음식메뉴판
	public static void main(String[] args) {		
		System.out.println("밥 빵 면 중에 무엇을 드시겠습니까?");
		Scanner in = new Scanner(System.in); //사용자 입력값 받아오기
		String user = in.next(); 	//Scanner 가 in안으로 in.next()로 스트링 받아온다.
			
		switch(user) 
		{
				
		case "밥" :
		System.out.println("1. 볶음밥");
		System.out.println("2. 리조또");
		System.out.println("3. 덮밥");
		System.out.println("선택지를 고르고 숫자를 적어주세요!");
		
		{int user2;
		Scanner scanner = new Scanner(System.in);
		user2 = scanner.nextInt();
		
		if(user2 == 1) {
			System.out.println("오 볶음밥을 택하셨군요! 관련 메뉴를 보여드릴게요");
			Menu riceMenu1 = new Menu();
			riceMenu1.RiceMenu1();
		}else if(user2 == 2) {
			System.out.println("리조또를 먹을 줄 아시는 분이시군요! 관련 메뉴를 보여드릴게요");
			Menu riceMenu2 = new Menu();
			riceMenu2.RiceMenu2();
		}else if(user2 == 3) { 
				System.out.println("덮밥을.. 택하셨군요! 관련 메뉴를 보여드릴게요");
				Menu riceMenu3 = new Menu();
				riceMenu3.RiceMenu3();
			}
		}break;
		
		
		case "빵" :
			System.out.println("1. 햄버거 및 샌드위치베이글");
			System.out.println("2. 스콘");
			System.out.println("3. 파리바게트를 간다.");
			System.out.println("4. 카레와 난");
			System.out.println("1번을 선택해주세요!");
			
//			{int user2;
//			Scanner scanner = new Scanner(System.in);
//			user2 = scanner.nextInt();
//
//			if(user2 == 1) {
//				System.out.println("햄버거를 만들어드릴게요!");
//				Menu2 myMenu2 = new Menu2;
//				myMenu2.make();
//			}break;
			
		case "면" :
			System.out.println("잔치국수 및 한식");
			System.out.println("라멘 및 일식");
			System.out.println("베트남 쌀국수 및 베트남식");
			System.out.println("라면,우동,라볶이");
			System.out.println("짜장면 짬뽕 및 중식");
			System.out.println("스파게티 및 양식");
			break;
		}
	}
}

 