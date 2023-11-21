package hn.unah.examen2.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tipovehiculo")
@Data
public class TipoVehiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipovehiculo")
    private int idTipoVehiculo;
    
    @Column(name="descripcion")
    private String descripcion;

    @Column(name="precioxhora")
    private double precioXhora;
    
}
