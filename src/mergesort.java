import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class mergesort {

    // ALGORYTM MERGESORT

    static int licznik_operacji_2 = 0;

    void merge(double tab[], int pocz, int srod, int kon)
    {

        int t_lewa = srod - pocz + 1; // wielkosci tablic  <0 - srodek>
        int t_prawa = kon - srod;     // (srodek - koniec>

        double[] Lewa_tab = new double[t_lewa];
        double[] Prawa_tab = new double[t_prawa];

        for (int i = 0; i < t_lewa; i++) {  // WYPELNIENIE TABLIC
            Lewa_tab[i] = tab[pocz + i];
        }

        for (int j = 0; j < t_prawa; j++) {  // WYPELNIENIE TABLIC
            Prawa_tab[j] = tab[srod + 1 + j];
        }

        int i = 0;
        int j = 0;
        int pom = pocz;

        while (i < t_lewa && j < t_prawa) { // iteracja do wyczerpania tablic
            if (Lewa_tab[i] <= Prawa_tab[j]) // zgodnie z merge sort jezeli wartosc i z lewej tablicy jest mniejsza od j z tablicy prawej to i
            {                                  /// z lewej tab jest dodwane do tablicy wynikowej a indeks i jest zwiekszany
                tab[pom] = Lewa_tab[i];
                i++;
            } else {                           // przypadek ze indeks j z tab prawej jest mniejszy
                tab[pom] = Prawa_tab[j];
                j++;
            }
            pom++;
            podbij_licznik();
        }
        while (i < t_lewa) {   // dopełnienie tablic kiedy maja rozne dlugosci
            tab[pom] = Lewa_tab[i];
            i++;
            pom++;
            podbij_licznik();
        }
        while (j < t_prawa) {
            tab[pom] = Prawa_tab[j];
            j++;
            pom++;
            podbij_licznik();
        }



    }

    void sort(double tab[], int l, int p) {
        if (l < p)
        {
            int m = (l + p) / 2; // znajdowanie srodka
            sort(tab, l, m); //  sortowanie lewej tablicy
            sort(tab, m + 1, p); // sortowanie prawej tablicy
            merge(tab, l, m, p); // zlaczenie posortowanych tablic w jedna
        }

    }
 /*
     void printArray(double tab[]) {
        int x = tab.length;
        for (int i = 0; i < x; i++)
            System.out.println((int) tab[i] + " ");


    }
*/
    void podbij_licznik()
    {
        licznik_operacji_2++;
    }
    void licznik()
    {

        System.out.println("licznik operacji : " + licznik_operacji_2);
    }

    void  sort_f(double tab[]) throws FileNotFoundException { // ZLICZENIE POWTORZEN

        int powtorzenie = 0;
        int max = 0;

        for(int i = 0 ; i < tab.length-1; i++)
        {
            if(tab[i] == tab[i+1])
            {
            powtorzenie++;
            }
            else
            {
                    if(powtorzenie >= max)
                        max = powtorzenie;
                        powtorzenie = 1;
            }

            licznik_operacji_2++;
        }
        System.out.println("WYNIK : " + max);
        PrintWriter printer = new PrintWriter("out.txt");
        printer.println(max);
        printer.close();

    }

    }
