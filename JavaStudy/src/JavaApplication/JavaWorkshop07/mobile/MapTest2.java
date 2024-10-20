package mobile;

import java.util.ArrayList;

public class MapTest2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Mobile m1 = new Mobile("LU6800", "Optimus 2x", 800000.0);
        Mobile m2 = new Mobile("SU6600", "Optimus black", 900000.0);
        Mobile m3 = new Mobile("KU6800", "Optimus big", 700000.0);
        Mobile m4 = new Mobile("KU7600", "Optimus Mach", 950000.0);

        //1. arryList 에 모바일 4개 add
        ArrayList<Mobile> mb = new ArrayList<>();
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);

        double sum = 0.0;
        for (Mobile mobile : mb) {
            sum += mobile.getPrice();
        }

        System.out.println("합: "+sum);
        System.out.println();

        for(Mobile m : mb) {
            m.setPrice(m.getPrice() + (m.getPrice() * 0.1));
        }

        System.out.println("가격 변경 후");

        sum = 0;

        for(Mobile m : mb) {
            System.out.println(mb);
            sum+=m.getPrice();
        }

        //2. list 순회, 가격총합 출력
        //3. list 순회, 가격 10퍼 증가
        //4. List 순회, 전체 데이터출력증가된 총합 출력


    }

}