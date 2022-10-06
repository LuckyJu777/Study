package someTea;

import java.util.ArrayList;
import java.util.Scanner;

public class Beer1 { // 맥주 자판기
	private ArrayList<CanInfo> userBeer = null; // 리스트 CanInfo객체 넣어주기
	private static Scanner sc = null;

	static boolean run = true;
	static CanInfo caninfo = new CanInfo(null, null, null); // CanInfo객체 데이터 넣어주기
	String beerInfo;
	String beerInfo2;
	String beerInfo3;
	String A = "0";
	
	Beer1() { // 속성기능?을 여기에 넣어준다 하나의 객체로 봤을 때 안에 뭘 넣어주고싶은지
		userBeer = new ArrayList<>(); // userBeer
		sc = new Scanner(System.in);
	}

	void call() {
		System.out.println("1.등록 및 종료 2.조회");
		int main = sc.nextInt();

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
			beerInfo2 = sc.next();
			beerInfo3 = sc.next();

			CanInfo caninfo = new CanInfo(beerInfo, beerInfo2, beerInfo3); // CanInfo객체 데이터 넣어주기
			caninfo.setName(beerInfo);
			caninfo.setBeerflavor(beerInfo2);
			caninfo.setBeerorigin(beerInfo3);
			userBeer.add(caninfo); // 배열에 담아주기
			System.out.println(userBeer.toString()); // 출력확인
		
			if(caninfo.getName().equals(A)){
				break;
			}
		}
		run = false;
		userBeer.remove(userBeer.size() -1);
		System.out.println("종료");
		call();
	}// 일단 종료하는건 나왔음 근데 beerInfo2, beerInfo3을 쳐야함 바로 종료되게 해보기 > 그거 어떻게하는건데.

	void LookUpBeer() { // 조회
		System.out.println("조회할 나라를 입력하세요.");
		String sch_location = sc.next(); // 만약 영국이라고 쳤으면?
		Find(null, sch_location);

		System.out.println("생산지 <" + sch_location + "> 에 해당하는 맥주 출력");
		System.out.println("---------------------------------\t");

	}
	//계속 73,74번째 줄이 문제라고 합니다..
	// 또 새생성자를 불러와야하나?
	@SuppressWarnings("unlikely-arg-type")
	void Find(ArrayList<CanInfo> userBeer2, String location_list) {
		// get비어생성지안의 문자열이 로케이션 리스트와 같다면
		if (userBeer.get(//아니 여기 뭐들어가야하냐고()).equals(location_list)) {
			System.out.println(userBeer.toString()); 
		} else if (location_list == "독일") {
			System.out.println("독일맥주");
		} else if (location_list == "일본") {
			System.out.println("일본맥주");
		} else if (location_list == "미국") {

		}
		// 조회했다면 다시 돌아가는 메소드 call 부르기 근데 데이터부터 먼저 넣어주고
	}
}	//아니 왜이렇게 다들 집중력이 좋아..?요,,?