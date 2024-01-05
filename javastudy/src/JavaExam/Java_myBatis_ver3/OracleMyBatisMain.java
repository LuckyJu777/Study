import java.util.HashMap;
import java.util.List;

import com.config.MySqlSessionFactory;
import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();
//		int num = service.insert(new Dept(17,"개발","강남"));
//		System.out.println("in main insert : " + num);

//		service.update(new Dept(17,"개발","서울"));

//		int num2 = service.delete(12);
//		System.out.println("in main delete : "+ num2  );

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "영업");
        map.put(2, "개발");
        List<Dept> list3 = service.selectDetail(map);
        for(Dept dept3: list3) {
            System.out.println("main : "+ dept3);
        }

        Dept dept = service.selectByDeptno(12);
        System.out.println(dept);

//		List<Dept> list = service.selectAll();	//list라는 것을 주의 (arrayList x)
//		for(Dept dept2: list) {
//			System.out.println("main : "+dept2);
//		}

    }
}
