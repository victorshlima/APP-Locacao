package com.victation.AppLocacao.controller;

import com.victation.AppLocacao.model.domain.Cliente;
import com.victation.AppLocacao.model.domain.Moto;
import com.victation.AppLocacao.model.test.AppImpressao;
import com.victation.AppLocacao.service.MotoService;
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
public class MotoController {

    private final MotoService motoService;
    private static Integer id =1;
    private static Map<String, Cliente> mapaCliente = new HashMap<String, Cliente>();

    public MotoController(MotoService motoService) {
        this.motoService = motoService;
    }

    public static void incluir(Cliente cliente){
        mapaCliente.put(cliente.getEmail(), cliente);
        AppImpressao.relatorio("\n Locacao " + cliente.getNome() + " incuido com sucesso", cliente  );
    }
    public static Collection<Cliente> obterLista(){
        return mapaCliente.values();
    }

    @GetMapping(value = "/moto")
    public String telaCadastro(){
        return "moto/cadastro";
    }

    @GetMapping("/moto/lista")
    public String telaLista (HttpServletRequest request, Model model){
        model.addAttribute("listagem", motoService.obterLista());
        return "/moto/lista";
    }

    @PostMapping(value ="/moto/incluir" )
    public String incluir(Moto moto){
        moto.setId(id++);
        motoService.incluir(moto);
        return  "redirect:/moto/lista";
    }

    @GetMapping(value ="/moto/{id}/excluir" )
    public String excluir(@PathVariable Integer id ){
        motoService.excluir(id);
        return  "redirect:/moto/lista";
    }

}
