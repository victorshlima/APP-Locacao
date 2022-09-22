package com.victation.AppLocacao.service;


import com.victation.AppLocacao.model.domain.Locatario;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class LocatarioService {

    private Map<Integer, Locatario> mapaLocatario = new HashMap<Integer, Locatario>();

    public Collection<Locatario> obterLista(){
        return mapaLocatario.values();
    }

    public  void excluir(Integer id){
        mapaLocatario.remove(id);
    }

    public void incluir(Locatario locatario){
        mapaLocatario.put(locatario.getId(), locatario);
       AppImpressao.relatorio("Cliente " + locatario.getNome() + " incuido com sucesso", locatario);
    }

}
