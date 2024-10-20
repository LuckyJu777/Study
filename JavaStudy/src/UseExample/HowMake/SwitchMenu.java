package how;

import java.text.MessageFormat;
import java.util.Scanner;

public class SwitchMenu extends getMenu2 {							//음식메뉴판
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
			System.out.println("1. 햄버거 샌드위치 ");
			System.out.println("1번을 선택해주세요!");
			
			{int user2;
			Scanner scanner = new Scanner(System.in);
			user2 = scanner.nextInt();
			
			if(user2 == 1) {
				System.out.println("샌드위치 햄버거를 만들어드릴게요!");
				getMenu2 breadMenu1 = new getMenu2();
				breadMenu1.makeSanwich(args);
			}
			}break;
			
		case "면" :
			System.out.println("면을 먹으려는 당신 진심이군요. 상대방을 설득할 호소문을 작성해 드릴게요.");
		
			{int user3;
			
			System.out.println("무엇을 드시고 싶은가요? 메뉴만 적어주세요.");
			Scanner scanner = new Scanner(System.in);
			String user4 = scanner.nextLine();
			
			
			String mymenu = user4;
			String text = "좋아해 {0} \n멋진녀석 {0}...";
			
			String result1 = MessageFormat.format(text,mymenu);
			System.out.println(result1);
			System.out.println();
		}	
			break;
		}
	}
}

 