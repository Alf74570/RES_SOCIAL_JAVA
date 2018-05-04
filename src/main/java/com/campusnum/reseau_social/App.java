package com.campusnum.reseau_social;

import java.util.*;

import javax.print.DocFlavor.STRING;

public class App {


	char rep;
	int choix;
	int numAmi;
	User user;
	Admin admin;
	Message message;

	Scanner sc = new Scanner(System.in);
	
	List<User> users = new ArrayList<User>();

	public static void main(String[] args) {

		App app = new App();
		
	}

	public App() {
		boolean quitter = false;

		while (!quitter) {
			quitter = this.run();
		}
	}

	/**
	 * 
	 * @return Should we exit
	 */
	public boolean run() {

		try {
			
			defaultUtilisateur();

				for (int a = 0; a < utilisateur.length; a++) {
					if (utilisateur[a] != null) {
						int level = utilisateur[a].getLevel();

						if (level == 2) {

							affMenuAdmin();

							switch (choix) {

							case 1:
								affProfil();
								break;
							case 2:
								modifInfo();
								break;
							case 3:
								ecrMess();
								break;
							case 4:
								affMess();
								break;
							case 5:
								affUtilisateur();
								break;
							case 6:
								//ajAmi();
								break;
							case 7:
								affAmi();
								break;
							case 8:
								modifMod();
								break;
							case 9:
								newUtilisateur();
								break;
							case 10:
								delUtilisateur();
								break;
							case 11:
								delUser();
								break;
							case 12:
								int code = -1;
								System.exit(code);
								// break;
							default:
								System.out.println("Merci d'effectuer un choix entre 1 et 9");
							}
						}

						else if (level == 1 && ((Admin) utilisateur[a]) != null) {

							affMenuUser();
						}
					}
				}
			
		} catch (AnneeNaissanceException | NomUserException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

		System.out.println("A bientôt " + utilisateur[0].getPrenom() + " sur notre nouvelle application");

		return true;

	}

	// System.out.println("Merci de votre visite");

	// return false;

	// ********* MES METHODES ********** //

	private void delUser() {
		// TODO Auto-generated method stub

	}

	public void affProfil() {

		editProfil();

		System.out.println("\n Revenir au menu Principal : O/N");
		rep = sc.nextLine().charAt(0);
	}

	public void modifInfo() throws AnneeNaissanceException, NomUserException {

		char rep = 'O';
		int level;

		editProfil();
		System.out.println("\n Voulez-vous modifier ces informations ? (O/N)");
		rep = sc.nextLine().charAt(0);

		if (rep == 'O' || rep == 'o') {

			System.out.println("Votre Nom : ");
			String nom = sc.nextLine();

			System.out.println("Votre Prénom : ");
			String prenom = sc.nextLine();

			System.out.println("Votre Date de Naissance : ");
			int dateNaiss = sc.nextInt();

			System.out.println("Votre Nationalité : ");
			String natio = sc.nextLine();

			try {

				User user = new User(nom, prenom, dateNaiss, natio);

				utilisateur[0] = user;

				System.out.println("Votre profil a bien été modifié.");
				System.out.println("\n Revenir au menu Principal : O/N");
				rep = sc.nextLine().charAt(0);

			}

			catch (AnneeNaissanceException | NomUserException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}

		}
	}

	public void modifMod() {

		System.out.println("Votre Niveau de Modération est de " + utilisateur[0].getLevel());
		System.out.println("Voulez-vous modifier votre Niveau de Modération ? (O/N)");
		char rep = sc.nextLine().charAt(0);

		if (rep == 'O' || rep == 'o') {

			((Admin) utilisateur[0]).setLevel();

			System.out.println("Votre Niveau de Moderation est maintenant de " + ((Admin) utilisateur[0]).getLevel());
		}

	}

	/*public void ecrMess() {

		char rep = 'O';

		System.out.println("***Bienvenue dans votre espace messagerie***");
		System.out.println("\n Voulez vous écrire un nouveau message ? (O/N)");
		rep = sc.nextLine().charAt(0);

		while (rep == 'O' || rep == 'o') {

			System.out.println("Votre Message : ");
			String content = sc.nextLine();

			Message message = new Message(content);

			if (j < 50) {

				mess[j] = message;
				j++;
			}

			System.out.println("\n Voulez-vous écrire un nouveau message ? (O/N)");
			rep = sc.nextLine().charAt(0);
		}
	}

	public void affMess() {
		// TODO Auto-generated method stub
	}*/

	/*public void ajAmi() {

		char rep = 'O';

		System.out.println("Voulez-vous ajouter un ami ? (O/N)");
		rep = sc.nextLine().charAt(0);

		while (rep == 'O' || rep == 'o') {

			System.out.println("Son Nom : ");
			String nom = sc.nextLine();

			System.out.println("Son Prénom : ");
			String prenom = sc.nextLine();

			System.out.println("Sa Date de Naissance : ");
			int dateNaiss = sc.nextInt();

			System.out.println("Sa Nationalité : ");
			String natio = sc.nextLine();

			if (i < 10) {

				try {
					User user = new User(nom, prenom, dateNaiss, natio);
					utilisateur[0].addAmi(user);
				} catch (AnneeNaissanceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			System.out.println("Votre ami a été enregistré. \n");
			System.out.println("Souhaitez-vous enregistrer un autre ami ? (O/N)");
			rep = sc.nextLine().charAt(0);
		}
	}*/

	/*public void affAmi() {

		char rep = 'O';
		while (rep == 'O' || rep == 'o') {

			System.out.println("Veuillez choisir un ami entre 1 et 9 :");
			numAmi = sc.nextInt();
			sc.nextLine();

			System.out.println("Ami n° " + numAmi + " : \n");
			System.out.println("Nom :  " + utilisateur[0].getAmi()[numAmi].getNom());
			System.out.println("Prénom :  " + utilisateur[0].getAmi()[numAmi].getPrenom());
			System.out.println("Année de Naissance :  " + utilisateur[0].getAmi()[numAmi].getDateNaiss());
			System.out.println("Nationalité :  " + utilisateur[0].getAmi()[numAmi].getNatio());

			System.out.println("Souhaitez-vous afficher un autre ami ? (O/N)");
			rep = sc.nextLine().charAt(0);
		}
	}*/

	public void editProfil() {

		System.out.println("Votre Profil : \n");
		System.out.println(users.get(0).toString());

	}

	public void affMenuAdmin() {

		System.out.println("\n ***** Que voulez-vous faire ? ***** \n");

		System.out.println("1/ Afficher votre profil,");
		System.out.println("2/ Modifier vos infos personnelles, \n");

		System.out.println("3/ Ecrire un message,");
		System.out.println("4/ Afficher un message, \n");

		System.out.println("5/ Afficher les utilisateurs,");
		System.out.println("6/ Ajouter un ami,");
		System.out.println("7/ Afficher le profil d'un ami, \n");

		System.out.println("8/ Modifier le niveau de Modération,");
		System.out.println("9/ Créer un nouvel utilisateur,");
		System.out.println("10/ Supprimer un utilisateur,");
		System.out.println("11/ Supprimer un message \n");

		System.out.println("12/ Quitter");

		System.out.println("\n Entrez votre choix : ");
		choix = sc.nextInt();
		sc.nextLine();
	}

	public void affMenuUser() {

		System.out.println("\n Que voulez-vous faire ? \n");

		System.out.println("1/ Afficher votre profil,");
		System.out.println("2/ Modifier vos infos personnelles, \n");

		System.out.println("3/ Ecrire un message,");
		System.out.println("4/ Afficher un message, \n");

		System.out.println("5/ Afficher les utilisateurs,");
		System.out.println("6/ Ajouter un ami,");
		System.out.println("7/ Afficher le profil d'un ami, \n");

		System.out.println("8/ Quitter");

		System.out.println("\n Entrez votre choix : ");
		choix = sc.nextInt();
		sc.nextLine();
	}

	public void newUtilisateur() throws AnneeNaissanceException, NomUserException {

		System.out.println("Voulez-vous créer un nouvel utilisateur ? (O/N)");
		char rep = sc.nextLine().charAt(0);

		while (rep == 'O' || rep == 'o') {

			System.out.println("Son Pseudo : ");
			String pseudo = sc.nextLine();
			
			System.out.println("Son Nom : ");
			String nom = sc.nextLine();

			System.out.println("Son Prénom : ");
			String prenom = sc.nextLine();

			System.out.println("Sa Date de Naissance : ");
			int dateNaiss = Integer.parseInt(sc.nextLine());

			System.out.println("Sa Nationalité : ");
			String natio = sc.nextLine();

			

				try {

					user = new User(pseudo, nom, prenom, dateNaiss, natio);
					this.users.add(user);
					
					System.out.println("L'utilisateur a bien été enregistré \n");

				}

				catch (AnneeNaissanceException | NomUserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			

			rep = ' ';

		}

		
		 System.out.println("\n Revenir au menu Principal : O/N"); rep =
		 sc.nextLine().charAt(0); if (rep == 'O') {affMenuAdmin();}
		 
	}

	public void delUtilisateur() {

	}

	public void defaultUtilisateur() throws AnneeNaissanceException, NomUserException {
		// Utilisateurs par défaut enregistrés dans la Collection "user"

		user = new Admin("Alf74", "Biagi", "Alexandre", 1975, "Française", 2);
		users.add(user);

		user = new User("Riko", "Ledevedec", "Eric", 1982, "Brestois");
		users.add(user);
		
		user = new User("Angel", "Prince", "Angélique", 1983, "Nordiste");
		users.add(user);
		
		user = new User("Le Rebeu", "YAHI", "Mohamed", 1975, "Algérien");
		users.add(user);
		
		user = new User("Nigers", "M'Dawa", "Sherif", 1977, "Ivoirien");
		users.add(user);
				

		System.out.println("Bienvenue " + users.get(0).getPrenom() + " sur le réseau social JAVA \n");

	}


	public void affUtilisateur() {

		System.out.println("Les utilisateurs inscrits : \n");

		for (int i = 0; i < users.size(); i++) {

			System.out.println("Utilisateur " +i+ " : " +users.get(i).getPrenom()+ " " +users.get(i).getNom()+ " dit " +users.get(i).getPseudo());
			
		}
		
		 System.out.println("\n Revenir au menu Principal : O/N"); rep =
		 sc.nextLine().charAt(0); if (rep == 'O') { affMenuAdmin(); }
		 
	}

}
