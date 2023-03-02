package com.ISTA.pruebaDC.repository;

import com.ISTA.pruebaDC.model.Carta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartaRespository extends MongoRepository<Carta, Long> {
}
