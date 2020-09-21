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
    }

}
