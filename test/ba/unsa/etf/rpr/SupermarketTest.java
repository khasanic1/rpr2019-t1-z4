package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Supermarket supermarket = new Supermarket();

    private static void punSupermarket(Supermarket supermarket) {
        for (int i=1;i<=1000;i++) supermarket.dodajArtikl(new Artikl("Caj",i,((Integer)i).toString()));
    }

    @Test
    void TestIzbaciArtiklSaKodom1() {
        punSupermarket(supermarket);
        assertNull(supermarket.izbaciArtiklSaKodom("9999"));
    }

    @Test
    void TestIzbaciArtiklSaKodom2() {
        punSupermarket(supermarket);
        assertEquals(supermarket.getArtikli()[998], supermarket.izbaciArtiklSaKodom("999"));
    }
}