package someTea;

import java.util.ArrayList;
import java.util.Scanner;

public class Beer1 { // 맥주 자판기
	private ArrayList<CanInfo> userBeer = null; // 리스트 CanInfo객체 넣어주기
	private static Scanner sc = null;

	static boolean run = true;
	String beerInfo;
	String beerInfo2;
	String beerInfo3;
	String A = "0";
	
	Beer1() { // 속성기능?을 여기에 넣어준다 하나의 객체로 봤을 때 안에 뭘 넣어주고싶은지
		userBeer = new ArrayList<>(); // userBeer
		sc = new Scanner(System.in);
	}

	void call() {	//메뉴 들어가서 하기
		System.out.println("1.등록 및 종료 2.조회");
		int main = sc.nextInt();
		
		if(main != 1) {
			System.out.println("보기를 입력하세요.");
		}else if (main != 2){
			System.out.println("보기 중 입력하세요.");
		} 
		
		switch (main) {
		case 1:
			PutBeerInfo();
		case 2: 
			LookUpBeer();
		}
	}

	void PutBeerInfo() { // 맥주 넣기, 종료
		while (run) {
			System.out.println("1.맥주이름 2.맥주맛 3.생성지");
			System.out.println(" 0 를 누르면 입력이 종료됩니다.");
			beerInfo = sc.next();
			if (beerInfo.equals(A)){
				run = false;
				System.out.println("종료");
				break;
			}
			beerInfo2 = sc.next();
			beerInfo3 = sc.next();
			
			CanInfo caninfo = new CanInfo(beerInfo, beerInfo2, beerInfo3); // CanInfo객체 데이터 넣어주기
			userBeer.add(caninfo); // 배열에 담아주기
			System.out.println(userBeer.toString()); // 출력확인
		}call();
	}
	
	void LookUpBeer() { // 조회
		System.out.println("조회할 나라를 입력하세요.");
		String sch_location = sc.next(); // 만약 ~이라고 쳤으면?

		System.out.println("생산지 <" + sch_location + "> 에 해당하는 맥주 출력");
		System.out.println("---------------");
		Find(sch_location);
	}
	
	void Find(String location_list) {
		//파라미터가 비지않았다면 대조,  비었다면 다시입력
		if (location_list != null) {
			int i;	//인트 i로 해서	
			int size= userBeer.size();	//메소드 = 함수, size는 userBeer.size()로 해서 
			
			ArrayList<CanInfo> find_beer = new ArrayList<>();	//CanInfo안에 findbeer로 변수명 정해주고 new Array로 객체 배열 만들어줌
			
			for(i = 0; i<size; i++) {
				CanInfo caninfo = userBeer.get(i);
				
				String beerorigin = caninfo.getBeerorigin();
				
					if(location_list.equals(beerorigin)) {
					find_beer.add(caninfo);
				}
			}
			if(find_beer.size() == 0 ) {
				System.out.println(location_list + " 에 해당하는 맥주가 없습니다.");
			} else {
				System.out.println(location_list + " 의 생산지인 맥주 목록입니다.");
				
				for(CanInfo one_obj : find_beer) {
					System.out.println(one_obj);
				}
			}
			
		} else if(location_list == null){
			System.out.println("다시 입력해주세요");
		} 
		call();
	}
}