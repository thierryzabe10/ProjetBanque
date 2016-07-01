package com.groupe4.gestiondesbanques.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author inti0298
 *classe:Retrait
 *date :30/06/2016
 */
@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {

	public Retrait() {
		super();
	}

	public Retrait(Date dateOperation, double montant) {
		super(dateOperation, montant);
	}

}
