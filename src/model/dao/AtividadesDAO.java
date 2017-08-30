
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;

public class AtividadesDAO {
     private Connection con;
    
    public AtividadesDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
}
