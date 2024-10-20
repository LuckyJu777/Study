package test8;

public class Ex08_4_2 {
    public static void main(String[] args) {
        Ex08_4_2 t = new Ex08_4_2();
        t.aaa();
        t.bbb();
        t.ccc();
    }

    public void ccc() {
        long start = System.currentTimeMillis();
        String x = "";
        for(int i =0; i< 10000; i++) {
            x = x.concat("hello");
        }
        System.out.println("x.length(): "+x.length());
        System.out.println("ccc(): "+(System.currentTimeMillis()-start)
        );
    }

    public void bbb() {
        long start = System.currentTimeMillis();
        StringBuffer x = new StringBuffer();
        for(int i =0; i< 10000; i++) {
            x = x.append("hello");
        }
        System.out.println("x.length(): "+x.length());
        System.out.println("bbb(): "+(System.currentTimeMillis()-start)
        );
    }

    public void aaa() {
        long start = System.currentTimeMillis();
        String x = "";
        for(int i =0; i< 10000; i++) {
            x = x.concat("hello");
        }
        System.out.println("x.length(): "+x.length());
        System.out.println("aaa(): "+(System.currentTimeMillis()-start)
        );
    }
}