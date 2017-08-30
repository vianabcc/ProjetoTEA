package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beans.Usuario;
import view.TelaLogin;

public class UsuarioDAO {
    
    public static boolean checkLogin(String usuario, String senha){
        TelaLogin tl = new TelaLogin();
        
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT usuario, senha FROM usuario WHERE usuario = ? and senha = md5(?)";
        boolean check = false; 

        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if(rs.next())
            {
                check = true;
            }
    
        }catch(SQLException ex){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null,ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
    public static boolean checkAtivo(String usuario){
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT ativo FROM usuario WHERE usuario = ? and ativo = ?";
        boolean check = false;
   
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setInt(2, 1);
            
            rs = stmt.executeQuery();
            
            if(rs.next())
            {
                check = true;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null,ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
    public static String checkTipoUsuario(String usuario){ // Retorna String
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT tipo_usuario FROM usuario WHERE usuario = ? and tipo_usuario = ?";
        int tipo_usuario = 0;
        String tipo_user = "";
   
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, "adm");
            //stmt.setInt(2, 1);
            
            rs = stmt.executeQuery();
            
            if(rs.next())
            {
             //tipo_usuario = 1;
              tipo_user = "adm";
            }else{
                //tipo_usuario = 2;
                tipo_user = "aluno";
            }
            
        }catch(SQLException ex){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null,ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
         return tipo_user;
        //return tipo_usuario;
    }
    
    public String usuarioAtivo(String usuario){
        String nome = "";
        
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
        
        try {
            String sql = "SELECT nome FROM usuario WHERE usuario = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                nome = rs.getString("nome");
            }
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return nome;
    }
    
    public Usuario cadastrar(Usuario user) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "INSERT INTO usuario (cpf, nome, usuario, senha, data_nasc, email, sexo,"
                + "municipio, instituicao, tempo_leciona, tempo_leciona_area, aula_mais_uma_escola,"
                + "qtd_escolas, escola_privada, atuou_atua_crianca_autismo, atuou_atua_crianca_deficiencia,"
                + "chave_secreta, ativo, tipo_usuario)VALUES(?,?,?,md5(?),STR_TO_DATE(?, '%d/%m/%Y'),?,?,?,?,?,?,?,?,?,?,?,?,?,?);"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Preparação do statement
            stmt.setString(1, user.getCpf()); // Seleciona os dados com os métodos getters
            stmt.setString(2, user.getNome());
            stmt.setString(3, user.getUsuario());
            stmt.setString(4, user.getSenha());
            stmt.setString(5, user.getData_nasc());
            stmt.setString(6, user.getEmail());
            stmt.setString(7, user.getSexo());
            stmt.setString(8, user.getMunicipio());
            stmt.setString(9, user.getInstituicao());
            stmt.setString(10, user.getTempo_leciona());
            stmt.setString(11, user.getTempo_leciona_area());
            stmt.setBoolean(12, user.isAulas_mais_uma_escola());
            stmt.setInt(13, user.getQtd_escolas());
            stmt.setBoolean(14, user.isEscola_privada());
            stmt.setBoolean(15, user.isAtua_autismo());
            stmt.setBoolean(16, user.isAtuou_deficiencia());
            stmt.setString(17, user.getChave_secreta());
            stmt.setBoolean(18, true);
            stmt.setString(19, "aluno");
            //stmt.setString(19, user.getTipo_user);
            stmt.executeUpdate(); // Executa o statement
            
            try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
                if(generatedKeys.next()){
                    user.setCpf(generatedKeys.getString(1));
                }
            }       
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        } catch (SQLException e) {
            //throw new RuntimeException("Erro ao realizar cadastro: "+e);
            JOptionPane.showMessageDialog(null, "Erro ao realizar cadastro: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return user;
    }
    
    public Usuario popular(String chave){
        Usuario user = null;
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM usuario WHERE usuario = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, chave);
            
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            
            rs = stmt.executeQuery();
            if(rs.next()){
                user = new Usuario();
                user.setCpf(rs.getString("cpf"));
                user.setNome(rs.getString("nome"));
                user.setUsuario(rs.getString("usuario"));
                user.setUserLog(rs.getString("usuario"));
                user.setEmail(rs.getString("email"));
                user.setData_nasc(df.format(rs.getDate("data_nasc")));
                user.setSexo(rs.getString("sexo"));
                user.setMunicipio(rs.getString("municipio"));
                user.setInstituicao(rs.getString("instituicao"));
                user.setTempo_leciona(rs.getString("tempo_leciona"));
                user.setTempo_leciona_area(rs.getString("tempo_leciona_area"));
                user.setQtd_escolas(rs.getShort("qtd_escolas"));
                user.setChave_secreta(rs.getString("chave_secreta"));
                user.setAulas_mais_uma_escola(rs.getBoolean("aula_mais_uma_escola"));
                user.setEscola_privada(rs.getBoolean("escola_privada"));
                user.setAtua_autismo(rs.getBoolean("atuou_atua_crianca_autismo"));
                user.setAtuou_deficiencia(rs.getBoolean("atuou_atua_crianca_deficiencia"));
                user.setAtivo(rs.getBoolean("ativo"));
                user.setTipo_user(rs.getString("tipo_usuario"));
            }  
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return user;
    }
    
