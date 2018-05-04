package com.campusnum.reseau_social;

public abstract class Employé extends Personne implements Salarié{

	protected int salaire;
	protected String duréeContrat;
	
	
	void travailler() {
		System.out.println("Je travaille pour le Réseau Social JAVA");
	}
	
	public void recevoirPaiement() {
		
	}
}

