package com.ISTA.pruebaDC.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "Carta")
@Data
@Getter
@Setter
public class Carta {
    private String nombre;
    private String categoria;
    private Integer cantidaad;

    private Plato plat;
    private List <Plato> listaPlat;
}
