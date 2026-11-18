package onepiece.piratas.RecompensasMarine.controller;

import onepiece.piratas.RecompensasMarine.model.Pirata;
import onepiece.piratas.RecompensasMarine.service.PirataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Marcando classe como Controlador de rotas
@RequestMapping("/pirata") // Mapeando rotas
public class PirataController {

    // "Conectando/Injetando" uma camada a outra criando um obj e constructor.
    private final PirataService pirataService;

    public PirataController(PirataService pirataService) {
        this.pirataService = pirataService;
    }

    // Marcação do Spring para mapear "Ações/Metodos"
    @GetMapping
    public List<Pirata> getAll() {return pirataService.getAll}
}

