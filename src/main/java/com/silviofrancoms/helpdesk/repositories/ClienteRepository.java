package com.silviofrancoms.helpdesk.repositories;

import com.silviofrancoms.helpdesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
