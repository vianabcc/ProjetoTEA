package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.beans.Testes;

public class TestesDAO {
    
     public Testes salvar(Testes teste) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "INSERT INTO testes(tipo_form, questao, texto, end_audio, end_video, alt_certa, alt_a, alt_b, alt_c, alt_d)VALUES(?,?,?,?,?,?,?,?,?,?);"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Preparação do statement
            stmt.setString(1, teste.getTipo_form()+"");
            stmt.setString(2, teste.getQuestao()+"");
            stmt.setString(3, teste.getTexto()+""); // Seleciona os dados com os métodos getters
            stmt.setString(4, teste.getEnd_audio()+"");
            stmt.setString(5, teste.getEnd_video()+"");
            stmt.setString(6, teste.getAlt_certa()+"");
            stmt.setString(7, teste.getAlt_a()+"");
            stmt.setString(8, teste.getAlt_b()+"");
            stmt.setString(9, teste.getAlt_c()+"");
            stmt.setString(10, teste.getAlt_d()+"");
            stmt.executeUpdate(); // Executa o statement
            
            try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
                if(generatedKeys.next()){
                    teste.setId_teste(generatedKeys.getInt(1));
                }
            }   
        } catch (SQLException e) {
            //throw new RuntimeException("Erro ao realizar cadastro: "+e);
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return teste;
    }
     
     public Testes popular(Testes teste){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM testes WHERE id_teste = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, teste.getId_teste()+"");
            
            rs = stmt.executeQuery();
            if(rs.next()){
                teste.setTipo_form(rs.getInt("tipo_form"));
                teste.setId_teste(rs.getInt("id_teste"));
                switch (rs.getInt("tipo_form")) {
                    case 1:
                        teste.setTexto(rs.getString("texto"));
                    break;
                    case 2:
                        teste.setEnd_audio(rs.getString("end_audio"));
                    break;
                    case 3:
                        teste.setEnd_video(rs.getString("end_video"));
                    break;
                }
                
                teste.setAlt_a(rs.getString("alt_a"));
                teste.setAlt_b(rs.getString("alt_b"));
                teste.setAlt_c(rs.getString("alt_c"));
                teste.setAlt_d(rs.getString("alt_d"));
                teste.setQuestao(rs.getString("questao"));
                teste.setAlt_certa(rs.getString("alt_certa"));
                teste.setTipo_form(rs.getInt("tipo_form"));
          
            }  
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return teste;
    }
}
