package plantas.usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

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

    public void login(String email, String senha) {
        List<Usuario> listaRetornada  = usuarioRepository.findAll();
        Usuario usuarioCerto = null;
        for (Usuario u : listaRetornada) {
            if (Objects.equals(u.getEmail(), email)) {
                usuarioCerto = u;
            }
        }
        usuarioCerto.login(email, senha);

    }

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }
}
