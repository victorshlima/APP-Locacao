package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Automovel;
import com.victation.AppLocacao.model.domain.Usuario;
import com.victation.AppLocacao.model.repository.AutomovelRepository;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;

    @Autowired
    private  CarroService carroService;

    @Autowired
    private  CaminhaoService caminhaoService;

    @Autowired
    private  MotoService motoService;

    List<Automovel> automoveis = new ArrayList<>();

    public List<Automovel> obterLista(){

        automoveis.addAll(caminhaoService.obterLista());
        automoveis.addAll(carroService.obterLista());
        automoveis.addAll(motoService.obterLista());

        return automoveis;

    }

    public  void excluir(Integer id){
        automovelRepository.deleteById(id);
    }

    public void incluir(Automovel automovel, Usuario user){
        automovel.setUsuario(user);
        automovelRepository.save(automovel);
        AppImpressao.relatorio("Automovel " + automovel.getId() + " incuido com sucesso", automovel);
    }

}
