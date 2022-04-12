package com.example.demo.service;

import java.util.List;

import com.demo.ethereum.entities.Contrat;

public interface ContratService {
public Contrat CreeContrat(Contrat cl);
public Contrat getContratById(String cl);	
public List<Contrat> getContratById();	
}
