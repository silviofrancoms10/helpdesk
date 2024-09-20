package com.silviofrancoms.helpdesk.services;

import com.silviofrancoms.helpdesk.domain.Chamado;
import com.silviofrancoms.helpdesk.domain.Cliente;
import com.silviofrancoms.helpdesk.domain.Tecnico;
import com.silviofrancoms.helpdesk.domain.enums.Perfil;
import com.silviofrancoms.helpdesk.domain.enums.Prioridade;
import com.silviofrancoms.helpdesk.domain.enums.Status;
import com.silviofrancoms.helpdesk.repositories.ChamadoRepository;
import com.silviofrancoms.helpdesk.repositories.ClienteRepository;
import com.silviofrancoms.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaDB() {
        Tecnico tec1 = new Tecnico(null, "Silvio Franco", "12345678900", "silvio@mail.com.br", "123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Linus Torvalds", "12345678901", "torvalds@mail.com", "123");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
