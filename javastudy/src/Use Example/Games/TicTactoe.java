package TicTac;				//1. 클래스 2.모듈 3.변수,객체 선언 4.식선언 5. return

import java.util.Scanner;

public class TicTactoe{
	
	public static void main(String[] args){
		System.out.println("TicTac 게임을 시작합니다.");
		System.out.println("1.게임시작		2.게임종료");
		System.out.println("1 또는 2를 입력해주세요.");
		//사용자 입력값 받아오기
		
		Scanner scanner = new Scanner(System.in);		//노란색줄은 낭비가 발생한다는 뜻이다.
		int inputString;	//inputString 객체생성	:int 정수 !
		inputString = scanner.nextInt();	//next라인 메소드 호출 키보드로 입력한 정수 얻음 ! 
		
		if(inputString == 1) {
			System.out.println("시작!");
			PlayChart(board, scanner);
			break;
		}else {
			System.out.println("끝");
			continue;
		}
		
	static class PlayChart {	//클래스 정의를 잘 모르겠다.
	
	int i = 0;
	char[][] board; 
	Scanner scanner;
	String name;
	
	class Player(int i, char[][] board, Scanner scanner, String symbol)
	System.out.println("33빙고입니다.");	
	char[][] board = new char[4][4];	
	board[0][0] = ' ';
	board[0][1] = '1';
	board[0][2] = '2';
	board[0][3] = '3';
	board[1][0] = 'a';
	board[2][0] = 'b';
	board[3][0] = 'c';
	
	//행에서의 승리조건
	for(int i =1; i< board.length; i++) {
		for(int j = 1; j<board.length; j++) {
			if(!board[i][j].equals(symbol))
				break;
		}				
		if (j == board.length)
			return true;
	}
	
	//열에서의 승리조건
	
	
	//대각선에서 승리조건
	}
}


		