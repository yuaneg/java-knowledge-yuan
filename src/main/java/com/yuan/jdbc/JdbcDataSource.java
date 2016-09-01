package com.yuan.jdbc;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * Created by 袁恩光 on 2016/8/30.
 */
public class JdbcDataSource implements DataSource{

    private String username;

    private String password;

    private String url;

    private Class<?> driverClass;

    public JdbcDataSource() {
        try {
            driverClass = Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (driverClass == null) {
            try {
                throw new Exception("驱动加载失败");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public JdbcDataSource(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return getConnection(this.username,this.password);
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return getConnection(this.url,username,password);
    }

    public Connection getConnection(String username,String password,String url){
        Connection con = null;
        try {
            con = DriverManager.getConnection(this.url,this.username,this.password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
