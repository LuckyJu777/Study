import com.MySQLDAO;
import com.OracleDAO;
import com.service.DBService;

public class DBMain {

    public static void main(String[] args) {
        DBService service = new DBService();
//		service.setDAO(new OracleDAO());
//		service.connect();

        service.setDAO(new MySQLDAO());
        service.connect();
    }

}