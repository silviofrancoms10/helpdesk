package com.silviofrancoms.helpdesk.repositories;

import com.silviofrancoms.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
