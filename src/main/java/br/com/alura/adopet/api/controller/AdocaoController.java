package br.com.alura.adopet.api.controller;

import br.com.alura.adopet.api.dto.AprovacaoAdocaoDto;
import br.com.alura.adopet.api.dto.ReprovacaoAdocaoDto;
import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.service.AdocaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/adocoes")
public class AdocaoController {


    @Autowired
    private AdocaoService service;


    @PostMapping
    @Transactional
    public ResponseEntity<String> solicitar(@RequestBody @Valid SolicitacaoAdocaoDto dto) {
        service.solicitar(dto);
        return ResponseEntity.ok("Adocao solicitado com sucesso!");
    }

    @PutMapping("/aprovar")
    @Transactional
    public ResponseEntity<String> aprovar(@RequestBody @Valid AprovacaoAdocaoDto dto) {
         service.aprovar(dto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/reprovar")
    @Transactional
    public ResponseEntity<String> reprovar(@RequestBody @Valid ReprovacaoAdocaoDto dto) {
         service.reprovar(dto);
        return ResponseEntity.ok().build();
    }

}
