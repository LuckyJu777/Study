package token;

import java.util.StringTokenizer;

public class StringTest01 {
    public static void main(String[] args) {
        String b = "4,2,3,6,7";

        StringTokenizer st = new StringTokenizer(b,",");
        //1번
        int sum = 0;
        while(st.hasMoreElements()!=false) {
            sum += Integer.parseInt(st.nextToken());
        }

        System.out.println(sum);

        String bb = "4,2,3,9,7";
        //2번	foreach
        for (String s : bb) {	//배열만 들어가야하나
            sum = Integer.parseInt(bb);
            System.out.println(s);

        }
    }
}