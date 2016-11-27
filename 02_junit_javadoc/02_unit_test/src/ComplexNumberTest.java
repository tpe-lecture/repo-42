import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test für die komplexen Zahlen.
 */
public class ComplexNumberTest {

    /**
     * Testet die Addtion.
     */
    @Test
    public void testAddition() {
        // Beispiel für einen Test der Addition
        
        // Durchzuführende Tests:
        // (4 + -5i) + (2 + 11i) = (6 + 6i)
        // (4 + -5i) + 3         = (7 + -5i)        
        ComplexNumber a = new ComplexNumber(4, -5);
        ComplexNumber b = new ComplexNumber(2, 11);

        assertEquals(new ComplexNumber(6, 6), a.add(b));
        assertEquals(new ComplexNumber(7, -5), a.add(3));
    }
    
    /**
     * Testet die Subtraktion.
     */
    @Test
    public void testSubtraktion() {
        // Durchzuführende Tests:
        // (4 + -5i) - (2 + 11i) = ( 2 + -16i)
        // (2 + 11i) - (4 + -5i) = (-2 +  16i)
        ComplexNumber a = new ComplexNumber(4, -5);
        ComplexNumber b = new ComplexNumber(2, 11);
        
        assertEquals(new ComplexNumber(2, -16), a.subtract(b));
        assertEquals(new ComplexNumber(-2, 16), b.subtract(a));
        
    }

    /**
     * Testet die Multiplikation.
     */
    @Test
    public void testMultiplikation() {
        // Durchzuführende Tests:
        // (2 + -4i) * (-3 + 5i) = (14  +  22i)
        // (2 +  5i) * ( 3 + 7i) = (-29 +  29i)
        // (2 + -4i) * 4         = (  8 + -16i)
        ComplexNumber a = new ComplexNumber(2, -4);
        ComplexNumber b = new ComplexNumber(-3, 5);
        ComplexNumber c = new ComplexNumber(2, 5);
        ComplexNumber d = new ComplexNumber(3, 7);
        
        assertEquals(new ComplexNumber(14, 22), a.multiply(b));
        assertEquals(new ComplexNumber(-29, 29), c.multiply(d));
        assertEquals(new ComplexNumber(8, -16), a.multiply(4));
        
       
    }

    /**
     * Testet die Division.
     */
    @Test
    public void testDivision() {
        // Durchzuführende Tests:
        // (4 + -8i) : (3 + 4i) = (-0,8 + -1,6i)
        // (1 +  0i) : (0 + 1i) = (   0 +   -1i)
        // (8 + 16i) : 4        = (   2 +    4i)
        ComplexNumber a = new ComplexNumber(4, -8);
        ComplexNumber b = new ComplexNumber(3, 4);
        ComplexNumber c = new ComplexNumber(1, 0);
        ComplexNumber d = new ComplexNumber(0, 1);
        ComplexNumber e = new ComplexNumber(8, 16);
        
        assertEquals(new ComplexNumber(-0.8, -1.6), a.divide(b));
        assertEquals(new ComplexNumber(0, -1), c.divide(d));
        assertEquals(new ComplexNumber(2, 4), e.divide(4));
    }   
    /**
     * Testet die Erzeugung der konjugiert Komplexen Zahl.
     */
    @Test
    public void testConjugate() {
        // Durchzuführende Tests:
        // (3   +  5i) --conj--> (3   + -5i)
        // (-2  + -4i) --conj--> (-2  + 4i)
        ComplexNumber a = new ComplexNumber(3, 5);
        ComplexNumber b = new ComplexNumber(-2, -4);
        assertEquals(new ComplexNumber(3, -5), a.conjugate());
        assertEquals(new ComplexNumber(-2, 4), b.conjugate());
    }

    /**
     * Testet die Berechnung des Betrages.
     */
    @Test
    public void testBetrag() {
        // Durchzuführende Tests:
        // |(3 + -4i)| = 5
        // |(0 +  3i)| = 3
        ComplexNumber a = new ComplexNumber(3, -4);
        ComplexNumber b = new ComplexNumber(0, 3);
        
        assertEquals(5.0, a.abs(), 0);
        assertEquals(3.0, b.abs(), 0);
    }   
    
    /**
     * Testet das Potenzieren.
     */
    @Test
    public void testPotenz() {
        // Durchzuführende Tests:
        // (2 + -4i)^1 = (2 + -4i)
        // (2 + -4i)^2 = (2 + -4i)*(2 + -4i)
        // (2 + -4i)^3 = (2 + -4i)*(2 + -4i)*(2 + -4i)
        // (2 + -4i)^6 = (7488 + -2816i)
        ComplexNumber a = new ComplexNumber(2, -4);
        
        assertEquals(new ComplexNumber(2, -4), a.power(1));
        assertEquals(a.multiply(a), a.power(2));
        assertEquals(a.multiply(a.multiply(a)), a.power(3));
        assertEquals(new ComplexNumber(7488, -2816), a.power(6));
        
    }
}

