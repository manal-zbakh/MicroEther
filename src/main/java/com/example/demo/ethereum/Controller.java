package com.example.demo.ethereum;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.web3j.tx.TransactionManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tuples.generated.Tuple3;



import com.demo.ethereum.entities.Contrat;


@SuppressWarnings("deprecation")
@RestController
@RequestMapping("ethereum")
public class Controller {
	@Autowired
	private com.example.demo.service.ContratService contratservice;
	public Controller() {

	}


	 Web3j web3j = Web3j.build(new HttpService("HTTP://127.0.0.1:7545"));
	 Credentials credentials = Credentials.create(Constantes.PRIVATE_KEY);
	 TransactionManager  transactionManager = new org.web3j.tx.RawTransactionManager(web3j,credentials );
	 private final Immobilier_sol_Immobilier contract = Immobilier_sol_Immobilier.load(Constantes.CONTRATC_ADDRESS,web3j,credentials,Constantes.GAS_PRICE, Constantes.GAS_LIMIT);    
	 @GetMapping("/get")  
	    public int getCountContract() throws Exception {
	        BigInteger msg = contract.getCount().send();
	        System.out.println(msg);
	        System.out.println(msg.intValue());
	        return msg.intValue();
	  }
	 @GetMapping("all")
	 public  List<Contrat> sayHello() {
		 return contratservice.getContratById();
		 }
	    @GetMapping("/getmy")
	    public ResponseEntity<List<Contract>> getContracts() throws Exception {
	    	int lenght = getCountContract();
	    	
	    	List<Contract> contracts = new ArrayList<Contract>();
	       for(int i=1;i<lenght+1;i++) {
	        	Tuple3<String, String, BigInteger> msg = contract.List(BigInteger.valueOf(i)).send();
	        	contracts.add(new Contract(msg.component1(),msg.component2(),msg.component3()));      	  
	       }
	        return new ResponseEntity<>(contracts, HttpStatus.OK);
	    }
	    
	    @PostMapping("/add")
	    public ResponseEntity<CompletableFuture<TransactionReceipt>> createContract(@RequestBody Contract c) throws Exception {
	    	CompletableFuture<TransactionReceipt> msg = contract.create(c.id,c.owner,c.cout).sendAsync();
	    	System.out.println("create");
	        System.out.println(msg); 
	        return new ResponseEntity<>(msg, HttpStatus.OK);
	    }
	    
	    @PostMapping("save")
	    public Contrat save(@RequestBody Contrat c) {return contratservice.CreeContrat(c);}
	    }

