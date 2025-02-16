package com.wit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import userandclass.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet("/servletDemo01")
public class ServletDemo01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<student> stulist = new ArrayList<student>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/test";
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            cn = DriverManager.getConnection(url, "root", "123456");
            st = cn.createStatement();
            String sql = "select * from student;";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            try {
                if (!rs.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            student stu = new student();
            try {
                stu.setId(rs.getInt("id"));
                stu.setAge(rs.getInt("age"));
                stu.setStuid(rs.getString("stuid"));
                stu.setStuname(rs.getString("stuname"));
                stu.setGrade(rs.getString("grade"));
                stu.setMajor(rs.getString("major"));
                stulist.add(stu);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        for(student u:stulist)
        {
            System.out.println(u.getId());
            System.out.println(u.getStuid());
            System.out.println(u.getStuname());
            System.out.println(u.getGrade());
            System.out.println(u.getAge());
            System.out.println(u.getMajor());
        }
    }
}
