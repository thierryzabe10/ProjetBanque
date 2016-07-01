package com.groupe4.gestiondesbanques.service.operation;

import java.text.ParseException;

import com.groupe4.gestiondesbanques.entity.Operation;
/**
 * 
 * @author inti0298
 *classe: classe Operation de la couche service
 *
 */
public interface IServiceOperation {
	
	//méthode qui permet d'effectuer un versment dans un compte
	public boolean verser(Long numero, double montant, Long codeEmploye) throws ParseException;
	//méthode qui permet de faire un retrait depuis un compte
	public boolean retirer(Long numero, double montant, Long codeEmploye);
	//méthode qui permet d'effectuer un virement d'un compte à un autre
	public boolean virement(Long numeroCpte1,Long numeroCpte2, double montant, Long codeEmploye) throws ParseException;

}
