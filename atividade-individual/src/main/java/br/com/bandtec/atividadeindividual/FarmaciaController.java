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

    @DeleteMapping("/remover/{id}") // remover caso produto estiver em falta
   public void removerRemedio(@PathVariable int id) {
        remedios.remove(id-1);
    }

    @PutMapping("/alterar/{id}") // alteração apos fornecedor vender produtos
    public void alterarRemedio(@PathVariable int id, @RequestBody Fornecedor remedio) {
        remedios.remove(id-1);
        remedios.add(id-1, remedio);
    }

}
