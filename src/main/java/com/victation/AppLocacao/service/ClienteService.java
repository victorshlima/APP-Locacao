package com.victation.AppLocacao.service;


import com.victation.AppLocacao.model.domain.Cliente;
import com.victation.AppLocacao.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {

    private  Map<String, Cliente> mapaCliente = new HashMap<String, Cliente>();

    public  Cliente validar(String email, String senha){


        Cliente cliente = this.mapaCliente.get(email);

        if (cliente != null && cliente.getSenha().equals(senha)){
            return cliente;
        }
        return null;
    }

    public  Collection<Cliente> obterLista(){
        return mapaCliente.values();
    }

    public  void excluir(String id){
        mapaCliente.remove(id);
    }

    public void incluir(Cliente cliente){
        mapaCliente.put(cliente.getEmail(), cliente);
        AppImpressao.relatorio("Solicitante " + cliente.getNome() + " incluído com sucesso", cliente);
    }


}
