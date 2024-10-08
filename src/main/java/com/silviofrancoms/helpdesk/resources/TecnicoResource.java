package com.silviofrancoms.helpdesk.resources;

import com.silviofrancoms.helpdesk.domain.Tecnico;
import com.silviofrancoms.helpdesk.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {

    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tecnico> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(tecnicoService.findById(id));
    }
}
