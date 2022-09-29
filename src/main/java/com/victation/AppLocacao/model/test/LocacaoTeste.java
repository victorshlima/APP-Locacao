package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.*;
import com.victation.AppLocacao.model.domain.exeptions.AutomovelNullExecption;
import com.victation.AppLocacao.model.domain.exeptions.LocatarioNullExecption;
import com.victation.AppLocacao.model.repository.UsuarioRepository;
import com.victation.AppLocacao.service.LocacaoService;
import com.victation.AppLocacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.*;

@Order(99)
@Component
public class LocacaoTeste implements ApplicationRunner {

    @Autowired
    private  LocacaoService locacaoService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    private static Integer id =1;
    @Override
    public void run(ApplicationArguments args)   {

       String dir = "//home//wid_vlima//dev//git_study//infnet//APP-Locacao//dev//";
        String arq = "locacoes.txt";
        String fileName =dir + arq;
        System.out.println(fileName);

        Usuario usuario = usuarioRepository.findById(1).get();

        usuarioService.incluir(usuario);

        Locatario locatario = new Locatario();
        locatario.setId(1);


       List<Automovel> automoveis = new ArrayList<Automovel>();

        var moto = new Moto();
        moto.setId(1);
        automoveis.add(moto);

        var carro = new Carro();
        carro.setId(1);
        automoveis.add(carro);

        var caminhao = new Caminhao();
        caminhao.setId(1);
        automoveis.add(caminhao);

        Locacao locacao = null;
        try {
            locacao = new Locacao(locatario, automoveis);
            locacao.setUsuario(usuario);

        } catch (LocatarioNullExecption e) {
            e.printStackTrace();
        } catch (AutomovelNullExecption e) {
            e.printStackTrace();
        }
        locacao.setDescricao("teste");
        locacao.setWeb(true);

        locacaoService.incluir(locacao);


    }

}
