package R.newInstance;

import java.lang.reflect.InvocationTargetException;

public class Main{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		try {
			Class clazz1 = Class.forName("NewInstance.BodyInfo");		//forName 정적메소드, 전체 이름(패키지가 포함된 이름)을 매개값으로 받ㄷ고 class객체를 리턴한다.
			Info info = (Info) clazz1.getDeclaredConstructor().newInstance();
			//리턴값이 object이기 떄문에 info로 한번 감싸준다.
			info.myInfo();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Class clazz2 = Class.forName("NewInstance.PersonalInfo");
			Info info = (Info) clazz2.getDeclaredConstructor().newInstance();
			info.myInfo();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}		//여기는 왜 throw가 없어??? 440p 