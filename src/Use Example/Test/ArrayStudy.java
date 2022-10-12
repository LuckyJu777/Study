package Test;
public class ArrayStudy{
	public static void main(String[] args) {
		ArrayNandom dom1 = new ArrayNandom();
		dom1.L1();
		dom1.L2();
		dom1.L3(0);;
		dom1.L4(null);
	}	//자 문제가 머냐 L4를 호출이 안돼 파라미터 값을 넣어주면 메인에 들어오지 않는데 
}		//메인에 안넣어주면 호출이 안되고 옹 호출할려면 생성자에 변수.메소드(); 해서 호출 
		//생성자 없이 그냥 메소드(); 이거는 걍 값 넣어주기 하는건가 
		//쩃든 문제는 L4를 해야하는데 호출이 안댕
		//L5메소드에서 생성자를 만들어서 L3호출 시도
		//안됨 왜 안대지 , 아니 리턴만들어서 값 넘기는거 잘 못하겠어
		//System.out.println()