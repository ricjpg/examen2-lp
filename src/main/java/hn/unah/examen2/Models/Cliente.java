package hn.unah.examen2.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="cliente")
public class Cliente {
    
    @Id
    @Column(name="codigocliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoCliente;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;
    
    @Column(name="fechaingreso")
    private Date fechaIngreso;

    @ManyToOne
    @JoinColumn(name="idtipocliente")
    private TipoCliente tipoCliente;
}
