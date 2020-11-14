//package plantas;
//
//import org.junit.Test;
//import plantas.especiePlanta.EspeciePlanta;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.junit.Assert.*;
//
//
//public class testeBuscarPlanta{
//
//    @Test
//    public void deveEncontrarEspeciePlanta() {
//        EspeciePlanta tomate = new EspeciePlanta();
//        tomate.setNomePlanta("Tomate");
//        tomate.setDiasEstimadosParaPrimeiraColheita(50);
//
//        Map<String, EspeciePlanta> especiesPlantas = new HashMap<>();
//        especiesPlantas.put(tomate.getNomePlanta(), tomate);
//
//        EspeciePlanta retornoTomate = BuscarPlanta.buscarEspeciePlanta("Tomate", especiesPlantas);
//        EspeciePlanta retornoEsperadoTomate = tomate;
//
//        EspeciePlanta retornoNull = BuscarPlanta.buscarEspeciePlanta("Toma", especiesPlantas);
//        EspeciePlanta retornoEsperadoNull = null;
//
//        assertEquals(retornoEsperadoTomate, retornoTomate);
//        assertEquals(retornoEsperadoNull, retornoNull);
//
//    }
//}
