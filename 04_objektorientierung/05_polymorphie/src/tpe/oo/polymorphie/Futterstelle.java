package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {
    /**
     * Alle Tiere füttern 
     * @param tiere
     */
    public void gibfutter(ZooTier tier){
        tier.fuettern();
    }

}
