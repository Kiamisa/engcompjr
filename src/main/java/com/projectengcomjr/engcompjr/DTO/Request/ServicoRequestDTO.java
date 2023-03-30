package com.projectengcomjr.engcompjr.DTO.Request;

import lombok.Getter;

@Getter
public class ServicoRequestDTO
{
    private String nome;
    private String contato;
    private String tipo;
    private String descricao_cliente;
    private String descricao_recebimento;
    private Boolean status;
}
