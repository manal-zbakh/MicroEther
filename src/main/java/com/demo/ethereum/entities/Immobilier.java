package com.demo.ethereum.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "immobilier")
public class Immobilier {
@Id
private String id;
private String codeImmobilier;
private String address;
private String type;
private String description;
private double surface ;
@DBRef(lazy = true)
private Client client;
public Immobilier(
		String id,
		String codeImmobilier,
		String address,
		String type,
		String description,
		double surface,
		Client client) {
	super();
	this.id = id;
	this.codeImmobilier=codeImmobilier;
	this.address = address;
	this.type = type;
	this.description = description;
	this.surface = surface;
	this.client=client;
}







public Client getClient() {
	return client;
}







public void setClient(Client client) {
	this.client = client;
}







public String getCodeImmobilier() {
	return codeImmobilier;
}







public void setCodeImmobilier(String codeImmobilier) {
	this.codeImmobilier = codeImmobilier;
}







public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getSurface() {
	return surface;
}
public void setSurface(double surface) {
	this.surface = surface;
}







}
