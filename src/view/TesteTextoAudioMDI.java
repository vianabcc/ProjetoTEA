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
import model.dao.TestesDAO;

/**
 *
 * @author Vinicius
 */
public class TesteTextoAudioMDI extends javax.swing.JInternalFrame {

    /**
     * Creates new form EdicaoModulosMDI
     */
    public TesteTextoAudioMDI() {
        initComponents();
    }
    
    Usuario user = new Usuario();
    Modulo mod = new Modulo();
    Ensino ensino = new Ensino();
    Testes teste = new Testes();
    TestesDAO teste_dao = new TestesDAO();
    EnsinoDAO ensino_dao = new EnsinoDAO();
    Historico hist = new Historico();
    HistoricoDAO hist_dao = new HistoricoDAO();
    AtividadeModulo ativ_mod = new AtividadeModulo();
    AtividadeModuloDAO ativ_mod_dao = new AtividadeModuloDAO();
    String op;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAlternativas = new javax.swing.ButtonGroup();
        pnlEdicao = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        rbAltA = new javax.swing.JRadioButton();
        rbAltB = new javax.swing.JRadioButton();
        rbAltC = new javax.swing.JRadioButton();
        rbAltD = new javax.swing.JRadioButton();
        lblPergunta = new javax.swing.JLabel();
        lblAltA = new javax.swing.JLabel();
        lblAltB = new javax.swing.JLabel();
        lblAltC = new javax.swing.JLabel();
        lblAltD = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        lblAudio = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Módulos - Pré/Pós-Teste (Texto e Áudio)");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnOk.setText("OK!");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        bgAlternativas.add(rbAltA);

        bgAlternativas.add(rbAltB);

        bgAlternativas.add(rbAltC);

        bgAlternativas.add(rbAltD);

        lblPergunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("COLOCAR TEXTO AQUI");

        lblAudio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAudio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAudio.setText("COLOCAR ÁUDIO AQUI");

        javax.swing.GroupLayout pnlEdicaoLayout = new javax.swing.GroupLayout(pnlEdicao);
        pnlEdicao.setLayout(pnlEdicaoLayout);
        pnlEdicaoLayout.setHorizontalGroup(
            pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEdicaoLayout.createSequentialGroup()
                        .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbAltA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAltA, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlEdicaoLayout.createSequentialGroup()
                                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbAltC)
                                            .addComponent(rbAltB))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAltB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblAltC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(pnlEdicaoLayout.createSequentialGroup()
                                        .addComponent(rbAltD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblAltD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(pnlEdicaoLayout.createSequentialGroup()
                        .addComponent(btnEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk))
                    .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        pnlEdicaoLayout.setVerticalGroup(
            pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEdicaoLayout.createSequentialGroup()
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAltA, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAltA))
                        .addGap(17, 17, 17)
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAltB)
                            .addComponent(lblAltB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAltC)
                            .addComponent(lblAltC, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbAltD)
                            .addComponent(lblAltD, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(190, 30, 900, 528);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if(rbAltA.isSelected()){
            op = "a";
        }
        if(rbAltB.isSelected()){
            op = "b";
        }
        if(rbAltC.isSelected()){
            op = "c";
        }
        if(rbAltD.isSelected()){
            op = "d";
        }
        
        if(teste.getAlt_certa().equals(op)){
           JOptionPane.showMessageDialog(null, "Alternativa correta!");
           ativ_mod = ativ_mod_dao.consulta(ativ_mod);
           
           hist.setCpf(user.getCpf());
           hist.setId_grupo(1);
           hist.setId_modulo(ativ_mod.getId_modulo());
           hist.setOrdem(ativ_mod.getOrdem());
           hist.setStatus_ativ("C");
           hist.setResposta(op);
           
           if(mod.getPrepos() == 0){
               hist.setFase("PRE");
           }else{
               hist.setFase("POS");
           }
          
           hist_dao.cadastrar(hist);
           
           this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Alternativa incorreta!");
                
            if(mod.getPrepos() == 0){
                ativ_mod = ativ_mod_dao.consultaProx(ativ_mod);

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
            }else{
                mod.setPrepos(0);
                JOptionPane.showMessageDialog(null, "Não foi possível concluir o teste! Inicie-o novamente!");
                this.dispose();
            }  
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       if(!teste.isEdit()){
            ativ_mod = ativ_mod_dao.consulta(ativ_mod);
            teste.setId_teste(ativ_mod.getId_teste());
            teste = teste_dao.popular(teste);
            btnOk.setVisible(false);
        }else{
            btnEnviar.setVisible(false);
            btnCancelar.setVisible(false);
        }
            lblTexto.setText(teste.getTexto());
            lblAudio.setText(teste.getEnd_audio());
            lblPergunta.setText(teste.getQuestao());
            lblAltA.setText(teste.getAlt_a());
            lblAltB.setText(teste.getAlt_b());
            lblAltC.setText(teste.getAlt_c());
            lblAltD.setText(teste.getAlt_d());   
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        if(!teste.isEdit()){
            hist.setCpf(user.getCpf());
            hist.setId_grupo(1);
            hist.setId_modulo(ativ_mod.getId_modulo());
            hist.setOrdem(ativ_mod.getOrdem());
            hist.setStatus_ativ("P");
            hist.setResposta(null);
            if(mod.getPrepos() == 0){
                hist.setFase("PRE");
            }else{
                hist.setFase("POS");
            }

            hist_dao.cadastrar(hist); 
        } 
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAlternativas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblAltA;
    private javax.swing.JLabel lblAltB;
    private javax.swing.JLabel lblAltC;
    private javax.swing.JLabel lblAltD;
    private javax.swing.JLabel lblAudio;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JPanel pnlEdicao;
    private javax.swing.JRadioButton rbAltA;
    private javax.swing.JRadioButton rbAltB;
    private javax.swing.JRadioButton rbAltC;
    private javax.swing.JRadioButton rbAltD;
    // End of variables declaration//GEN-END:variables
}
