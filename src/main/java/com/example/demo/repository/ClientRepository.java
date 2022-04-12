package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.demo.ethereum.entities.Client;

public interface ClientRepository extends MongoRepository<Client, Integer>{


}
