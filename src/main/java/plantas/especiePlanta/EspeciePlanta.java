package plantas.especiePlanta;

import plantas.BaseEntity;

import javax.persistence.Entity;

@Entity
public class EspeciePlanta extends BaseEntity {

    private String nomeEspecie;
    private String tipo;
    private int diasEstimadosParaPrimeiraColheita;
    private int regadasAoDia;
    private String estacaoBoaParaPlantar;
    private String tipoSolo;
    private String aduboIndicado;

    public EspeciePlanta() {
        super();
    }

    public EspeciePlanta(String nomeEspecie, String tipo, int diasEstimadosParaPrimeiraColheita, int regadasAoDia, String estacaoBoaParaPlantar, String tipoSolo, String aduboIndicado) {
        this();
        this.nomeEspecie = nomeEspecie;
        this.tipo = tipo;
        this.diasEstimadosParaPrimeiraColheita = diasEstimadosParaPrimeiraColheita;
        this.regadasAoDia = regadasAoDia;
        this.estacaoBoaParaPlantar = estacaoBoaParaPlantar;
        this.tipoSolo = tipoSolo;
        this.aduboIndicado = aduboIndicado;
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

    public int getDiasEstimadosParaPrimeiraColheita() {
        return diasEstimadosParaPrimeiraColheita;
    }

    public void setDiasEstimadosParaPrimeiraColheita(int diasEstimadosParaPrimeiraColheita) {
        this.diasEstimadosParaPrimeiraColheita = diasEstimadosParaPrimeiraColheita;
    }

    public int getRegadasAoDia() {
        return regadasAoDia;
    }

    public void setRegadasAoDia(int regadasAoDia) {
        this.regadasAoDia = regadasAoDia;
    }

    public String getEstacaoBoaParaPlantar() {
        return estacaoBoaParaPlantar;
    }

    public void setEstacaoBoaParaPlantar(String estacaoBoaParaPlantar) {
        this.estacaoBoaParaPlantar = estacaoBoaParaPlantar;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public String getAduboIndicado() {
        return aduboIndicado;
    }

    public void setAdubosIndicados(String aduboIndicado) {
        this.aduboIndicado = aduboIndicado;
    }

    @Override
    public String toString() {
        return getNomeEspecie();
    }
}
