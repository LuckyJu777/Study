package how;				//햄버거를 만드는 법!

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//외부 메소드호출 생성자 만들기.
public class getMenu2{
	static String make() {	
		
		List<String> 속재료 = Arrays.asList("[화이트빵] ", "[하티빵] ","[플랫브래드빵] ","[파마산오레가노빵] ","[허니오트빵] ","[위트빵] ");
		List<String> 메인재료 = Arrays.asList("[닭가슴살] ", "[새우] ","[칠면조햄] ","[에그오믈렛] ","  ","[베이컨] ");
		List<String> 치즈 = Arrays.asList("[아메리칸 치즈] ", "[슈레드치즈] ","[모짜렐라 치즈] ");
		List<String> 야채 = Arrays.asList("[양상추] ", "[토마토] ","[오이] ","[피망] ","[양파] ","[피클] ","[올리브] ","[할라피뇨] ");
		List<String> 소스 = Arrays.asList("[렌치] ", "[스위트 어니언] ","[허니 머스타드] ","[스위트 칠리] ","[스모크 바비큐] ","[핫칠리] ","[사우스 웨스트] ",
											"[홀스래디쉬] ","[머스타드] ","[이태리 엑스트라버진 올리브 오일] ","[레드와인식초] ","[소금] ","[후추] ");
//		Collections.shuffle(Arrays.asList(속재료));
//		Collections.shuffle(Arrays.asList(메인재료));
//		Collections.shuffle(Arrays.asList(치즈));
//		Collections.shuffle(Arrays.asList(야채));
//		Collections.shuffle(Arrays.asList(소스));
		
		Collections.shuffle(속재료);
		Collections.shuffle(메인재료);
		Collections.shuffle(치즈);
		Collections.shuffle(야채);
		Collections.shuffle(소스);
		
		Random rd = new Random();
		//랜덤
		for(int i=0; i<2; i++) {
			
		}
		return 속재료.get(0) + 메인재료.get(0) + 치즈.get(0) + 야채.get(0)+ 소스.get(0) +소스.get(1);
		}
	
		public static void main(String[] args) {
		for(int i=0; i < 1; i++) {
			if (i % 10 == 0) {
			System.out.println();
			}
			System.out.println(make() + "샌드위치 햄버거 입니다.!");
		} 
		
	}
}
		
//
//if(user2 == 1) {
//	System.out.println(" "+str);
//	Menu2 myMenu2 = new Menu2;
//	myMenu2.make();

//15장 ArrayList 찍먹
//return => 메소드를 종료하고 출력값으로 반환한다. 출력값은 다양하게 사용