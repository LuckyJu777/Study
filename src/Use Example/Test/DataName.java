package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class DataName{
	private ArrayList<String> setName_List;
	private String Name;
	
	public DataName() {
		System.out.println("< dataChartList - dataName 입력 >");
	}
	
	public String data() {
		String call_str = "...null"; 
		System.out.println("< 빈 Data>");
		return call_str;
	}
	
	public void setName(ArrayList<String> name) {
		System.out.println("< nameSet 출력 >");
		this.setName_List = setName_List;
	}
	
	public ArrayList<String> getName_List() {
		return setName_List;
	}
	
	public String getName() {
		System.out.println("DataName - String Name - return");
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
}