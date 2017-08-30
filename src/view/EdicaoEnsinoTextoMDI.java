/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import model.beans.Ensino;
import model.dao.EnsinoDAO;

/**
 *
 * @author Vinicius
 */
public class EdicaoEnsinoTextoMDI extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form EdicaoEnsinoTextoMDI
     */
    public EdicaoEnsinoTextoMDI() {
        initComponents();
    }
    Ensino ensino = new Ensino();
    EnsinoDAO dao = new EnsinoDAO();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEnsinoTexto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTexto = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Edição de Módulos - Ensino (Texto)");

        taTexto.setColumns(20);
        taTexto.setRows(5);
        taTexto.setText("Digite aqui o conteúdeo desejado...");
        taTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                taTextoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(taTexto);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEnsinoTextoLayout = new javax.swing.GroupLayout(pnlEnsinoTexto);
        pnlEnsinoTexto.setLayout(pnlEnsinoTextoLayout);
        pnlEnsinoTextoLayout.setHorizontalGroup(
            pnlEnsinoTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnsinoTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnsinoTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnsinoTextoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        pnlEnsinoTextoLayout.setVerticalGroup(
            pnlEnsinoTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnsinoTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnsinoTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEnsinoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEnsinoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(190, 30, 900, 417);
    }// </editor-fold>//GEN-END:initComponents

    private void taTextoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taTextoMouseReleased
        taTexto.selectAll();
    }//GEN-LAST:event_taTextoMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     ensino.setTipo_form(1);
     ensino.setTexto(taTexto.getText());
     ensino.setEnd_audio(null);
     ensino.setEnd_video(null);
     
     if(!ensino.isEdit()){
            JDesktopPane desktopPaneT = getDesktopPane();
            JInternalFrame [] l = desktopPaneT.getAllFrames();
            for (int i = 0; i < l.length; i++) 
                if (l[i].getClass() == CriacaoModulosMDI.class) {
                    CriacaoModulosMDI criacaoMod = (CriacaoModulosMDI) l[i];
                    criacaoMod.insereNovaLinhaEnsino(ensino);
                    break;
                }
       }
     this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlEnsinoTexto;
    private javax.swing.JTextArea taTexto;
    // End of variables declaration//GEN-END:variables
}
