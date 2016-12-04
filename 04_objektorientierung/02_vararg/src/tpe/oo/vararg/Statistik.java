package tpe.oo.vararg;

import java.util.Arrays;

/**
 * Einfache Statistik-Funktionen.
 */
public final class Statistik {

    /**
     * Konstruktor.
     */
    private Statistik() {
    }
    /**
     * median berechnen.
     * @param array die liste wo raus wir den median berechnen werden.
     * @return gibt den wert des medians zurück.
     */
    public static int median(int...array) {

        Arrays.sort(array);
        if (array.length % 2 != 0) {
            int a = array.length;
            int c = a / 2;
            int median = array[c];
            return median;
        }
        else {
            int c = ((array.length) / 2) - 1;
            int median = ((array[c] + array[c + 1]) / 2);
            return median;
        }
    }
    /**
     * median beredchnen.
     * @param array double array.
     * @return gibt der wert des medians zurück.
     */
    public static double median(double...array) {
        Arrays.sort(array);
        if (array.length % 2 != 0) {
            double a = array.length;
            double c = a / 2;
            double median = array[(int) c];
            return median;
        }
        else {
            double c = ((array.length) / 2) - 1;
            double median = ((array[(int) c] + array[(int) (c + 1)]) / 2);
            return median;
        }
    }

    // Bitte fügen Sie Ihre Methoden hier ein
}
