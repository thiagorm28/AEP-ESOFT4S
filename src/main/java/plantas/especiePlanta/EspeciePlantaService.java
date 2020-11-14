package plantas.especiePlanta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class EspeciePlantaService {
    @Autowired
    private EspeciePlantaRepository especiePlantaRepository;

    public void criarEspeciePlantas(EspeciePlanta especiePlanta) {
        especiePlantaRepository.save(especiePlanta);
    }

    public List<EspeciePlanta> getAll() {
        return especiePlantaRepository.findAll();
    }

    //Busca a espécie da planta pelo nome no banco de dados
    public EspeciePlanta buscarPorNomeEspecie(String nomeEspecie) {
        List<EspeciePlanta> listaRetornada = especiePlantaRepository.findAll();
        for (EspeciePlanta ep : listaRetornada) {
            if(Objects.equals(ep.getNomeEspecie(), nomeEspecie)) {
                return ep;
            }
        }
        return null;
    }
}
