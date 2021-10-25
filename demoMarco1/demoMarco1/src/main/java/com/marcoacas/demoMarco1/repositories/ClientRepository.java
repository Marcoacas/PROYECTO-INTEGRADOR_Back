package com.marcoacas.demoMarco1.repositories;

import com.marcoacas.demoMarco1.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
