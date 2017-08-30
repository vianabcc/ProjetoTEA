package model.beans;

public class UsuarioGrupoModulo {
    
    private int id_grupo, id_modulo, ordem_atual;
    private String cpf;
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public int getId_modulo() {
        return id_modulo;
    }

    public void setId_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public int getOrdem_atual() {
        return ordem_atual;
    }

    public void setOrdem_atual(int ordem_atual) {
        this.ordem_atual = ordem_atual;
    }

}
