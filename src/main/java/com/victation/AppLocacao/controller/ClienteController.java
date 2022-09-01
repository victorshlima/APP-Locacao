package com.victation.AppLocacao.controller;


import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.domain.Cliente;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ClienteController {

    private static Map<String, Cliente> mapaCliente = new HashMap<String, Cliente>();

    public static void incluir(Cliente cliente){
        mapaCliente.put(cliente.getEmail(), cliente);
        AppImpressao.relatorio("Cliente " + cliente.getNome() + " incuido com sucesso", cliente);
    }
    public static Collection<Cliente> obterLista(){
        return mapaCliente.values();
    }
    @GetMapping("/cliente/lista")
    public String telaLista (HttpServletRequest request, Model model){

        model.addAttribute("clienteLista", obterLista());
        return "/cliente/lista";
    }




}
