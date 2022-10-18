package Test;

public class ArrayListData {
	public static void main(String[] args) {

		ArrayRandom Test = new ArrayRandom();
		Test.input_Name();
//		Test.call_Name(); // callname안 getkey가 또있다.
							// 이미 여기서 다 값을 주고 최종적으로 > hashmap에 들어갔다.
							// 밑에 이미 값이 지나간 빈통을 불러도 값이 다시 오지는 않는다.
		Test.ArrayKey();
		
		//처음에만 호출하기, 그리고 key값 홀수 짝수로 해서 홀수 키만 골라서 값 도출하기.
		//그러면 어떡해야함. key값 호출해서 > 홀수짝수 함수 부르기 > 값넣기 > 출력하기.
		
		
	}
}


//		getSum을 받아와서 하는것처럼 => 여기서도 이름이랑 호출해서 값 파라미터로 넣어서 대조
//		어우손시려 > entry잘 모르겠는데 어케해용 봐도 ㅗㅁㄹ르갯서웋ㅎㅎ	
// 		13줄에 있던것,		
//		System.out.println("┌ < Test0.getName()을 호출합니다. > ┐");
//		Test0.getName();	//return값 보기
//		System.out.println(Test0.getName());
//		System.out.println("┌ < Test0.getKey()를 호출합니다. > ┐");
//		Test0.getKey();		

//		System.out.println("Rename있는지 확인" + Rename);
//		Test0.timeStamp();
//		Test0.getData();	//엥 그럼 이럴경우에는 함수내부에서 값을 불러줘야함.

//		Test.call_Name();

//		public void nameLoop() {
//		ArrayRandom Test2 = new ArrayRandom();
//		Test2.call_Name();		
//	}
