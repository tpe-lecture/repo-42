/**
 * Klasse dient als Beispiel für den Coding-Standard und die Namenskonventionen
 * bei Java-Programmen.
 */
public class CodingStandard {

    /**
     * Konstante, die dem Rest der Welt etwas mitteilen soll.
     */
    public static final  int KONSTANTEMITTOLLMWERT = 3;

    private int erstesFeld;

    private double zweitesFeld;


   /**
    * Legt eine neue Instanz an.
    * @param erstesFeld neue Instanz
    * @param zweitesFeld neue Instanz
    */
    public CodingStandard(int erstesFeld, double zweitesFeld) {
        this.erstesFeld = erstesFeld;    this.zweitesFeld = zweitesFeld;
    }

    /**
     *   Methode, die etwas tut.
     * @param parameter Eingabewert für die Methode.
     * @return gibt einen Wert abhängig von {@code parameter} zurück.
     */
    public int methodeDieWasTut(int parameter) {
        int result;

        if (parameter > KONSTANTEMITTOLLMWERT) {
            result = 12;
        }
        else {
            result = 13;
        }
        erstesFeld = result;
        zweitesFeld = 2 * result;
        return result;
    }
}
