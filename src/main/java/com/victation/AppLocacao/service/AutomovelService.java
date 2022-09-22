package com.victation.AppLocacao.service;

import com.victation.AppLocacao.model.domain.Automovel;
import com.victation.AppLocacao.model.domain.Caminhao;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AutomovelService {

    private final CarroService carroService;
    private final CaminhaoService caminhaoService;
    private final MotoService motoService;

    List<Automovel> automoveis = new ArrayList<>();

    public AutomovelService(CarroService carroService, CaminhaoService caminhaoService, MotoService motoService) {
        this.carroService = carroService;
        this.caminhaoService = caminhaoService;
        this.motoService = motoService;
    }

    private Map<Integer, Automovel> mapaAutomovel = new HashMap< >();

    public List<Automovel> obterLista(){

        automoveis.addAll(caminhaoService.obterLista());
        automoveis.addAll(carroService.obterLista());
        automoveis.addAll(motoService.obterLista());

        return automoveis;

    }

    public  void excluir(Integer id){
        mapaAutomovel.remove(id);
    }

    public void incluir(Automovel automovel){
        mapaAutomovel.put(automovel.getId(), automovel);
        AppImpressao.relatorio("Automovel " + automovel.getId() + " incuido com sucesso", automovel);
    }

}
