package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Cliente;
import com.victation.AppLocacao.model.test.AppImpressao;
import com.victation.AppLocacao.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/cliente/lista")
    public String telaLista (HttpServletRequest request, Model model){
        model.addAttribute("clienteLista", clienteService.obterLista());
        return "/cliente/lista";
    }

    @PostMapping("/cliente/incluir")
    public String incluir(Cliente cliente){
        System.out.println("Cadastro !!!   " + cliente.getNome());

        clienteService.incluir(cliente);
        AppImpressao.relatorio("Cliente " + cliente.getNome() + " incuido com sucesso", cliente);
        return "redirect:/";
    }

    @GetMapping("/cliente")
    public String telaCadastro (){
        return "cliente/cadastro";
    }

    @GetMapping("/cliente/{email}/excluir")
    public String excluir(@PathVariable String email){
        clienteService.excluir(email);
        System.out.println("excluido co sucesso" + email);
        return "redirect:/cliente/lista";
    }


}
