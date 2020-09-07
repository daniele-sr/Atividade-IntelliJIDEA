package br.com.bandtec.atividadeindividual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/remedios")
public class FarmaciaController {

    private List<Fornecedor> remedios = new ArrayList<>();

    @GetMapping("/listar")
    public List<Fornecedor> getRemedios() {
        return remedios;
    }

    @PostMapping("/cadastrar")
    public void cadastrarRemedio(@RequestBody Fornecedor remedio) {
        remedios.add(remedio);
    }

    @DeleteMapping("/remover/{id}")
   public void removerRemedio(@PathVariable int id) { // remover por ter sido comprado
        remedios.remove(id-1);
    }
}
