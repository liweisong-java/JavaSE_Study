package com.weisong;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st= null;
        ResultSet rs= null;

        try {
            conn= JdbcUtils.getConnection();//获取数据库连接
            st=conn.createStatement();//获取SQL的执行对象
            String sql="UPDATE users SET `Name` = 'weisong' ,`email` = '1139575852@qq.com' WHERE id = 1";
            int i=st.executeUpdate(sql);
            if(i>0) {
                System.out.println("更新成功!");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn, st, rs);
        }
    }
}
