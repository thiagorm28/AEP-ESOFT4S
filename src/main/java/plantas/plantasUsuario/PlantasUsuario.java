package plantas.plantasUsuario;

import plantas.BaseEntity;
import plantas.especiePlanta.BuscarPlanta;
import plantas.especiePlanta.EspeciePlanta;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

@Entity
public class PlantasUsuario extends BaseEntity {

    private String apelido;
    @ManyToOne
    private EspeciePlanta especiePlanta;
    private LocalDate dataDePlantacao;

    public PlantasUsuario() {
        super();
    }

    public PlantasUsuario(String apelido, LocalDate dataDePlantacao, EspeciePlanta especiePlanta) {
        this();
        this.apelido = apelido;
        this.dataDePlantacao = dataDePlantacao;
        this.especiePlanta = especiePlanta;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public EspeciePlanta getEspeciePlanta() {
        return especiePlanta;
    }

    public String getDataDePlantacao() {
        return dataDePlantacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setDataDePlantacao(LocalDate dataDePlantacao) {
        this.dataDePlantacao = dataDePlantacao;
    }

    public void criarPlantaUsuario(Map<String, EspeciePlanta> plantas) {
        Scanner leia = new Scanner(System.in);
        this.especiePlanta = BuscarPlanta.buscarEspeciePlanta(plantas);
        System.out.println("Insira o apelido da nova planta");
        this.apelido = leia.nextLine();
        this.dataDePlantacao = LocalDate.now();
        System.out.println("Nova Planta cadastrada com sucesso");
    }

    @Override
    public String toString() {
        return "Suas Plantas: " +
                "apelido: " + apelido + '\'' +
                ", espécie da planta: " + especiePlanta.getNomeEspecie() +
                ", data de plantacao: " + dataDePlantacao;
    }
}
