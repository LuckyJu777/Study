package how;
public class Hoegaarden {
	public static void main(String[] args) {
		//호가든 맥주 레몬맛 객체 생성하기
		Hoegaarden holemon = new Hoegaarden("에일라거", "제주에일라거맥주");
		
		//Beer 클래스로부터 상속받은 필드
		System.out.println("타입 : " +holemon.type());
		System.out.println("모델 : " +holemon.model());
	}
}