package model.beans;

import java.sql.Date;
import java.sql.Time;

public class Historico {
    
    private int  id_grupo, id_modulo, ordem;
    private String cpf, status_ativ, fase;

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getStatus_ativ() {
        return status_ativ;
    }

    public void setStatus_ativ(String status_ativ) {
        this.status_ativ = status_ativ;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    private boolean pausou;
    private String resposta;
    private Date data_horario_atual;
    private Time tempo_pausa, tempo_resposta_leitura;

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

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public boolean isPausou() {
        return pausou;
    }

    public void setPausou(boolean pausou) {
        this.pausou = pausou;
    }

    public Date getData_horario_atual() {
        return data_horario_atual;
    }

    public void setData_horario_atual(Date data_horario_atual) {
        this.data_horario_atual = data_horario_atual;
    }

    public Time getTempo_pausa() {
        return tempo_pausa;
    }

    public void setTempo_pausa(Time tempo_pausa) {
        this.tempo_pausa = tempo_pausa;
    }

    public Time getTempo_resposta_leitura() {
        return tempo_resposta_leitura;
    }

    public void setTempo_resposta_leitura(Time tempo_resposta_leitura) {
        this.tempo_resposta_leitura = tempo_resposta_leitura;
    }

}
