package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {


    public OracleMyBatisDAO() {
        super();
    }

    public List<Dept> selectDetail(SqlSession session, HashMap<Integer, String> map) {
        List<Dept> list = session.selectList("selectDetail",map);
        System.out.print("detail출력");
        return list;
    }

    public List<Dept> selectAll(SqlSession sessoin) {
        List<Dept> list = sessoin.selectList("selectAll");
        return list;
    }

    public int insert(SqlSession session, Dept dept) {
        int num = session.insert("deptInsert",dept); // sql문으로 넘어간당
        System.out.println("추가된 레코드 >>> "+ num);
        return num;
    }

    public int delete(SqlSession session, int i) {
        int num = session.delete("delete", i);
        System.out.println("삭제된 레코드 >>> "+num);
        return num;
    }

    public int update(SqlSession session, Dept dept) {
        int num = session.update("update", dept);
        System.out.println("업데이트 레코드 >>> "+num);
        return num;
    }

    public Dept selectByDeptno(SqlSession session, int i) {
        Dept dept = session.selectOne("selectByDeptno",i);
        System.out.println("select 1 검색완료");
        return dept;
    }
}
