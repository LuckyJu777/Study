import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListTest01 {
    public static void main(String[] args) {

        System.out.println("몇개의 랜덤숫자를 넣을것인가?");
        Scanner sc = new Scanner(System.in);
        int putSc = Integer.parseInt(sc.next());

        //객체생성
        MakeList li = new MakeList();
        li.makeArrayList(putSc);

        ArrayList<Integer> list = null;

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }

        li.getAverage();

    }
}