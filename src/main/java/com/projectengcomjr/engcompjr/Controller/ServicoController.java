package com.projectengcomjr.engcompjr.Controller;

import com.projectengcomjr.engcompjr.DTO.Request.ServicoRequestDTO;
import com.projectengcomjr.engcompjr.DTO.Response.ServicoReponseDTO;
import com.projectengcomjr.engcompjr.Service.ServicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
@RequiredArgsConstructor
public class ServicoController {


    private final ServicoService servicoService;
    @GetMapping(value = "/{id}")
        public ResponseEntity<ServicoReponseDTO> findById(@PathVariable(name = "id") Long id)
    {
        return ResponseEntity.ok().body(servicoService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ServicoReponseDTO>> findAll()
    {
         return ResponseEntity.ok().body(servicoService.findALl());
    }

    @PostMapping
    public ResponseEntity<ServicoReponseDTO> register(@RequestBody ServicoRequestDTO servicoRequestDTO, UriComponentsBuilder uriBuilder)
    {
        ServicoReponseDTO servicoReponseDTO = servicoService.register(servicoRequestDTO);

        URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(servicoReponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(servicoReponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ServicoReponseDTO> update(@RequestBody ServicoRequestDTO servicoDTO, @PathVariable(name = "id") Long id)
    {
        return ResponseEntity.ok().body(servicoService.update(id, servicoDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id)
    {
        return ResponseEntity.ok().body(servicoService.delete(id));
    }

}
