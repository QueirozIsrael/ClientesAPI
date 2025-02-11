package com.example.QueirozIsrael.Vendas.repositories;

import com.example.QueirozIsrael.Vendas.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
