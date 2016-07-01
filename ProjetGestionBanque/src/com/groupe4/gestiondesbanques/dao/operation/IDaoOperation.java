package com.groupe4.gestiondesbanques.dao.operation;

import com.groupe4.gestiondesbanques.entity.Operation;

/**
 * 
 * @author inti0298
 *classe: Interface de la classe opération pour la couche dao
 *date : 30/06/2016
 */
public interface IDaoOperation {

	public Operation addOperation(Operation o,Long numero, Long codeEmploye);

}
