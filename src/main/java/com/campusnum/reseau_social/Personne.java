package com.campusnum.reseau_social;

/**
 * <b> Personne est la classe représentant les membres du Réseau Social JAVA </b>
 * 
 * <p>
 * Un membre du Réseau Social est caractérisé par les informations suivantes :
 * <ul>
 * <li> Un nom</li>
 * <li> Un prénom</li>
 * <li> Une date de naissance (Année)</li>
 * <li> Une nationalité</li>
 * </ul>
 * </p>
 *  
 * @author Alexandre Biagi
 * @version 1.0
 *
 */

public abstract class Personne {
	
	protected String pseudo;
	protected String nom;
	protected String prenom;
	protected int dateNaiss;
	protected String natio;
	protected int level = 0;

}
