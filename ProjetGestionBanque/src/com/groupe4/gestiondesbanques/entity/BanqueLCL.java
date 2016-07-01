package com.groupe4.gestiondesbanques.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author inti0298
 *classe:Banque LCL
 *date :30/06/2016
 */
@Entity
@DiscriminatorValue("LCL")
public class BanqueLCL extends Banque {

	public BanqueLCL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BanqueLCL(String nomAgence, String adresse, String codePostale) {
		super(nomAgence, adresse, codePostale);
		// TODO Auto-generated constructor stub
	}
	
	

}
