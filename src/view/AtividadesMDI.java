/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import model.beans.AtividadeModulo;
import model.beans.Ensino;
import model.beans.Historico;
import model.beans.Modulo;
import model.beans.Testes;
import model.beans.Usuario;
import model.dao.AtividadeModuloDAO;
import model.dao.EnsinoDAO;
import model.dao.HistoricoDAO;
import model.dao.ModuloDAO;
import model.dao.TestesDAO;

/**
 *
 * @author Vinicius Viana
 */
public class AtividadesMDI extends javax.swing.JInternalFrame {
    Usuario user = new Usuario();
    Historico hist = new Historico();
    HistoricoDAO hist_dao = new HistoricoDAO();
    Modulo mod = new Modulo();
    ModuloDAO mod_dao = new ModuloDAO();
    AtividadeModulo ativ_mod = new AtividadeModulo();
    AtividadeModuloDAO ativ_mod_dao = new AtividadeModuloDAO();
    Testes teste = new Testes();
    TestesDAO teste_dao = new TestesDAO();
    Ensino ensino = new Ensino();
    EnsinoDAO ensino_dao = new EnsinoDAO();
    
    public void SituacaoAtual(){
        hist = hist_dao.consultar(user);
    }
    
    public void iniciarModulo(AtividadeModulo ativ_mod){
        if(ativ_mod.getId_teste() != 0){
            teste.setId_teste(ativ_mod.getId_teste());
            teste = teste_dao.popular(teste);
            
            teste.setEdit(false);
            switch(teste.getTipo_form()){
                case 1:
                    //Set do tipo de form a ser chamado
                    TesteTextoMDI ModT = new TesteTextoMDI();                 
                    ModT.teste = this.teste;
                    ModT.ativ_mod = this.ativ_mod;
                    ModT.user = this.user;
                            
                    JDesktopPane desktopPaneT = getDesktopPane();
                    desktopPaneT.add(ModT);
                    ModT.setVisible(true);
                break;
                case 2:
                    TesteAudioMDI ModA = new TesteAudioMDI();
                    ModA.teste = this.teste;
                    ModA.ativ_mod = this.ativ_mod;
                    ModA.user = this.user;
                    
                    JDesktopPane desktopPaneA = getDesktopPane();
                    desktopPaneA.add(ModA);
                    ModA.setVisible(true);
                break;
                case 3:
                    TesteVideoMDI ModV = new TesteVideoMDI();
                    ModV.teste = this.teste;
                    ModV.ativ_mod = this.ativ_mod;
                    ModV.user = this.user;
                    
                    JDesktopPane desktopPaneV = getDesktopPane();
                    desktopPaneV.add(ModV);
                    ModV.setVisible(true);
                break;
                case 4:
                    TesteTextoVideoMDI ModTV = new TesteTextoVideoMDI();
                    ModTV.teste = this.teste;
                    ModTV.ativ_mod = this.ativ_mod;
                    ModTV.user = this.user;
                    
                    JDesktopPane desktopPaneTV = getDesktopPane();
                    desktopPaneTV.add(ModTV);
                    ModTV.setVisible(true);
                break;
                case 5:
                    TesteTextoAudioMDI ModTA = new TesteTextoAudioMDI();
                    ModTA.teste = this.teste;
                    ModTA.ativ_mod = this.ativ_mod;
                    ModTA.user = this.user;
                    
                    JDesktopPane desktopPaneTA = getDesktopPane();
                    desktopPaneTA.add(ModTA);
                    ModTA.setVisible(true);
                break;
                case 6:
                    TesteVideoAudioMDI ModVA = new TesteVideoAudioMDI();
                    ModVA.teste = this.teste;
                    ModVA.ativ_mod = this.ativ_mod;
                    ModVA.user = this.user;
                    
                    JDesktopPane desktopPaneVA = getDesktopPane();
                    desktopPaneVA.add(ModVA);
                    ModVA.setVisible(true);
                break;
            }
            
            this.dispose();
        }
        
        if(ativ_mod.getId_atividade_ensino() != 0){
            ensino.setId_atividade_ensino(ativ_mod.getId_atividade_ensino());
            ensino = ensino_dao.popular(ensino);
            
            ensino.setEdit(false);
                
            switch(ensino.getTipo_form()){
                case 1:
                    EnsinoTextoMDI ensinoT = new EnsinoTextoMDI();
                    ensinoT.ensino = this.ensino;
                    ensinoT.ativ_mod = this.ativ_mod;
                    ensinoT.user = this.user;
                            
                    JDesktopPane desktopPaneT = getDesktopPane();
                    desktopPaneT.add(ensinoT);
                    ensinoT.setVisible(true);
                break;
                case 2:
                    EnsinoAudioMDI ensinoA = new EnsinoAudioMDI();
                    ensinoA.ensino = this.ensino;
                    ensinoA.ativ_mod = this.ativ_mod;
                    ensinoA.user = this.user;
                            
                    JDesktopPane desktopPaneA = getDesktopPane();
                    desktopPaneA.add(ensinoA);
                    ensinoA.setVisible(true);
                break;
                case 3:
                    EnsinoVideoMDI ensinoV = new EnsinoVideoMDI();
                    ensinoV.ensino = this.ensino;
                    ensinoV.ativ_mod = this.ativ_mod;
                    ensinoV.user = this.user;
                    
                    JDesktopPane desktopPaneV = getDesktopPane();
                    desktopPaneV.add(ensinoV);
                    ensinoV.setVisible(true);
                break;
            }
            this.dispose();    
        }
    }
    
