package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.test.AppLocacao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CarroController {


    private static List<Carro> carros =  new ArrayList<Carro>();

    private static Map<Integer,Carro> mapaCarro = new HashMap<Integer, Carro>();
    private static Integer id =1;

    public static void incluir(Carro carro){
        carro.setId(id++);
        mapaCarro.put(carro.getId(), carro);
        AppLocacao.relatorio("Carro " + carro.getModelo() + " incuido com sucesso", carro);
    }

    @GetMapping("/carro/lista")
    public String telaLista (HttpServletRequest request, Model model){

        model.addAttribute("carroLista", mapaCarro.values());



        return "/carro/lista";
    }





}
