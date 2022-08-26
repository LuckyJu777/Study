package chap3;
public class IfNested{
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) +81;
		System.out.println("학점은" + score + "입니다.");
	String grade;
	if(score>=95) {
		if(score>=95) {
		grade = "A+";
	}else{
		grade = "A";
	}} else {
		if(score >= 85) {
		grade = "B+";
		}else {
		grade = "B";
		}}
	System.out.println("등급 : " + grade);
	}}