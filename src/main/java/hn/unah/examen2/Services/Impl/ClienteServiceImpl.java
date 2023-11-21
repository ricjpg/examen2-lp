package hn.unah.examen2.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.Models.Cliente;
import hn.unah.examen2.Repositories.ClienteRepository;
import hn.unah.examen2.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerPorId(int codigoCliente) {
        return this.clienteRepository.findById(codigoCliente).get();
    }
    
}