    public AtividadesMDI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAtividades = new javax.swing.JPanel();
        lblMod = new javax.swing.JLabel();
        lblAtiv = new javax.swing.JLabel();
        btnRealizar = new javax.swing.JButton();
        lblRMod = new javax.swing.JLabel();
        lblRAtiv = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblAtivConcluida = new javax.swing.JLabel();
        lblAtivConcluida1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Atividades - Situação atual");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblMod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMod.setText("Módulo: ");

        lblAtiv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAtiv.setText("Atividade: ");

        btnRealizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRealizar.setText("Realizar atividade");
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });

        lblRMod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblRAtiv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblAtivConcluida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblAtivConcluida1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAtivConcluida1.setText("A tarefa atual é");

        javax.swing.GroupLayout pnlAtividadesLayout = new javax.swing.GroupLayout(pnlAtividades);
        pnlAtividades.setLayout(pnlAtividadesLayout);
        pnlAtividadesLayout.setHorizontalGroup(
            pnlAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAtividadesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnRealizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(89, 89, 89))
            .addGroup(pnlAtividadesLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblAtivConcluida1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlAtividadesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtividadesLayout.createSequentialGroup()
                        .addComponent(lblAtivConcluida, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlAtividadesLayout.createSequentialGroup()
                        .addComponent(lblMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRMod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAtiv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        pnlAtividadesLayout.setVerticalGroup(
            pnlAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtividadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAtivConcluida1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(pnlAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblRMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lblAtivConcluida, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(400, 80, 450, 180);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        SituacaoAtual();
        
         if(hist == null){
            lblRMod.setText("1");
            lblRAtiv.setText("1");
            mod.setId_modulo(1);
            ativ_mod.setId_modulo(mod.getId_modulo());
            ativ_mod.setOrdem(0);
            ativ_mod = ativ_mod_dao.consulta(ativ_mod);

        }else{
            boolean acabou = false;
            if(hist.getStatus_ativ().equals("C")){
                if(hist.getId_modulo() == mod_dao.contaModulos()){
                    ativ_mod.setId_modulo(hist.getId_modulo());

                    if(hist.getOrdem() == (ativ_mod_dao.contaAtividades(ativ_mod)-2)){
                        acabou = true;
                    }
                }else{
                    acabou = false;
                    lblRMod.setText(""+hist.getId_modulo());
                    lblRAtiv.setText(""+(hist.getOrdem()+2));
                    ativ_mod.setId_modulo(hist.getId_modulo());
                    ativ_mod.setOrdem(hist.getOrdem());

                    ativ_mod = ativ_mod_dao.consultaProxTeste(ativ_mod);
                }  
            }else{
                acabou = false;
                lblRMod.setText(""+hist.getId_modulo());
                lblRAtiv.setText(""+(hist.getOrdem()));
                ativ_mod.setId_modulo(hist.getId_modulo());
                ativ_mod.setOrdem(hist.getOrdem());
                ativ_mod = ativ_mod_dao.consulta(ativ_mod);
                
            }
            
            if(ativ_mod.getId_teste() == 0 && ativ_mod.getId_atividade_ensino() == 0){
                if(!acabou){
                    JOptionPane.showMessageDialog(null, "Você acaba de completar um módulo!");
                    ativ_mod.setId_modulo(ativ_mod.getId_modulo()+1);
                    ativ_mod = ativ_mod_dao.consulta(ativ_mod);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Todos os módulos foram concluídos!");
                    btnRealizar.setEnabled(false);
                    this.dispose();
                }
            }
        }
        
    
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        iniciarModulo(ativ_mod);
    }//GEN-LAST:event_btnRealizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JLabel lblAtiv;
    private javax.swing.JLabel lblAtivConcluida;
    private javax.swing.JLabel lblAtivConcluida1;
    private javax.swing.JLabel lblMod;
    private javax.swing.JLabel lblRAtiv;
    private javax.swing.JLabel lblRMod;
    private javax.swing.JPanel pnlAtividades;
    // End of variables declaration//GEN-END:variables
}
