package plantas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppPlanta {

    public static void main(String[] args) {
        EspeciePlanta tomate = new EspeciePlanta();
        tomate.setNomePlanta("Tomate");
        tomate.setDiasEstimadosParaPrimeiraColheita(50);
        Map<String, EspeciePlanta> especiesPlantas = new HashMap<>();
        especiesPlantas.put(tomate.getNomePlanta(), tomate);
        EspeciePlanta especie = BuscarPlanta.buscarEspeciePlanta("Tomate", especiesPlantas);
        PlantasUsuario plantaUsuario = new PlantasUsuario(LocalDate.now(), especie);
        Usuario usuario1 = new Usuario();
        usuario1.addPlantacao(plantaUsuario);
        System.out.println(usuario1.getPlantacao());
        usuario1.setSenha("1234");
        usuario1.setEmail("joao@hotmail.com");
//        try {
//            usuario1.login("joo@hotmail.com", "1234");
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }

        System.out.println(plantaUsuario.getDataDePlantacao() + " colheita: " + plantaUsuario.getPrevisaoDeColheita());

    }

}
