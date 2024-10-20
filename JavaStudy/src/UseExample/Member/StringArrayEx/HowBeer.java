package Member.StringArrayEx;

import java.util.ArrayList;
import java.util.List;

public class HowBeer{
	public static void main(String[] args) {
	List<String> BeerA = new ArrayList<>();
	
//	BeerA.add(집어넣을값)
	BeerA.add("아사히");
	BeerA.add("기린");
	BeerA.add("블랑");
	BeerA.add(new String("삿포로"));
	BeerA.add(1, "첫번째맥주");
	
	System.out.println(BeerA);
	}
}