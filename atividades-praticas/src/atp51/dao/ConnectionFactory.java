package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    private String url;
    private String user;
    private String password;
    private DataSource dataSource;

    public ConnectionFactory(){
        this.url = "jdbc:postgresql://localhost:5432/postgres";
        this.user = "postgres";
        this.password = "123456";

        //Criação de POOL de Conexão
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl(this.url);
        pool.setUser(this.user);
        pool.setPassword(this.password);
        pool.setMaxPoolSize(50);
        //Classe mais abstrata
        this.dataSource = pool;
    }

    public Connection getConnection() throws SQLException{
        // return DriverManager.getConnection(this.url, this.user, this.password);
        return this.dataSource.getConnection();
    }
    
}
