package com.wit;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import userandclass.student;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;




@WebServlet("/requestDemo01")
public class RequestDemo01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<student> stulist = new ArrayList<student>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
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
        resp.setContentType("text/html;charset=GBK");
        ServletOutputStream out = resp.getOutputStream();

        out.write("<html>".getBytes());
        out.write("<head><title>学生管理</title></head>".getBytes());
        out.write(("<style>\n" + "  table {\n" + "    width: 100%;\n" + "    border-collapse: collapse; /* 合并边框 */\n" + "    margin: 50px 0; /* 外边距 */\n" + "    font-size: 0.9em; /* 字体大小 */\n" + "    font-family: sans-serif; /* 字体 */\n" + "    min-width: 400px; /* 最小宽度 */\n" + "    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15); /* 阴影效果 */\n" + "  }\n" + "  \n" + "  th, td {\n" + "    padding: 12px 15px; /* 内边距 */\n" + "    text-align: left; /* 文本对齐 */\n" + "    border-bottom: 1px solid #dddddd; /* 单元格底部边框 */\n" + "  }\n" + "\n" + "  th {\n" + "    background-color: #009879; /* 背景颜色 */\n" + "    color: #ffffff; /* 字体颜色 */\n" + "    text-transform: uppercase; /* 文本大写 */\n" + "  }\n" + "\n" + "  td {\n" + "    background-color: #f3f3f3; /* 背景颜色 */\n" + "  }\n" + "\n" + "  tr:nth-child(even) {\n" + "    background-color: #f9f9f9; /* 偶数行背景颜色 */\n" + "  }\n" + "\n" + "  tr:hover {\n" + "    background-color: #f1f1f1; /* 鼠标悬停行背景颜色 */\n" + "  }\n" + "\n" + "  @media screen and (max-width: 600px) {\n" + "    table {\n" + "      border: 0;\n" + "    }\n" + "\n" + "    table caption {\n" + "      font-size: 1.3em;\n" + "    }\n" + "\n" + "    table thead {\n" + "      border: none;\n" + "      clip: rect(0 0 0 0);\n" + "      height: 1px;\n" + "      margin: -1px;\n" + "      overflow: hidden;\n" + "      padding: 0;\n" + "      position: absolute;\n" + "      width: 1px;\n" + "    }\n" + "\n" + "    table tr {\n" + "      border-bottom: 3px solid #ddd;\n" + "      display: block;\n" + "      margin-bottom: .625em;\n" + "    }\n" + "\n" + "    table td {\n" + "      border-bottom: 1px solid #ddd;\n" + "      display: block;\n" + "      text-align: right;\n" + "    }\n" + "\n" + "    table td::before {\n" + "      content: attr(data-label);\n" + "      float: left;\n" + "      font-weight: bold;\n" + "      text-transform: uppercase;\n" + "    }\n" + "\n" + "    table td:last-child {\n" + "      border-bottom: 0;\n" + "    }\n" + "  }\n" + "</style>").getBytes());
        out.write("<body>".getBytes());
        out.write("<table>".getBytes());
        out.write("<tr>".getBytes());
        out.write("<th>ID</th>".getBytes());
        out.write("<th>学号</th>".getBytes());
        out.write("<th>姓名</th>".getBytes());
        out.write("<th>年龄</th>".getBytes());
        out.write("<th>年级</th>".getBytes());
        out.write("<th>专业</th>".getBytes());
        out.write("</tr>".getBytes());

        for(student s:stulist) {
            out.write("<tr>".getBytes());
            out.write(("<td>"+s.getId()+"</td>").getBytes());
            out.write(("<td>"+s.getStuid()+"</td>").getBytes());
            out.write(("<td>"+s.getStuname()+"</td>").getBytes());
            out.write(("<td>"+s.getAge()+"</td>").getBytes());
            out.write(("<td>"+s.getGrade()+"</td>").getBytes());
            out.write(("<td>"+s.getMajor()+"</td>").getBytes());
            out.write("</tr>".getBytes());
        }


        out.write("</table>".getBytes());
        out.write("</body>".getBytes());
        out.write("</html>".getBytes());
    }
}














