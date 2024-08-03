
package OsztalyesObjektumFeladat;


public class VonalTeszt {
    public static void main(String[] args) {
        // Első teszteset: Helyes hossz és alapértelmezett értékek
        Vonal vonal1 = new Vonal(3);
        System.out.println(vonal1);
        System.out.println(vonal1.rajz());
        
        // Második teszteset: Helyes hossz és eltolas
        Vonal vonal2 = new Vonal(3, 2);
        System.out.println(vonal2);
        System.out.println(vonal2.rajz());
        
        // Harmadik teszteset: Helyes hossz, eltolas és szin
        Vonal vonal3 = new Vonal(2, 3, Vonal.Szinek.KEK);
        System.out.println(vonal3);
        System.out.println(vonal3.rajz());
        
        // Negyedik teszteset: Helyes hossz, eltolas, szin és stilus
        Vonal vonal4 = new Vonal(5, 0, Vonal.Szinek.ZOLD, Vonal.Stilusok.PONT);
        System.out.println(vonal4);
        System.out.println(vonal4.rajz());
        
        // Ötödik teszteset: Hossz < 1, hibás teszt
        Vonal vonal5 = new Vonal(-3, 2, Vonal.Szinek.PIROS, Vonal.Stilusok.DUPLA);
        System.out.println(vonal5);
        System.out.println(vonal5.rajz());
        
        // Eltolás beállítása negatív értékre, hibás teszt
        vonal5.setEltolas(-1);
        System.out.println(vonal5);
        System.out.println(vonal5.rajz()); 
        
        // Szín és stílus megváltoztatása
        vonal5.setSzin(Vonal.Szinek.KEK);
        vonal5.setStilus(Vonal.Stilusok.SZIMPLA);
        System.out.println(vonal5);
        System.out.println(vonal5.rajz());
    }
}