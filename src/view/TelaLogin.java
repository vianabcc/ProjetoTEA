/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
 
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.beans.Usuario;
import model.dao.UsuarioDAO;


/**
 *
 * @author Vinicius
 */
public class TelaLogin extends javax.swing.JFrame {
    /**
     * Creates new form TelaLogin
     */
    UsuarioDAO user_dao = new UsuarioDAO();
    
    public TelaLogin() {
        initComponents();
        btnEntrar.setToolTipText("Entrar no sistema");
        btnSair.setToolTipText("Sair do sistema");
        btnCadastro.setToolTipText("Realizar novo cadastro no sistema");
    }
    
    Usuario user = new Usuario();

    public void Autenticacao(){
        
        if(user_dao.checkLogin(txtUsuario.getText(),new String(txtSenha.getPassword()))){
            if(user_dao.checkAtivo(txtUsuario.getText())){
                
                user.setUserLog(txtUsuario.getText());
                
                if(user_dao.checkTipoUsuario(txtUsuario.getText()).equals("adm")
                || user_dao.checkTipoUsuario(txtUsuario.getText()).equals("tutor")){
                    TelaPrincipalAdmin tpa = new TelaPrincipalAdmin();
                    tpa.user.setUserLog(txtUsuario.getText());
                    tpa.setVisible(true);
                    this.dispose(); 
                }else{
                    TelaPrincipalUser tpu = new TelaPrincipalUser();
                    tpu.user.setUserLog(txtUsuario.getText());
                    tpu.setVisible(true);
                    this.dispose(); 
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não ativo! Contate o administrador para ativá-lo.");
                txtSenha.requestFocus();
                txtSenha.selectAll();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            txtSenha.requestFocus();
            txtSenha.selectAll();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastro = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setResizable(false);
        getContentPane().setLayout(null);

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastar usuário");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        btnCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastroKeyPressed(evt);
            }
        });
        getContentPane().add(btnCadastro);
        btnCadastro.setBounds(170, 220, 250, 23);

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(170, 150, 80, 30);

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        btnSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSairKeyPressed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(340, 150, 80, 30);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(170, 90, 250, 30);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(170, 30, 250, 30);

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(80, 30, 80, 30);

        lblSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(90, 90, 70, 30);

        setSize(new java.awt.Dimension(573, 302));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.Autenticacao();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.Autenticacao();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairKeyPressed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // Botão Sair da Tela de Login
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.Autenticacao();
        }
    }//GEN-LAST:event_btnEntrarKeyPressed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // Botão Acessar Tela de Login
        this.Autenticacao();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.Autenticacao();
        }
    }//GEN-LAST:event_btnCadastroKeyPressed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        new TelaCadastroUsuario().setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            Properties props = new Properties();
            props.put("","");
            GraphiteLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e);
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables


}
