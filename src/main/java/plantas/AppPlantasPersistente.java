package plantas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import plantas.especiePlanta.EspeciePlanta;
import plantas.especiePlanta.EspeciePlantaService;
import plantas.plantasUsuario.PlantasUsuario;
import plantas.plantasUsuario.PlantasUsuarioService;
import plantas.usuario.Usuario;
import plantas.usuario.UsuarioService;

import java.time.LocalDate;

@SpringBootApplication
public class AppPlantasPersistente implements CommandLineRunner{

    @Autowired
    EspeciePlantaService especiePlantaService;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    PlantasUsuarioService plantasUsuarioService;

    public static void main(String[] args) {
        SpringApplication.run(AppPlantasPersistente.class, args).close();
    }

    @Override
    public void run(String... args) throws Exception {

        EspeciePlanta tomate = new EspeciePlanta(
                        "Tomate",
                        "Fruta",
                        "Anual",
                        "Irrigar Regularmente",
                        "Inverno",
                        "Arenoso"
        );
        especiePlantaService.criarEspeciePlantas(tomate);
        Usuario usuario1 = new Usuario("joao@hotmail.com", "João Silva", "1234");
        usuarioService.criarUsuario(usuario1);
        PlantasUsuario plantasUsuario1 = null;
        try {
            EspeciePlanta novaEspeciePlanta  = especiePlantaService.buscarPorNomeEspecie("Tomate");
             plantasUsuario1 = new PlantasUsuario("juju", LocalDate.now(), novaEspeciePlanta);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        usuario1.addPlantacao(plantasUsuario1);
        usuarioService.criarUsuario(usuario1);

        for (EspeciePlanta ep : especiePlantaService.getAll()) {
            System.out.println(ep);
        }

        for (Usuario u : usuarioService.getAll()) {
            System.out.println(u.getEmail());
        }

        for (PlantasUsuario pu : plantasUsuarioService.getAll()) {
            System.out.println(pu.getApelido());
        }
    }

}
