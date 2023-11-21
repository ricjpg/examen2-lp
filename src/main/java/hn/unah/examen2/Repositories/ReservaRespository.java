package hn.unah.examen2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen2.Models.Reserva;

public interface ReservaRespository extends JpaRepository<Reserva, Integer>{
    
}
