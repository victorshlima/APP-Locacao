package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Moto;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MotoService  {

    private Map<Integer, Moto> mapaMoto = new HashMap<Integer, Moto>();

    public Collection<Moto> obterLista(){
        return mapaMoto.values();
    }

    public  void excluir(Integer id){
        mapaMoto.remove(id);
    }

    public void incluir(Moto moto){
        mapaMoto.put(moto.getId(), moto);
        AppImpressao.relatorio("Cliente " + moto.getId() + " incuido com sucesso", moto);
    }

}
