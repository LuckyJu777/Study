package workshop08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductManagerMain {

    public static void main(String[] args) {
        String driver = "";
        String url = "";
        String userid = "";
        String passwd = "";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, userid, passwd);

            String sql =  "";

            Scanner sc = new Scanner(System.in);

            System.out.println("매출 초회 메뉴 - [매출 일자순 : 1, 상품별 매출순 : 2] : ");
            int menu = sc.nextInt();
            if(menu == 1){
                sql = "SELECT P.PNAME 상품명, SUM(O.QUANTITY*P.PRICE) 매출 FROM D7_ORDER O JOIN D7_PRODUCT P"
                        + " USING(PID) GROUP BY P.PNAME ORDER BY 2 DESC";
            }
            if(menu == 2) {
                sql = "select odate 영업일, sum(price*quantity) 매출 from d7_order join d7_product"
                        + " on d7_product.pid = d7_order.pid"
                        + " group by odate order by 1";

            }
            pstmt = con.prepareStatement(sql);
            rs= pstmt.executeQuery();

            while(rs.next()) {
                System.out.println(rs);	//객체로 뽑고있음
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                //7. 자원반납
                if(rs!=null) rs.close();
                if(pstmt!=null)pstmt.close();
                if(con!=null)con.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}