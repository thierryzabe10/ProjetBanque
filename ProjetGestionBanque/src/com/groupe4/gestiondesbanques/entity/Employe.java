package com.groupe4.gestiondesbanques.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
/**
 * 
 * @author inti0298
 *classe:Employe
 *date :30/06/2016
 */
@Entity
public class Employe implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmploye;
	private String nomEmploye;
	@OneToMany(mappedBy="employe")
	private Collection<Operation>listeDesOperations;
	@OneToMany(mappedBy="employe")
    private Collection<Compte>listeDesComptes;
	@ManyToMany
	@JoinTable(name="EMP_GRPE")
    private Collection<Groupe>listeDesGroupes;
	/*get et set*/
	public Long getCodeEmploye() {
		return codeEmploye;
	}
	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public Collection<Operation> getListeDesOperations() {
		return listeDesOperations;
	}
	public void setListeDesOperations(Collection<Operation> listeDesOperations) {
		this.listeDesOperations = listeDesOperations;
	}
	public Collection<Compte> getListeDesComptes() {
		return listeDesComptes;
	}
	public void setListeDesComptes(Collection<Compte> listeDesComptes) {
		this.listeDesComptes = listeDesComptes;
	}
	public Collection<Groupe> getListeDesGroupes() {
		return listeDesGroupes;
	}
	public void setListeDesGroupes(Collection<Groupe> listeDesGroupes) {
		this.listeDesGroupes = listeDesGroupes;
	}
	/*constructeurs*/
	public Employe(String nomEmploye) {
		super();
		this.nomEmploye = nomEmploye;
	}
	public Employe() {
		super();
	
	}
	
}
