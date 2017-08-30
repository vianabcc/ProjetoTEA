package model.beans;

public class Modulo {
    
    private int id_modulo, prepos;
    private String nome_modulo;
    
    public int getPrepos() {
        return prepos;
    }

    public void setPrepos(int prepos) {
        this.prepos = prepos;
    }
 
    public int getId_modulo() {
        return id_modulo;
    }

    public void setId_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public String getNome_modulo() {
        return nome_modulo;
    }

    public void setNome_modulo(String nome_modulo) {
        this.nome_modulo = nome_modulo;
    }
    
}
