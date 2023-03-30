package com.projectengcomjr.engcompjr.Util;

import com.projectengcomjr.engcompjr.DTO.Request.ServicoRequestDTO;
import com.projectengcomjr.engcompjr.DTO.Response.ServicoReponseDTO;
import com.projectengcomjr.engcompjr.Entities.ServicoEntities;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServicoMapper {
    public ServicoEntities toServico(ServicoRequestDTO servicoDTO)
    {
        return ServicoEntities.builder()
                .nome(servicoDTO.getNome())
                .contato(servicoDTO.getContato())
                .tipo(servicoDTO.getTipo())
                .descricao_cliente(servicoDTO.getDescricao_cliente())
                .descricao_recebimento(servicoDTO.getDescricao_recebimento())
                .status(servicoDTO.getStatus())
                .build();
    }

    public ServicoReponseDTO toServicoDTO(ServicoEntities servico)
    {
        return new ServicoReponseDTO(servico);
    }

    public List<ServicoReponseDTO> toServicoDTO(List<ServicoEntities> servicoList)
    {
        return servicoList.stream().map(ServicoReponseDTO::new).collect(Collectors.toList());
    }

    public void updateServicoData(ServicoEntities servico, ServicoRequestDTO servicoDTO)
    {
        servico.setNome(servicoDTO.getNome());
        servico.setContato(servicoDTO.getContato());
        servico.setTipo(servicoDTO.getTipo());
        servico.setDescricao_cliente(servicoDTO.getDescricao_cliente());
        servico.setDescricao_recebimento(servicoDTO.getDescricao_recebimento());
        servico.setStatus(servicoDTO.getStatus());
    }
}
