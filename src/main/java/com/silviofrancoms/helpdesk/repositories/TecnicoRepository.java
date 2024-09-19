package com.silviofrancoms.helpdesk.repositories;

import com.silviofrancoms.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
