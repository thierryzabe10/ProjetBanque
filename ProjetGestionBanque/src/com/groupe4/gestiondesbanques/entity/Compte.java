package com.groupe4.gestiondesbanques.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * @author inti0299
 *classe:Compte
 *date :30/06/2016
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typecompte", discriminatorType=DiscriminatorType.STRING,length=2)
public abstract class Compte implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numero;
	private Double solde;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	@ManyToOne
	@JoinColumn(name="compte_client")
	private Client client;
	@ManyToOne
	@JoinColumn(name="compte_banque")
	private Banque banque;
	@OneToMany(mappedBy="compte")
	private Collection<Operation> listeDesOperations;
	@ManyToOne
	@JoinColumn(name="listeDesComptes")
	private Employe employe;
	
	// ------- Get & Set -------- //
	
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Banque getBanque() {
		return banque;
	}
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	public Collection<Operation> getListeDesOperations() {
		return listeDesOperations;
	}
	public void setListeDesOperations(Collection<Operation> listeDesOperations) {
		this.listeDesOperations = listeDesOperations;
	}
	
	// -------- Constructor -----------/ 
	
	public Compte() {
		super();
	}
	public Compte(Double solde, Date dateCreation) {
		super();
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	
	
	

}
