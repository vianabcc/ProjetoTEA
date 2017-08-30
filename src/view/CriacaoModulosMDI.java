/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.AtividadeModulo;
import model.beans.Ensino;
import model.beans.Modulo;
import model.beans.Testes;
import model.dao.AtividadeModuloDAO;
import model.dao.EnsinoDAO;
import model.dao.ModuloDAO;
import model.dao.TestesDAO;

/**
 *
 * @author Vinicius Viana
 */
public class CriacaoModulosMDI extends javax.swing.JInternalFrame {

      /*
        O QUE FOI FEITO
            - Criação de todo o layout
            - Chamada dos forms de criação de atividades (Testes e Ensino)
            - Botão de exclusão de linhas (sem atualização da ordem dos demais itens)
            - Troca de ordem de duas linhas na tabela (inclusive o vetor)
            - Bloqueio dos botões quando necessário
            - Trazer informações da criação de atividades para inserir na tabela (e armazenar o objeto a ser inserido no banco)
            - Botões: Visualizar, Salvar Módulo, Alterar
        */
    
    private List<Object> atividades = new ArrayList<>();
    
    public CriacaoModulosMDI() {
        initComponents();
        tblAtividades.getColumnModel().getColumn(0).setPreferredWidth(3);
        tblAtividades.getColumnModel().getColumn(1).setPreferredWidth(500);
        tblAtividades.getColumnModel().getColumn(2).setWidth(80);
        
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnView.setEnabled(false);
        btnCima.setEnabled(false);
        btnBaixo.setEnabled(false);
    }
    Modulo modulo = new Modulo();
    Testes teste = new Testes();
    Ensino ensino = new Ensino();
    AtividadeModulo ativ_mod  = new AtividadeModulo();
    TestesDAO teste_dao = new TestesDAO();
    EnsinoDAO ensino_dao = new EnsinoDAO();
    ModuloDAO modulo_dao = new ModuloDAO();
    AtividadeModuloDAO ativ_mod_dao = new AtividadeModuloDAO();
    
    public int ordem;
    public String nome, tipo;
    
    public void alteraLinhaTeste(Testes teste){
        atividades.set(tblAtividades.getSelectedRow()+1, teste);
    }
    
    public void alteraLinhaEnsino(Ensino ensino){
        atividades.set(tblAtividades.getSelectedRow()+1, ensino);
    }
    public void insereNovaLinhaTeste(Testes teste){
        atividades.add(teste);
        DefaultTableModel model = (DefaultTableModel)tblAtividades.getModel();
        model.addRow(new Object[]{tblAtividades.getRowCount()+ 1,
                                  teste.getNome(),
                                  "Teste"
                                 });
        detalhes();
    }
    public void insereNovaLinhaEnsino(Ensino ensino){
        atividades.add(ensino);
        DefaultTableModel model = (DefaultTableModel)tblAtividades.getModel();
        model.addRow(new Object[]{tblAtividades.getRowCount()+ 1,
                                  ensino.getNome(),
                                  "Ensino"
                                 });
        detalhes();
    }
    
