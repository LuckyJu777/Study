package chap6;
public class CarExample{
	public static void mian(String[] args) {
		Car car = new Car();		//Car객체생성
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1 :
				System.out.println("앞 왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2 :
				System.out.println("앞 오른쪽 kumho타이어로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
				break;
			case 3 :
				System.out.println("뒤 왼쪽 hankook타이어로 교체");
				car.backRightTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4 :
				System.out.println("뒤 오른쪽 Kumhotire로 교체");
				car.backLeftTire = new KumhoTire("뒤오른쪽",15);
				break;
			}
			System.out.println("----------------------------"); //1회전시 출력되는 내용을 구분
			}
		}
	}