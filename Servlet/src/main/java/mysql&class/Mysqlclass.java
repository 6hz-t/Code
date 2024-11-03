package userandclass;

import java.sql.*;
import java.util.ArrayList;



public class Mysqlclass {

        ArrayList<User> userlist = new ArrayList<User>();
        String url="jdbc:mysql://localhost:3306/test";
        Connection cn=DriverManager.getConnection(url,"root","123456");
        Statement st=cn.createStatement();
        String sql="select * from student";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next())
            {
            User u=new User();
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            userlist.add(u);
            }
        public  boolean login(String use,String pas)
        {
            for(User u:userlist)
            {
                if(u.getUsername().equals(use)&&u.getPassword().equals(pas))
                    return true;

            }
            return false;
        };


    public Mysqlclass() throws SQLException {
    }
}
