package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;

public class UsuarioGrupoModuloDAO {
    
     private Connection con;
    
    public UsuarioGrupoModuloDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
}
