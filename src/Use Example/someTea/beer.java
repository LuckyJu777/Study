package someTea;

import java.util.Scanner;

public class beer{	//맥주 자판기
	public static void main(String[] args) {
		System.out.println("수제맥주");
		System.out.println("수제맥주 이름 등록하세요");
		Scanner sc = new Scanner(System.in);
		String beerInfo = sc.next();	//맥주이름넣기
		System.out.println("맥주 맛을 등록하세요");
		String beerInfo2 = sc.next();
		System.out.println("맥주 브랜드를 등록하세요");
		String beerInfo3 = sc.next();
//		CanInfo caninfo = new CanInfo(beerInfo);
		
		CanInfo caninfo = new CanInfo();
		caninfo.setName(beerInfo);
		caninfo.setBeerflavor(beerInfo2);
		caninfo.setBeerbrand(beerInfo3);

		caninfo.getBeerflavor();
		System.out.println("맥주맛 " + caninfo.getBeerflavor());
	}
}