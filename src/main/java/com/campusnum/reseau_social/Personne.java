package com.campusnum.reseau_social;

/**
 * <b> Personne est la classe repr�sentant les membres du R�seau Social JAVA </b>
 * 
 * <p>
 * Un membre du R�seau Social est caract�ris� par les informations suivantes :
 * <ul>
 * <li> Un nom</li>
 * <li> Un pr�nom</li>
 * <li> Une date de naissance (Ann�e)</li>
 * <li> Une nationalit�</li>
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
