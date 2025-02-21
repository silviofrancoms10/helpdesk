package com.silviofrancoms.helpdesk.services;

import com.silviofrancoms.helpdesk.domain.Tecnico;
import com.silviofrancoms.helpdesk.domain.TecnicoDTO;
import com.silviofrancoms.helpdesk.repositories.TecnicoRepository;
import com.silviofrancoms.helpdesk.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> obj = tecnicoRepository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: " + id ));
    }

    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }

    public Tecnico create(TecnicoDTO objDTO) {
        objDTO.setId(null);
        return tecnicoRepository.save(new Tecnico(objDTO));
    }
}
