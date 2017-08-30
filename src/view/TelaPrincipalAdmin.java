
package view;

import model.beans.Usuario;
import model.dao.UsuarioDAO;

public class TelaPrincipalAdmin extends javax.swing.JFrame {
   
    public TelaPrincipalAdmin() {
        initComponents();
    }
    UsuarioDAO dao = new UsuarioDAO();
    Usuario user = new Usuario();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDPPrincipal = new javax.swing.JDesktopPane();
        txtNome = new javax.swing.JLabel();
        jMBPrincipal = new javax.swing.JMenuBar();
        jMArquivo = new javax.swing.JMenu();
        jMSobre = new javax.swing.JMenuItem();
        jMISearch = new javax.swing.JMenuItem();
        jMISair = new javax.swing.JMenuItem();
        jMUsers = new javax.swing.JMenu();
        jMICadUser = new javax.swing.JMenuItem();
        jMIConfigUser = new javax.swing.JMenuItem();
        jMGrupos = new javax.swing.JMenu();
        jMICadGrupo = new javax.swing.JMenuItem();
        jMIConfigGrupo = new javax.swing.JMenuItem();
        jMMódulos = new javax.swing.JMenu();
        jMenuCriarMod = new javax.swing.JMenuItem();
        jMModConfig = new javax.swing.JMenuItem();
        jMRelatorios = new javax.swing.JMenu();
        jMGC = new javax.swing.JMenuItem();
        jMGE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Tela Principal Administrador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDPPrincipal.setName(""); // NOI18N
        jDPPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDPPrincipalMouseReleased(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jDPPrincipal.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDPPrincipalLayout = new javax.swing.GroupLayout(jDPPrincipal);
        jDPPrincipal.setLayout(jDPPrincipalLayout);
        jDPPrincipalLayout.setHorizontalGroup(
            jDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDPPrincipalLayout.createSequentialGroup()
                .addGap(0, 850, Short.MAX_VALUE)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDPPrincipalLayout.setVerticalGroup(
            jDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDPPrincipalLayout.createSequentialGroup()
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 549, Short.MAX_VALUE))
        );

        jMArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page.png"))); // NOI18N
        jMArquivo.setText("Arquivo");

        jMSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        jMSobre.setText("Sobre");
        jMSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSobreActionPerformed(evt);
            }
        });
        jMArquivo.add(jMSobre);

        jMISearch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMISearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        jMISearch.setText("Pesquisar");
        jMISearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISearchActionPerformed(evt);
            }
        });
        jMArquivo.add(jMISearch);

        jMISair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMISair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMArquivo.add(jMISair);

        jMBPrincipal.add(jMArquivo);

        jMUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jMUsers.setText("Usuários");
        jMUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUsersActionPerformed(evt);
            }
        });

        jMICadUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        jMICadUser.setText("Cadastrar");
        jMICadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadUserActionPerformed(evt);
            }
        });
        jMUsers.add(jMICadUser);

        jMIConfigUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
        jMIConfigUser.setText("Configurar");
        jMIConfigUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConfigUserActionPerformed(evt);
            }
        });
        jMUsers.add(jMIConfigUser);

        jMBPrincipal.add(jMUsers);

        jMGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        jMGrupos.setText("Grupos");

        jMICadGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_add.png"))); // NOI18N
        jMICadGrupo.setText("Cadastrar");
        jMICadGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadGrupoActionPerformed(evt);
            }
        });
        jMGrupos.add(jMICadGrupo);

        jMIConfigGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_edit.png"))); // NOI18N
        jMIConfigGrupo.setText("Configurar");
        jMIConfigGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConfigGrupoActionPerformed(evt);
            }
        });
        jMGrupos.add(jMIConfigGrupo);

        jMBPrincipal.add(jMGrupos);

        jMMódulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/application.png"))); // NOI18N
        jMMódulos.setText("Módulos");

        jMenuCriarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page_white_wrench.png"))); // NOI18N
        jMenuCriarMod.setText("Criar");
        jMenuCriarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCriarModActionPerformed(evt);
            }
        });
        jMMódulos.add(jMenuCriarMod);

        jMModConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page_white_wrench.png"))); // NOI18N
        jMModConfig.setText("Configurar");
        jMModConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMModConfigActionPerformed(evt);
            }
        });
        jMMódulos.add(jMModConfig);

        jMBPrincipal.add(jMMódulos);

        jMRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart_bar.png"))); // NOI18N
        jMRelatorios.setText("Relatórios");

        jMGC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        jMGC.setText("Grupo Controle");
        jMRelatorios.add(jMGC);

        jMGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        jMGE.setText("Grupo Experimental");
        jMGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGEActionPerformed(evt);
            }
        });
        jMRelatorios.add(jMGE);

        jMBPrincipal.add(jMRelatorios);

        setJMenuBar(jMBPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPPrincipal)
        );

        setSize(new java.awt.Dimension(1216, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIConfigUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConfigUserActionPerformed
        BuscaUsuarioMDI buscaUser = new BuscaUsuarioMDI();
        buscaUser.user.setUserLog(this.user.getUserLog());
        jDPPrincipal.add(buscaUser);
        buscaUser.setVisible(true);
    }//GEN-LAST:event_jMIConfigUserActionPerformed

    private void jMIConfigGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConfigGrupoActionPerformed
        BuscaGrupoMDI buscaGrupo = new BuscaGrupoMDI();
        jDPPrincipal.add(buscaGrupo);
        buscaGrupo.setVisible(true);
    }//GEN-LAST:event_jMIConfigGrupoActionPerformed

    private void jMUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUsersActionPerformed
        
        
    }//GEN-LAST:event_jMUsersActionPerformed

    private void jMICadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadUserActionPerformed
        // Cadastro do usuário MDI
        TelaCadastroUsuarioMDI telaCadUser = new TelaCadastroUsuarioMDI();
        jDPPrincipal.add(telaCadUser);
        telaCadUser.setVisible(true);
    }//GEN-LAST:event_jMICadUserActionPerformed

    private void jMICadGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadGrupoActionPerformed
        // Cadastro Cliente MDI
        TelaCadastroGrupoMDI telaCadCliente = new TelaCadastroGrupoMDI();
        jDPPrincipal.add(telaCadCliente);
        telaCadCliente.setVisible(true);
    }//GEN-LAST:event_jMICadGrupoActionPerformed

    private void jMSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSobreActionPerformed
        SobreMDI sobre = new SobreMDI();
        jDPPrincipal.add(sobre);
        sobre.setVisible(true);
    }//GEN-LAST:event_jMSobreActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        // jMenuItem Sair Tela Principal
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMISairActionPerformed

    private void jMGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMGEActionPerformed

    private void jDPPrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDPPrincipalMouseReleased

    }//GEN-LAST:event_jDPPrincipalMouseReleased

    private void jMModConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMModConfigActionPerformed
        /*CriacaoTesteMDI criacaoMod = new CriacaoTesteMDI();
        jDPPrincipal.add(criacaoMod);
        criacaoMod.setVisible(true);*/
    }//GEN-LAST:event_jMModConfigActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      String Nome = dao.usuarioAtivo(user.getUserLog());
      txtNome.setText("Bem vindo(a), " + Nome);
      
    }//GEN-LAST:event_formWindowOpened

    private void jMISearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISearchActionPerformed
       
    }//GEN-LAST:event_jMISearchActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jMenuCriarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCriarModActionPerformed
       CriacaoModulosMDI modulo = new CriacaoModulosMDI();
       jDPPrincipal.add(modulo);
       modulo.setVisible(true);
    }//GEN-LAST:event_jMenuCriarModActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
      
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPPrincipal;
    private javax.swing.JMenu jMArquivo;
    private javax.swing.JMenuBar jMBPrincipal;
    private javax.swing.JMenuItem jMGC;
    private javax.swing.JMenuItem jMGE;
    private javax.swing.JMenu jMGrupos;
    private javax.swing.JMenuItem jMICadGrupo;
    private javax.swing.JMenuItem jMICadUser;
    private javax.swing.JMenuItem jMIConfigGrupo;
    private javax.swing.JMenuItem jMIConfigUser;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenuItem jMISearch;
    private javax.swing.JMenuItem jMModConfig;
    private javax.swing.JMenu jMMódulos;
    private javax.swing.JMenu jMRelatorios;
    private javax.swing.JMenuItem jMSobre;
    private javax.swing.JMenu jMUsers;
    private javax.swing.JMenuItem jMenuCriarMod;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
}
