package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.beans.Historico;
import model.beans.Usuario;


public class HistoricoDAO {
    
      public void cadastrar(Historico hist) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "INSERT INTO historico (cpf, id_grupo, id_modulo, ordem, fase, status_atividade, resposta,"
                + "data_horario_atual)"
                + "VALUES(?,?,?,?,?,?,?, NOW());"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql); //Preparação do statement
            stmt.setString(1, hist.getCpf()); // Seleciona os dados com os métodos getters
            stmt.setInt(2, hist.getId_grupo());
            stmt.setInt(3, hist.getId_modulo());
            stmt.setInt(4, hist.getOrdem());
            stmt.setString(5, hist.getFase());
            stmt.setString(6, hist.getStatus_ativ());
            stmt.setString(7, hist.getResposta());
            //stmt.setString(7, hist.getTempo_resposta_leitura());
            //stmt.setBoolean(8, hist.isPausou());
           // stmt.setTimestamp(9, new java.sql.Timestamp(java.util.Calendar.getInstance().getTimeInMillis());
           // stmt.setT(10, hist.getTempo_pausa()));
            
            stmt.executeUpdate(); // Executa o statement
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar registro de atividades: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
      
      public Historico consultar(Usuario user){
        
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Historico hist = null;
        try {
            String sql = "SELECT * FROM historico WHERE cpf = ? ORDER BY data_horario_atual DESC LIMIT 1";
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, user.getCpf());
            rs = stmt.executeQuery();
            
            
               if(rs.next()){
                    hist = new Historico();
                    hist.setCpf(rs.getString("cpf")); 
                    hist.setId_grupo(rs.getInt("id_grupo"));
                    hist.setId_modulo(rs.getInt("id_modulo"));
                    hist.setOrdem(rs.getInt("ordem"));
                    hist.setStatus_ativ(rs.getString("status_atividade"));
               } 
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return hist;
    }
}
