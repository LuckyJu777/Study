package someTea;

import java.util.ArrayList;
import java.util.Scanner;

public class Beer1 { // 맥주 자판기
	private ArrayList<CanInfo> userBeer = null;	//리스트 CanInfo객체 넣어주기
	private ArrayList<String> beer_list = null;
	private Scanner sc = null;
	
	private String name;
	private String A = "N";
	private int B = 1;
	static boolean run = true;
	boolean find = true;
	
	Beer1(){	//함수만들기
		userBeer = new ArrayList<>();	//userBeer
		beer_list = new ArrayList<>();
		sc = new Scanner(System.in);
	}	 
	
	void PutBeerInfo() {		//맥주 넣기
		while (run) {
			System.out.println("1.맥주이름 2.맥주맛 3.생성지");
			String beerInfo = sc.next();
			String beerInfo2 = sc.next();
			String beerInfo3 = sc.next();
			CanInfo caninfo = new CanInfo(beerInfo, beerInfo2, beerInfo3);	//CanInfo객체 데이터 넣어주기
			userBeer.add(caninfo);	//userBeer <CanInfo>객체에 리스트로 싸서 넣어주기 
			
			System.out.print(" 계속 입력하시겠습니까? ( Y : 계속 ,  N : 종료 ) ");
			String beerInfo4 = sc.next();
			Stop(beerInfo4);
		}
	}	
			
	public void Stop(String A) {
		if (A == "N") {
			for (int i = 0; i < userBeer.size(); i++) { // userBeer.size로 해서
				CanInfo caninfo = userBeer.get(i); // CanInfo 클래스의 변수명 caninfo로 해서 userBeer안에
			} // 객체 리스트 만큼 get(i)번으로 돌려서 넣어준다.
		}run = false; 
		System.out.println("완료");
	}
	
	void LookUpBeer(CanInfo canInfo) {	//조회
		System.out.println("🍺당신이 만든 수제맥주🍺");
		System.out.println("--------------------");
		System.out.println("내가 만든 수제맥주의 상품명은 <" + canInfo.getName() + "> 입니다.");
		System.out.println("맥주의 맛 종류는 <" + canInfo.getBeerflavor() + "> 을(를) 선택하셨습니다.");
		System.out.println("이 맥주의 생성지는 <" + canInfo.getBeerorigin() + "> 입니다.");
		System.out.println("검색할 생산지 이름을 입력하세요. ");
		String sch_location = sc.next(); // 만약 영국이라고 쳤으면?
		
		if(find){
			System.out.println("생산지 : 영국 에 해당하는 맥주 출력");
			canInfo.getBeerorigin(); 										//객체안에 있는 생성지 정보가 
		}
	}
	 
	
	void Find(ArrayList<CanInfo>userBeer2, String origin) {
		String print_C = "";
		
		if(origin == "한국") {
			
//		}else if(origin == "독일") {
//			
//		}else if(origin == "일본") {
//			
//		}else if(origin == "미국") {
//			
//		}else if(origin == "벨기에"){
//			
//		}else if(origin == "중국") {
//			
//		}else if(origin == "체코") {
//			
//		}else if(origin == "아일랜드");
	}
}
