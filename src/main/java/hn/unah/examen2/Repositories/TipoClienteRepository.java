package hn.unah.examen2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen2.Models.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer>{
    
}
