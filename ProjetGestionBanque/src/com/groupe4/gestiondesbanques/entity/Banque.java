package com.groupe4.gestiondesbanques.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
/**
 * 
 * @author inti0298
 *classe:Banque
 *date :30/06/2016
 */
	@Entity
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
	@DiscriminatorColumn(discriminatorType=DiscriminatorType.STRING,length=3,name="TYPE_BANK")
	public abstract class Banque implements Serializable{
		/*attributs*/

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
			private Long idBanque;
			private String nomAgence;
			private String adresse;
			private String codePostale;
			@OneToMany(mappedBy="banque")
			private Collection<Compte>listeDesComptes;
			
			
			/*get et set*/
			public Long getIdBanque() {
				return idBanque;
			}
			public void setIdBanque(Long idBanque) {
				this.idBanque = idBanque;
			}
			public String getNomAgence() {
				return nomAgence;
			}
			public void setNomAgence(String nomAgence) {
				this.nomAgence = nomAgence;
			}
			public String getAdresse() {
				return adresse;
			}
			public void setAdresse(String adresse) {
				this.adresse = adresse;
			}
			public String getCodePostale() {
				return codePostale;
			}
			public void setCodePostale(String codePostale) {
				this.codePostale = codePostale;
			}
			public Collection<Compte> getListeDesComptes() {
				return listeDesComptes;
			}
			public void setListeDesComptes(Collection<Compte> listeDesComptes) {
				this.listeDesComptes = listeDesComptes;
			}
			/*constructeurs*/
			public Banque(String nomAgence, String adresse, String codePostale) {
				super();
				this.nomAgence = nomAgence;
				this.adresse = adresse;
				this.codePostale = codePostale;
			}
			public Banque() {
				super();
			}
			
			
			
	}



