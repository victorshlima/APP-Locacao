package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.domain.Moto;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarroService {

    private Map<Integer, Carro> mapaCarro = new HashMap<Integer, Carro>();

    public Collection<Carro> obterLista(){
        return mapaCarro.values();
    }

    public  void excluir(Integer id){
        mapaCarro.remove(id);
    }

    public void incluir(Carro carro){
        mapaCarro.put(carro.getId(), carro);
        AppImpressao.relatorio("Cliente " + carro.getId() + " incuido com sucesso", carro);
    }

}
