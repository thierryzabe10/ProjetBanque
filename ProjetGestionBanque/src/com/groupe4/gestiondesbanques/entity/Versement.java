package com.groupe4.gestiondesbanques.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author inti0298
 *classe:Versement
 *date :30/06/2016
 */
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {

}
