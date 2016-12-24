/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class ConnectionFactory {
    private Connection conn;
    private static final String URL = "jdbc:mysql://localhost";
    private static final String PORT = "3306";
    private static final String DATA_BASE = "bibliotecatsi";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static ConnectionFactory connectionFactory;

    private ConnectionFactory() throws SQLException {
        conn = DriverManager.getConnection(URL+":"+PORT+"/"+DATA_BASE, USER, PASSWORD);
    }
    
    /**
     * Metodo que volta uma unica instancia desta Classe (Singleton)
     * @return
     * @throws SQLException 
     */
    public static ConnectionFactory getInstance() throws SQLException{
        if(connectionFactory == null){
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }
    
    public Connection getConn(){
        return conn;
    }

}
