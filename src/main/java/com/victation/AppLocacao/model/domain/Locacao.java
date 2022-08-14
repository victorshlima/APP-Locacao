package com.victation.AppLocacao.model.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Locacao {

    private String descricao;
    private LocalDateTime dataLocacao;
    private LocalDateTime dataDevolucao;
    private Automovel automovel;
    private boolean web;

}
