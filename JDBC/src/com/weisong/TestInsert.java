package com.weisong;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) throws Exception {
        Connection conn =null;
        Statement st=null;
        ResultSet rs=null;

        try {
            conn= JdbcUtils.getConnection();
            st=conn.createStatement();
            String sql="INSERT INTO `users`  (`id`,`name`,`password`,`email`,`birthday`)"
                    + " VALUES ('4','weisong','123456','1139575852@qq.com','2000-6-28') ";
            int i=st.executeUpdate(sql);
            if(i>0) {
                System.out.println("插入成功!");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn, st, rs);
        }
    }
}
