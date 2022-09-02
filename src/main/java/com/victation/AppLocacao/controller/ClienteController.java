package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Cliente;
import com.victation.AppLocacao.model.test.AppImpressao;
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
public class ClienteController {

    private static Map<String, Cliente> mapaCliente = new HashMap<String, Cliente>();

    public static Cliente validar(String email, String senha){

        Cliente cliente = mapaCliente.get(email);

        if (cliente != null && cliente.getSenha().equals(senha)){
            return cliente;
        }
        return null;
    }

    @GetMapping("/cliente/lista")
    public String telaLista (HttpServletRequest request, Model model){

        model.addAttribute("clienteLista", obterLista());
        return "/cliente/lista";
    }

    @PostMapping("/cliente/incluir")
    public static String inclusao(Cliente cliente){
        System.out.println("Cadastro !!!   " + cliente.getNome());

        incluir(cliente);
        AppImpressao.relatorio("Cliente " + cliente.getNome() + " incuido com sucesso", cliente);
        return "redirect:/";
    }


    public static void incluir(Cliente cliente){
        mapaCliente.put(cliente.getEmail(), cliente);
        AppImpressao.relatorio("Cliente " + cliente.getNome() + " incuido com sucesso", cliente);
    }

    public static Collection<Cliente> obterLista(){
        return mapaCliente.values();
    }


    @GetMapping("/cliente")
    public String telaCadastro (){
        return "cliente/cadastro";
    }

    @GetMapping("/cliente/{email}/excluir")
    public String exclusao(@PathVariable String email){
        excluir(email);
        System.out.println("excluido co sucesso" + email);
        return "redirect:/cliente/lista";
    }

    public static void excluir(String id){
        mapaCliente.remove(id);
    }
}
