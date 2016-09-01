package com.yuan.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by 袁恩光 on 2016/8/30.
 */
public class JdbcTest {


    public static void main(String[] args) {
        JdbcDataSource jdbcInit = new JdbcDataSource("root","123456","jdbc:mysql://localhost:3306/test");
        Connection con = null;
        try {
            con =  jdbcInit.getConnection();
            Statement statement = con.createStatement();
            String sql = "select * from sys_user ";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Object obj = resultSet.getObject(2);
                System.out.println(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}
