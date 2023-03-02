package com.ISTA.pruebaDC.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Plato")
@Data
@Getter
@Setter
public class Plato {
    private String nombre;
    private String descripcion;
    private Double precio;
}

