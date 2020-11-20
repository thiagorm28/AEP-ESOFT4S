package plantas.especiePlanta;

import plantas.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EspeciePlanta extends BaseEntity {

    private String nomeEspecie;
    private String tipo;
    private String tipoDeColheita;
    private String tipoDeIrrigacao;
    @Column(length = 1024)
    private String tipoSolo;
    @Column(length = 1024)
    private String observacoesExtras;

    public EspeciePlanta() {
        super();
    }

    public EspeciePlanta(String nomeEspecie, String tipo, String tipoDeColheita, String tipoDeIrrigacao, String tipoSolo, String observacoesExtras) {
        this();
        this.nomeEspecie = nomeEspecie;
        this.tipo = tipo;
        this.tipoDeColheita = tipoDeColheita;
        this.tipoDeIrrigacao = tipoDeIrrigacao;
        this.observacoesExtras = observacoesExtras;
        this.tipoSolo = tipoSolo;
    }


    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoDeColheita() {
        return tipoDeColheita;
    }

    public void setTipoDeColheita(String tipoDeColheita) {
        this.tipoDeColheita = tipoDeColheita;
    }

    public String getTipoDeIrrigacao() {
        return tipoDeIrrigacao;
    }

    public void setTipoDeIrrigacao(String tipoDeIrrigacao) {
        this.tipoDeIrrigacao = tipoDeIrrigacao;
    }

    public String getObservacoesExtras() {
        return observacoesExtras;
    }

    public void setObservacoesExtras(String observacoesExtras) {
        this.observacoesExtras = observacoesExtras;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public void setAdubosIndicados(String aduboIndicado) {
    }

    @Override
    public String toString() {
        return "Nome da espécie: " + nomeEspecie + '\'' +
                ", \ntipo: " + tipo + '\'' +
                ", \ntipo de colheita: " + tipoDeColheita + '\'' +
                ", \ntipo de irrigacao: " + tipoDeIrrigacao + '\'' +
                ", \ntipo de solo: " + tipoSolo + '\'' +
                ", \nobservacoes extras: " + observacoesExtras + '\'';
    }
}
