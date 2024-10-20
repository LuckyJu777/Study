package test8;

public class Ex08_5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int v1 = 123;
        char v2 = 'A';
        float v3 = 3.14F;
        boolean v4 = true;

        String x1= Integer.toString(v1);
        String x2= Character.toString(v2);
        String x3= Float.toString(v3);
        String x4= Boolean.toString(v4);

        int a1 = Integer.parseInt(x1);
        float a2 = Float.parseFloat(x3);
        boolean a3 = Boolean.parseBoolean(x4);	//문자열 => boolean
        double a4 = Double.parseDouble("3.14");	//문자열 => double
//		Character.parseCharacter 가 없어요 x2.charAt(0) 으로 해주면 index에 해당하는걸 char로 돌려주고 있다.
        System.out.println(v1+"\t"+v2+"\t"+v3+"\t"+v4);
        System.out.println(x1+10);
        System.out.println(a1+"\t"+a2+"\t"+a3+"\t"+a4);

    }

}