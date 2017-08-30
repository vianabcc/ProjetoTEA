package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class ConnectionFactory {

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
            //CONEXÃO LOCAL
    /*private static final String URL = "jdbc:mysql://localhost:3306/projeto_baae";
    private static final String USER = "root";
    private static final String PASS = "";
    */
           // CONEXÃO ONLINE
    
    private static final String URL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10192350";
    private static final String USER = "sql10192350";
    private static final String PASS = "HA7HzreuX3";
    
public static Connection getConnetction() {
    try {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
    } catch (ClassNotFoundException | SQLException ex) {  
        JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados!");
        throw new RuntimeException(" Erro na conexão: ", ex);
    }    
}

public static void closeConnection(Connection con){
    
    try {
        if(con != null){
             con.close();
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
 
    }

public static void closeConnection(Connection con, PreparedStatement stmt){
    
    closeConnection(con);
    
    try {
        if(stmt != null){
             stmt.close();
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
 
    }

public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
    
    closeConnection(con, stmt);
    
    try {
        if(rs != null){
             rs.close();
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
 
    }
}
