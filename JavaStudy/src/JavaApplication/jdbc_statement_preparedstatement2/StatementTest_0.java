import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

    public static void main(String[] args) {
        //1. 4가지 정보
        String driver="oracle.jdbc.driver.OracleDriver";
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String userid ="scott";
        String passwd ="tiger";
        //2. Driver로딩
        Connection con=null;
        Statement stmt = null;
        ResultSet rs= null;

        try {
            Class.forName(driver);
            System.out.println("드라이버 로딩 ");
            //3. db접속
            con = DriverManager.getConnection(url, userid, passwd);
            System.out.println("con :"+ con);
            //4. connection이용 Statement 생성
            stmt  = con.createStatement();
            //5. sql실행  select: executeQuery=> ResultSet, dml : executeUpate => int
            String sql="select deptno, dname, loc from dept      ";   //; 제외
            rs= stmt.executeQuery(sql);// sql실행 , 결과 ResultSet 으로 받기
            //6. 결과 출력
            //6-1 ResultSetMetaData를 이용한 헤더 처리
            ResultSetMetaData rmd  =rs.getMetaData();  //헤더정보
            int count= rmd.getColumnCount();//헤더의 갯수
            for (int i = 1; i <=count; i++) {
                System.out.print(rmd.getColumnName(i)+"\t");
            }
            System.out.println();
            System.out.println("=====================================");
            while (rs.next()) {
                int deptno= rs.getInt(1);
                String dname= rs.getString(2);
                String loc= rs.getString("loc");
                System.out.println(deptno+"\t"+ dname+"\t"+loc);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                if(rs!=null)rs.close();
                if(stmt!=null) stmt.close();
                if(con!=null) con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }//finally



    }//end main
}
// end class