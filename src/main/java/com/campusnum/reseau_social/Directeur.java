package com.campusnum.reseau_social;

public class Directeur extends Employé implements Relation{

	public Directeur(
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

	@Override
	public void ajoutPersonne() {
		// TODO Auto-generated method stub
		
	}
}
