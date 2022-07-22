package com.espacobeleza.espacobeleza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espacobeleza.espacobeleza.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
