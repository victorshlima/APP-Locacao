package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.domain.Moto;
import com.victation.AppLocacao.model.repository.CarroRepository;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Collection<Carro> obterLista(){
        return (Collection<Carro>) carroRepository.findAll();
    }

    public  void excluir(Integer id){
        carroRepository.deleteById(id);
    }

    public void incluir(Carro carro){
        carroRepository.save(carro);
        AppImpressao.relatorio("usuario " + carro.getId() + " incuido com sucesso", carro);
    }

}
