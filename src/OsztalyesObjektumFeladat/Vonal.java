
package OsztalyesObjektumFeladat;


public class Vonal {

//enumok
    public enum Szinek {
        PIROS, KEK, ZOLD, FEKETE
    }

    public enum Stilusok {
        SZIMPLA, DUPLA, PONT
    }
//adattagok    
    private int hossz;
    private int eltolas;
    private Szinek szin;
    private Stilusok stilus;    
 
//konstruktorok    
    public Vonal(int hossz) {
        this(hossz, 0, Szinek.PIROS, Stilusok.SZIMPLA);
    }

    public Vonal(int hossz, int eltolas) {
        this(hossz, eltolas, Szinek.PIROS, Stilusok.SZIMPLA);
    }

    public Vonal(int hossz, int eltolas, Szinek szin) {
        this(hossz, eltolas, szin, Stilusok.SZIMPLA);
    }

    public Vonal(int hossz, int eltolas, Szinek szin, Stilusok stilus) {
        if (hossz < 1) {
        System.out.println("Hiba: A hossz nem lehet kisebb, mint 1!");
            this.hossz = 1;
        } else {
            this.hossz = hossz;
        }
        if (eltolas < 0) {
            System.out.println("Hiba: Az eltolás nem lehet negatív!");
            this.eltolas = 0;
        } else {
            this.eltolas = eltolas;
        }
        this.szin = szin;
        this.stilus = stilus;
    }
    
    
}

