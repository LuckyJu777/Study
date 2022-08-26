package chap3;
public class SwitchString{		//직급별월급
	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장" : 
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("750만원");
			break;
		case "차장" : 
			System.out.println("600만원");
			break;
		default : 
			System.out.println("400만원");
		}
	}
}