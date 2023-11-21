package hn.unah.examen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.Models.Reserva;
import hn.unah.examen2.Repositories.ReservaRespository;
import hn.unah.examen2.Services.ReservaService;


@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRespository reservaRespository;

    @Override
    public Reserva crearReserva(Reserva nuevaReserva) {
        return this.reservaRespository.save(nuevaReserva);
    }
    
}
