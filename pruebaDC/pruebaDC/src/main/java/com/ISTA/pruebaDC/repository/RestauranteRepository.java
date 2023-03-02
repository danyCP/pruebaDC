package com.ISTA.pruebaDC.repository;

import com.ISTA.pruebaDC.model.Carta;
import com.ISTA.pruebaDC.model.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestauranteRepository extends MongoRepository<Restaurante, Long> {
}
