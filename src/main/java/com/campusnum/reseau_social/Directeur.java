package com.campusnum.reseau_social;

public class Directeur extends Employ� implements Relation{

	public Directeur(
			String nom, 
			String prenom, 
			int dateNaiss, 
			String natio,
			int salaire,
			String dur�eContrat) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.natio = natio;
		this.salaire = salaire;
		this.dur�eContrat = dur�eContrat;
	}

	@Override
	public void ajoutPersonne() {
		// TODO Auto-generated method stub
		
	}
}
