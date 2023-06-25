package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {
    OracleMyBatisDAO dao;

    public OracleMyBatisService() {
        super();
        dao = new OracleMyBatisDAO();
    }

    public List<Dept> selectDetail (HashMap<Integer, String> map){
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<Dept> list = null;
        try {
            list = dao.selectDetail(session,map);
        }finally {
            session.close();
        }
        return list;
    }

    public Dept selectByDeptno(int i) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        Dept dept = null;
        try {
            dept = dao.selectByDeptno(session,i);
        }finally {
            session.close();
        }
        return dept;
    }

    public int update(Dept dept) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        int num = 0;
        try {
            num = dao.update(session, dept);
            session.commit();
        }finally {
            session.close();
        }
        return num;
    }

    public int insert(Dept dept) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        int num = 0;
        try {
            num = dao.insert(session, dept);
            session.commit();
        }finally {
            session.close();
        }
        return num;
    }

    public List<Dept> selectAll() {
        SqlSession session = MySqlSessionFactory.getSqlSession(); //connection

        List<Dept> list = null;
        try {
            list = dao.selectAll(session);
        }finally {
            session.close();
        }
        return list;
    }

    public int delete(int i) {
        SqlSession session = MySqlSessionFactory.getSqlSession(); //connection
        int num = 0;
        try {
            num = dao.delete(session,i);
            session.commit();
        }finally {
            session.close();
        }
        return num;
    }

}
