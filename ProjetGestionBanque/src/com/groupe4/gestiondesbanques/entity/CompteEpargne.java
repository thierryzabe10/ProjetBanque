package com.groupe4.gestiondesbanques.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * 
 * @author inti0298
 classe:Compte Epargne
 *date :30/06/2016
 */
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
	/*attributs*/
	private double taux;
/*get et set*/

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	/*constructeurs*/

	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}

	public CompteEpargne(Double solde, Date dateCreation, double taux) {
		super(solde, dateCreation);
		this.taux = taux;
	}

}
