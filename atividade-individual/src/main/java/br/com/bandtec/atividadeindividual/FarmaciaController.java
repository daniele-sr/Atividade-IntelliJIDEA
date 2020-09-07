package br.com.bandtec.atividadeindividual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/remedios")
public class FarmaciaController {

    private List<Farmacia> remedios = new ArrayList<>();

    @GetMapping("/listar")
    public List<Farmacia> getRemedios() {
        return remedios;
    }

    @PostMapping("/cadastrar")
    public void cadastrarRemedio(@RequestBody Farmacia remedio) {
        remedios.add(remedio);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirRemedio(@PathVariable int id) { // excluir por que cliente comprou
        remedios.remove(id-1);
    }
}
