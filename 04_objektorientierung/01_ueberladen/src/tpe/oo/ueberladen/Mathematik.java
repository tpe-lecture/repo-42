package tpe.oo.ueberladen;

/**
 * Einfache Hilfsklasse mit mathematischen Methoden.
 */
public final class Mathematik {

     /**
     * Konstruktor.
     */
    private Mathematik() {
    }
    /**
     * maximum bestimmen.
     * @param a ertse int wert.
     * @param b zweite int wert
     * @return gibt das maximum zurück.
     */
    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        }
        else {
            max = b;
        }
        return max;
    }
    /**
     * maximum von 3 werten bestimmen.
     * @param a erste wert.
     * @param b zweite wert.
     * @param c dritte wert.
     * @return gibt das maximum zurück.
     */
    public static int max(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            if (a > c) {
                max = a;
            }
            else {
                max = c;
            }
        }
        else {
            if (b > c) {
                max = b;
            }
            else {
                max = c;
            }
        }
        return max;
    }
    /**
     * maximum von 4 werten bestimmen.
     * @param a erste wert.
     * @param b zweite wert.
     * @param c dritte wert.
     * @param d vierte wert.
     * @return gibt das maximum zurück.
     */
    public static int max(int a, int b, int c, int d) {
        int max = 0;
        int[] m = {a, b, c, d};
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        return max;

    }
}
