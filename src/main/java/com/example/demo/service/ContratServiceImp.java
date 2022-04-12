package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.ethereum.entities.Contrat;

import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.ContratRepository;
import com.example.demo.repository.ImmobilierRepository;



@Service
public class ContratServiceImp implements ContratService{
	@Autowired
	ClientRepository clrep;

	@Autowired
	ImmobilierRepository imrep;
	@Autowired
	ContratRepository crep;
	@Override
	public Contrat CreeContrat(Contrat cl) {
		// TODO Auto-generated method stub
		return crep.save(cl);
	}




	@Override
	public Contrat getContratById(String cl) {return crep.findById(cl).get();}

	@Override
	public List<Contrat> getContratById() {return 	crep.findAll();}

}
