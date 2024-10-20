import java.util.ArrayList;

public class MakeList2 {
    ArrayList<Integer> list;
    ArrayList<Integer> list2;
    //배열 2개를 하나의 배열에
    ArrayList<Integer> list3;
    int num;

    public MakeList2(){
        list = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
    }

    public void print() {
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
    }

    //list 3의 값의 반을 list 반을 list2에 저장
    public ArrayList<Integer> addList() {
        int num = 0;
        for (int i = 0; i < 20; i++) {
            list3.add((int) (Math.random() * 10) + 1);
        }
        for (int i = 0; i < 10; i++) {
            list.add(list3.get(i));
            list2.add(list3.get(i+10));
        }
        return list3;
    }

    public void divideList() {
        for (int j = 0; j < 10; j++) {
            try {
                num = list.get(j) / list2.get(j);
                System.out.println(list.get(j) + " / " + list2.get(j) + " = " + num);

            } catch (ArithmeticException e) {
                System.out.println("분모가 0입니다." + e.getMessage());

            }
        }
    }
}