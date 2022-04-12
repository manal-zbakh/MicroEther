package com.demo.ethereum.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "client")
public class Client {
@Id
private String id;
private String nom;
private String codeClient;
public String getCodeClient() {
	return codeClient;
}
public Client() {
	
}

public void setCodeClient(String codeClient) {
	this.codeClient = codeClient;
}
private String prenom;
private String email;

public Client(String id, String nom, String prenom, String codeClient, String email) {
	super();
	this.id=id;
	this.codeClient = codeClient;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;

}





public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}






}
