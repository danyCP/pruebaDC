package com.ISTA.pruebaDC.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Restaurante")
@Data
@Getter
@Setter
public class Restaurante {
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    private Carta carta;
    private List<Carta> listaCartas;

    private Cliente cli;
    private List<Cliente> listaCli;
}
