package ba.unsa.etf.rpr.t1z4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    public void getNaziv_predmeta() {
        Predmet predmet = new Predmet("Semina",999,30);
        assertEquals("Semina", predmet.getNaziv_predmeta());
    }
}
