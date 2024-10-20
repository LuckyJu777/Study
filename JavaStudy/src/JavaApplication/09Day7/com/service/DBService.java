package com.service;

import com.MySQLDAO;
import com.OracleDAO;

public class DBService {
    MySQLDAO dao;

    public DBService() {
        super();
        // TODO Auto-generated constructor stub
    }

//	public DBService(OracleDAO dao) {
//		super();
//		this.dao = dao;
//	}

    public void setDAO(MySQLDAO dao) {
        this.dao = dao;
    }

    public void connect() {
        dao.connectMySQL();	//호출
    }

}