package plantas.plantasUsuario;

import plantas.BaseEntity;
import plantas.especiePlanta.EspeciePlanta;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
public class PlantasUsuario extends BaseEntity {

    private String apelido;
    @ManyToOne
    private EspeciePlanta especiePlanta;
    private LocalDate dataDePlantacao;
    private LocalDate previsaoDeColheita;

    public PlantasUsuario() {
        super();
    }

    public PlantasUsuario(String apelido, LocalDate dataDePlantacao, EspeciePlanta especiePlanta) {
        this();
        this.apelido = apelido;
        this.dataDePlantacao = dataDePlantacao;
        this.especiePlanta = especiePlanta;
        previsaoDeColheita = dataDePlantacao.plusDays(especiePlanta.getDiasEstimadosParaPrimeiraColheita());
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

//    Antigo
//    public void setEspeciePlanta(String nomePlanta, List<EspeciePlanta> plantas) {
//        EspeciePlanta especiePlanta = plantaExiste(nomePlanta, plantas);
//        if (!especiePlanta.getNomePlanta().equals(null)) {
//            System.out.println("Espécie de planta encontrada, e " + especiePlanta + " foi adicionado como espécie da nova planta!");
//            this.especiePlanta = especiePlanta;
//        } else {
//            System.out.println("Espécie de planta não encontrada!");
//        }
//    }
//
//    private EspeciePlanta plantaExiste (String nomePlanta, List<EspeciePlanta> plantas) {
//        EspeciePlanta especiePlanta = new EspeciePlanta();
//        for (EspeciePlanta p: plantas) {
//            if (p.getNomePlanta().equals(nomePlanta)) {
//                especiePlanta = p;
//                break;
//            }
//        }
//        return especiePlanta;
//    }

    public EspeciePlanta getEspeciePlanta() {
        return especiePlanta;
    }

    public String getDataDePlantacao() {
        return dataDePlantacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getPrevisaoDeColheita() {
        return previsaoDeColheita.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setDataDePlantacao(LocalDate dataDePlantacao) {
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