package someTea;

import java.util.ArrayList;
import java.util.Scanner;

public class Beer1{	//맥주 자판기
	public static void main(String[] args) {
		ArrayList<CanInfo> userBeer = new ArrayList<>();
		
		System.out.println("수제맥주");
		System.out.println("수제맥주 이름 등록하세요");
		Scanner sc = new Scanner(System.in);
		String beerInfo = sc.next();	//맥주이름넣기
		System.out.println("맥주 맛을 등록하세요");
		String beerInfo2 = sc.next();
		System.out.println("맥주 생성지를 등록하세요");
		String beerInfo3 = sc.next();
		
		CanInfo caninfo = new CanInfo();	//여기 필드에서 만든 생성자객체이름은 caninfo(=>CanInfo연결)
		caninfo.setName(beerInfo);
		caninfo.setBeerflavor(beerInfo2);
		caninfo.setBeerorigin(beerInfo3);		//이 정보들을 묶어서 하나의 배열로 일단 셋팅해놓고 밑에서 받아서 저장하는
		
		userBeer.add(caninfo);		

		caninfo.getName();//맥주이름 가져오기
		caninfo.getBeerflavor();	//맥주맛가져오기
		caninfo.getBeerorigin(); //맥주국적쓰	=> 배열 만들어서 맥주정보 넣어주기 해보기
		System.out.println("🍺당신이 만든 수제맥주🍺");
		System.out.println("--------------------");
		System.out.println("내가 만든 수제맥주의 상품명은 <" + caninfo.getName() + "> 입니다.");
		System.out.println("맥주의 맛 종류는 <" + caninfo.getBeerflavor() + "> 을(를) 선택하셨습니다.");
		System.out.println("이 맥주의 생성지는 <" + caninfo.getBeerorigin() + "> 입니다.");
		//맥주정보 저장
		System.out.println("\t 이 정보를 저장하시겠습니까?");	//객체배열에 담아주겠습니까?
		System.out.println("1.예 / 2.아니오");
		int answer = sc.nextInt();	//1번이나 2번을 answer에 담아서 
		
									//new beer 객체 생성자 만듬
									//여기서 비어 세이브메서드를 불러서 파라미터로 유저비어값과, 앤서 값을 만들어준다.
	}								//넘겨주면서 다시 호출해야하는거 아닌가 
	
	public void Save(ArrayList<CanInfo> userBeer, int print_type) { //저장메소드 생성 , 배열만들어주고 배열안에 canInfo의 정보를 넣고싶음,
		ArrayList<String> beerlist = new ArrayList<String>();	//beer 리스트 
		System.out.println();
		
		if(print_type == 1) {
//			caninfo.add(); 
			System.out.println("저장되었습니다. 🍻 ");
			System.out.println(userBeer);		//저장이 안되어있어서 안에 아무것도 들어있지않다.
			
		} else {
			System.out.println("저장되지않았습니다.");
		
		}	
	} 
}
//1. 객체를 리스트에 넣어주기

/*
 * String country = "영국";
 * //YES라고 하면 CANINFO정보 불러와서 영국대조 맞으면 쭉 정보 내보내기 if() {
 * } else {
 * 
 * }
 */