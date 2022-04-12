package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.ethereum.entities.Immobilier;

public interface ImmobilierRepository extends MongoRepository<Immobilier, Integer>{

}
