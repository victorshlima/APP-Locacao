package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Locacao;
import com.victation.AppLocacao.model.domain.Locatario;
import com.victation.AppLocacao.model.test.AppImpressao;
import com.victation.AppLocacao.service.AutomovelService;
import com.victation.AppLocacao.service.LocacaoService;
import com.victation.AppLocacao.service.LocatarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class LocacaoController {

    private static Integer id =1;

    private final LocacaoService locacaoService;
    private final LocatarioService locatarioService;
    private final AutomovelService automovelService;

    public LocacaoController(LocacaoService locacaoService, LocatarioService locatarioService, AutomovelService automovelService) {
        this.locacaoService = locacaoService;
        this.locatarioService = locatarioService;
        this.automovelService = automovelService;
    }

    public void incluir(Locacao locacao){
        locacao.setId(id++);
        locacaoService.incluir(locacao);
        AppImpressao.relatorio("\n Locacao " + locacao.getDescricao() + " incuido com sucesso", locacao  );
    }

    public  void excluir(Integer id){
        locacaoService.excluir(id);
    }

    @GetMapping("/locacao")
    public String telaCadastro ( Model model){
        model.addAttribute("locatarios", locatarioService.obterLista());
        model.addAttribute("automoveis", automovelService.obterLista());
        return "locacao/cadastro";
    }

    @GetMapping("/locacao/lista")
    public String telaLista (HttpServletRequest request, Model model){
        model.addAttribute("locatarios", locatarioService.obterLista());
        model.addAttribute("locacaoLista", locacaoService.obterLista());
        model.addAttribute("automoveis", automovelService.obterLista());
        return "/locacao/lista";
    }

    @GetMapping("/locacao/{id}/excluir")
    public String exclusao(@PathVariable String id){
        excluir(Integer.valueOf(id));
        System.out.println("excluido co sucesso" + id);
        return "redirect:/locacao/lista";
    }


}
