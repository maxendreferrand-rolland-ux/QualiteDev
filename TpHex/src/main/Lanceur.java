package main;

import ctrl.Gestionnaire;
import ctrl.GestionnaireDePartie;

public class Lanceur {

	public static void main(String[] args) {
		GestionnaireDePartie gestionnaire = Gestionnaire.getInstance();
		gestionnaire.nouvellePartie(5);
		gestionnaire.jouer();
	}
}