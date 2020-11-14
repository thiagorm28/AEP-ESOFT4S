//package repository;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class GerenciadorDeConexao implements AutoCloseable{
//
//    private Connection conexao = null;
//
//    public GerenciadorDeConexao() throws SQLException {
//        conexao = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5432//aepplanta", "postgres", "postgres"
//        );
//    }
//
//    public Connection getConexao() {
//        return conexao;
//    }
//
//    @Override
//    public void close() throws Exception {
//        if (conexao != null) {
//            conexao.close();
//        }
//    }
//}
