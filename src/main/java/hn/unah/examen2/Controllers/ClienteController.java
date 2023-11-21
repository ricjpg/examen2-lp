package hn.unah.examen2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.Models.Cliente;
import hn.unah.examen2.Services.Impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    private Cliente crearCliente(@RequestBody Cliente nuevoCliente){
        return this.clienteServiceImpl.crearCliente(nuevoCliente);
    }

    @GetMapping("/obtenerTodos")
    private List<Cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtenerPorId")
    private Cliente getCliente(@RequestParam(name="codigoCliente") int codigoCliente){
        return this.clienteServiceImpl.obtenerPorId(codigoCliente);
    }
}
