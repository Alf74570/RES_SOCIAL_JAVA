package com.campusnum.reseau_social;

public class AnneeNaissanceException extends Exception {

	public AnneeNaissanceException(int dateNaiss) {
		System.out.println("***** ATTENTION *****");
		System.out.println("Vous essayer de cr�er un utilisateur dont l'ann�e de naissance n'est pas valide !!!");
		System.out.println("\t =>" + dateNaiss);
	}

}
