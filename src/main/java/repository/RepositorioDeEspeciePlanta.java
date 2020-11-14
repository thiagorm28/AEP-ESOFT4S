//package repository;
//
//import plantas.especiePlanta.EspeciePlanta;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class RepositorioDeEspeciePlanta {
//
//    Connection conexao;
//
//    public RepositorioDeEspeciePlanta(Connection conexao) {
//        this.conexao = conexao;
//    }
//
//    public EspeciePlanta buscarEspeciePlanta(String nomePlanta) {
//        try (Statement select = conexao.createStatement();
//             ResultSet resultado = select.executeQuery("select id, nome_planta, tipo, dias_primeira_colheita, " +
//                     "regadas_dia, estacao_plantar, tipo_solo, adubo_indicado from especie_planta")) {
//            while (resultado.next()) {
//                EspeciePlanta especiePlantaEncontrada = new EspeciePlanta(
//                        resultado.getString("id"),
//                        resultado.getString("nome_planta"),
//                        resultado.getString("tipo"),
//                        resultado.getInt("dias_primeira_colheita"),
//                        resultado.getInt("regadas_dia"),
//                        resultado.getString("estacao_plantar"),
//                        resultado.getString("tipo_solo"),
//                        resultado.getString("adubo_indicado")
//                );
//                if (especiePlantaEncontrada.getNomePlanta().equals(nomePlanta)) {
//                    return especiePlantaEncontrada;
//                }
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return null;
//    }
//
//}
