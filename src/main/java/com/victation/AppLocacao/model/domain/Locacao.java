package com.victation.AppLocacao.model.domain;

import com.victation.AppLocacao.interfaces.IPrinter;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Locacao implements IPrinter {

    private String descricao;
    private LocalDateTime dataLocacao;
    private LocalDateTime dataDevolucao;
    private Automovel automovel;
    private boolean web;

    @Override
    public void impressao() {
        System.out.println("#usuario");
        System.out.println(this);
    }

}
