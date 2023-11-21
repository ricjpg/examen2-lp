package hn.unah.examen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.Models.TipoVehiculo;
import hn.unah.examen2.Repositories.TipoVehiculoRepository;
import hn.unah.examen2.Services.TipoVehiculoService;


@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    
    
}
