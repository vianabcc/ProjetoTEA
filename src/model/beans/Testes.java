package model.beans;

public class Testes {
 
    private int id_teste, tipo_form;
    private String nome, questao, texto, end_audio, end_video, alt_certa, alt_a, alt_b, alt_c, alt_d;

    public String getAlt_a() {
        return alt_a;
    }

    public void setAlt_a(String alt_a) {
        this.alt_a = alt_a;
    }

    public String getAlt_b() {
        return alt_b;
    }

    public void setAlt_b(String alt_b) {
        this.alt_b = alt_b;
    }

    public String getAlt_c() {
        return alt_c;
    }

    public void setAlt_c(String alt_c) {
        this.alt_c = alt_c;
    }

    public String getAlt_d() {
        return alt_d;
    }

    public void setAlt_d(String alt_d) {
        this.alt_d = alt_d;
    }
    private boolean edit;

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

    public int getId_teste() {
        return id_teste;
    }

    public void setId_teste(int id_teste) {
        this.id_teste = id_teste;
    }

    public int getTipo_form() {
        return tipo_form;
    }

    public void setTipo_form(int tipo_form) {
        this.tipo_form = tipo_form;
    }

    public String getAlt_certa() {
        return alt_certa;
    }

    public void setAlt_certa(String alt_certa) {
        this.alt_certa = alt_certa;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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
    
}
