package com.cmp.clientschallenge.repositories;

import com.cmp.clientschallenge.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
