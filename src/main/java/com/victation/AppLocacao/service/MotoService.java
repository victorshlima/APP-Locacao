package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Moto;
import com.victation.AppLocacao.model.repository.MotoRepository;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MotoService  {

    @Autowired
    private MotoRepository motoRepository;

    public Collection<Moto> obterLista(){
        return (Collection<Moto>) motoRepository.findAll();
    }

    public  void excluir(Integer id){
        motoRepository.deleteById(id);
    }

    public void incluir(Moto moto){
        motoRepository.save(moto);
        AppImpressao.relatorio("Usuario " + moto.getId() + " incuido com sucesso", moto);
    }

}
