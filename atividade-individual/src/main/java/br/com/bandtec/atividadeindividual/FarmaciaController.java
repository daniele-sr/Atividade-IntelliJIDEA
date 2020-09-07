package br.com.bandtec.atividadeindividual;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/farmacias")
public class FarmaciaController {

    private List<Farmacia> farmacias = new ArrayList<>();

    @GetMapping
    public List listarRemedios() {
        return farmacias;
    }

    @PostMapping("/cadastrar")
    public void cadastrarRemedio(@RequestBody Farmacia remedio) {
        farmacias.add(remedio);
    }



}
