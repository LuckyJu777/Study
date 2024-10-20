package chap4;
import java.util.Calendar; //Calendar클래스는 java.util패키지에 있으므로 import필요
public class EnumWeek{
	public static void main(String[] args) {
		Week today = null; //열거타입 변수 선언
		
	Calendar cla = Calendar.getInstance();
	int week = cla.get(Calendar.DAY_OF_WEEK);	//일(1)~토(7) 숫자를 리턴
	
	switch(week) {				//열거상수 대입
	case 1:				
		today = Week.SUNDAY; break;
	case 2:
		today = Week.MONDAY; break;
	case 3:
		today = Week.TUESDAY; break;
	case 4:
		today = Week.WEDNESDAY; break;
	case 5:
		today = Week.THURSDAY; break;
	case 6:
		today = Week.FRIDAY; break;
	case 7:
		today = Week.SATURDAY; break;
	}
	
	System.out.println("오늘 요일:" + today);
	
	if(today == Week.SUNDAY) {
		System.out.println("일요일 축구를 합니다.");
	}else {
		System.out.println("열심히 자바 공부합니다.");
	}
  }
}