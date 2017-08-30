/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import model.beans.Ensino;
import model.beans.Testes;
import model.dao.TestesDAO;

/**
 *
 * @author Vinicius
 */
public class EdicaoTesteVideoAudioMDI extends javax.swing.JInternalFrame {

    /**
     * Creates new form EdicaoModulosVideoAudioMDI
     */
    public EdicaoTesteVideoAudioMDI() {
        initComponents();
    }
    
    Ensino ensino = new Ensino();
    Testes teste = new Testes();
    TestesDAO teste_dao = new TestesDAO();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taPergunta = new javax.swing.JTextArea();
        tfAltA = new javax.swing.JTextField();
        tfAltB = new javax.swing.JTextField();
        tfAltC = new javax.swing.JTextField();
        tfAltD = new javax.swing.JTextField();
        btnProximo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        rbAltB = new javax.swing.JRadioButton();
        rbAltD = new javax.swing.JRadioButton();
        rbAltC = new javax.swing.JRadioButton();
        rbAltA = new javax.swing.JRadioButton();
        txtYoutubeAudio = new javax.swing.JTextField();
        lblYoutubeAudio = new javax.swing.JLabel();
        txtYoutubeVideo = new javax.swing.JTextField();
        lblYoutubeVideo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Edição de Testes - Pré/Pós-Teste (Vídeo com Áudio)");
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

        taPergunta.setColumns(20);
        taPergunta.setRows(5);
        taPergunta.setText("Digite aqui a pergunta desejada...");
        taPergunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                taPerguntaMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(taPergunta);

        tfAltA.setText("Alternativa A");
        tfAltA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tfAltAMouseReleased(evt);
            }
        });

        tfAltB.setText("Alternativa B");
        tfAltB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tfAltBMouseReleased(evt);
            }
        });

        tfAltC.setText("Alternativa C");
        tfAltC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tfAltCMouseReleased(evt);
            }
        });

        tfAltD.setText("Alternativa D");
        tfAltD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tfAltDMouseReleased(evt);
            }
        });

        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblYoutubeAudio.setText("Link do Youtube (Áudio): ");

        lblYoutubeVideo.setText("Link do Youtube (Vídeo): ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rbAltB)
                                .addComponent(rbAltC)
                                .addComponent(rbAltD))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(rbAltA)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAltB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfAltC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfAltD)
                            .addComponent(tfAltA)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblYoutubeVideo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtYoutubeVideo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblYoutubeAudio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtYoutubeAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYoutubeAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYoutubeAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYoutubeVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYoutubeVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfAltA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfAltB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfAltC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfAltD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbAltA)
                                .addGap(38, 38, 38))
                            .addComponent(rbAltB))
                        .addGap(18, 18, 18)
                        .addComponent(rbAltC)
                        .addGap(18, 18, 18)
                        .addComponent(rbAltD)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(190, 30, 900, 364);
    }// </editor-fold>//GEN-END:initComponents

    private void taPerguntaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taPerguntaMouseReleased
        taPergunta.selectAll();
    }//GEN-LAST:event_taPerguntaMouseReleased

    private void tfAltAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfAltAMouseReleased
        tfAltA.selectAll();
    }//GEN-LAST:event_tfAltAMouseReleased

    private void tfAltBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfAltBMouseReleased
        tfAltB.selectAll();
    }//GEN-LAST:event_tfAltBMouseReleased

    private void tfAltCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfAltCMouseReleased
        tfAltC.selectAll();
    }//GEN-LAST:event_tfAltCMouseReleased

    private void tfAltDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfAltDMouseReleased
        tfAltD.selectAll();
    }//GEN-LAST:event_tfAltDMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        teste.setTexto(null);
        teste.setQuestao(taPergunta.getText());
        teste.setEnd_audio(txtYoutubeAudio.getText());
        teste.setEnd_video(txtYoutubeVideo.getText());
        teste.setTipo_form(6);
        if(rbAltA.isSelected())
            teste.setAlt_certa("a");
        if(rbAltB.isSelected())
            teste.setAlt_certa("b");
        if(rbAltC.isSelected())
            teste.setAlt_certa("c");
        if(rbAltD.isSelected())
            teste.setAlt_certa("d");
        
        teste.setAlt_a(tfAltA.getText());
        teste.setAlt_b(tfAltB.getText());
        teste.setAlt_c(tfAltC.getText());
        teste.setAlt_d(tfAltD.getText());
        
        if(!teste.isEdit()){
            JDesktopPane desktopPaneT = getDesktopPane();
            JInternalFrame [] l = desktopPaneT.getAllFrames();
            for (int i = 0; i < l.length; i++) 
                if (l[i].getClass() == CriacaoModulosMDI.class) {
                    CriacaoModulosMDI criacaoMod = (CriacaoModulosMDI) l[i];
                    criacaoMod.insereNovaLinhaTeste(teste);
                    break;
                }
        }
        this.dispose();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if(teste.getAlt_certa() != null){
         txtYoutubeVideo.setText(teste.getEnd_video());
         txtYoutubeAudio.setText(teste.getEnd_audio());
         taPergunta.setText(teste.getQuestao());
         tfAltA.setText(teste.getAlt_a());
         tfAltB.setText(teste.getAlt_b());
         tfAltC.setText(teste.getAlt_c());
         tfAltD.setText(teste.getAlt_d());
         switch(teste.getAlt_certa()){
             case "a":
                 rbAltA.setSelected(true);
             break;
             case "b":
                 rbAltB.setSelected(true);
             break;
             case "c":
                 rbAltC.setSelected(true);
             break;
             case "d":
                 rbAltD.setSelected(true);
             break;
         }
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblYoutubeAudio;
    private javax.swing.JLabel lblYoutubeVideo;
    private javax.swing.JRadioButton rbAltA;
    private javax.swing.JRadioButton rbAltB;
    private javax.swing.JRadioButton rbAltC;
    private javax.swing.JRadioButton rbAltD;
    private javax.swing.JTextArea taPergunta;
    private javax.swing.JTextField tfAltA;
    private javax.swing.JTextField tfAltB;
    private javax.swing.JTextField tfAltC;
    private javax.swing.JTextField tfAltD;
    private javax.swing.JTextField txtYoutubeAudio;
    private javax.swing.JTextField txtYoutubeVideo;
    // End of variables declaration//GEN-END:variables
}
