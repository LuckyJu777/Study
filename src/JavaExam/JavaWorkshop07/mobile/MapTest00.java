package mobile;

import java.util.HashMap;

public class MapTest00 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<String,Mobile> code = new HashMap<String,Mobile>();
        double sum = 0.0;

        Mobile m1 = new Mobile("LU6800", "Optimus 2x", 800000.0);
        Mobile m2 = new Mobile("SU6600", "Optimus black", 900000.0);
        Mobile m3 = new Mobile("KU6800", "Optimus big", 700000.0);
        Mobile m4 = new Mobile("KU7600", "Optimus Mach", 950000.0);
        code.put(m1.getCode(), m1);
        code.put(m2.getCode(), m2);
        code.put(m3.getCode(), m3);
        code.put(m4.getCode(), m4);

        //순회 데이터 찍기 총합구하기

        System.out.println("합계 : "+ print(code));
        System.out.println("\n가격 변경 후 합계 : "+ print(code)*0.1);
        sum = 0;
        sum = print(code);
    }

    public static double print(HashMap<String,Mobile> code){
        double sum = 0.0;
        for(String s:code.keySet()) {
            Mobile m = (Mobile)code.get(s);
            System.out.println(m.printInfo());
            sum += m.getPrice();
        }
        return sum;
    }

}