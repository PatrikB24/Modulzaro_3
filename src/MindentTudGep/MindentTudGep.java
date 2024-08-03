package MindentTudGep;

import java.util.Random;
import java.util.Scanner;

public class MindentTudGep {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ötös lottó szelvény: " + ervenyesOtosLotto());
        System.out.println("Totó szelvény: \n" + ervenyesToto());
        zeneAjánló();
    }

// Ötös lottó generálás
    public static String ervenyesOtosLotto() {
        int[] lottoSzamok = new int[5];
        int index = 0;

        while (index < 5) {
            int szam = random.nextInt(90) + 1;
            if (!szerepelbenne(lottoSzamok, szam)) {
                lottoSzamok[index++] = szam;
            }
        }

        for (int i = 0; i < lottoSzamok.length - 1; i++) {
            for (int j = 0; j < lottoSzamok.length - i - 1; j++) {
                if (lottoSzamok[j] > lottoSzamok[j + 1]) {
                    int Szamok = lottoSzamok[j];
                    lottoSzamok[j] = lottoSzamok[j + 1];
                    lottoSzamok[j + 1] = Szamok;
                }
            }
        }

        String result = "";
        for (int i = 0; i < lottoSzamok.length; i++) {
            result += lottoSzamok[i];
            if (i < lottoSzamok.length - 1) {
                result += ", ";
            }
        }
        return result;
    }

    private static boolean szerepelbenne(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    // Totó tipp generálás
    public static String ervenyesToto() {
        char[] lehetosegek = {'1', '2', 'X'};
        String totoSzamok = "";
        String totoTippek = "";

        for (int i = 1; i <= 14; i++) {
            totoSzamok += i;
            totoTippek += lehetosegek[random.nextInt(3)];
            if (i <= 9) {
                totoSzamok += " ";
                totoTippek += " ";
            }else if(i >= 10){
                totoSzamok += " ";
                totoTippek += "  ";
            }
            
        }
        return totoSzamok + "\n" + totoTippek;
    }

    // Zeneajánló gép
    public static void zeneAjánló() {
        String[] rapCimek = {
            "Lose Yourself",
            "Sicko Mode",
            "God's Plan",

        };
        String[] rockCimek = {
            "Bohemian Rhapsody",
            "Stairway to Heaven",
            "Hotel California",

        };
        String[] popCimek = {
            "Shape of You",
            "Blinding Lights",
            "Rolling in the Deep",

        };

         String valasztas = "";
        boolean ervenyesValasztas = false;
        
        while (!ervenyesValasztas) {
            System.out.println("Milyen hangulatú zenét szeretnél? (rap, rock, pop)");
            valasztas = scanner.nextLine().toLowerCase();
            
            if (valasztas.equals("rap") || valasztas.equals("rock") || valasztas.equals("pop")) {
                ervenyesValasztas = true;
            } else {
                System.out.println("Érvénytelen választás, kérlek próbáld újra.");
            }
        }

        String[] valasztottCimek;
        switch (valasztas) {
            case "rap":
                valasztottCimek = rapCimek;
                break;
            case "rock":
                valasztottCimek = rockCimek;
                break;
            case "pop":
                valasztottCimek = popCimek;
                break;
            default:
                System.out.println("Érvénytelen választás, alapértelmezettként a pop zenéket ajánlom:");
                valasztottCimek = popCimek;
                break;
        }

        String ajanlottZene = valasztottCimek[random.nextInt(valasztottCimek.length)];
        System.out.println("Ajánlott zene: " + ajanlottZene);

        // Új zenecím hozzáadása
        System.out.println("Szeretnél új zenecímet hozzáadni a listához? (igen/nem)");
        String hozzaadas = scanner.nextLine().toLowerCase();

        if (hozzaadas.equals("igen")) {
            System.out.println("Írd be az új zenecímet:");
            String ujZene = scanner.nextLine();
            System.out.println("Új zenecím hozzáadva: " + ujZene);
        }
    }
}
