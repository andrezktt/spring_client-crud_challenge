package com.andrezktt.client_crud.repositories;

import com.andrezktt.client_crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
