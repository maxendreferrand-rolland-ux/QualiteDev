package ihm;

import hex.Coords;
import hex.PartieHex;
import hex.PlateauHex;
import hex.affich.AffichageInformationsDuTour;
import hex.affich.AffichagePlateau;
import hex.affich.DemanderProchainCoup;

public class IHMConsole implements IhmI{
	
	public void actualiserPlateau(PlateauHex plateau) {
		System.out.println(AffichagePlateau.plateau2string(plateau));
	}
	
	public void afficherInfos(PartieHex partie) {
		System.out.println(AffichageInformationsDuTour.getStringInfo(partie));
		
	}
	
	public Coords demanderPlacement(PlateauHex plateau) {
		return DemanderProchainCoup.promptCase(plateau);
		 
		 
	}

}
