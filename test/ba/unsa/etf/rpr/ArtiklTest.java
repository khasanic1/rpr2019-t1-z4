package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @org.junit.jupiter.api.Test
    void getNaziv() {
        Artikl a=new Artikl("Tanjir", 54, "172836");
        assertEquals("Tanjir", a.getNaziv());
    }

    @org.junit.jupiter.api.Test
    void getCijena() {
        Artikl a=new Artikl("Tanjir", 54, "172836");
        assertEquals(54, a.getCijena());
    }

    @org.junit.jupiter.api.Test
    void getKod() {
        Artikl a=new Artikl("Tanjir", 54, "172836");
        assertEquals("172836", a.getKod());
    }
}