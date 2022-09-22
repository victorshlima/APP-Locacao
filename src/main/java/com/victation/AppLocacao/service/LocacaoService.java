package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Locacao;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class LocacaoService {

    private static Integer id =1;
    private static Map<Integer, Locacao> mapaLocacao = new HashMap<Integer, Locacao>();

    public Collection<Locacao> obterLista(){
        return mapaLocacao.values();
    }

    public  void excluir(Integer id){
        mapaLocacao.remove(id);
    }

    public void incluir(Locacao locacao){
        mapaLocacao.put(locacao.getId(), locacao);
        AppImpressao.relatorio("Locacao " + locacao.getId() + " incuido com sucesso", locacao);
    }

}
