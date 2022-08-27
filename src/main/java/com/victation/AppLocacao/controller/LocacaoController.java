package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Locacao;
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
public class LocacaoController {

    private static Map<Integer, Locacao> mapaLocacao = new HashMap<Integer, Locacao>();
    private static Integer id =1;

    public static void incluir(Locacao locacao){
        locacao.setId(id++);
        mapaLocacao.put(locacao.getId(), locacao);
        AppImpressao.relatorio("\n Locacao " + locacao.getDescricao() + " incuido com sucesso", locacao  );
    }
    public static Collection<Locacao> obterLista(){
        return mapaLocacao.values();
    }

    public static void excluir(Integer id){
        mapaLocacao.remove(id);
    }


    @GetMapping("/locacao/lista")
    public String telaLista (HttpServletRequest request, Model model){

        model.addAttribute("locacaoLista", obterLista());
        return "/locacao/lista";
    }

    @GetMapping("/locacao/{id}/excluir")
    public String exclusao(@PathVariable String id){
        excluir(Integer.valueOf(id));
        System.out.println("excluido co sucesso" + id);
        return "redirect:/locacao/lista";
    }


}
