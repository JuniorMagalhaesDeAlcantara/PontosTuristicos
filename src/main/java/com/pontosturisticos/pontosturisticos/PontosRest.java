package com.pontosturisticos.pontosturisticos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontosturisticos.pontosturisticos.database.RepositorioPontos;
import com.pontosturisticos.pontosturisticos.entidade.PontoTuristico;

@RestController
@RequestMapping("/ponto")
public class PontosRest {
    @Autowired
    private RepositorioPontos repositorio;

    @GetMapping
    public List<PontoTuristico>listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody PontoTuristico ponto){
        repositorio.save(ponto);
    }

    @PutMapping
    public void alterar(@RequestBody PontoTuristico ponto){
        if(ponto.getId() > 0)
        repositorio.save(ponto);
    }

    @DeleteMapping
    public void deletar(@RequestBody PontoTuristico ponto){
        repositorio.delete(ponto);
    }
}


