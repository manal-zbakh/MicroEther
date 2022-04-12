package com.example.demo.ethereum;

import java.math.BigInteger;

public class Contract {
 
	String id;
	String owner;
	BigInteger cout;
	public Contract() {
		// TODO Auto-generated constructor stub
	}
	public Contract(String id,String owner, BigInteger cout) {
		super();
		this.id = id;
		this.owner = owner;
		this.cout = cout;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public BigInteger getCout() {
		return cout;
	}
	public void setCout(BigInteger cout) {
		this.cout = cout;
	}
	public Contract(String id, BigInteger cout) {
		super();
		this.id = id;
		this.cout = cout;
	}

	
	
	
	

}
