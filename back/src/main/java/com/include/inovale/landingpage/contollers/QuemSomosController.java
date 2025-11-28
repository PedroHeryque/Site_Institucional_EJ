package com.include.inovale.landingpage.contollers;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.include.inovale.landingpage.models.dtos.ReqQuemSomosDTO;
import com.include.inovale.landingpage.models.dtos.ResQuemSomosDTO;
import com.include.inovale.landingpage.services.QuemSomosService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/membro")
public class QuemSomosController {
    private final QuemSomosService quemSomosService;

    @PostMapping()
    public ResponseEntity<ResQuemSomosDTO> salvarMembro(@RequestBody @Validated ReqQuemSomosDTO dto){
        ResQuemSomosDTO membro = quemSomosService.criarMembro(dto);
        return ResponseEntity.ok().body(membro);
    }
    
}
