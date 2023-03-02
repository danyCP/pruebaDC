package com.ISTA.pruebaDC.repository;

import com.ISTA.pruebaDC.model.Carta;
import com.ISTA.pruebaDC.model.Plato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlatoRepository extends MongoRepository<Plato, Long> {
}
