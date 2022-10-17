package Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class DataName{
	private HashMap<String,Integer> map = null;
	private String Name;	//왜 낭비인지 잘 모르겠다. > 해결
	private int Key;
	
	public DataName() {
		System.out.println("<DataName 입력>");
	}
	
	public String getName() {
		return Name;
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
		return map;	
	}
}