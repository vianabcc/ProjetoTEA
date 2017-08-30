package model.beans;

public class Ensino {
    
    private int id_atividade_ensino, tipo_form;
    private String nome, end_audio, end_video, texto;
    private boolean edit;

    public int getId_atividade_ensino() {
        return id_atividade_ensino;
    }

    public void setId_atividade_ensino(int id_atividade_ensino) {
        this.id_atividade_ensino = id_atividade_ensino;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo_form() {
        return tipo_form;
    }

    public void setTipo_form(int tipo_form) {
        this.tipo_form = tipo_form;
    }

    public String getEnd_audio() {
        return end_audio;
    }

    public void setEnd_audio(String end_audio) {
        this.end_audio = end_audio;
    }

    public String getEnd_video() {
        return end_video;
    }

    public void setEnd_video(String end_video) {
        this.end_video = end_video;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
