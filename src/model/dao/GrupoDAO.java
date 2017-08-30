
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.Grupo;


public class GrupoDAO {
 
    public void cadastrarGrupo(Grupo grupo) {
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
         
        String sql = "INSERT INTO grupo (nome_escola, nome_grupo, chave_secreta, tipo_grupo) VALUES(?,?,?,?)";// Statement desejado
        
        try {
            stmt = con.prepareStatement(sql); //Preparação do statement
            stmt.setString(1, grupo.getNome_escola()); // Seleciona os dados com os métodos getters
            stmt.setString(2, grupo.getNome_grupo());
            stmt.setString(3, grupo.getChave_secreta());
            stmt.setString(4, grupo.getTipo_grupo());
            
            stmt.executeUpdate(); // Executa o statement
           
            JOptionPane.showMessageDialog(null, "Cadastro do grupo efetuado com sucesso!");
        } catch (SQLException e) {
            //throw new RuntimeException("Erro ao realizar cadastro: "+e);
            JOptionPane.showMessageDialog(null, "Erro ao realizar cadastro do grupo: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Grupo> consultar(){
        
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Grupo> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM grupo";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Grupo grupo = new Grupo();
                grupo.setId_grupo(rs.getInt("id_grupo"));
                grupo.setNome_escola(rs.getString("nome_escola"));
                grupo.setNome_grupo(rs.getString("nome_grupo"));
                grupo.setChave_secreta(rs.getString("chave_secreta"));

                lista.add(grupo);
            }
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return lista;
    }
    
    public List<Grupo> consultarNome(String nome){
        
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Grupo> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM grupo WHERE nome_grupo LIKE ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+ nome +"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Grupo grupo = new Grupo();
                grupo.setId_grupo(rs.getInt("id_grupo"));
                grupo.setNome_escola(rs.getString("nome_escola"));
                grupo.setNome_grupo(rs.getString("nome_grupo"));
                grupo.setChave_secreta(rs.getString("chave_secreta"));

                lista.add(grupo);
            }
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return lista;
    }
    
    public void excluir(Grupo grupo) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "DELETE FROM grupo WHERE id_grupo = ?"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql); //Preparação do statement
            stmt.setString(1, grupo.getId_grupo()+""); // Seleciona os dados com os métodos getters
            stmt.executeUpdate(); // Executa o statement
            
            JOptionPane.showMessageDialog(null, "Exclusão do grupo efetuada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar exclusão do grupo: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void alterar(Grupo grupo) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "UPDATE grupo SET nome_escola = ?, nome_grupo = ?, chave_secreta = ?, tipo_grupo = ? WHERE id_grupo = ?"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql); //Preparação do statement
            stmt.setString(1, grupo.getNome_escola()); // Seleciona os dados com os métodos getters
            stmt.setString(2, grupo.getNome_grupo());
            stmt.setString(3, grupo.getChave_secreta());
            stmt.setString(4, grupo.getTipo_grupo());
            stmt.setString(5, grupo.getId_grupo()+"");
  
            stmt.executeUpdate(); // Executa o statement
            
            JOptionPane.showMessageDialog(null, "Alteração do grupo efetuada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar alteração do grupo: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public Grupo popular(int chave){
        Grupo grupo = new Grupo();
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM grupo WHERE id_grupo = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, chave+"");
 
            rs = stmt.executeQuery();
            while(rs.next()){
                grupo.setId_grupo(rs.getInt("id_grupo"));
                grupo.setNome_escola(rs.getString("nome_escola"));
                grupo.setNome_grupo(rs.getString("nome_grupo"));
                grupo.setChave_secreta(rs.getString("chave_secreta"));
                grupo.setTipo_grupo(rs.getString("tipo_grupo"));
              
            }  
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return grupo;
    }
}
