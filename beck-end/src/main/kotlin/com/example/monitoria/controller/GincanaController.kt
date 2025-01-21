import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/gincanas")
class GincanaController(@Autowired val gincanaRepository: GincanaRepository) {

    @GetMapping
    fun listarGincanas(): List<Gincana> {
        return gincanaRepository.findAll()
    }

    @PostMapping
    fun criarGincana(@RequestBody gincana: Gincana): Gincana {
        return gincanaRepository.save(gincana)
    }
}