    public void detalhes(){
        if(tblAtividades.getRowCount() == 1){
            btnExcluir.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnView.setEnabled(true);
        }
        
        if(tblAtividades.getRowCount() >= 2){
            btnCima.setEnabled(true);
            btnBaixo.setEnabled(true);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCriar = new javax.swing.JPanel();
        btnTestes = new javax.swing.JButton();
        btnEnsino = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlEditar = new javax.swing.JPanel();
        sclpLista = new javax.swing.JScrollPane();
        tblAtividades = new javax.swing.JTable();
        btnCima = new javax.swing.JButton();
        btnBaixo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Criação de Módulos");
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

        pnlCriar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criar atividades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        btnTestes.setText("Testes");
        btnTestes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestesActionPerformed(evt);
            }
        });

        btnEnsino.setText("Ensino");
        btnEnsino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsinoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar Módulo");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCriarLayout = new javax.swing.GroupLayout(pnlCriar);
        pnlCriar.setLayout(pnlCriarLayout);
        pnlCriarLayout.setHorizontalGroup(
            pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriarLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnTestes)
                .addGap(18, 18, 18)
                .addComponent(btnEnsino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(6, 6, 6))
        );
        pnlCriarLayout.setVerticalGroup(
            pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnEnsino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTestes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEditar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar atividades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        tblAtividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ordem", "Nome", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sclpLista.setViewportView(tblAtividades);

        btnCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_up.png"))); // NOI18N
        btnCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCimaActionPerformed(evt);
            }
        });

        btnBaixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_down.png"))); // NOI18N
        btnBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnView.setText("Visualizar");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        lblId.setText("ID");

        javax.swing.GroupLayout pnlEditarLayout = new javax.swing.GroupLayout(pnlEditar);
        pnlEditar.setLayout(pnlEditarLayout);
        pnlEditarLayout.setHorizontalGroup(
            pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sclpLista, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCima, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnlEditarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
        );
        pnlEditarLayout.setVerticalGroup(
            pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlEditarLayout.createSequentialGroup()
                        .addComponent(btnCima, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir))
                    .addComponent(sclpLista, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(251, 251, 251))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCriar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(210, 80, 826, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnTestesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestesActionPerformed
        CriacaoTesteMDI  criacaoTeste = new CriacaoTesteMDI();
        
        JDesktopPane desktopPaneT = getDesktopPane();
        desktopPaneT.add(criacaoTeste);
        criacaoTeste.setVisible(true);           
    }//GEN-LAST:event_btnTestesActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnEnsinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsinoActionPerformed
        CriacaoEnsinoMDI  criacaoEnsino = new CriacaoEnsinoMDI();
        
        JDesktopPane desktopPaneE = getDesktopPane();
        desktopPaneE.add(criacaoEnsino);
        criacaoEnsino.setVisible(true);
    }//GEN-LAST:event_btnEnsinoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tblAtividades.getSelectedRow() != -1){
            atividades.remove(tblAtividades.getSelectedRow());
        
            for(int i=tblAtividades.getSelectedRow()+1; i<tblAtividades.getRowCount(); i++){
                ((DefaultTableModel) tblAtividades.getModel()).setValueAt((int)(tblAtividades.getValueAt(i, 0)) - 1, i, 0);       
            }
            ((DefaultTableModel) tblAtividades.getModel()).removeRow(tblAtividades.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para remover!");
        }
        
        if(tblAtividades.getRowCount() == 0){
           btnExcluir.setEnabled(false);
           btnAlterar.setEnabled(false);
           btnView.setEnabled(false);
        }
        if(tblAtividades.getRowCount() < 2){
            btnCima.setEnabled(false);
            btnBaixo.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblAtividades.getSelectedRow() != -1){
              if(tblAtividades.getValueAt(tblAtividades.getSelectedRow(), 2).equals("Teste")) {
                teste = (Testes) atividades.get(tblAtividades.getSelectedRow());
                teste.setEdit(true);
                switch(teste.getTipo_form()){
                    case 1:
                        //Set do tipo de form a ser chamado
                        EdicaoTesteTextoMDI edicaoModT = new EdicaoTesteTextoMDI();                 
                        edicaoModT.teste = this.teste;
                        
                        JDesktopPane desktopPaneT = getDesktopPane();
                        desktopPaneT.add(edicaoModT);
                        edicaoModT.setVisible(true);
                    break;
                    case 2:
                        EdicaoTesteAudioMDI edicaoModA = new EdicaoTesteAudioMDI();
                        edicaoModA.teste = this.teste;
                        
                        JDesktopPane desktopPaneA = getDesktopPane();
                        desktopPaneA.add(edicaoModA);
                        edicaoModA.setVisible(true);
                    break;
                    case 3:
                        EdicaoTesteVideoMDI edicaoModV = new EdicaoTesteVideoMDI();
                        edicaoModV.teste = this.teste;
                        
                        JDesktopPane desktopPaneV = getDesktopPane();
                        desktopPaneV.add(edicaoModV);
                        edicaoModV.setVisible(true);
                    break;
                    case 4:
                        EdicaoTesteTextoVideoMDI edicaoModTV = new EdicaoTesteTextoVideoMDI();
                        edicaoModTV.teste = this.teste;
                        
                        JDesktopPane desktopPaneTV = getDesktopPane();
                        desktopPaneTV.add(edicaoModTV);
                        edicaoModTV.setVisible(true);
                    break;
                    case 5:
                        EdicaoTesteTextoAudioMDI edicaoModTA = new EdicaoTesteTextoAudioMDI();
                        edicaoModTA.teste = this.teste;
                        
                        JDesktopPane desktopPaneTA = getDesktopPane();
                        desktopPaneTA.add(edicaoModTA);
                        edicaoModTA.setVisible(true);
                    break;
                    case 6:
                        EdicaoTesteVideoAudioMDI edicaoModVA = new EdicaoTesteVideoAudioMDI();
                        edicaoModVA.teste = this.teste;
                        
                        JDesktopPane desktopPaneVA = getDesktopPane();
                        desktopPaneVA.add(edicaoModVA);
                        edicaoModVA.setVisible(true);
                    break;
                } 
            }else if(tblAtividades.getValueAt(tblAtividades.getSelectedRow(), 2).equals("Ensino")){
                ensino = (Ensino) atividades.get(tblAtividades.getSelectedRow());
                ensino.setEdit(true);
                switch(ensino.getTipo_form()){
                    case 1:
                        EdicaoEnsinoTextoMDI ensinoT = new EdicaoEnsinoTextoMDI();
                        ensinoT.ensino = this.ensino;
                        
                        JDesktopPane desktopPaneT = getDesktopPane();
                        desktopPaneT.add(ensinoT);
                        ensinoT.setVisible(true);
                    break;
                    case 2:
                        EdicaoEnsinoAudioMDI ensinoA = new EdicaoEnsinoAudioMDI();
                        ensinoA.ensino = this.ensino;
                        
                        JDesktopPane desktopPaneA = getDesktopPane();
                        desktopPaneA.add(ensinoA);
                        ensinoA.setVisible(true);
                    break;
                    case 3:
                        EdicaoEnsinoVideoMDI ensinoV = new EdicaoEnsinoVideoMDI();
                        ensinoV.ensino = this.ensino;
                        
                        JDesktopPane desktopPaneV = getDesktopPane();
                        desktopPaneV.add(ensinoV);
                        ensinoV.setVisible(true);
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma atividade para alterar!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        if (tblAtividades.getSelectedRow() != -1){
            if(tblAtividades.getValueAt(tblAtividades.getSelectedRow(), 2).equals("Teste")) {
                teste = (Testes) atividades.get(tblAtividades.getSelectedRow());
                System.out.println(teste.getAlt_certa());
                teste.setEdit(false);
                switch(teste.getTipo_form()){
                    case 1:
                        //Set do tipo de form a ser chamado
                        TesteTextoMDI ModT = new TesteTextoMDI();                 
                        ModT.teste = this.teste;
                        
                        JDesktopPane desktopPaneT = getDesktopPane();
                        desktopPaneT.add(ModT);
                        ModT.setVisible(true);
                    break;
                    case 2:
                        TesteAudioMDI ModA = new TesteAudioMDI();
                        ModA.teste = this.teste;
                        
                        JDesktopPane desktopPaneA = getDesktopPane();
                        desktopPaneA.add(ModA);
                        ModA.setVisible(true);
                    break;
                    case 3:
                        TesteVideoMDI ModV = new TesteVideoMDI();
                        ModV.teste = this.teste;
                        
                        JDesktopPane desktopPaneV = getDesktopPane();
                        desktopPaneV.add(ModV);
                        ModV.setVisible(true);
                    break;
                    case 4:
                        TesteTextoVideoMDI ModTV = new TesteTextoVideoMDI();
                        ModTV.teste = this.teste;
                        
                        JDesktopPane desktopPaneTV = getDesktopPane();
                        desktopPaneTV.add(ModTV);
                        ModTV.setVisible(true);
                    break;
                    case 5:
                        TesteTextoAudioMDI ModTA = new TesteTextoAudioMDI();
                        ModTA.teste = this.teste;
                        
                        JDesktopPane desktopPaneTA = getDesktopPane();
                        desktopPaneTA.add(ModTA);
                        ModTA.setVisible(true);
                    break;
                    case 6:
                        TesteVideoAudioMDI ModVA = new TesteVideoAudioMDI();
                        ModVA.teste = this.teste;
                        
                        JDesktopPane desktopPaneVA = getDesktopPane();
                        desktopPaneVA.add(ModVA);
                        ModVA.setVisible(true);
                    break;
                } 
            } else if(tblAtividades.getValueAt(tblAtividades.getSelectedRow(), 2).equals("Ensino")){
                ensino = (Ensino) atividades.get(tblAtividades.getSelectedRow());
                ensino.setEdit(false);
                
                switch(ensino.getTipo_form()){
                    case 1:
                        EnsinoTextoMDI ensinoT = new EnsinoTextoMDI();
                        ensinoT.ensino = this.ensino;
                        
                        JDesktopPane desktopPaneT = getDesktopPane();
                        desktopPaneT.add(ensinoT);
                        ensinoT.setVisible(true);
                    break;
                    case 2:
                        EnsinoAudioMDI ensinoA = new EnsinoAudioMDI();
                        ensinoA.ensino = this.ensino;
                        
                        JDesktopPane desktopPaneA = getDesktopPane();
                        desktopPaneA.add(ensinoA);
                        ensinoA.setVisible(true);
                    break;
                    case 3:
                        EnsinoVideoMDI ensinoV = new EnsinoVideoMDI();
                        ensinoV.ensino = this.ensino;
                        
                        JDesktopPane desktopPaneV = getDesktopPane();
                        desktopPaneV.add(ensinoV);
                        ensinoV.setVisible(true);
                    break;
                }
            }  
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma atividade para visualizar!");
        } 
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       if (txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Dê um nome ao módulo!");  
        }else{
            modulo.setNome_modulo(txtNome.getText());
            modulo = modulo_dao.salvar(modulo);
            ativ_mod.setId_modulo(modulo.getId_modulo());

            for (int i=0; i<tblAtividades.getRowCount(); i++){
                ativ_mod.setOrdem(i);
                if(tblAtividades.getValueAt(i, 2).equals("Teste")){
                   teste = teste_dao.salvar((Testes) atividades.get(i));
                   ativ_mod.setId_teste(teste.getId_teste());
                   ativ_mod_dao.relacionar_tabelas_teste(ativ_mod);
                }else if(tblAtividades.getValueAt(i, 2).equals("Ensino")){
                       ensino = ensino_dao.salvar((Ensino)atividades.get(i));
                       ativ_mod.setId_atividade_ensino(ensino.getId_atividade_ensino());
                       ativ_mod_dao.relacionar_tabelas_ensino(ativ_mod);
                }
            }
            
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCimaActionPerformed
       if(tblAtividades.getSelectedRow() != -1){
           if(tblAtividades.getSelectedRow() != 0){ 
               nome = (String)tblAtividades.getValueAt(tblAtividades.getSelectedRow()-1, 1);
               tipo = (String)tblAtividades.getValueAt(tblAtividades.getSelectedRow()-1, 2);

               tblAtividades.setValueAt(tblAtividades.getValueAt(tblAtividades.getSelectedRow(),1),tblAtividades.getSelectedRow()-1 , 1);
               tblAtividades.setValueAt(tblAtividades.getValueAt(tblAtividades.getSelectedRow(),2),tblAtividades.getSelectedRow()-1 , 2);

               tblAtividades.setValueAt(nome, tblAtividades.getSelectedRow(), 1);
               tblAtividades.setValueAt(tipo, tblAtividades.getSelectedRow(), 2);
               
               Object tmp1 = new Object();
               
               tmp1 = atividades.get(tblAtividades.getSelectedRow()-1);
               
               atividades.set(tblAtividades.getSelectedRow()-1, atividades.get(tblAtividades.getSelectedRow()));
               atividades.set(tblAtividades.getSelectedRow(), tmp1);
               
           }
       }else{
           JOptionPane.showMessageDialog(null, "Selecione uma linha!");
       }
    }//GEN-LAST:event_btnCimaActionPerformed

    private void btnBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixoActionPerformed
        if(tblAtividades.getSelectedRow() != -1){
           if(tblAtividades.getSelectedRow() != tblAtividades.getRowCount()-1){ 
               nome = (String)tblAtividades.getValueAt(tblAtividades.getSelectedRow()+1, 1);
               tipo = (String)tblAtividades.getValueAt(tblAtividades.getSelectedRow()+1, 2);

               tblAtividades.setValueAt(tblAtividades.getValueAt(tblAtividades.getSelectedRow(),1),tblAtividades.getSelectedRow()+1 , 1);
               tblAtividades.setValueAt(tblAtividades.getValueAt(tblAtividades.getSelectedRow(),2),tblAtividades.getSelectedRow()+1 , 2);

               tblAtividades.setValueAt(nome, tblAtividades.getSelectedRow(), 1);
               tblAtividades.setValueAt(tipo, tblAtividades.getSelectedRow(), 2);
               
               Object tmp1 = new Object();
               
               tmp1 = atividades.get(tblAtividades.getSelectedRow()+1);
               
               atividades.set(tblAtividades.getSelectedRow()+1, atividades.get(tblAtividades.getSelectedRow()));    
               atividades.set(tblAtividades.getSelectedRow(), tmp1);
           }
       }else{
           JOptionPane.showMessageDialog(null, "Selecione uma linha!");
       }
    }//GEN-LAST:event_btnBaixoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBaixo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCima;
    private javax.swing.JButton btnEnsino;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTestes;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlCriar;
    private javax.swing.JPanel pnlEditar;
    private javax.swing.JScrollPane sclpLista;
    private javax.swing.JTable tblAtividades;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
