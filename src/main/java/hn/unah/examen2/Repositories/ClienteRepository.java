package hn.unah.examen2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen2.Models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
