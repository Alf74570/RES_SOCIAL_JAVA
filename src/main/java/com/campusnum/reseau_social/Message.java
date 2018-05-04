package com.campusnum.reseau_social;

public class Message {
	
	
	private String exped;
	private String destin;
	private String titre;
	private String contenu;
	

	public Message(String pexped, String pdestin, String ptitre, String pcontenu) {
		this.exped = pexped;
		this.destin = pdestin;
		this.titre = ptitre;
		this.contenu = pcontenu;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMessage() {
		return contenu;
	}

	public void setMessage(String pcontenu) {
		this.contenu = pcontenu;
	}

	/**
	 * @return the exped
	 */
	public String getExped() {
		return exped;
	}

	/**
	 * @param exped the exped to set
	 */
	public void setExped(String exped) {
		this.exped = exped;
	}

	/**
	 * @return the destin
	 */
	public String getDestin() {
		return destin;
	}

	/**
	 * @param destin the destin to set
	 */
	public void setDestin(String destin) {
		this.destin = destin;
	}

}





