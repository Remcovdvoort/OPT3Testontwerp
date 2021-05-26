import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Testing {
    ArrayList<Double> wiskundeCijfers = new ArrayList<>(Arrays.asList(5.5, 6.0, 7.0, 8.0, 7.5));
    ArrayList<Double> OPTCijfers = new ArrayList<>(Arrays.asList(5.0, 5.0, 4.8, 4.5, 5.3));
    ArrayList<Double> natuurkundeCijfers = new ArrayList<>(Arrays.asList(4.0, 10.0, 8.0, 8.5, 6.4));
    Student student = new Student("Casper", wiskundeCijfers, natuurkundeCijfers, OPTCijfers);

    @Test
    public void ModifiedTest() {
        assertTrue(student.cijferCheck(wiskundeCijfers, 5));
        assertFalse(student.cijferCheck(wiskundeCijfers, 6));//het is weer 4 weken later, en deze student had 6 toetsen moeten maken
        assertFalse(student.cijferCheck(natuurkundeCijfers, 5));
        assertFalse(student.cijferCheck(OPTCijfers, 5));
    }

    @Test
    public void EquivalentieTest() {
        Double cijfer1 = 1.0;
        Double cijfer2 = 1.1;
        Double cijfer3 = 5.4;
        Double cijfer4 = 5.5;
        Double cijfer5 = 5.6;
        Double cijfer6 = 6.9;
        Double cijfer7 = 7.0;
        Double cijfer8 = 7.1;
        Double cijfer9 = 10.0;

        assertEquals("Onvoldoende", new Cijfer(cijfer1).getBeoordeling());
        assertEquals("Onvoldoende", new Cijfer(cijfer2).getBeoordeling());
        assertEquals("Onvoldoende", new Cijfer(cijfer3).getBeoordeling());
        assertEquals("Ruim voldoende", new Cijfer(cijfer4).getBeoordeling());
        assertEquals("Ruim voldoende", new Cijfer(cijfer5).getBeoordeling());
        assertEquals("Ruim voldoende", new Cijfer(cijfer6).getBeoordeling());
        assertEquals("Goed", new Cijfer(cijfer7).getBeoordeling());
        assertEquals("Goed", new Cijfer(cijfer8).getBeoordeling());
        assertEquals("Goed", new Cijfer(cijfer9).getBeoordeling());
    }

    @Test
    public void PairwiseTest() {
        Double cijfer = 6.0;

        assertEquals(1.0, Cijfer.bepaalCijfer(cijfer, -2, true, true, true));
        assertEquals(cijfer-0.5, Cijfer.bepaalCijfer(cijfer, -2, false, false, false));
        assertEquals(1.0, Cijfer.bepaalCijfer(cijfer, 2, true, false, false));
        assertEquals(cijfer+1, Cijfer.bepaalCijfer(cijfer, 2, false, true, true));
        assertEquals(1.0, Cijfer.bepaalCijfer(cijfer, 3, true, false, true));
        assertEquals(1.0, Cijfer.bepaalCijfer(cijfer, 3, false, true, false));
    }
}
