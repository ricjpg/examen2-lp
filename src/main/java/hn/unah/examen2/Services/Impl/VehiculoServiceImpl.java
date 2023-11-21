package hn.unah.examen2.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.Models.Vehiculo;
import hn.unah.examen2.Repositories.VehiculoRepository;
import hn.unah.examen2.Services.VehiculoService;


@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo nuevoVehiculo) {
        nuevoVehiculo.setTipoVehiculo(nuevoVehiculo.getTipoVehiculo());
        return this.vehiculoRepository.save(nuevoVehiculo);    
    }

    @Override
    public List<Vehiculo> obtenerTodos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerPorId(int codigoVehiculo) {
        return this.vehiculoRepository.findById(codigoVehiculo).get();
    }
    
}
