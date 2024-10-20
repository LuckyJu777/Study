//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.controller;

import com.service.EmpService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/EmpDeleteServlet"})
public class EmpDeleteServlet extends HttpServlet {
    public EmpDeleteServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String empno = request.getParameter("empno");
        EmpService service = new EmpService();
        service.delete(Integer.parseInt(empno));
        response.sendRedirect("EmpListServlet");
    }
}
