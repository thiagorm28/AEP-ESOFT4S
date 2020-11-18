package plantas.usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plantas.plantasUsuario.PlantasUsuario;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public void criarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }


    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    public List<PlantasUsuario> getPlantasDoUsuario(Usuario usuario) {
        Optional<Usuario> usuarioEncontrado =  usuarioRepository.findById(usuario.getId());
        return usuarioEncontrado.get().getPlantaçao();
    }
}
