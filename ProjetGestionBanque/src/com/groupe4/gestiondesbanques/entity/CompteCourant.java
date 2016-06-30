package com.groupe4.gestiondesbanques.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * 
 * @author inti0298
 classe:Compte Courant
 *date :30/06/2016
 */
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
	/*attributs*/
	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
/*constructeurs*/

	public CompteCourant() {
		super();
	}

	public CompteCourant(Double solde, Date dateCreation, double decouvert) {
		super(solde, dateCreation);
		this.decouvert = decouvert;
	}

	
	
}
