package mFaro.Jeux;

/**
 * Created by Mes documents on 15/11/2016.
 */
public class lancer {
    protected int numLancer;
    protected int nbQuillesTombe;
    protected TypeLance type;

    public lancer(int nbLancer,int nbQuillesTombe,TypeLance typelance){
        this.numLancer=0;
        this.nbQuillesTombe=0;
        this.type=typelance;
    }
}
