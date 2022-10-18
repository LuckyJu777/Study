package Test;

public class ArrayListData{
	public static void main(String[] args) {

		ArrayRandom Test = new ArrayRandom();
		Test.input_Name();
		Test.call_Name(); //callname안 getkey가 또있다.
							//이미 여기서 다 값을 주고 최종적으로 > hashmap에 들어갔다.
							//밑에 이미 값이 지나간 빈통을 불러도 값이 다시 오지는 않는다.
		
		DataName Test0 = new DataName();
		System.out.println("┌ < Test0.getName()을 호출합니다. > ┐");
		Test0.getName();	//return값 보기
		System.out.println(Test0.getName());
		System.out.println("┌ < Test0.getKey()를 호출합니다. > ┐");
		Test0.getKey();
		System.out.println(Test0.getKey());	//겉에서 함수호출을 하면 값이 안넣어지는데??
											//그러면 DataName안에 return 값을 넣어주려면?

//		getSum을 받아와서 하는것처럼 => 여기서도 이름이랑 호출해서 값 파라미터로 넣어서 대조
		
		
		
		
		
		
		
//		System.out.println("Rename있는지 확인" + Rename);
//		Test0.timeStamp();
//Test0.getData();	//엥 그럼 이럴경우에는 함수내부에서 값을 불러줘야함.
		
//		Test.call_Name();
	}

//	public void nameLoop() {
//		ArrayRandom Test2 = new ArrayRandom();
//		Test2.call_Name();		
//	}
	
	
}