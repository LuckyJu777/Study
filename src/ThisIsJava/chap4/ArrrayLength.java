package chap4;
public class ArrrayLength{
	public static void main(String[] args) {
	int[] score = {30,20,60};
	
	int sum = 0;
	for(int i =0; i<score.length; i++) {
		sum += score[i];
	}
	System.out.println("총합 : " + sum);
	
	double avg = (double) sum / score.length ;
	System.out.println("평균 : " + avg);
	}
  }
