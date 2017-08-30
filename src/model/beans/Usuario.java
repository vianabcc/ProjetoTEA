package model.beans;

import java.util.Date;

public class Usuario {
   
    private int qtd_escolas;
    private String cpf, nome, sexo, userLog, userCnfg, usuario, senha, email, municipio, instituicao, tempo_leciona, tempo_leciona_area, chave_secreta, data_nasc, tipo_user;

    public String getUserCnfg() {
        return userCnfg;
    }

    public void setUserCnfg(String userCnfg) {
        this.userCnfg = userCnfg;
    }
    private boolean aulas_mais_uma_escola, escola_privada, atua_autismo, atuou_deficiencia, ativo;
    
     public String getUserLog() {
        return userLog;
    }

    public void setUserLog(String userLog) {
        this.userLog = userLog;
    }
    
    public String getSexo() {
        return sexo;
    }

    public String getTipo_user() {
        return tipo_user;
    }

    public void setTipo_user(String tipo_user) {
        this.tipo_user = tipo_user;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public boolean isAtua_autismo() {
        return atua_autismo;
    }

    public void setAtua_autismo(boolean atua_autismo) {
        this.atua_autismo = atua_autismo;
    }

    public boolean isAtuou_deficiencia() {
        return atuou_deficiencia;
    }

    public void setAtuou_deficiencia(boolean atuou_deficiencia) {
        this.atuou_deficiencia = atuou_deficiencia;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQtd_escolas() {
        return qtd_escolas;
    }

    public void setQtd_escolas(int qtd_escolas) {
        this.qtd_escolas = qtd_escolas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getTempo_leciona() {
        return tempo_leciona;
    }

    public void setTempo_leciona(String tempo_leciona) {
        this.tempo_leciona = tempo_leciona;
    }

    public String getTempo_leciona_area() {
        return tempo_leciona_area;
    }

    public void setTempo_leciona_area(String tempo_leciona_area) {
        this.tempo_leciona_area = tempo_leciona_area;
    }

    public String getChave_secreta() {
        return chave_secreta;
    }

    public void setChave_secreta(String chave_secreta) {
        this.chave_secreta = chave_secreta;
    }

    public boolean isAulas_mais_uma_escola() {
        return aulas_mais_uma_escola;
    }

    public void setAulas_mais_uma_escola(boolean aulas_mais_uma_escola) {
        this.aulas_mais_uma_escola = aulas_mais_uma_escola;
    }

    public boolean isEscola_privada() {
        return escola_privada;
    }

    public void setEscola_privada(boolean escola_privada) {
        this.escola_privada = escola_privada;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    
}
