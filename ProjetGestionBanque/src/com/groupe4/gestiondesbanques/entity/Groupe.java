package com.groupe4.gestiondesbanques.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
/**
 * 
 * @author inti0298
 *classe:Groupe
 *date :30/06/2016
 */
@Entity
public class Groupe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeGroupe;
	private String nomGroupe;
	@ManyToMany
	@JoinTable(name="EMP_GRPE")
	private Collection<Employe>listeDesEmployes;
	/*get et set*/
	public Long getCodeGroupe() {
		return codeGroupe;
	}
	public void setCodeGroupe(Long codeGroupe) {
		this.codeGroupe = codeGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Collection<Employe> getListeDesEmployes() {
		return listeDesEmployes;
	}
	public void setListeDesEmployes(Collection<Employe> listeDesEmployes) {
		this.listeDesEmployes = listeDesEmployes;
	}
	/*constructeurs*/
	public Groupe(String nomGroupe) {
		super();
		this.nomGroupe = nomGroupe;
	}
	public Groupe() {
		super();
	}
	
	
	

}
