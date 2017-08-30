
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.Formacao;
import model.beans.Usuario;

public class FormacaoDAO {
    
        public void cadastrar(Formacao f){
        
            Connection con = ConnectionFactory.getConnetction();
            PreparedStatement stmt = null;

            try {
                String sql = "INSERT INTO formacao (cpf, curso, nivel)VALUES(?,?,?)";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, f.getCpf());
                stmt.setString(2, f.getCurso());
                stmt.setString(3, f.getNivel());

                stmt.executeUpdate();

            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
            }finally{
                ConnectionFactory.closeConnection(con, stmt);
            } 
        }
        
        public List<Formacao> consultar(String userLogCpf){
     
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Formacao> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM formacao WHERE  cpf = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, userLogCpf);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Formacao f = new Formacao();
                f.setCurso(rs.getString("curso"));
                f.setNivel(rs.getString("nivel"));
                lista.add(f);
            }
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return lista;
    }
        
        public void excluir(String userLogCpf){
        
            Connection con = ConnectionFactory.getConnetction();
            PreparedStatement stmt = null;

            try {
                String sql = "DELETE FROM formacao WHERE cpf = ?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, userLogCpf);

                stmt.executeUpdate();

            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro na exclusão: "+ e);
            }finally{
                ConnectionFactory.closeConnection(con, stmt);
            } 
        }
}
