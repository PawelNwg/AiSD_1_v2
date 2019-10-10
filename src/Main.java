// ZADANIE 1 WERSJA II PAWEŁ NIEWĘGŁOWSKI AiSD 2019
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //========== WERSJA ULEPSZONA =========
        Reading r = new Reading();
        mergesort mg = new mergesort();
        double []tab = r.reading(); // NOWA TABLICA ZCZYTANA METODA READING
        mg.sort(tab, 0, tab.length - 1);
        mg.sort_f(tab);
        mg.licznik();

        //    SZACOWANA ZŁOŻONOŚĆ N*LOGN + N

        //========== WERSJA ULEPSZONA =========^^


        /*========== WERSJA NAIWNA =======
         sort s = new sort();
         s.reading();                           ZŁOŻONOŚĆ OSZACOWANA  N^2
         ========== WERSJA NAIWNA =======^^
         */

    }


}