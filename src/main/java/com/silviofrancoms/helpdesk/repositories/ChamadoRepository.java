package com.silviofrancoms.helpdesk.repositories;

import com.silviofrancoms.helpdesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
