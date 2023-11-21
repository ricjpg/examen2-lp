package hn.unah.examen2.Services;

import java.util.List;

import hn.unah.examen2.Models.Vehiculo;

public interface VehiculoService {
    

    public Vehiculo crearVehiculo(Vehiculo nuevoVehiculo);

    public List<Vehiculo> obtenerTodos();

    public Vehiculo obtenerPorId(int codigoVehiculo);
}
