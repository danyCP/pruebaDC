package com.ISTA.pruebaDC.repository;

import com.ISTA.pruebaDC.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
