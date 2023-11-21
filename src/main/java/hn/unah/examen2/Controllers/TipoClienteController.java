package hn.unah.examen2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.Models.TipoCliente;
import hn.unah.examen2.Services.Impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipoCliente")
public class TipoClienteController {
  
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestParam(name="descripcion") String descripcion){
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcion);
    }
}
