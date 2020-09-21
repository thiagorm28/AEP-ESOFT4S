package plantas;

import java.util.ArrayList;
import java.util.List;

public class EspeciePlanta {

    private String nomePlanta;
    private String tipo;
    private int diasEstimadosParaPrimeiraColheita;
    private int regadasAoDia;
    private String estacaoBoaParaPlantar;
    private String tipoSolo;
    private List<String> adubosIndicados = new ArrayList<String>();

    public String getNomePlanta() {
        return nomePlanta;
    }

    public void setNomePlanta(String nomePlanta) {
        this.nomePlanta = nomePlanta;
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

    public List<String> getAdubosIndicados() {
        return adubosIndicados;
    }

    public void setAdubosIndicados(List<String> adubosIndicados) {
        this.adubosIndicados = adubosIndicados;
    }

    @Override
    public String toString() {
        return getNomePlanta();
    }
}
