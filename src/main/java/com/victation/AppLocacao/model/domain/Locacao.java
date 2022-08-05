package com.victation.AppLocacao.model.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Locacao {

    private String descricao;
    private LocalDateTime data;
    private boolean web;

}
