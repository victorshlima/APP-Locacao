package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Usuario;
import com.victation.AppLocacao.model.test.AppImpressao;
import com.victation.AppLocacao.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuario/lista")
    public String telaLista (HttpServletRequest request, Model model){
        model.addAttribute("usuarioLista", usuarioService.obterLista());
        return "/usuario/lista";
    }

    @PostMapping("/usuario/incluir")
    public String incluir(Usuario usuario){
        System.out.println("Cadastro !!!   " + usuario.getNome());

        usuarioService.incluir(usuario);
        AppImpressao.relatorio("usuario " + usuario.getNome() + " incuido com sucesso", usuario);
        return "redirect:/";
    }

    @GetMapping("/usuario")
    public String telaCadastro (){
        return "usuario/cadastro";
    }

    @GetMapping("/usuario/{email}/excluir")
    public String excluir(@PathVariable Integer id){
        usuarioService.excluir(id);
        System.out.println("excluido co sucesso" + id);
        return "redirect:/usuario/lista";
    }


}
