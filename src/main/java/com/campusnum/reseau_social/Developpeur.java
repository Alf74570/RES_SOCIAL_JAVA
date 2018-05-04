package com.campusnum.reseau_social;

public class Developpeur extends Employé {
	
	public Developpeur(
			String nom, 
			String prenom, 
			int dateNaiss, 
			String natio,
			int salaire,
			String duréeContrat) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.natio = natio;
		this.salaire = salaire;
		this.duréeContrat = duréeContrat;
	}

}
