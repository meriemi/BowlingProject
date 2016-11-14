package mFaro.Jeux;

/**
 * Created by Mes documents on 14/11/2016.
 */
public abstract class Jeu {
    protected int nbEssai1;
    protected int nbEssai2;

    public Jeu() {
        this.nbEssai1 = 0;
        this.nbEssai2 = 0;
    }

    public void lancerUn(int nbQuilTombe) {
        this.nbEssai1 = nbQuilTombe;
    }

    public void lancerDeux(int nbQuilTombe) {
        this.nbEssai2 = nbQuilTombe;
    }

    public abstract int calculerScore();

}