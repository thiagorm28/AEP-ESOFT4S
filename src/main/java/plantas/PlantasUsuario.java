package plantas;

import java.util.Calendar;
import java.util.List;

public class PlantasUsuario {

    private String apelido;
    private EspeciePlanta especiePlanta;
    private Calendar dataDePlantacao;
    private Calendar previsaoDeColheita;

    public PlantasUsuario() {
        //previsaoDeColheita = dataDePlantacao + especiePlanta.getDiasEstimadosParaPrimeiraColheita
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    void setEspeciePlanta(String nomePlanta, List<EspeciePlanta> plantas) {
        EspeciePlanta especiePlanta = plantaExiste(nomePlanta, plantas);
        if (!especiePlanta.getNomePlanta().equals(null)) {
            System.out.println("Espécie de planta encontrada, e " + especiePlanta + " foi adicionado como espécie da nova planta!");
            this.especiePlanta = especiePlanta;
        } else {
            System.out.println("Espécie de planta não encontrada!");
        }
    }

    private EspeciePlanta plantaExiste (String nomePlanta, List<EspeciePlanta> plantas) {
        EspeciePlanta especiePlanta = new EspeciePlanta();
        for (EspeciePlanta p: plantas) {
            if (p.getNomePlanta().equals(nomePlanta)) {
                especiePlanta = p;
                break;
            }
        }
        return especiePlanta;
    }

    public EspeciePlanta getEspeciePlanta() {
        return especiePlanta;
    }

    public Calendar getDataDePlantacao() {
        return dataDePlantacao;
    }

    public void setDataDePlantacao(Calendar dataDePlantacao) {
        this.dataDePlantacao = dataDePlantacao;
    }

    @Override
    public String toString() {
        if (this.apelido == null)
            return("Espécie: " + this.especiePlanta);
        else {
            return("Espécie: " + this.especiePlanta + ", Apelido: " + this.apelido);
        }
    }
}
