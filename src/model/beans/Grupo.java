package model.beans;

public class Grupo {
    
    private int id_grupo;
    private String nome_escola, nome_grupo, chave_secreta, tipo_grupo;

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getNome_escola() {
        return nome_escola;
    }

    public void setNome_escola(String nome_escola) {
        this.nome_escola = nome_escola;
    }

    public String getNome_grupo() {
        return nome_grupo;
    }

    public void setNome_grupo(String nome_grupo) {
        this.nome_grupo = nome_grupo;
    }

    public String getChave_secreta() {
        return chave_secreta;
    }

    public void setChave_secreta(String chave_secreta) {
        this.chave_secreta = chave_secreta;
    }
    
     public String getTipo_grupo() {
        return tipo_grupo;
    }

    public void setTipo_grupo(String tipo_grupo) {
        this.tipo_grupo = tipo_grupo;
    }
    
}
