package ctrl;

import hex.Coords;
import hex.MouvementImpossibleException;
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

	
	
	
	public void nouvellePartie(int taillePlateau) {
		this.partie = new PartieHex(taillePlateau); 
		
	}

	
	public void jouer() {
		while(!this.partie.estFini()) {
			ihm.actualiserPlateau(this.partie.getPlateau());
			ihm.afficherInfos(this.partie);
			Coords c = this.ihm.demanderPlacement(this.partie.getPlateau());
			try {
				this.partie.poserJeton(c);
			} catch (MouvementImpossibleException e) {
				System.err.println("Coup impossible");
				e.printStackTrace();
			}
		}
		ihm.actualiserPlateau(this.partie.getPlateau());
		ihm.afficherInfos(this.partie);
		
		
	}

}
