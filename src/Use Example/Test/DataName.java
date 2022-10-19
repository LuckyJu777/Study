package Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class DataName {		//getter , setter
	private HashMap<String, Integer> map = null;
	private ArrayList<HashMap<String, Integer>> list = new ArrayList<HashMap<String, Integer>>();
	private String Name; // 왜 낭비인지 잘 모르겠다. > 해결
	private int Key;

	public DataName() {
		System.out.println("<DataName 입력>");
	}
	
	public void setArrayKey() {	//key값만
		this.getKey();
	}
	
	public void setName(String name) {
		this.Name = name; // set인데 리턴이 없는거면 어떡하지
		System.out.println("<setname에 담긴 값> " + Name);
	}

	public String getName() {
		System.out.println("<getname에 담긴 값> " + Name);
		return Name; // 이게 담겼다가 넘겨지는거구나..
	}

	public void setKey(int key) {
		this.Key = key;
	}

	public int getKey() {
		return Key;
	}

	public void timeStamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd hh:mm:ss");
		System.out.println(sdf.format(timestamp));
	} // main에서 호출하는것 부터

	public HashMap<String, Integer> setData(String name, int key) {
		this.Name = name;
		this.Key = key;
		map = new HashMap<>();
		map.put(Name, Key);
		list.add(map); // 리스트에 담긴 값
		System.out.println("<name,key> = masterdata! (new)");
		return map;
	}

	public HashMap<String, Integer> getData() { // setData리턴
		System.out.println("<name,key> = masterdata");
		print(list); // 값 담아주고 호출
		return map;
	}

	public static void print(ArrayList<HashMap<String, Integer>> map) { // list값 모두 출력 
		int size = map.size();
		for (int i = 0; i < size; i++) {
			HashMap<String, Integer> str = map.get((i));
			System.out.println("str의 값을 출력합니다. > " + str);
		}
	}
	
	public void ArrayKeyset(HashMap<String,Integer> map) {
		//KeySet() 활용, hashmap의 key만 출력하게. hasNext(): 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드 있으면 true, 없으면 false 를 반환
		//list.add(map)하면되는데 누가 넘겨주냐고
		Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println("KEY : " + key); // Key2 , Key1, Key4, Key3, Key5
        }
	}
}