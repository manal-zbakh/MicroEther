package com.demo.ethereum.entities;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "contrat")
public class Contrat {
@Id
private String id;
private double cout;
private Date date ;
@DBRef
private Immobilier immobilier;
@DBRef
private Client owner;
@DBRef
private Client bayer;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double getCout() {
	return cout;
}
public void setCout(double cout) {
	this.cout = cout;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Immobilier getImmobilier() {
	return immobilier;
}
public void setImmobilier(Immobilier immobilier) {
	this.immobilier = immobilier;
}
public Client getOwner() {
	return owner;
}
public void setOwner(Client owner) {
	this.owner = owner;
}
public Client getBayer() {
	return bayer;
}
public void setBayer(Client bayer) {
	this.bayer = bayer;
}
public Contrat(String id, double cout, Immobilier immobilier, Client owner, Client bayer) {
	super();
	this.id = id;
	this.cout = cout;
	this.date = new  Date();
	this.immobilier = immobilier;
	this.owner = owner;
	this.bayer = bayer;
}

}
