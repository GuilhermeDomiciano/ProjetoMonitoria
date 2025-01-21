import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/usuarios")
class UsuarioController(@Autowired val usuarioRepository: UsuarioRepository) {

    @GetMapping
    fun listarUsuarios(): List<Usuario> {
        return usuarioRepository.findAll()
    }

    @PostMapping
    fun criarUsuario(@RequestBody usuario: Usuario): Usuario {
        return usuarioRepository.save(usuario)
    }
}
