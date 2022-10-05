package someTea;

import java.util.ArrayList;
import java.util.Scanner;

public class Beer1 { // 맥주 자판기
	private ArrayList<CanInfo> userBeer = null;	//리스트 CanInfo객체 넣어주기
	private static Scanner sc = null;
	
	private String A = "0";
	static boolean run = true;

	Beer1(){	//함수만들기
		userBeer = new ArrayList<>();	//userBeer
		new ArrayList<>();
		sc = new Scanner(System.in);
	}	 
	
	void call() {
		System.out.println("1.등록 및 종료 2.조회");
		int main = sc.nextInt();
		
		switch (main) {
		case 1: PutBeerInfo();
		case 2: LookUpBeer();
				Find(null,null);
		}
	}
		
	void PutBeerInfo() { // 맥주 넣기, 종료
		while (run) {
			System.out.println("1.맥주이름 2.맥주맛 3.생성지");
			System.out.println(" 0 를 누르면 입력이 종료됩니다.");
			String beerInfo = sc.next();
			String beerInfo2 = sc.next();
			String beerInfo3 = sc.next();

			CanInfo caninfo = new CanInfo(beerInfo, beerInfo2, beerInfo3); // CanInfo객체 데이터 넣어주기
			for (int i = 0; i < userBeer.size(); i++) {
				userBeer.get(i);
				userBeer.add(caninfo); // for문으로 돌려서 객체에 담기
				Find(userBeer, null);
			}
			if (caninfo.getName().equals(A)) {
				run = false;
				System.out.println("종료");
				break;
			}
		}
		if (run == false) {
			call();
		}
	}//일단 종료하는건 나왔음 근데 beerInfo2, beerInfo3을 쳐야함 바로 종료되게 해보기
	
	void LookUpBeer() {	//조회	 
		System.out.println("조회할 나라를 입력하세요.");
		String sch_location = sc.next(); // 만약 영국이라고 쳤으면?
		Find(null,sch_location);
		
		System.out.println("생산지 <" + sch_location + "> 에 해당하는 맥주 출력");
		System.out.println("---------------------------------\t");
	}
	
	void PrintBeer() {
//		System.out.println("🍺당신이 만든 수제맥주🍺" + "--------------------" 
//				+ "내가 만든 수제맥주의 상품명은 <" + name + "> 입니다."
//				+ "맥주의 맛 종류는 <" + beerflavor + "> 을(를) 선택하셨습니다." 
//				+ "이 맥주의 생성지는 <" + beerorigin + "> 입니다."
//				+ "검색할 생산지 이름을 입력하세요. ");
	}

	void Find(ArrayList<CanInfo> userBeer2, String location_list) {

		if (location_list == "영국") {
//			userBeer.;
		} else if (location_list == "독일") {

		} else if (location_list == "일본") {

		} else if (location_list == "미국") {

		}
		// 조회했다면 다시 돌아가는 메소드 call 부르기 근데 데이터부터 먼저 넣어주고
	}
}