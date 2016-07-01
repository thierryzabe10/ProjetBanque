package com.groupe4.gestiondesbanques.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author inti0298
 *classe:Banque BNP
 *date :30/06/2016
 */
@Entity
@DiscriminatorValue("BNP")
public class BanqueBNP extends Banque {

	public BanqueBNP() {
		super();
		
	}

	public BanqueBNP(String nomAgence, String adresse, String codePostale) {
		super(nomAgence, adresse, codePostale);
		
	}
	
	

}
