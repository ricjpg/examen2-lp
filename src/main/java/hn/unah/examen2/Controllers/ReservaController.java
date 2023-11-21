package hn.unah.examen2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.Models.Reserva;
import hn.unah.examen2.Services.Impl.ReservaServiceImpl;

@RestController
@RequestMapping("api/reserva")
public class ReservaController {
    
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("crear")
    private Reserva crearReserva(Reserva nuevaReserva){
        return reservaServiceImpl.crearReserva(nuevaReserva);
    }
}
