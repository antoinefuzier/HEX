package Hex;

import java.util.Scanner;

public class Menu {

	
	
	public void sauvegarder(char tab[]){
		
		/* METTRE ICI FONCTION POUR SAUVEGARDER TAB DANS UN FICHIER */
		
	}
	
	public void charger(){
		
		/* METTRE ICI FONCTION POUR CHARGER TAB D'UN UN FICHIER */
		
	}
	
	public Plateau nouvellePartie(){
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Veuillez donner la taille du plateau (entre 2 et 30) :");
		int saisie=s.nextInt();
		Plateau p=new Plateau(saisie);
		return p;
	}
	
	public void annulationDernierCoup(){
		
		/*FONCTION POUR ANNULER LE DERNIER COUP JOUER */
		
		
	}
	
	public void abandonPartie(){
		
		/*FONCTION POUR QUITTER LA PARTIE EN COURS */
		
		
	}
	
	public void quitter(){
		
		/*FONCTION POUR QUITTER LE JEU */
		
		
	}
	
}
