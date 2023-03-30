package com.projectengcomjr.engcompjr.Service;

import com.projectengcomjr.engcompjr.DTO.Request.ServicoRequestDTO;
import com.projectengcomjr.engcompjr.DTO.Response.ServicoReponseDTO;
import com.projectengcomjr.engcompjr.Entities.ServicoEntities;
import com.projectengcomjr.engcompjr.Repository.ServicoRepository;
import com.projectengcomjr.engcompjr.Util.ServicoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor

public class ServicoServiceImplements implements ServicoService {

    private final ServicoRepository servicoRepository;

    public final ServicoMapper servicoMapper;

    @Override
    public ServicoReponseDTO findById(Long id) {
        return servicoMapper.toServicoDTO(returnServico(id));
    }

    @Override
    public List<ServicoReponseDTO> findALl() {
        return servicoMapper.toServicoDTO(servicoRepository.findAll());
    }

    @Override
    public ServicoReponseDTO register(ServicoRequestDTO servicoDTO) {
        ServicoEntities servico = servicoMapper.toServico(servicoDTO);

        return servicoMapper.toServicoDTO(servicoRepository.save(servico));
    }


    @Override
    public ServicoReponseDTO update(Long id, ServicoRequestDTO servicoDTO) {
        ServicoEntities servico = returnServico(id);

        servicoMapper.updateServicoData(servico, servicoDTO);

        return servicoMapper.toServicoDTO(servicoRepository.save(servico));
    }

    @Override
    public String delete(Long id) {
        servicoRepository.deleteById(id);
        return "Cliente id: "+id+"deletado!";
    }

    private ServicoEntities returnServico(Long id)
    {
       return servicoRepository.findById(id)
               .orElseThrow(()->new RuntimeException("Pessoa não encontrada"));
    }
}
