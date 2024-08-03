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

//setterek
    public void setEltolas(int eltolas) {
        if (eltolas < 0) {
            System.out.println("Hiba: Az eltolás nem lehet negatív! Nem történt változtatás.");
        } else {
            this.eltolas = eltolas;
        }
    }

    public void setSzin(Szinek szin) {
        this.szin = szin;
    }

    public void setStilus(Stilusok stilus) {
        this.stilus = stilus;
    }

//metódusok
    @Override
    public String toString() {
        return "Vonal{hossz=" + hossz + ", eltolás=" + eltolas + ", szin=" + szin + ", stilus=" + stilus + "}";
    }

    public String rajz() {
        String abra = "";
        for (int i = 0; i < eltolas; i++) {
            abra += " ";
        }
        for (int i = 0; i < hossz; i++) {
            if (stilus == Stilusok.SZIMPLA) {
                abra += "_";
            } else if (stilus == Stilusok.DUPLA) {
                abra += "=";
            } else if (stilus == Stilusok.PONT) {
                abra += ".";
            }
        }
        return abra;

    }
}
