package plantas;

import plantas.especiePlanta.EspeciePlanta;

import java.util.Map;

public class BuscarPlanta {

    public static EspeciePlanta buscarEspeciePlanta(String nomePlanta, Map<String, EspeciePlanta> plantas) {
        return plantas.get(nomePlanta);
    }

}
