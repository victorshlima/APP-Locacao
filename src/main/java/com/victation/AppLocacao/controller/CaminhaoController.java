package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Caminhao;
import com.victation.AppLocacao.service.CaminhaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CaminhaoController {

    private final CaminhaoService caminhaoService;
    private static Map<Integer, Caminhao> mapacaminhao = new HashMap<Integer, Caminhao>();
    private static Integer id =1;

    public CaminhaoController(CaminhaoService caminhaoService) {
        this.caminhaoService = caminhaoService;
    }

    public static Collection<Caminhao> obterLista(){
        return mapacaminhao.values();
    }

    public void excluir(Integer id){
        caminhaoService.excluir(id);
    }

    @GetMapping(value = "/caminhao")
    public String telaCadastro(){
        return "caminhao/cadastro";
    }

    @GetMapping("/caminhao/lista")
    public String telaLista (Model model){

        model.addAttribute("listagem", caminhaoService.obterLista());
        return "/caminhao/lista";
    }

    @GetMapping("/caminhao/{id}/excluir")
    public String exclusao(@PathVariable String id){
        excluir(Integer.valueOf(id));
        System.out.println("excluido co sucesso" + id);
        return "redirect:/caminhao/lista";
    }

    @PostMapping(value ="/caminhao/incluir" )
    public String incluir(Caminhao caminhao){
        caminhao.setId(id++);
        caminhaoService.incluir(caminhao);
        return  "redirect:/caminhao/lista";
    }

}
