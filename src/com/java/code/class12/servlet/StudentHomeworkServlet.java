package com.java.code.class12.servlet;

import com.java.code.class12.jdbc.StudentHomeworkJdbc;
import com.java.code.class12.model.Homework;
import com.java.code.class12.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * StudentHomeworkServlet
 *
 * @author wangkm
 * @date 2020-03-05
 * @since 0.0.1
 */
//显示作业完成情况
@WebServlet("/show_homework")
public class StudentHomeworkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查找所有已布置作业
        List<Homework> list = StudentHomeworkJdbc.selectAllhw();

        req.setAttribute("homework", list);

        req.getRequestDispatcher("function/check_homework.jsp").forward(req, resp);
    }
}
