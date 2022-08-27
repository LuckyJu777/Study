package chap4;
public class AdvancedFor{
	public static void main(String[] args) {
		int[] scores = { 96,54,37,88,87 };
		
		int sum = 0;
		for (int score : scores) {  //향상된 for문 처음 실행될 때 : scores 값을 확인
			sum = sum + score;		//for(int score 에 저장 밑에 실행문 루프 돌아서 scores
		}
		System.out.println("점수 통합 =" +  sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}