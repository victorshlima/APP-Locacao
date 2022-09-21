package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Automovel;
import com.victation.AppLocacao.service.AutomovelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AutomovelController {

    private final AutomovelService automovelService;
    private static Map<Integer, Automovel> mapaAutomovel = new HashMap<>();
    private static Integer id =1;


    public AutomovelController(AutomovelService automovelService) {
        this.automovelService = automovelService;
    }

    public static Collection<Automovel> obterLista(){
        return mapaAutomovel.values();
    }

    public void excluir(Integer id){
        automovelService.excluir(id);
    }

    @GetMapping(value = "automovel")
    public String telaCadastro(){
        return "automovel/cadastro";
    }

    @GetMapping("automovel/lista")
    public String telaLista (HttpServletRequest request, Model model){
        model.addAttribute("listagem", automovelService.obterLista());
        return "automovel/lista";
    }

    @GetMapping("automovel/{id}/excluir")
    public String exclusao(@PathVariable String id){
        excluir(Integer.valueOf(id));
        System.out.println("excluido co sucesso" + id);
        return "redirect:automovel/lista";
    }
    @PostMapping(value ="automovel/incluir" )
    public String incluir(Automovel automovel){
        automovel.setId(id++);
        automovelService.incluir(automovel);
        return  "redirect:automovel/lista";
    }


}
