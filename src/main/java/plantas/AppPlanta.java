package plantas;

import java.util.ArrayList;
import java.util.List;

public class AppPlanta {

    public static void main(String[] args) {
        EspeciePlanta tomate = new EspeciePlanta();
        tomate.setNomePlanta("Tomate");
        List<EspeciePlanta> especiesPlantas = new ArrayList<EspeciePlanta>();
        especiesPlantas.add(tomate);
        PlantasUsuario plantasUsuario = new PlantasUsuario();
        plantasUsuario.setEspeciePlanta("Tomate", especiesPlantas);
        Usuario usuario1 = new Usuario();
        usuario1.addPlantacao(plantasUsuario);
        System.out.println(usuario1.getPlantacao());
        usuario1.setSenha("1234");
        usuario1.setEmail("joao@hotmail.com");
        try {
            usuario1.login("joo@hotmail.com", "1234");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

}
