package com.projectengcomjr.engcompjr.Entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_servicos")
@Getter
@Setter
@NoArgsConstructor

public class ServicoEntities {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        private Long id;
        @Column(name = "name", nullable = false)
        private String nome;
        @Column(name = "contato", nullable = false)
        private String contato;
        @Column(name = "tipo", nullable = false)
        private String tipo;
        @Column(name = "descricao_cliente", nullable = false)
        private String descricao_cliente;
        @Column(name = "descricao_recebimento", nullable = false)
        private String descricao_recebimento;
        @Column(name = "status", nullable = false)
        private Boolean status;

        @Builder
    public ServicoEntities(String nome, String contato, String tipo, String descricao_cliente, String descricao_recebimento, Boolean status) {
        this.nome = nome;
        this.contato = contato;
        this.tipo = tipo;
        this.descricao_cliente = descricao_cliente;
        this.descricao_recebimento = descricao_recebimento;
        this.status = status;
    }

}
