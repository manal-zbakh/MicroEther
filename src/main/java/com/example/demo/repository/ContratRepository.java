package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.ethereum.entities.Contrat;

public interface ContratRepository extends MongoRepository<Contrat, String>{

}
