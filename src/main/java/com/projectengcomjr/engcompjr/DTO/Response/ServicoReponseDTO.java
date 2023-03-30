package com.projectengcomjr.engcompjr.DTO.Response;

import com.projectengcomjr.engcompjr.Entities.ServicoEntities;
import lombok.Getter;

@Getter
public class ServicoReponseDTO {

    private final Long id;
    private final String nome;
    private final String contato;
    private final String tipo;
    private final String descricao_cliente;
    private final String descricao_recebimento;
    private final Boolean status;

    public ServicoReponseDTO(ServicoEntities servico)
    {
        this.id = servico.getId();
        this.nome = servico.getNome();
        this.contato = servico.getContato();
        this.tipo = servico.getTipo();
        this.descricao_cliente = servico.getDescricao_cliente();
        this.descricao_recebimento = servico.getDescricao_recebimento();
        this.status = servico.getStatus();
    }
}
