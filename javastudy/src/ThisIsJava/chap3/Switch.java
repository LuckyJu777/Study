package chap3;
public class Switch{	//주사위 switch문 
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1; 	//주사위 번호표 하나 뽑기
	
	switch(num)	{
	case 1 : 
		System.out.println("1입니다.");
		break;
	case 2 :
		System.out.println("2입니다.");
		break;
	case 3 :
		System.out.println("3입니다.");
		break;
	case 4 :
		System.out.println("4입니다.");
		break;
	case 5 :
		System.out.println("5입니다.");
		break;
	default : 
		System.out.println("6입니다.");
		break;
	}
  }
}