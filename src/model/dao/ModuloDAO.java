package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.beans.Modulo;


public class ModuloDAO {
    
      public Modulo salvar(Modulo mod) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "INSERT INTO modulo (nome_modulo)VALUES(?)"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Preparação do statement
            stmt.setString(1, mod.getNome_modulo()); // Seleciona os dados com os métodos getters

            stmt.executeUpdate(); // Executa o statement
            try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
                if(generatedKeys.next()){
                    mod.setId_modulo(generatedKeys.getInt(1));
                }
            }              
            JOptionPane.showMessageDialog(null, "Módulo '"+mod.getNome_modulo()+"' salvo com sucesso!" );
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return mod;
    }
      
      public int contaModulos(){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int qtdMods = 0;
        try {
            String sql = "SELECT COUNT(*) FROM modulo";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                qtdMods = rs.getInt(1);
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return qtdMods;
    }
}
