package com.projectengcomjr.engcompjr.Service;

import com.projectengcomjr.engcompjr.DTO.Request.ServicoRequestDTO;
import com.projectengcomjr.engcompjr.DTO.Response.ServicoReponseDTO;

import java.util.List;


public interface ServicoService {

    ServicoReponseDTO findById(Long id);

    List<ServicoReponseDTO> findALl();

    ServicoReponseDTO register(ServicoRequestDTO servicoDTO);

    ServicoReponseDTO update(Long id,ServicoRequestDTO servicoDTO);

    String delete(Long id);
}
