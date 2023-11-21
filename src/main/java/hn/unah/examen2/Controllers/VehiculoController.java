package hn.unah.examen2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.Models.Vehiculo;
import hn.unah.examen2.Services.Impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    private Vehiculo crearVehiculo(@RequestBody Vehiculo nuevoVehiculo){
        return this.vehiculoServiceImpl.crearVehiculo(nuevoVehiculo);
    }

    @GetMapping("/obtenerTodos")
    private List<Vehiculo> obtenerTodos(){
        return this.vehiculoServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtenerPorId")
    private Vehiculo getVehiculo(@RequestParam(name="idVehiculo") int idVehiculo){
        return this.vehiculoServiceImpl.obtenerPorId(idVehiculo);
    }
}
