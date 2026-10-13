package ctrl;

import hex.PartieHex;
import ihm.IHMConsole;

public class Gestionnaire implements GestionnaireDePartie {
	
	private static Gestionnaire instance = new Gestionnaire();
	
	private PartieHex partie;	
	
	private IHMConsole ihm;


	/*Constructeur privé*/
	
	private Gestionnaire() {
		this.ihm = new IHMConsole();
	}
	
	public static Gestionnaire getInstance() {
		return instance; 
	}

	
	
	@Override
	public void nouvellePartie(int taillePlateau) {
		this.partie = new PartieHex(taillePlateau); 
		
	}

	@Override
	public void jouer() {
		while(!this.partie.estFini()) {
			
		}
		
		
	}

}
