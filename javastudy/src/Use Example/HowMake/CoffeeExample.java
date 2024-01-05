package how;
public class CoffeeExample{
	public static void main (String[] args) {
		Coffee mycoffee = new Coffee();
		System.out.println("브랜드 :" + mycoffee.brand);
		System.out.println("윈두타입 :" + mycoffee.beantype);
		System.out.println("신선도 :" + mycoffee.freshness);
		System.out.println("메뉴 :" + mycoffee.menu);
		
		mycoffee.menu = "cappuccino";
		System.out.println("수정된 메뉴:" + mycoffee.menu);
	}
}