    public List<Usuario> consultar(){
        
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM usuario";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario user = new Usuario();
                user.setCpf(rs.getString("cpf"));
                user.setNome(rs.getString("nome"));
                user.setUsuario(rs.getString("usuario"));
                user.setEmail(rs.getString("email"));

                lista.add(user);
            }
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return lista;
    }
    
    public Usuario alterar(Usuario user) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "UPDATE usuario SET cpf = ?, nome = ?, usuario = ?, senha = md5(?), data_nasc = STR_TO_DATE(?, '%d/%m/%Y'),"
                + "email = ?, sexo = ?, municipio = ?, instituicao = ?, tempo_leciona = ?, tempo_leciona_area = ?, "
                + "aula_mais_uma_escola = ?, qtd_escolas = ?, escola_privada = ?, atuou_atua_crianca_autismo = ?, "
                + "atuou_atua_crianca_deficiencia = ?, chave_secreta = ?, ativo = ?, tipo_usuario = ? WHERE cpf = ?"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Preparação do statement
            stmt.setString(1, user.getCpf()); // Seleciona os dados com os métodos getters
            stmt.setString(2, user.getNome());
            stmt.setString(3, user.getUsuario());
            stmt.setString(4, user.getSenha());
            stmt.setString(5, user.getData_nasc());
            stmt.setString(6, user.getEmail());
            stmt.setString(7, user.getSexo());
            stmt.setString(8, user.getMunicipio());
            stmt.setString(9, user.getInstituicao());
            stmt.setString(10, user.getTempo_leciona());
            stmt.setString(11, user.getTempo_leciona_area());
            stmt.setBoolean(12, user.isAulas_mais_uma_escola());
            stmt.setInt(13, user.getQtd_escolas());
            stmt.setBoolean(14, user.isEscola_privada());
            stmt.setBoolean(15, user.isAtua_autismo());
            stmt.setBoolean(16, user.isAtuou_deficiencia());
            stmt.setString(17, user.getChave_secreta());
            stmt.setBoolean(18, true);
            stmt.setInt(19, 2);
            stmt.setString(20, user.getCpf());
  
            stmt.executeUpdate(); // Executa o statement
            
            try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
                if(generatedKeys.next()){
                    user.setCpf(generatedKeys.getString(1));
                }
            }
            JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar alteração: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return user;
    }
    
    public void excluir(Usuario user) {
         Connection con = ConnectionFactory.getConnetction();
         PreparedStatement stmt = null;
         
        String sql = "DELETE FROM usuario WHERE cpf = ?"; // Statement desejado
        
        try {
            stmt = con.prepareStatement(sql); //Preparação do statement
            stmt.setString(1, user.getUserLog()); // Seleciona os dados com os métodos getters
            stmt.executeUpdate(); // Executa o statement
            
            JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar exclusão: "+e);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
   
    public List<Usuario> consultarNome(String nome){
        
        Connection con = ConnectionFactory.getConnetction();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM usuario WHERE nome LIKE ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+ nome +"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario user = new Usuario();
                user.setCpf(rs.getString("cpf"));
                user.setNome(rs.getString("nome"));
                user.setUsuario(rs.getString("usuario"));
                user.setEmail(rs.getString("email"));

                lista.add(user);
            }
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na consulta: "+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return lista;
    }
   
}

