package com.groupe4.gestiondesbanques.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author inti0298
 *classe:Banque CIC
 *date :30/06/2016
 */
@Entity
@DiscriminatorValue("CIC")
public class BanqueCIC extends Banque {

}
