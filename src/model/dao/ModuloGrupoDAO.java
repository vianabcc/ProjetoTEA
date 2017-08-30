/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.beans.ModuloGrupo;

/**
 *
 * @author Vinicius Viana
 */
public class ModuloGrupoDAO {
    public ModuloGrupo consulta(ModuloGrupo mod_grp){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM modulo_grupo WHERE id_grupo = ?, id_modulo = ?, ordem = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, mod_grp.getId_grupo()+"");
            stmt.setString(2, mod_grp.getId_modulo()+"");
            stmt.setString(3, mod_grp.getOrdem()+"");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                mod_grp.setId_modulo(rs.getInt("id_modulo"));
                mod_grp.setId_grupo(rs.getInt("id_grupo"));
                mod_grp.setOrdem(rs.getInt("ordem"));
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return mod_grp;
    }
    
    public void relacionar_tabelas(ModuloGrupo mod_grp){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO modulo_grupo (id_grupo, id_modulo, ordem)  VALUES (?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, mod_grp.getId_grupo());
            stmt.setInt(2, mod_grp.getId_modulo());
            stmt.setInt(3, mod_grp.getOrdem());
            
            stmt.executeUpdate();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na relação dos dados: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
   
}
