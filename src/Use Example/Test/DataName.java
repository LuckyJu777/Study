package Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class DataName{
	private HashMap<String,Integer> map = null;
//	private ArrayList<String> List = null;		//리스트에 String
	private ArrayList <HashMap<String,Integer>> list = new ArrayList <HashMap<String,Integer>>();
	private String Name;	//왜 낭비인지 잘 모르겠다. > 해결
	private int Key;
	
	public DataName() {
		System.out.println("<DataName 입력>");
	}
	
	public void setName(String name) {
		this.Name = name;	//set인데 리턴이 없는거면 어떡하지
		System.out.println("<setname에 담긴 값> " + Name);
	}
	
	public String getName() {
		System.out.println("<getname에 담긴 값> " + Name);
		return Name;	//이게 담겼다가 넘겨지는거구나..
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
	}	//main에서 호출하는것 부터
	
	public HashMap<String, Integer> setData(String name, int key) {
		this.Name = name;
		this.Key = key;
		map = new HashMap<>();
		map.put(Name, Key);
		System.out.println("<name,key> = masterdata! (new)");
		return map;
	}
	
	public HashMap<String,Integer> getData() {	//setData리턴
		System.out.println("<name,key> = masterdata");
		System.out.println("HashMap 출력 > = " + map);
//		print(map);
		return map;	
	}
	
	public static void print(HashMap<String, Integer> map) {
		this.map = map;
		int size = map.size();
		for(int i = 0; i <size; i++) {
			System.out.println("리스트"+ i + "순서");
			for(Entry<String,Integer> elem : map.get(i).()) {
				System.out.println(String.format("키 : %s , 값: %s", elem.getKey(), elem.getValue()));
			}
		}
	}
}