package dev.java10x.CadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira Rota";
    }


    //Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    //Mostra todos ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }


    //Mostra Ninjas por ID

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
    }

    //Alterar dados dos ninjas

    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "alterar ninja por ID";
    }

    @DeleteMapping("/deletarID")
    public String deletaNinjaPorId() {
        return "Ninja deletado";
    }


}

