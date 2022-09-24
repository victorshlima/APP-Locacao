package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Usuario;
import com.victation.AppLocacao.model.domain.Locatario;
import com.victation.AppLocacao.service.LocatarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LocatarioController {

    private final LocatarioService locatarioService;

    public LocatarioController(LocatarioService locatarioService) {
        this.locatarioService = locatarioService;
    }

    @GetMapping(value = "/locatario")
    public String telaCadastro(){
        return "locatario/cadastro";
    }

    @GetMapping("/locatario/lista")
    public String telaLista (HttpServletRequest request, Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem", locatarioService.obterLista(usuario));
        return "/locatario/lista";
    }

    @PostMapping(value ="/locatario/incluir" )
    public String incluir(Locatario locatario, @SessionAttribute("user") Usuario usuario){

        locatario.setUsuario(usuario);

        locatarioService.incluir(locatario);
        return  "redirect:/locatario/lista";
    }

    @GetMapping(value ="/locatario/{id}/excluir" )
    public String excluir(@PathVariable Integer id ){
        locatarioService.excluir(id);
        return  "redirect:/locatario/lista";
    }

}
