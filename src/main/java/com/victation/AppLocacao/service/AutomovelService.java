package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Caminhao;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AutomovelService {

    private Map<Integer, Caminhao> mapaCaminhao = new HashMap<Integer, Caminhao>();

    public Collection<Caminhao> obterLista(){
        return mapaCaminhao.values();
    }

    public  void excluir(Integer id){
        mapaCaminhao.remove(id);
    }

    public void incluir(Caminhao caminhao){
        mapaCaminhao.put(caminhao.getId(), caminhao);
        AppImpressao.relatorio("Automovel " + caminhao.getId() + " incuido com sucesso", caminhao);
    }

}
