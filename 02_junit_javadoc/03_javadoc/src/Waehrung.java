/**
 * Das ist ist eine Klasse die das Wechselkurz zum Dollar rechnet.
 * @author Anouar
 *
 */
public class Waehrung {
    /**
     * deklaration vom kurs
     * das nach der initialisierung nicht mehr verändert werden kann
     * und ist nur für diese klasse sichtbar.
     */
    private final int kurs;

    /**
     * deklaration von der Name der Währung
     * die  nach der initialisierung nicht mehr verändert werden kann
     * und ist nur für diese klasse sichtbar.
     */
    private final String name;
    /**
     * deklaration von der Kuerzel der Währung
     * die nach der initialisierung nicht mehr verändert werden kann
     * und ist nur für diese klasse sichtbar.
     */
    private final String kuerzel;
    /**
     * initialisierung  der Teiler.
     * der nicht mehr verändert werden kann
     * und ist damit als konstante definiert
     */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    /**
     * rechnet die Währung um.
     * @param betrag betrag der umgerechnet wird
     * @param toWaehrung zu welsche währung wird umgerechnet
     * @return gibt der umgerechente betrag zurück
     */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    /**
     *
     * @return gibt der wechsel kurs zum Dollar zurück.
     */
    public int getKurs() {
        return kurs;
    }

    /**
     *
     * @return gibt die Name der Währung zurück.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return gibt das kürzel der Währung zurück.
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s",
                name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result
                + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
