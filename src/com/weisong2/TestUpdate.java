package com.weisong2;

import com.weisong.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st= null;

        try {
            conn= com.weisong.JdbcUtils.getConnection();//获取数据库连接

            //区别
            //使用 ？ 占位符代替参数
            String sql ="update users set `name` =? where id =?;";

            st=conn.prepareStatement(sql);//预编译SQL，先写sql，然后不执行

            //手动给参数赋值
            st.setString(1,"伟松");
            st.setInt(2,1);
            //执行
            int i = st.executeUpdate();
            if (i > 0){
                System.out.println("更新成功");
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            JdbcUtils.release(conn,st,null);
        }
    }
}
