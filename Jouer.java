import java.util.Scanner;


public class Jouer {

	
	
	
	private boolean verifierCoup(String s, int x,int y){
		
		int max=(int) Math.sqrt(s.length());
		if(x<0 || x>max-1 || y<0 || y>max-1){
			System.out.println("Coordonnées incorrect. Les valeurs doivent être comprise entre 0 et "+ (max-1));
			return false;
		}
		if(Plateau.verifierCase(s,x,y)!='.'){
			System.out.println("Case déjà occupée par un pion ");
			return false;
		}
		return true;
	}
	
	private String rentrerCoup(String graphe,char pion){
		boolean b;
		Scanner sc;
		int reponse1;
		int reponse2;
		System.out.print("Veuillez donner la ligne à rentrer (ou -1 pour accéder au menu):");
		sc= new Scanner(System.in);
		reponse1=sc.nextInt();
		
		
		if(reponse1==-1){
			sc.close();
			return "Menu";
		}
			
		
		System.out.print("Veuillez donner la colonne à rentrer (ou -1 pour accéder au menu):");
		reponse2=sc.nextInt();
		
		
		if(reponse2==-1){
			sc.close();
			return "Menu";
		}
		
		b=verifierCoup(graphe,reponse1,reponse2);
		while(!b){
			
			System.out.print("Veuillez donner la ligne à rentrer (ou -1 pour accéder au menu): ");
			reponse1=sc.nextInt();
			
			
			if(reponse1==-1){
				sc.close();
				return "Menu";
			}
			
			System.out.print("Veuillez donner la colonne à rentrer (ou -1 pour accéder au menu): ");
			reponse2=sc.nextInt();
			
			if(reponse2==-1){
				sc.close();
				return "Menu";
			}
			
			b=verifierCoup(graphe,reponse1,reponse2);
			
			
		}
		graphe=Plateau.rentrerCoup(graphe,pion,reponse1,reponse2);
		
		if(pion=='b'){
			Menu.afficher(graphe);
			System.out.println("Le joueur BLANC à jouer à la case [" + reponse1 +","+ reponse2+"]" );
		}
		else{
			Menu.afficher(graphe);
			System.out.println("Le joueur NOIR à jouer à la case [" + reponse1 +","+ reponse2+"]" );
		}
		
		return graphe;
		
		
	}
	
	private char gagnant(String s){
		
		return Plateau.verifierGagnant(s);

	}
	
	public int jouerPartie(String graphe,char pionQuiCommence){
		char pionGagnant;
		char pion;
		String valeur;
		Menu.afficher(graphe);
		if(pionQuiCommence=='b'){
			while(true){
			
				/* COUP DU PION BLANC */
				pion='b';
				System.out.println("C'est au joueur BLANC de jouer");
				valeur=rentrerCoup(graphe,pion);
				if(valeur=="Menu")
					return -1;
				graphe=valeur;
				pionGagnant=gagnant(graphe);
				if(pionGagnant=='b'){
						System.out.println("Bravo! Le joueur BLANC à gagner!");
						System.out.println("La parti est fini, retour au menu...");
						return 1;
				}
			
				
				/* COUP DU PION NOIR */
				pion='n';
				System.out.println("C'est au joueur NOIR de jouer");
				valeur=rentrerCoup(graphe,pion);
				if(valeur=="Menu")
					return -1;
				graphe=valeur;
				pionGagnant=gagnant(graphe);
				
				if(pionGagnant=='b'){
					System.out.println("Bravo! Le joueur NOIR à gagner!");
					System.out.println("La parti est fini, retour au menu...");
					return 1;
				}
			
			
			
			
			}
		}
		
		if(pionQuiCommence=='n'){
			while(true){
			
				/* COUP DU PION NOIR */
				pion='n';
				System.out.println("C'est au joueur NOIR de jouer");
				valeur=rentrerCoup(graphe,pion);
				if(valeur=="Menu")
					return -1;
				graphe=valeur;
				pionGagnant=gagnant(graphe);
				if(pionGagnant=='b'){
					System.out.println("Bravo! Le joueur NOIR à gagner!");
					System.out.println("La parti est fini, retour au menu...");
					return 1;
				}
			
				
				/* COUP DU PION BLANC */
				pion='b';
				System.out.println("C'est au joueur BLANC de jouer");
				valeur=rentrerCoup(graphe,pion);
				if(valeur=="Menu")
					return -1;
				graphe=valeur;
				pionGagnant=gagnant(graphe);
				if(pionGagnant=='b'){
						System.out.println("Bravo! Le joueur BLANC à gagner!");
						System.out.println("La parti est fini, retour au menu...");
						return 1;
				}
			
			
			
			
			}
		}
		return 0;
	}
	
	
	
	
}
