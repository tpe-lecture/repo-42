package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }
    
    /**
     * Main-Methode.
     * 
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Futterstelle futterstelle = new Futterstelle();
        ZooTier[] tier = new ZooTier[3];
        int i = 0;
        tier[i++] = new Affe("Charlie");
        tier[i++] = new Gorilla("Buck");
        tier[i++] = new Giraffe("Debbie");
        for (ZooTier zooTier : tier) {
            System.out.println(tier);

        }
        
        System.out.println("Fütterung...");
        
        for (ZooTier zooTier : tier) {
           // futterstelle.gibfutter(tier);
        }
        
        for (ZooTier zooTier : tier) {
            System.out.println(tier);
        }
    }
}
