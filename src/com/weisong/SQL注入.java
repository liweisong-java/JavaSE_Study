package com.weisong;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL注入 {
    public static void main(String[] args) {
//        login("weisong","123456");
        login("'or '1=1","123456");

    }

    //登录业务
    public static void login(String username , String password){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();

            st = conn.createStatement();
            //SQL         SELECT * FROM users WHERE `Name` = 'weisong' AND PASSWORD = '123456';
            String sql = "SELECT * FROM users WHERE `Name` = '"+username+"' AND `PASSWORD` = '"+password+"'";

            rs = st.executeQuery(sql);//查询完毕会返回结果集

            while(rs.next()){
                System.out.println(rs.getString("NAME"));
                System.out.println(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JdbcUtils.release(conn,st,rs);
        }
    }
}
