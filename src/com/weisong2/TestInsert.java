package com.weisong2;

import com.weisong.JdbcUtils;

import java.sql.*;

public class TestInsert {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st= null;

        try {
            conn= JdbcUtils.getConnection();//获取数据库连接

            //区别
            //使用 ？ 占位符代替参数
            String sql ="insert into users(`id`,`name`,`password`,`email`,`birthday`) values(?,?,?,?,?)";

            st=conn.prepareStatement(sql);//预编译SQL，先写sql，然后不执行

            //手动给参数赋值
            st.setInt(1,4);//id
            st.setString(2,"jinglin");//name
            st.setString(3,"123456");//password
            st.setString(4,"1139575348@qq.com");//email
            //注意点：sql.Date    数据库                    java.sql.Date    转化为sqlDate
            //      util.Date   java                     new Date().getTime()   获得时间戳
            st.setDate(5,new java.sql.Date(new java.util.Date().getTime()));//birthday

            //执行
            int i = st.executeUpdate();
            if (i > 0){
                System.out.println("插入成功");
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            JdbcUtils.release(conn,st,null);
        }
    }
}
