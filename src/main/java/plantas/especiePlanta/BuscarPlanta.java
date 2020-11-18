package plantas.especiePlanta;

import plantas.especiePlanta.EspeciePlanta;

import java.util.Map;
import java.util.Scanner;

public class BuscarPlanta {

    private static Scanner leia = new Scanner(System.in);

    public static EspeciePlanta buscarEspeciePlanta(Map<String, EspeciePlanta> plantas) {
        System.out.println("Insira o nome da espécie de planta que deseja encontrar: ");
        String nomePlanta = leia.nextLine();
        return plantas.get(nomePlanta);
    }

}
