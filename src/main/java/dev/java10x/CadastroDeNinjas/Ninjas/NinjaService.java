package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //lISTA TODOS OS NINJAS
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();

    }



    }


