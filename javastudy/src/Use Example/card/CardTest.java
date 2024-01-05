package card;

public class CardTest{
	public static void main(String[] args) {
	System.out.println("CardWidth = " + Card.width);
	System.out.println("Card.Height = " + Card.height);	//static변수는 객체생성 없이 '클래스이름.변수'로 사용이 가능하다.
	
	Card c1 = new Card();
	c1.kind = "Heart";
	c1.number = 3;
	
	Card c2 = new Card();
	c2.kind = "Diamond";
	c2.number = 5;

	System.out.println("가지고 있는 c1의 높이는" + c1.width +" 넓이는 " + c1.height + "입니다.");
	System.out.println("가지고 있는 c1은" + c1.kind + c1.number + "입니다.");
	System.out.println("가지고 있는 c2는" + c2.kind + c2.number + "입니다.");
	
	c1.width = 50;
	c1.height = 70;
	
	System.out.println("가지고 있는 c1의 높이는" + c1.width +" 넓이는 " + c1.height + "입니다.");
	
	}
}