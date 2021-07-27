package src.com.weisongJDBC.lesson01;

import java.sql.*;

//我的第一个JDBC程序
public class JDBCFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver"); //固定写法，加载驱动

        //2.用户信息和url
        //?userUnicode=true&cahracterEncoding=utf8&useSSL=true
        //   支持中文编码        设定字符集utf-8           使用安全的链接
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?userUnicode=true&cahracterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "123456";

        //3.连接成功，数据库对象      connection  代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //4.执行SQL的对象        statement  执行sql的对象
        Statement statement = connection.createStatement();

        //5.执行SQL的对象 去 执行SQL，可能存在结果，查看返回结果
        String sql = "SELECT * FROM users";

        ResultSet resultSet = statement.executeQuery(sql);//返回结果集,结果集中封装了我们全部的查询出来的结果

        while(resultSet.next()){
            System.out.println("id" + resultSet.getObject("id"));
            System.out.println("name" + resultSet.getObject("NAME"));
            System.out.println("pwd" + resultSet.getObject("PASSWORD"));
            System.out.println("email" + resultSet.getObject("email"));
            System.out.println("birth" + resultSet.getObject("birthday"));
            System.out.println("====================================================");
        }
        //6.释放连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
