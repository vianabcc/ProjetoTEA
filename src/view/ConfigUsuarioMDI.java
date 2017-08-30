/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.Formacao;
import model.beans.Usuario;
import model.dao.FormacaoDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author Vinicius
 */
public class ConfigUsuarioMDI extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConfigUsuario
     */
    
    public ConfigUsuarioMDI() {
        initComponents();
    }
   
    UsuarioDAO dao = new UsuarioDAO();
    public Usuario user = new Usuario();
    public Formacao formacao = new Formacao();
    public FormacaoDAO fdao = new FormacaoDAO();

    public void PopularCampos(){
        
         user = dao.popular(this.user.getUserCnfg());
         
         txtfCpf.setText(user.getCpf());
         txtNome.setText(user.getNome());
         txtUsuario.setText(user.getUsuario());
         txtSenha.setText(user.getSenha());
         txtfDataNasc.setText(user.getData_nasc());
         txtEmail.setText(user.getEmail());
         txtMunicipio.setText(user.getMunicipio());
         txtInstituição.setText(user.getInstituicao());
         txtTempoL.setText(user.getTempo_leciona());
         txtTempoLA.setText(user.getTempo_leciona_area());
         txtQtdAulas.setText(""+user.getQtd_escolas());
         txtChaveSecreta.setText(user.getChave_secreta());
         switch(user.getSexo()){
             case "F":
                 cbSexo.setSelectedIndex(1);
             break;
             case "M":
                 cbSexo.setSelectedIndex(2);
             break;
        }
        switch(user.getTipo_user()){
             case "adm":
                 cbTipoUser.setSelectedIndex(1);
                 cbTipoUser.setVisible(true);
                 tgbAtivo.setVisible(true);
             break;
             case "tutor":
                 cbTipoUser.setSelectedIndex(1);
                 cbTipoUser.setVisible(true);
                 tgbAtivo.setVisible(true);
             break;
             case "aluno":
                 cbTipoUser.setSelectedIndex(3);
                 cbTipoUser.setVisible(false);
                 tgbAtivo.setVisible(false);
             break;
         }
        
        if(user.isAulas_mais_uma_escola()){
           rbSimAulas.setSelected(true);
        }else{
            rbNaoAulas.setSelected(true);
        }
        if(user.isAtua_autismo()){
           rbSimAtuaAutismo.setSelected(true);
        }else{
            rbNaoAtuaAutismo.setSelected(true);
        }
        if(user.isAtuou_deficiencia()){
           rbSimAtuouDeficiencia.setSelected(true);
        }else{
            rbNaoAtuouDeficiencia.setSelected(true);
        }
        if(user.isEscola_privada()){
           rbSimAulasP.setSelected(true);
        }else{
            rbNaoAulasP.setSelected(true);
        }
        
    }
    
    public void Listar(){
        try {
            
            DefaultTableModel model = (DefaultTableModel)tblFormacao.getModel();
            model.setNumRows(0);
            FormacaoDAO fdao = new FormacaoDAO();
            
            for(Formacao f: fdao.consultar(user.getCpf())){
                model.addRow(new Object[]{
                    f.getNivel(),
                    f.getCurso()         
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAulas = new javax.swing.ButtonGroup();
        bgAulasP = new javax.swing.ButtonGroup();
        bgAtuouAutismo = new javax.swing.ButtonGroup();
        bgAtuouDeficiencia = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlDados = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        lblDataNasc = new javax.swing.JLabel();
        txtfDataNasc = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblFormacao = new javax.swing.JLabel();
        lblInstituicao = new javax.swing.JLabel();
        txtInstituição = new javax.swing.JTextField();
        lblLocal = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        lblTempoL = new javax.swing.JLabel();
        txtTempoL = new javax.swing.JTextField();
        lblTempoLA = new javax.swing.JLabel();
        txtTempoLA = new javax.swing.JTextField();
        rbSimAulas = new javax.swing.JRadioButton();
        rbNaoAulas = new javax.swing.JRadioButton();
        lblAulas = new javax.swing.JLabel();
        txtQtdAulas = new javax.swing.JTextField();
        lblAulasP = new javax.swing.JLabel();
        lblAtuouAutismo = new javax.swing.JLabel();
        rbSimAtuaAutismo = new javax.swing.JRadioButton();
        rbNaoAtuaAutismo = new javax.swing.JRadioButton();
        lblAtuouDeficiencia = new javax.swing.JLabel();
        rbSimAtuouDeficiencia = new javax.swing.JRadioButton();
        rbNaoAtuouDeficiencia = new javax.swing.JRadioButton();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblChaveSecreta = new javax.swing.JLabel();
        txtChaveSecreta = new javax.swing.JTextField();
        btnSalvarU = new javax.swing.JButton();
        btnCancelarU = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        rbSimAulasP = new javax.swing.JRadioButton();
        rbNaoAulasP = new javax.swing.JRadioButton();
        txtfCpf = new javax.swing.JFormattedTextField();
        lblCpf = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFormacao = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnrmv = new javax.swing.JButton();
        tgbAtivo = new javax.swing.JToggleButton();
        cbTipoUser = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Configuração do Usuário");
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lblNome.setText("Nome Completo");

        lblSexo.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino" }));

        lblDataNasc.setText("Data de nascimento");

        try {
            txtfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmail.setText("Email");

        lblFormacao.setText("Formação");

        lblInstituicao.setText("Instituição");

        txtInstituição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstituiçãoActionPerformed(evt);
            }
        });

        lblLocal.setText("Município / Estado");

        lblTempoL.setText("Tempo que leciona");

        lblTempoLA.setText("Tempo que leciona na área de formação");

        bgAulas.add(rbSimAulas);
        rbSimAulas.setText("Sim");
        rbSimAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimAulasActionPerformed(evt);
            }
        });

        bgAulas.add(rbNaoAulas);
        rbNaoAulas.setText("Não");
        rbNaoAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNaoAulasActionPerformed(evt);
            }
        });

        lblAulas.setText("Tem aulas em mais de uma escola? Se sim, quantas?");

        txtQtdAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQtdAulasMouseClicked(evt);
            }
        });
        txtQtdAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdAulasActionPerformed(evt);
            }
        });

        lblAulasP.setText("Alguma delas é de ensino privado?");

        lblAtuouAutismo.setText("Atuou ou atua com alguma criança com autismo?");

        bgAtuouAutismo.add(rbSimAtuaAutismo);
        rbSimAtuaAutismo.setText("Sim");

        bgAtuouAutismo.add(rbNaoAtuaAutismo);
        rbNaoAtuaAutismo.setText("Não");

        lblAtuouDeficiencia.setText("Atuou ou atua com alguma criança com outras formas de deficiência?");

        bgAtuouDeficiencia.add(rbSimAtuouDeficiencia);
        rbSimAtuouDeficiencia.setText("Sim");

        bgAtuouDeficiencia.add(rbNaoAtuouDeficiencia);
        rbNaoAtuouDeficiencia.setText("Não");

        lblUsuario.setText("Usuário");

        lblSenha.setText("Senha");

        lblChaveSecreta.setText("Chave secreta");

        btnSalvarU.setText("Salvar");
        btnSalvarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUActionPerformed(evt);
            }
        });

        btnCancelarU.setText("Cancelar");
        btnCancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUActionPerformed(evt);
            }
        });

        bgAulasP.add(rbSimAulasP);
        rbSimAulasP.setText("Sim");

        bgAulasP.add(rbNaoAulasP);
        rbNaoAulasP.setText("Não");

        try {
            txtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCpf.setText("CPF");

        tblFormacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nível", "Curso"
            }
        ));
        jScrollPane2.setViewportView(tblFormacao);

        btnadd.setText("Adicionar");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnrmv.setText("Remover");
        btnrmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmvActionPerformed(evt);
            }
        });

        tgbAtivo.setSelected(true);
        tgbAtivo.setText("Desativar usuário");
        tgbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbAtivoActionPerformed(evt);
            }
        });

        cbTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------", "Administrador", "Tutor", "Aluno" }));

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                            .addGap(345, 345, 345)
                            .addComponent(lblAulasP)
                            .addGap(130, 130, 130))
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUsuario))
                            .addGap(22, 22, 22)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlDadosLayout.createSequentialGroup()
                                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tgbAtivo)
                                        .addComponent(lblSenha))
                                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlDadosLayout.createSequentialGroup()
                                            .addGap(88, 88, 88)
                                            .addComponent(btnSalvarU)
                                            .addGap(62, 62, 62)
                                            .addComponent(btnCancelarU))
                                        .addGroup(pnlDadosLayout.createSequentialGroup()
                                            .addGap(101, 101, 101)
                                            .addComponent(lblChaveSecreta))))
                                .addGroup(pnlDadosLayout.createSequentialGroup()
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtChaveSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstituicao)
                            .addComponent(txtInstituição, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTempoL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTempoLA)))
                            .addComponent(lblTempoL)
                            .addComponent(txtTempoLA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome))
                                .addComponent(lblFormacao, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnadd)
                                    .addComponent(btnrmv)))
                            .addComponent(lblAtuouAutismo)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(rbSimAtuaAutismo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaoAtuaAutismo))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(rbSimAtuouDeficiencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbNaoAtuouDeficiencia))
                            .addComponent(lblAtuouDeficiencia)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosLayout.createSequentialGroup()
                                        .addComponent(rbSimAulas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNaoAulas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQtdAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAulas, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(96, 96, 96)
                                .addComponent(rbSimAulasP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbNaoAulasP))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addGap(381, 381, 381)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDadosLayout.createSequentialGroup()
                                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSexo))
                                        .addGap(46, 46, 46)
                                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDataNasc)
                                            .addComponent(txtfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlDadosLayout.createSequentialGroup()
                                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLocal)
                                            .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCpf)
                                            .addComponent(txtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(lblLocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(lblCpf)
                                .addGap(26, 26, 26)))))
                .addGap(20, 20, 20)
                .addComponent(lblFormacao)
                .addGap(10, 10, 10)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrmv))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblInstituicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInstituição, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempoL)
                    .addComponent(lblTempoLA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTempoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempoLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAulas)
                    .addComponent(lblAulasP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbSimAulasP)
                        .addComponent(rbNaoAulasP))
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbSimAulas)
                        .addComponent(rbNaoAulas)
                        .addComponent(txtQtdAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(lblAtuouAutismo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSimAtuaAutismo)
                    .addComponent(rbNaoAtuaAutismo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAtuouDeficiencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSimAtuouDeficiencia)
                    .addComponent(rbNaoAtuouDeficiencia))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblSenha)
                    .addComponent(lblChaveSecreta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(txtChaveSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarU)
                            .addComponent(btnCancelarU)))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgbAtivo))))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(pnlDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(190, 30, 797, 395);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarUActionPerformed

    private void txtInstituiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstituiçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstituiçãoActionPerformed

    private void txtQtdAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdAulasActionPerformed
    }//GEN-LAST:event_txtQtdAulasActionPerformed

    private void txtQtdAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQtdAulasMouseClicked
        txtQtdAulas.selectAll();
    }//GEN-LAST:event_txtQtdAulasMouseClicked

    private void btnSalvarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUActionPerformed
        user.setCpf(txtfCpf.getText());
        user.setNome(txtNome.getText());
        user.setEmail(txtEmail.getText());
        user.setMunicipio(txtMunicipio.getText());
        user.setData_nasc(txtfDataNasc.getText());
        user.setInstituicao(txtInstituição.getText());
        user.setTempo_leciona(txtTempoL.getText());
        user.setTempo_leciona_area(txtTempoLA.getText());
        user.setQtd_escolas(Integer.parseInt(txtQtdAulas.getText()));  
        user.setUsuario(txtUsuario.getText());
        user.setSenha(new String(txtSenha.getPassword()));
        user.setChave_secreta(txtChaveSecreta.getText());
        
       switch(cbSexo.getSelectedIndex()){
            case 1:
                user.setSexo("F");
            break;
            case 2:
                user.setSexo("M");
            break;
        }
        
        if(rbSimAulas.isSelected())
            user.setAulas_mais_uma_escola(true);
        if(rbNaoAulas.isSelected())
            user.setAulas_mais_uma_escola(false);
        
        if(rbSimAulasP.isSelected())
            user.setEscola_privada(true);
        if(rbNaoAulasP.isSelected())
            user.setEscola_privada(false);
        
        if(rbSimAtuaAutismo.isSelected())
            user.setAtua_autismo(true);
        if(rbNaoAtuaAutismo.isSelected())
            user.setAtua_autismo(false);
        
        if(rbSimAtuouDeficiencia.isSelected())
            user.setAtuou_deficiencia(true);
        if(rbNaoAtuouDeficiencia.isSelected())
            user.setAtuou_deficiencia(false);
        
        if(tblFormacao.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Adicione pelo menos uma formação!");
        }else{
            fdao.excluir(user.getCpf());
            formacao.setCpf(user.getCpf());
            for(int i=0; i < tblFormacao.getRowCount(); i++){
                formacao.setNivel(tblFormacao.getValueAt(i, 0).toString());
                formacao.setCurso(tblFormacao.getValueAt(i, 1).toString());
                fdao.cadastrar(formacao);
            }
            dao.alterar(user);
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarUActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        PopularCampos();
        Listar();
    }//GEN-LAST:event_formInternalFrameOpened

    private void rbSimAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimAulasActionPerformed
        txtQtdAulas.setText("Quantas?");
        txtQtdAulas.setVisible(true);
    }//GEN-LAST:event_rbSimAulasActionPerformed

    private void rbNaoAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNaoAulasActionPerformed
        txtQtdAulas.setVisible(false);
        txtQtdAulas.setText("0");
    }//GEN-LAST:event_rbNaoAulasActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if(tblFormacao.getRowCount() == 0)
        btnrmv.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblFormacao.getModel();
        Object[] linha = {"",""};
        model.addRow(linha);

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnrmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmvActionPerformed
        if(tblFormacao.getSelectedRow() != -1){
            ((DefaultTableModel) tblFormacao.getModel()).removeRow(tblFormacao.getSelectedRow());
            if(tblFormacao.getRowCount() == 0)
            btnrmv.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para remover!");
        }
    }//GEN-LAST:event_btnrmvActionPerformed

    private void tgbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbAtivoActionPerformed
        if(tgbAtivo.isSelected()){
            tgbAtivo.setText("Desativar usuário");
            user.setAtivo(true);
        }else{
            tgbAtivo.setText("Ativar usuário");
            user.setAtivo(false);
        }
    }//GEN-LAST:event_tgbAtivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAtuouAutismo;
    private javax.swing.ButtonGroup bgAtuouDeficiencia;
    private javax.swing.ButtonGroup bgAulas;
    private javax.swing.ButtonGroup bgAulasP;
    private javax.swing.JButton btnCancelarU;
    private javax.swing.JButton btnSalvarU;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnrmv;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAtuouAutismo;
    private javax.swing.JLabel lblAtuouDeficiencia;
    private javax.swing.JLabel lblAulas;
    private javax.swing.JLabel lblAulasP;
    private javax.swing.JLabel lblChaveSecreta;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFormacao;
    private javax.swing.JLabel lblInstituicao;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTempoL;
    private javax.swing.JLabel lblTempoLA;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JRadioButton rbNaoAtuaAutismo;
    private javax.swing.JRadioButton rbNaoAtuouDeficiencia;
    private javax.swing.JRadioButton rbNaoAulas;
    private javax.swing.JRadioButton rbNaoAulasP;
    private javax.swing.JRadioButton rbSimAtuaAutismo;
    private javax.swing.JRadioButton rbSimAtuouDeficiencia;
    private javax.swing.JRadioButton rbSimAulas;
    private javax.swing.JRadioButton rbSimAulasP;
    private javax.swing.JTable tblFormacao;
    private javax.swing.JToggleButton tgbAtivo;
    private javax.swing.JTextField txtChaveSecreta;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtInstituição;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdAulas;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTempoL;
    private javax.swing.JTextField txtTempoLA;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JFormattedTextField txtfCpf;
    private javax.swing.JFormattedTextField txtfDataNasc;
    // End of variables declaration//GEN-END:variables
}
