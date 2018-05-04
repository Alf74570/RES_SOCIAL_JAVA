package com.campusnum.reseau_social;

public class Admin extends User implements Salarié {

	public Admin(String pseudo, String nom, String prenom, int dateNaiss, String natio, int level) 
			throws AnneeNaissanceException, NomUserException {
		super(pseudo, nom, prenom, dateNaiss, natio);
		this.level = level;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return this.level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel() {
		System.out.println("Veuillez selection votre niveau de modération : 1 || 2");
		level = sc.nextInt();
		sc.nextLine();

			System.out.println("Vous êtes Modérateur de Niveau " +level);
	}

	public void modMessage() {

	}

	public void suppMessage() {

	}

	public void newUtilisateur() {

	}

	public void suppUtilisateur() {

	}
	
	public void recevoirPaiement() {
		
	}
	
	public String toString() {
		String string = "Votre nom : " + this.getNom() + "\n";
		string += "Votre prénom : " + this.getPrenom() + "\n";
		string += "Votre date de naissance : " + this.getDateNaiss() + "\n";
		string += "Votre nationalité : " + this.getNatio() + "\n";
		string += "Votre niveau de Moderation est de niveau " + this.getLevel() + "\n";
		return string;
		
	}
}
