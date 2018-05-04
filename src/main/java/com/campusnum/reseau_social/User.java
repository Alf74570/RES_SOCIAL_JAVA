package com.campusnum.reseau_social;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class User extends Personne implements Relation{

	protected User[] ami = new User[10];
	protected int i = 0;
	protected User[] message = new User[50];
	protected int j = 0;

	Scanner sc = new Scanner(System.in);

	// Constructeur par default
	public User(String pseudo, String nom, String prenom, int dateNaiss, String natio) 
	throws AnneeNaissanceException, NomUserException {
	
		if (dateNaiss >= 2018)
			throw new AnneeNaissanceException(dateNaiss);

		
		if (nom.length() < 3 )
			throw new NomUserException("Le nom de l'utilisateur est inférieur à 3 caractères ! Nom : " +nom);
		
		
		else {
			
			this.pseudo = pseudo;
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaiss = dateNaiss;
			this.natio = natio;
			this.level = 0;

		}
	}
	
	
	/**
	 * @return
	 */
	public int getLevel() {
		return level;
	}
	
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaiss
	 */
	public int getDateNaiss() {
		return dateNaiss;
	}

	/**
	 * @param dateNaiss
	 *            the dateNaiss to set
	 */
	public void setDateNaiss(int dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/**
	 * @return the natio
	 */
	public String getNatio() {
		return natio;
	}

	/**
	 * @param natio
	 *            the natio to set
	 */
	public void setNatio(String natio) {
		this.natio = natio;
	}

	/**
	 * @return the ami
	 */
	public User[] getAmi() {
		return ami;
	}

	/**
	 * @param ami
	 *            the ami to set
	 */
	public void setAmi(User[] ami) {
		this.ami = ami;
	}

	public void addAmi(User ami) {
		this.ami[j] = ami;
		j++;

	}
	
	void connect() {
		System.out.println("Connecter");
	}
	
	void disconnect() {
		System.out.println("Deconnecter");
	}

	public String toString() {
		String string = "Votre nom : " + this.getNom() + "\n";
		string += "Votre prénom : " + this.getPrenom() + "\n";
		string += "Votre date de naissance : " + this.getDateNaiss() + "\n";
		string += "Votre nationalité : " + this.getNatio() + "\n";
		return string;

	}

	@Override
	public void ajoutPersonne() {
		// TODO Auto-generated method stub
		
	}

}
