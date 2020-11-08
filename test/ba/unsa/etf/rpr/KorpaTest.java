package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa=new Korpa();

    private static void punaKorpa(Korpa k) {
        for (int i=1;i<=50;i++){
            k.dodajArtikl(new Artikl("Tanjir",i,((Integer)i).toString()));
        }
    }

    @Test
    public void TestDodajArtikl1 (){      //Ovo je test da li metoda ispravno vraca vrijednos false kad je korpa puna
        punaKorpa(korpa);
        assertTrue(!korpa.dodajArtikl(new Artikl("Tanjir1",51,"51")));
    }
    @Test
    public void TestDodajArtikl2 (){      //Ovo je test da li metoda ispravno vraca vrijednos true kad korpa nije puna
        assertTrue(korpa.dodajArtikl(new Artikl("Tanjir2",51,"51")));
    }
    @Test
    public void TestIzbaciArtiklSaKodom1 (){      //Testira vracanje null reference jer artikla s datim kodom nema u korpi
        punaKorpa(korpa);
        assertNull(korpa.izbaciArtiklSaKodom("250"));
    }
    @Test
    public void TestIzbaciArtiklSaKodom2 (){       //Testira vracanje reference na izbacen artikl
        assertEquals(korpa.getArtikli()[9],korpa.izbaciArtiklSaKodom("10"));
    }

    @Test
    public void TestDajUkupnuCijenuArtikala (){
        punaKorpa(korpa);
        int cijena=0;
        for (Artikl x: korpa.getArtikli()) cijena += x.getCijena();
        assertEquals(cijena, korpa.dajUkupnuCijenuArtikala());
    }
}