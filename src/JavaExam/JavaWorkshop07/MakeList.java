import java.util.ArrayList;
import java.util.Scanner;

public class MakeList {
    ArrayList<Integer> list;

    public void MakeList() {	//기본생성자 호출할때 하나 만들어줌 준비물같은
        list = new  ArrayList<Integer>();
    }

    //size만큼 정수형 데이터를 랜덤하게 만들어 ArrayList
    //어떻게 list공유하는지?
    public void makeArrayList(int size) {
        System.out.println("123qwe");
        //랜덤배열저장
        for(int i= 0 ; i<size; i++) {
            list.add((int)((Math.random()*10)+10));
        }

        System.out.println(" makeArrayList >> > 저장되었습니다. ");
    }

    //평균return double
    public void getAverage() {
        int sum = 0;
        double num = 0;

        for(int k = 0; k < list.size(); k++) {
            sum += list.get(k);
        }

        num = sum/list.size();
        System.out.println(" 총 평균 값은 >>> "+ num);
    }

    //ArrayList 리턴
    public ArrayList<Integer> getList() {
        return list;
    }


}