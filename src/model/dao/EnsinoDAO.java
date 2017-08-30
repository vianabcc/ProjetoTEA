
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.beans.Ensino;

public class EnsinoDAO {
    
    public Ensino salvar(Ensino ensino) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "INSERT INTO ensino (end_audio, end_video, texto, tipo_form)VALUES(?,?,?,?);"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Preparação do statement
            stmt.setString(1, ensino.getEnd_audio()+"");
            stmt.setString(2, ensino.getEnd_video()+"");
            stmt.setString(3, ensino.getTexto()+""); // Seleciona os dados com os métodos getters
            stmt.setString(4, ensino.getTipo_form()+"");
            
            stmt.executeUpdate(); // Executa o statement

            try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
                if(generatedKeys.next()){
                    ensino.setId_atividade_ensino(generatedKeys.getInt(1));
                }
            }   
        } catch (SQLException e) {
            //throw new RuntimeException("Erro ao realizar cadastro: "+e);
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return ensino;
    }
    
    public Ensino popular(Ensino ensino){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM ensino WHERE id_atividade_ensino = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ensino.getId_atividade_ensino()+"");
            
            rs = stmt.executeQuery();
            if(rs.next()){
                ensino.setTipo_form(rs.getInt("tipo_form"));
                ensino.setId_atividade_ensino(rs.getInt("id_atividade_ensino"));
                switch (rs.getInt("tipo_form")) {
                    case 1:
                        ensino.setTexto(rs.getString("texto"));
                    break;
                    case 2:
                        ensino.setEnd_audio(rs.getString("end_audio"));
                    break;
                    case 3:
                        ensino.setEnd_video(rs.getString("end_video"));
                    break;
                }
            }  
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ensino;
    }
}
