package plantas.plantasUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plantas.especiePlanta.EspeciePlanta;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class PlantasUsuarioService {
    @Autowired
    private PlantasUsuarioRepository plantasUsuarioRepository;

    public void criarPlantasUsuario(PlantasUsuario plantasUsuario) {
        plantasUsuarioRepository.save(plantasUsuario);
    }

    public List<PlantasUsuario> getAll() {
        return plantasUsuarioRepository.findAll();
    }
}
