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
public class EdicaoTesteTextoMDI extends javax.swing.JInternalFrame {
 
    /**
     * Creates new form EdicaoModulosMDI
     */
    public EdicaoTesteTextoMDI() {
        initComponents();
    }
    
    Ensino ensino = new Ensino();
    Testes teste = new Testes();
    TestesDAO teste_dao = new TestesDAO();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAlternativas = new javax.swing.ButtonGroup();
        pnlEdicao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTexto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taPergunta = new javax.swing.JTextArea();
        tfAltA = new javax.swing.JTextField();
        tfAltB = new javax.swing.JTextField();
        tfAltC = new javax.swing.JTextField();
        tfAltD = new javax.swing.JTextField();
        btnProximo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        rbAltA = new javax.swing.JRadioButton();
        rbAltB = new javax.swing.JRadioButton();
        rbAltC = new javax.swing.JRadioButton();
        rbAltD = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Edição de Testes - Pré/Pós-Teste (Texto)");
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

        taTexto.setColumns(20);
        taTexto.setRows(5);
        taTexto.setText("Digite aqui o conteúdo desejado...");
        taTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                taTextoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(taTexto);

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

        bgAlternativas.add(rbAltA);

        bgAlternativas.add(rbAltB);

        bgAlternativas.add(rbAltC);

        bgAlternativas.add(rbAltD);

        javax.swing.GroupLayout pnlEdicaoLayout = new javax.swing.GroupLayout(pnlEdicao);
        pnlEdicao.setLayout(pnlEdicaoLayout);
        pnlEdicaoLayout.setHorizontalGroup(
            pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEdicaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbAltB)
                                    .addComponent(rbAltC)
                                    .addComponent(rbAltD))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAltB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfAltC)
                                    .addComponent(tfAltD)))
                            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(rbAltA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAltA))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEdicaoLayout.createSequentialGroup()
                        .addComponent(btnProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addGap(1, 1, 1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlEdicaoLayout.setVerticalGroup(
            pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEdicaoLayout.createSequentialGroup()
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlEdicaoLayout.createSequentialGroup()
                                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAltA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbAltA))
                                .addGap(18, 18, 18)
                                .addComponent(tfAltB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbAltB))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAltC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAltC))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfAltD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAltD)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(pnlEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void taTextoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taTextoMouseReleased
        taTexto.selectAll();
    }//GEN-LAST:event_taTextoMouseReleased

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
        teste.setTexto(taTexto.getText());
        teste.setQuestao(taPergunta.getText());
        teste.setEnd_audio(null);
        teste.setEnd_video(null);
        teste.setTipo_form(1);
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
            taTexto.setText(teste.getTexto());
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
    private javax.swing.ButtonGroup bgAlternativas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlEdicao;
    private javax.swing.JRadioButton rbAltA;
    private javax.swing.JRadioButton rbAltB;
    private javax.swing.JRadioButton rbAltC;
    private javax.swing.JRadioButton rbAltD;
    private javax.swing.JTextArea taPergunta;
    private javax.swing.JTextArea taTexto;
    private javax.swing.JTextField tfAltA;
    private javax.swing.JTextField tfAltB;
    private javax.swing.JTextField tfAltC;
    private javax.swing.JTextField tfAltD;
    // End of variables declaration//GEN-END:variables
}
