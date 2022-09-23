package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Caminhao;
import com.victation.AppLocacao.model.repository.CaminhaoRepository;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CaminhaoService {


    @Autowired
    public CaminhaoRepository caminhaoRepository;

    public Collection<Caminhao> obterLista(){
        return (Collection<Caminhao>) caminhaoRepository.findAll();
    }

    public  void excluir(Integer id){
        caminhaoRepository.deleteById(id);
    }

    public void incluir(Caminhao caminhao){
        caminhaoRepository.save(caminhao);
        AppImpressao.relatorio("usuario " + caminhao.getId() + " incuido com sucesso", caminhao);
    }

}
