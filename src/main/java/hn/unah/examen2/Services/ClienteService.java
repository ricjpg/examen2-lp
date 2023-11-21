package hn.unah.examen2.Services;

import java.util.List;

import hn.unah.examen2.Models.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerTodos();

    public Cliente obtenerPorId(int codigoCliente);
}
