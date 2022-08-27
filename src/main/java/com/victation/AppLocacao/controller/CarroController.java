package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CarroController {

    private static Map<Integer,Carro> mapaCarro = new HashMap<Integer, Carro>();
    private static Integer id =1;

    public static void incluir(Carro carro){
        carro.setId(id++);
        mapaCarro.put(carro.getId(), carro);
        AppImpressao.relatorio("Carro " + carro.getModelo() + " incuido com sucesso", carro);
    }
    public static Collection<Carro> obterLista(){
        return mapaCarro.values();
    }

    public static void excluir(Integer id){
        mapaCarro.remove(id);
    }

    @GetMapping("/carro/lista")
    public String telaLista (HttpServletRequest request, Model model){

        model.addAttribute("carroLista", obterLista());
        return "/carro/lista";
    }

    @GetMapping("/carro/{id}/excluir")
    public String exclusao(@PathVariable String id){
        excluir(Integer.valueOf(id));
        System.out.println("excluido co sucesso" + id);
        return "redirect:/carro/lista";
    }


}
