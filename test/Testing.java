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
}
