package chap4;
public class ArraySimple{
	public static void main(String[] args) {
		int[] score = {83,90,37};
		
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += score[i];
		}
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}