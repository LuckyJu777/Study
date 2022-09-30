package chap2;	//삼항 연산자
public class Conditional10peration{	
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은" +grade + "등급입니다.");
	}
}
/**
   조건식 	? 	값 또는 연산식 : 값 또는 연산식
(피연산자1)		(피연산자2)		(피연산자3)
 **/