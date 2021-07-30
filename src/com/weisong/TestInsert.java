package com.weisong;

import java.sql.*;

public class TestInsert {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement st= null;
        ResultSet rs= null;

        try {
            conn= JdbcUtils.getConnection();//获取数据库连接
            st=conn.createStatement();//获取SQL的执行对象
            String sql="INSERT INTO users(`id`,`name`,`password`,`email`,`birthday`)" +
                    "VALUES ('4','weisong','123456','1139575852@qq.com','2000-5-27')";
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
