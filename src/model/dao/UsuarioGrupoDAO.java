package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.beans.UsuarioGrupo;

public class UsuarioGrupoDAO {
    
   public void relaciona_user_grp(UsuarioGrupo user_grp) {
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
         
        String sql = "INSERT INTO usuario_grupo (cpf, id_grupo) VALUES(?,?)";// Statement desejado
        
        try {
            stmt = con.prepareStatement(sql); //Preparação do statement
            stmt.setString(1, user_grp.getCpf()); // Seleciona os dados com os métodos getters
            stmt.setString(2, user_grp.getId_grupo()+"");
            stmt.executeUpdate(); // Executa o statement

        } catch (SQLException e) {
            //throw new RuntimeException("Erro ao realizar cadastro: "+e);
            JOptionPane.showMessageDialog(null, "Erro ao relacionar tabelas: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    } 
}
