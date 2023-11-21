package hn.unah.examen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.Models.TipoCliente;
import hn.unah.examen2.Repositories.TipoClienteRepository;
import hn.unah.examen2.Services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{

    @Autowired
    TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente nuevoTipoCliente = new TipoCliente();
        nuevoTipoCliente.setDescripcion(descripcion);
        return this.tipoClienteRepository.save(nuevoTipoCliente);
    }

    
    
}
