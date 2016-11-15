package mFaro.Jeux;

/**
 * Created by Mes documents on 15/11/2016.
 */
public class True extends Jeu {

    @Override
    public int calculerScore() {
        lancer lancerprem;
        lancer lancerDeux;
        int nbquillestombees1;
        int nbquillestombees2;
        lancerprem = this.lance1;
        nbquillestombees1 = lancerprem.nbQuillesTombe;
        lancerDeux = this.lance2;
        nbquillestombees2 = lancerDeux.nbQuillesTombe;
        return (nbquillestombees1+nbquillestombees2);
    }
}
