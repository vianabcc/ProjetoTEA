
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.beans.AtividadeModulo;

public class AtividadeModuloDAO {
    private Connection con;
    
    public AtividadeModulo consulta(AtividadeModulo ativ_mod){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM atividade_modulo WHERE id_modulo = ? AND ordem = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ativ_mod.getId_modulo()+"");
            stmt.setString(2, ativ_mod.getOrdem()+"");
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                ativ_mod.setId_modulo(rs.getInt("id_modulo"));
                ativ_mod.setId_teste(rs.getInt("id_teste"));
                ativ_mod.setId_atividade_ensino(rs.getInt("id_atividade_ensino"));
                ativ_mod.setOrdem(rs.getInt("ordem"));
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return ativ_mod;
    }
    
    public AtividadeModulo consultaProx(AtividadeModulo ativ_mod){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM atividade_modulo WHERE id_modulo = ? AND ordem = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ativ_mod.getId_modulo()+"");
            stmt.setString(2, (ativ_mod.getOrdem()+1)+"");
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                ativ_mod.setId_modulo(rs.getInt("id_modulo"));
                ativ_mod.setId_teste(rs.getInt("id_teste"));
                ativ_mod.setId_atividade_ensino(rs.getInt("id_atividade_ensino"));
                ativ_mod.setOrdem(rs.getInt("ordem"));
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return ativ_mod;
    }
    
    public AtividadeModulo consultaAnt(AtividadeModulo ativ_mod){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM atividade_modulo WHERE id_modulo = ? AND ordem = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ativ_mod.getId_modulo()+"");
            stmt.setString(2, (ativ_mod.getOrdem()-1)+"");
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                ativ_mod.setId_modulo(rs.getInt("id_modulo"));
                ativ_mod.setId_teste(rs.getInt("id_teste"));
                ativ_mod.setId_atividade_ensino(rs.getInt("id_atividade_ensino"));
                ativ_mod.setOrdem(rs.getInt("ordem"));
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return ativ_mod;
    }
    
    public AtividadeModulo consultaProxTeste(AtividadeModulo ativ_mod){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM atividade_modulo WHERE id_modulo = ? AND ordem = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ativ_mod.getId_modulo()+"");
            stmt.setString(2, (ativ_mod.getOrdem()+2)+"");
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                ativ_mod.setId_modulo(rs.getInt("id_modulo"));
                ativ_mod.setId_teste(rs.getInt("id_teste"));
                ativ_mod.setId_atividade_ensino(rs.getInt("id_atividade_ensino"));
                ativ_mod.setOrdem(rs.getInt("ordem"));
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return ativ_mod;
    }
    
    public int contaAtividades(AtividadeModulo ativ_mod){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int qtdAtividades = 0;
        try {
            String sql = "SELECT COUNT(*) FROM atividade_modulo WHERE id_modulo = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ativ_mod.getId_modulo()+"");
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                qtdAtividades = rs.getInt(1);
            }

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return qtdAtividades;
    }
    
    public void relacionar_tabelas_teste(AtividadeModulo ativ_mod){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO atividade_modulo (id_teste, id_modulo, ordem)  VALUES (?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ativ_mod.getId_teste()+"");
            stmt.setString(2, ativ_mod.getId_modulo()+"");
            stmt.setInt(3, ativ_mod.getOrdem());
            
            stmt.executeUpdate();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na relação dos dados de teste: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void relacionar_tabelas_ensino(AtividadeModulo ativ_mod){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO atividade_modulo (id_atividade_ensino, id_modulo, ordem)  VALUES (?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ativ_mod.getId_atividade_ensino()+"");
            stmt.setString(2, ativ_mod.getId_modulo()+"");
            stmt.setInt(3, ativ_mod.getOrdem());
            
            stmt.executeUpdate();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na relação dos dados de ensino: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
