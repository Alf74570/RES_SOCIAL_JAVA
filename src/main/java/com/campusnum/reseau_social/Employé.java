package com.campusnum.reseau_social;

public abstract class Employ� extends Personne implements Salari�{

	protected int salaire;
	protected String dur�eContrat;
	
	
	void travailler() {
		System.out.println("Je travaille pour le R�seau Social JAVA");
	}
	
	public void recevoirPaiement() {
		
	}
}

